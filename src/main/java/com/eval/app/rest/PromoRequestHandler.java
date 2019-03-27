package com.eval.app.rest;

import com.eval.persistence.DbManager;
import com.eval.utils.QueryUtils;
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
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotNull;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Handle the requests to the promotions endpoint.
 */
public class PromoRequestHandler {

    private static final Logger logger = LoggerFactory.getLogger(ObjectRequestHandler.class);

    /**
     * Return list of listings for a given date, type and city are optional params.
     *
     * @param date Format yyyy-mm-dd
     * @param categoryId The ID of the category of the event.
     * @param city City name to filter list.
     */
    public ResponseEntity getBasicPromotionHandler(
            @NotNull String date,
            @Nullable String categoryId,
            @Nullable String city) {

        // parse date
        Date inputDate;
        try {
            inputDate = Date.valueOf(date);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad input date, must be of form YYYY-MM-DD");
        }

        String sqlQuery = QueryUtils.getQueryString(inputDate, categoryId, city);
        Result<Record> result;
        try (Connection conn = DbManager.getDbConn()) {
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

            result = create.fetch(sqlQuery);

        } catch (SQLException e) {
            logger.error(e.getSQLState());
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Unable to retrieve listings at this time");
        }

        List<Map<String, Object>> mapsList = result.intoMaps();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(mapsList);

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(json);
    }
}
