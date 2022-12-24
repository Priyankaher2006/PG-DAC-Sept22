package student;
import java.sql.*;

public class CreateTableStudent {
	public static void main(String[] args) {
		String JdbcURL = "jdbc:mysql://localhost:3306/jdbc?" + "autoReconnect=true&useSSL=false";
        String Username = "root";
        String password = "sept22";
        Connection con=null;
		try {
			// load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			//forName(static method of class) will load specific/given class in JRE
			con = DriverManager.getConnection(JdbcURL, Username, password);
			//create query statement
			Statement s = con.createStatement();
			//execute query
			boolean flag = s.execute("create table Student1(rno int not null auto_increment primary key, name varchar(25), marks float(10,2),dob date)");
			System.out.println(flag);
			//close statement
			s.close();
			//close connection
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
