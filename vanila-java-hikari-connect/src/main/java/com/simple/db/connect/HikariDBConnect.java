package com.simple.db.connect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HikariDBConnect {

    Logger log = LoggerFactory.getLogger(HikariDBConnect.class);

    public void run() throws SQLException {
        Connection connection = CustomDatasource.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from users");
        while (resultSet.next()) {
            String id = resultSet.getString(1);
            String about = resultSet.getString(2);
            String email = resultSet.getString(3);
            String name = resultSet.getString(4);
            log.info("\n Id: {} \n name: {} \n about: {} \n email: {} \n", id, name, about, email);
        }
    }
}
