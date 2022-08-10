package com.revature.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	

	
	private static Connection connection;
	
	public static Connection getConnection() throws SQLException{
		if(connection!=null && !connection.isClosed()) {
			return connection;
		}else {
					
			try {
				Class.forName("org.postgresql.Driver");
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			String url = "jdbc:postgresql://javafsrevature.ceyl9cnfz7h5.us-east-1.rds.amazonaws.com:5432/p0";
			String username = "postgres"; 
			String password = "Hunter22";
			
			connection = DriverManager.getConnection(url, username, password);
			
			return connection;
			
		}
	}

}