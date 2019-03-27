package com.eval.utils;

import com.eval.jooq.Keys;
import com.eval.jooq.Tables;
import org.jooq.Condition;
import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.DSL;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

/**
 * Helper class to use JOOQ's DSL to generate SQL queries for MySQL database.
 */
public class QueryUtils {

    private QueryUtils() {
    }

    private static final List<TableField> fields = Arrays.asList(
            Tables.LISTINGS.LISTING_ID,
            Tables.LISTINGS.DATE_ID,
            Tables.LISTINGS.NUM_TICKETS,
            Tables.LISTINGS.PRICE_TICKET,
            Tables.CATEGORIES.CATEGORY_ID,
            Tables.VENUES.CITY);

    /**
     * Return the SQL query string for the promotions endpoint
     *
     * @param date       Required field
     * @param categoryId optional input param
     * @param city       optional param
     * @return SQL query string.
     */
    public static String getQueryString(Date date, String categoryId, String city) {
        return DSL.using(SQLDialect.MYSQL)
                .select(fields)
                .from(Tables.LISTINGS)
                .innerJoin(Tables.DATES).onKey(Keys.LISTINGS_IBFK_3)
                .leftJoin(Tables.SALES).onKey(Keys.SALES_IBFK_1)
                .innerJoin(Tables.EVENTS).onKey(Keys.LISTINGS_IBFK_2)
                .innerJoin(Tables.CATEGORIES).onKey(Keys.EVENTS_IBFK_2)
                .innerJoin(Tables.VENUES).onKey(Keys.EVENTS_IBFK_1)
                .where(buildWhereCondition(date, categoryId, city))
                .getSQL();
    }

    /**
     * Build the where clause for the promotion query.
     * <p>
     * Note, for some reason JOOQ is rending .eq() values as '?' hence the clauses are hand written for now.
     */
    private static Condition buildWhereCondition(Date date, String categoryId, String city) {

        Condition result = Tables.SALES.SALES_ID.isNull();
        result = result.and("dates.cal_date = " + "'" + date.toString() + "'");

        if (categoryId != null && !categoryId.isEmpty()) {
            // result = result.and(Tables.CATEGORIES.CATEGORY_ID.eq(Integer.valueOf(categoryId)));
            result = result.and("categories.category_id = " + categoryId);
        }

        if (city != null && !city.isEmpty()) {
            // result = result.and(Tables.VENUES.CITY.equalIgnoreCase(city));
            result = result.and("lower(venues.city) = lower('" + city + "')");
        }
        return result;
    }

}
