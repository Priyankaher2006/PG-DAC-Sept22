package student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectOneRecordStudent {

		public static void main(String[] args) {
			String JdbcURL = "jdbc:mysql://localhost:3306/jdbc?" + "autoReconnect=true&useSSL=false";
	        String Username = "root";
	        String password = "sept22";
	        Connection con=null;

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(JdbcURL, Username, password);
			     PreparedStatement s = con.prepareStatement("select avg(marks) from Student");
				ResultSet rs = s.executeQuery();
				while(rs.next()) {
					System.out.println(rs.getInt(1));
				}

				s.close();
				con.close();
			} catch (ClassNotFoundException | SQLException e) {			
				e.printStackTrace();
			}
			
			System.out.println("done");
			
		}

	}


