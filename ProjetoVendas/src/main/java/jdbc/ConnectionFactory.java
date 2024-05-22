package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jabes
 */
public class ConnectionFactory {
    
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/BDVENDAS";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "jabes123";
    
        public Connection getConnection(){
            try{
                Connection connection = DriverManager.getConnection(DATABASE_URL,DATABASE_USERNAME,DATABASE_PASSWORD);
                return connection;
            }catch(SQLException ex){
                System.err.print("Cause");
            }
            return null;
        }
}
