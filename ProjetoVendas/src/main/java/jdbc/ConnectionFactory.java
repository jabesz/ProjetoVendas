package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jabes
 */
public class ConnectionFactory {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/BDVENDAS", "java", "escola");
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
