package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jabes
 */
public class ConnectionFactory {
    
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/BDVENDAS";
    private static final String DATABASE_USERNAME = "root";
    private static final String DATABASE_PASSWORD = "jabes123";
    private static final String SELECT_QUERY = "SELECT * FROM users WHERE username = ? AND password = ?";
    
    public boolean validate(String username, String password) {

            try {
                Connection conn = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
                PreparedStatement ps = conn.prepareStatement(SELECT_QUERY);
                ps.setString(1, username);
                ps.setString(2, password);

                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    return true;
                }
                
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                
            return false;
        }

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
