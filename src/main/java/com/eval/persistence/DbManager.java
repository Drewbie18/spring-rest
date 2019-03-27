package com.eval.persistence;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Class that will create the Hikari {@link HikariDataSource} object instance, this will be
 * used to manage the DB connection pool.
 */
public class DbManager {
    private static final Logger logger = LoggerFactory.getLogger(DbManager.class);
    private static HikariDataSource dataSource;

    static {
        Properties props = new Properties();
        InputStream in = DbManager.class.getResourceAsStream("/hikari.properties");
        try {
            props.load(in);
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
        HikariConfig config = new HikariConfig(props);
        dataSource = new HikariDataSource(config);
    }

    private DbManager() {
    }

    public static Connection getDbConn() throws SQLException {
        return dataSource.getConnection();
    }

}
