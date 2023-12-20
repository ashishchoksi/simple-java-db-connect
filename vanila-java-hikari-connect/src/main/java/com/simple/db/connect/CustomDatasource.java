package com.simple.db.connect;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

// create hikari datasource for get connect method
public class CustomDatasource {

    private static HikariDataSource hikariDataSource;
    private static String jdbcUrl = "jdbc:mysql://localhost:3306/micro_service?createDatabaseIfNotExist=true";
    private static String userName = "root";
    private static String password = "root";


    static {
        HikariConfig hikariConfig = new HikariConfig();

        hikariConfig.setJdbcUrl(jdbcUrl);
        hikariConfig.setUsername(userName);
        hikariConfig.setPassword(password);
        hikariDataSource = new HikariDataSource(hikariConfig);
    }

    public static Connection getConnection() throws SQLException {
        return hikariDataSource.getConnection();
    }

}
