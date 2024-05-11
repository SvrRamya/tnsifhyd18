package employee;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveData {
	
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/emplyoee";
		String username = "root";
		String password = "root";
		 
		try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
		 
			String sql = "SELECT * FROM employee";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    int empid = result.getInt(1);
			   // String pass = result.getString(3);
			    String empname = result.getString("empname");
			    String address = result.getString("address");
			 
			    String output = "User #%d:- %d - %s - %s ";
			    System.out.println(String.format(output, ++count, empid,  empname,address));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}

}