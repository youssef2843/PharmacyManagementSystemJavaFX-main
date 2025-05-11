package pharmacymanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {
    private static database instance;
    private Connection connection;

    private database() {}

    public static database getInstance() {
        if (instance == null) {
            instance = new database();
        }
        return instance;
    }

    public Connection connectDb() {
        try {
            if (connection == null) {
                Class.forName("com.mysql.jdbc.Driver");
                connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/pharmacy",
                    "root",
                    ""
                );
            }
            return connection;
        } catch(Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Database connection failed: " + e.getMessage());
        }
    }

    public void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                connection = null;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}