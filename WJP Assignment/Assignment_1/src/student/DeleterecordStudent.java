package student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleterecordStudent {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		String JdbcURL = "jdbc:mysql://localhost:3306/jdbc?" + "autoReconnect=true&useSSL=false";
        String Username = "root";
        String password = "sept22";
        Connection con=null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rno");
		int rno = sc.nextInt();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(JdbcURL, Username, password);
		    PreparedStatement s = con.prepareStatement("delete from Student1 where rno=?");
		    s.setInt(1, rno);
			int rs = s.executeUpdate();
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
		System.out.println("done");
	}
}

