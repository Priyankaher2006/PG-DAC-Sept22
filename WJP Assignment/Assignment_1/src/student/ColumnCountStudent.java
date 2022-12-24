package student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ColumnCountStudent {
	public static void main(String[] args) {
		String JdbcURL = "jdbc:mysql://localhost:3306/jdbc?" + "autoReconnect=true&useSSL=false";
		String Username = "root";
		String password = "sept22";
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(JdbcURL, Username, password);
			PreparedStatement s = con.prepareStatement("select * from Student1");
			ResultSet rs = s.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println(rsmd.getColumnCount());
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
		System.out.println("done");
	}
}
