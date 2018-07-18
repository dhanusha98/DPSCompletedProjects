package dataAccessLayer;

import java.sql.*;
public class DatabaseConnection {

	private static final String dataSource="jdbc:mysql://localhost:9999/studentdb";
	private static final String username="root";
	private static final String password="";
	
	private Connection conn;
	
	public Connection databaseConnection(){
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(dataSource, username, password);
			
			System.out.println("CONNECTED TO THE DATABASE !");
			
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
		
		return conn;
	}
}
