import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;

    private DatabaseConnection() throws SQLException{
        connection = DriverManager.getConnection("jdbc:sqlite:./sqlite-sakila.db");
    }

    public static DatabaseConnection getInstance() throws SQLException{
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}