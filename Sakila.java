import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sakila {
 
  public static void main(String[] args) {

    try {
      DatabaseConnection dataConnection = DatabaseConnection.getInstance();
      Connection connection = dataConnection.getConnection();
      Statement statement = connection.createStatement();
    
      statement.setQueryTimeout(30);  // set timeout to 30 sec.

      ResultSet rs = statement.executeQuery("select * from category");

      while(rs.next()) {
        // read the result set
        System.out.println("Category = " + rs.getString("name"));
      }     
    } catch (SQLException e){
      e.printStackTrace(System.err);
    }
  }
}