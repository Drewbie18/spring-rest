package com.eval.jooq.test;

import com.eval.jooq.Tables;
import com.eval.jooq.tables.records.UsersRecord;
import com.eval.persistence.DbManager;
import com.google.gson.Gson;
import org.jooq.DSLContext;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class QueryDataBaseTests {

    private final Logger logger = LoggerFactory.getLogger(QueryDataBaseTests.class);

    @Test //use hikari directly to manage JDBC connection pool.
    public void connectionPool() {
        try {
            Connection conn = DbManager.getDbConn();
            DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

            Result<UsersRecord> result = create
                    .selectFrom(Tables.USERS)
                    .where("user_id = 1")
                    .fetch();


            Map<String, Object> maps = result.get(0).intoMap();
            System.out.println(maps.toString());
            Gson gson = new Gson();
            String json = gson.toJson(maps);
            System.out.println(json);


            assertEquals("Rafael", result.get(0).getFirstName());
        } catch (SQLException e) {
            logger.error(e.getSQLState());
        }
    }

}
