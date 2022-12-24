package student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecordStudent {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner n = new Scanner(System.in);
		System.out.println("Enter rno ");
		int rno = n.nextInt();
		System.out.println("Enter name ");
		String name = n.next();
		System.out.println("Enter marks ");
		float marks = n.nextFloat();
		System.out.println("Enter dob yyyy-mm-dd ");
		String dob = n.next();
		//URL components
		String JdbcURL = "jdbc:mysql://localhost:3306/jdbc?" + "autoReconnect=true&useSSL=false";
        String Username = "root";
        String password = "sept22";
        Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(JdbcURL, Username, password);
			PreparedStatement s = con.prepareStatement("insert into Student1 values("+rno+",'"+name+"',"+marks+",'"+dob+"')");
			int i = s.executeUpdate();
			System.out.println(i+" rows inserted");
			s.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
		System.out.println("done");
	}
}
