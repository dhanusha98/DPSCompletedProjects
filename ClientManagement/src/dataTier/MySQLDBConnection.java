package dataTier;

import java.sql.*;
public class MySQLDBConnection extends DBConnectionStructure {

	private String dataSource="jdbc:mysql://localhost:3306/ClientDB";
	private String dbUsername="root";
	private String dbPassword="123";
	private Connection conn;
	
	/**
	 * @return the conn
	 */
	public Connection getConn() {
		return conn;
	}

	public void dbConnection(){
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			this.conn=DriverManager.getConnection(dataSource,dbUsername, dbPassword);
			
			System.out.println("SUCCESSFULLY CONNECTED TO DATABASE !");
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	
	
	
}
