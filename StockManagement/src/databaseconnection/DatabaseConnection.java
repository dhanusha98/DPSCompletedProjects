package databaseconnection;

import java.sql.*;
public abstract class DatabaseConnection {

	private static String username;
	private static String password;
	private static String dbURL;
	private Connection conn;
	
	public void dbConnection(){
		
		 username="root";
		 password="19981212dps";
		 dbURL="jdbc:mysql://localhost:3306/products";
				
		try {
			
			
			conn = DriverManager.getConnection(dbURL, username, password);
			if(conn !=null){
				System.out.println("Successfully Connected to Database !!");
			}
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
		
		finally{
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Connection getConnection(){
		
		return conn;
	}
}
