package com.jwt.ejb.dataAccess;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	private String dataSource;
	private String dbUsername;
	private String dbPassword;
	
	private static Connection conn;
	
	public DatabaseConnection() {
		
		this.dataSource="jdbc:mysql://localhost:8080/dpsStockDB";
		this.dbUsername="root";
		this.dbPassword="1385VB";
	}
	
	
	public String getDataSource() {
		return dataSource;
	}



	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}



	public String getDbUsername() {
		return dbUsername;
	}



	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}



	public String getDbPassword() {
		return dbPassword;
	}



	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	public Connection createDBConnection() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			conn=DriverManager.getConnection(dataSource, dbUsername, dbPassword);
            System.out.println("CONNECTED TO THE DATABASE !");			
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return conn;
	}
	
	
}
