package examen.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Datos de conexión a MySQL
    private static final String URL = "jdbc:mysql:/localhost:3306/rentacar";
    private static final String USUARIO = "admin";
    private static final String PASSWORD = "Password1234";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }
}
