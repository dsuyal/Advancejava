package in.co.rays;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class TestCrud {
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rays", "root", "root");
		
		//PreparedStatement ps = conn.prepareStatement("insert into employee value(4 , 'dinesh' , 20000)");
		
		PreparedStatement ps = conn.prepareStatement("insert into employee value(? , ? , ?)");
		
		ps.setInt(1, 5);
		ps.setString(2,"suyal");
		ps.setInt(3, 15000);
		
		int i = ps.executeUpdate();
		
		System.out.println( "Data inserted" + i);
	}

}
