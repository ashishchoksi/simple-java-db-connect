package com.simple.db.connect;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        HikariDBConnect hikariDBConnect = new HikariDBConnect();
        hikariDBConnect.run();
    }
}