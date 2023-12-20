package com.simple.db.connect;

import java.sql.*;

public class VanillaDBConnection {

    public void connect() throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/micro_service?createDatabaseIfNotExist=true";
        String userName = "root";
        String password = "root";

        Connection connection = DriverManager.getConnection(jdbcUrl, userName, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from users");
        while (resultSet.next()) {
            String id = resultSet.getString(1);
            String about = resultSet.getString(2);
            String email = resultSet.getString(3);
            String name = resultSet.getString(4);

            System.out.println(
                    "id : " + id + "\n" +
                    "about : " + about + "\n" +
                    "email : " + email + "\n" +
                    "name : " + name + "\n"
            );
        }

    }

}
