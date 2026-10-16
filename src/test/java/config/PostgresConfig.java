package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConfig {
    public static final String username = "postgres";
    public static final String password = "12345678";
    public static final String password1 = "12345678";
    public static final String password2 = "12345678";
    public static final String password3 = "12345678";
    public static final String password4 = "12345678";
    public static final String password5 = "12345678";


    public static final String baseUrl ="jdbc:postgresql://localhost:5432/postgres";
    public static final Connection getConnection() throws SQLException {
        return DriverManager.getConnection(baseUrl,username,password);
    }

    
}
