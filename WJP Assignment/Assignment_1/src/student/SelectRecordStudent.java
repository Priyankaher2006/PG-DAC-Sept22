package student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectRecordStudent {
	public static void main(String[] args) {
		String JdbcURL = "jdbc:mysql://localhost:3306/jdbc?" + "autoReconnect=true&useSSL=false";
        String Username = "root";
        String password = "sept22";
        Connection con=null;
		try {
			/*java loading mysql driver to establish db connection*/
			Class.forName("com.mysql.cj.jdbc.Driver");
			/*grtConnection of DriverManager used to establish connection with db*/
			con = DriverManager.getConnection(JdbcURL, Username, password);
			/*object statement is responsible to execute queries with db*/
			/*Query is complied & saved in s*/
		     PreparedStatement s = con.prepareStatement("select * from Student1");
		     /*Query executed & saved in rs*/
			ResultSet rs = s.executeQuery();
			//printing result
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
			}

			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
		
		System.out.println("done");
		
	}

}

