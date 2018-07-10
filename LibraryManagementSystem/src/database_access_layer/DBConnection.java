package database_access_layer;

import java.sql.*;
public class DBConnection {

	private String dataSource="jdbc:mysql://localhost:8080/libraryDB";
	private String username="root";
	private String password="19981212dps";
	
	private Connection conn;
	
	/**
	 * @return the dataSource
	 */
	public String getDataSource() {
		return dataSource;
	}

	/**
	 * @param dataSource the dataSource to set
	 */
	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public Connection createDBConnection(){
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(dataSource, username, password);
			
			System.out.println("SUCCESSFULLY CONNECTED TO THE DATABASE !!");
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
		
		return conn;
	}
}
