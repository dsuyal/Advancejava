package in.co.rays.test;

import java.sql.Connection;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public final class JdbcDataSource {
	
	private static JdbcDataSource jds = null;
	
	private ComboPooledDataSource ds = null;
	
	private JdbcDataSource () {
		
		try {
			
			ds = new ComboPooledDataSource();
			
			ds.setDriverClass("com.mysql.jdbc.Driver");
			ds.setJdbcUrl("jdbc:mysql://localhost:3306/sunrays");
			ds.setUser("root");
			ds.setPassword("root");
			ds.setInitialPoolSize(5);
			ds.setAcquireIncrement(5);
			ds.setMaxPoolSize(30);
			
		} catch (Exception e) {
		
		}	
	}
		public static JdbcDataSource getInstance () {
			
			if (jds == null) {
				jds = new JdbcDataSource();
				
			}
			return jds;
		
		}
		
		public static Connection getConnection () {
			
			try {
				return  getInstance().ds.getConnection();
				
			} catch (Exception e) {
				
			}
			return null;
			
		}

}
