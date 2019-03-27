package com.eval.app.rest;

import com.eval.jooq.tables.*;
import com.eval.persistence.DbManager;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Handle GET requests object by type and ID.
 */
public class ObjectRequestHandler {

    private final Logger logger = LoggerFactory.getLogger(ObjectRequestHandler.class);

    // input request names
    private static final String CATEGORY_TYPE = "category";
    private static final String DATE_TYPE = "date";
    private static final String EVENT_TYPE = "event";
    private static final String LISTING_TYPE = "listing";
    private static final String SALES_TYPE = "sale";
    private static final String USER_TYPE = "user";
    private static final String VENUE_TYPE = "venue";

    /**
     * Create a simple map that contains the expected input query param for type and return the type's table and
     * primary key (id) field name.
     */
    private static Map<String, TableIdColumn> getTypeIdMap() {
        Map<String, TableIdColumn> map = new HashMap<>(7);
        map.put(CATEGORY_TYPE, new TableIdColumn(Categories.CATEGORIES, Categories.CATEGORIES.CATEGORY_ID));
        map.put(DATE_TYPE, new TableIdColumn(Dates.DATES, Dates.DATES.DATE_ID));
        map.put(EVENT_TYPE, new TableIdColumn(Events.EVENTS, Events.EVENTS.EVENT_ID));
        map.put(LISTING_TYPE, new TableIdColumn(Listings.LISTINGS, Listings.LISTINGS.LISTING_ID));
        map.put(SALES_TYPE, new TableIdColumn(Sales.SALES, Sales.SALES.SALES_ID));
        map.put(USER_TYPE, new TableIdColumn(Users.USERS, Users.USERS.USER_ID));
        map.put(VENUE_TYPE, new TableIdColumn(Venues.VENUES, Venues.VENUES.VENUE_ID));
        return map;
    }


    /**
     * Method to search for a record of a given type by a given ID.
     *
     * @param type the record type
     * @param id   the ID of the record
     */
    @SuppressWarnings("unchecked") // use jooq to fetch records of generic type
    public ResponseEntity getObjectById(String type, int id) {

        TableIdColumn tableIdColumn = getTypeIdMap().get(type);
        if (tableIdColumn == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Query type does not exist: " + type);
        }

        String sqCondition = String.format("%s = %d", tableIdColumn.getIdColumnName().getName(), id);
        Map<String, Object> result;
        try (Connection conn = DbManager.getDbConn()) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

            result = create
                    .selectFrom(tableIdColumn.getTable())
                    .where(sqCondition)
                    .fetchAnyMap(); // can return null

        } catch (SQLException e) {
            logger.error(e.getSQLState());
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Unable to retrieve record at this time");
        }

        if (result == null) {
            return ResponseEntity
                    .status(HttpStatus.NO_CONTENT)
                    .body("Record not found. Request: " + type + ": " + id);
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(result);
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(json);
    }

    @SuppressWarnings("unchecked")
    public ResponseEntity getAllIdsByType(String type) {

        TableIdColumn tableIdColumn = getTypeIdMap().get(type);
        if (tableIdColumn == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Query type does not exist: " + type);
        }

        Result<Record> result;
        try (Connection conn = DbManager.getDbConn()) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

            result = create
                    .select(tableIdColumn.getIdColumnName())
                    .from(tableIdColumn.getTable())
                    .fetch(); // can return null

        } catch (SQLException e) {
            logger.error(e.getSQLState());
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Unable to retrieve ID list at this time");
        }


        List<Integer> list = new ArrayList<>(result.size());

        result.forEach(record -> list.add((Integer) record.get(tableIdColumn.getIdColumnName().getName())));

        // return as JSON array for now
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(list);
    }

}
