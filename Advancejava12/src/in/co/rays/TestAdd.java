package in.co.rays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestAdd {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		Statement stmt = conn.createStatement();
		
		int i = stmt.executeUpdate("insert into employee values(1,'hritika',1500)");
		    i = stmt.executeUpdate("insert into employee values(2,'hritika',2000)");
		    i = stmt.executeUpdate("insert into employee values(3,'hritika',2500)");
		System.out.println("Data inserted" + i);
	}

}
