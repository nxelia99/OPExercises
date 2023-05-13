package com.tareamayo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private String jdbcUrl;
    private String user;
    private String password;
    //constructor de 3 parámetros
    public ConexionBD (String jdbcUrl, String user, String password) {
        this.jdbcUrl= jdbcUrl;
        this.user = user;
        this.password = password;
    }

    public Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection (jdbcUrl, user, password);
        return connection;
    }
}
