package com.jwt.ejb.dataAccessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.ejb.Stateless;

import com.jwt.ejb.dataAccessStructure.dbConnectionStruct;

@Stateless
public class DatabaseConnection implements dbConnectionStruct {
	
	private final String dataSource="jdbc:mysql://localhost:9999/dpsStockDB";
	private final String dbUsername="root";
	private final String dbPassword="";
	
	private Connection conn;
	
	public Connection dbConnection()
	{
				
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			conn=DriverManager.getConnection(dataSource, dbUsername, dbPassword);
			
		}
		
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return conn;
	}


}
