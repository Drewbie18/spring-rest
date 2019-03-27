package com.eval.jooq.test;

import com.eval.utils.QueryUtils;
import org.junit.Test;

import java.sql.Date;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;


public class QueryUtilsTest {

    @Test
    public void getStringWithDate() {
        Date date = Date.valueOf("2008-01-24");
        String mySqlQuery = QueryUtils.getQueryString(date, null, null);
        assertThat(mySqlQuery, containsString("2008-01-24"));
    }

    @Test
    public void getWithCategoryId() {
        Date date = Date.valueOf("2008-01-24");
        String mySqlQuery = QueryUtils.getQueryString(date, "8", null);
        assertThat(mySqlQuery, containsString("2008-01-24"));
        assertThat(mySqlQuery, containsString("categories.category_id = 8"));
    }

    @Test
    public void getWithCategoryIdAndCity() {
        Date date = Date.valueOf("2008-01-24");
        String mySqlQuery = QueryUtils.getQueryString(date, "8", "Chicago");
        assertThat(mySqlQuery, containsString("2008-01-24"));
        assertThat(mySqlQuery, containsString("categories.category_id = 8"));
        assertThat(mySqlQuery, containsString("lower(venues.city) = lower('Chicago'))"));
    }
}
