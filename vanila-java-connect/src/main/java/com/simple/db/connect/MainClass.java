package com.simple.db.connect;

import java.sql.SQLException;

public class MainClass {
    public static void main(String[] args) throws SQLException {
        VanillaDBConnection connection = new VanillaDBConnection();
        connection.connect();
    }
}