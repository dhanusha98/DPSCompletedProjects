package DatabaseAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class EmailDataLayer {

	private static String dbSource="jdbc:mysql://localhost:3306/EmailManagementDB";
	private static String dbUserName="root";
	private static String dbPassword="1233";
	private static Connection conn;
	private String sql;
	
	public static Connection dbConnection(){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(dbSource,dbUserName,dbPassword);
			System.out.println("SUCCESSFULLY CONNECTED TO THE DATABASE !!");
		}
		
		catch(Exception ex){	
			ex.printStackTrace();
		}
		
		return conn;
	}
	
	public void searchEmail(int emailID){
		
		try {
			
			Statement selectStmt=dbConnection().createStatement();
			sql="SELECT * FROM email WHERE EmailID="+emailID+"";
			
			ResultSet rs=selectStmt.executeQuery(sql);
			
			if(rs.next()){
				System.out.println("EMAIL ID: "+rs.getString(1));
				System.out.println("SUBJECT: "+rs.getString(2));
				System.out.println("SENDER: "+rs.getString(3));
				System.out.println("RECEIVER: "+rs.getString(4));
				System.out.println("MESSAGE: "+rs.getString(5));
				
			} else {
				System.out.println("EMAIL NOT FOUND !");
			}
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void insertEmail(String subject, String sender, String receiver, String message){
		
		try {
			
			Statement insertStmt=dbConnection().createStatement();
			sql="INSERT INTO email VALUES ('"+subject+"', '"+sender+"', '"+receiver+"', '"+message+"')";
			
			int result=insertStmt.executeUpdate(sql);
			
			if(result > 0){
				System.out.println("EMAIL CREATED SUCCESSFULLY !");
			} else {
				System.out.println("EMAIL CREATION FAILED !");
			}
		}
		
		catch(Exception ex){
			
			ex.printStackTrace();
		}
	}
	
	public void updateEmail(int emailID, String subject, String sender, String receiver, String message){
		
		try {
			
			Statement updateStmt=dbConnection().createStatement();
			sql="UPDATE email SET Subject='"+subject+"', Sender='"+sender+"', Receiver='"+receiver+"', Message='"+message+"', WHERE EmailID="+emailID+"";
			
			int result=updateStmt.executeUpdate(sql);
			
			if(result > 0){
				System.out.println("EMAIL UPDATED SUCCESSFULLY !");
			} else {
				System.out.println("EMAIL UPDATE FAILED !");
			}
		} 
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void deleteEmail(int emailID){
		
	   try {
		   
		   Statement deleteStmt=dbConnection().createStatement();
		   sql="DELETE FROM email WHERE EmailID="+emailID+"";
		   
		   int result=deleteStmt.executeUpdate(sql);
		   
		   if(result > 0){
			   System.out.println("EMAIL DELETED SUCCCESSFULLY !");
		   } else {
			   System.out.println("EMAIL DELETION FAILED !");
		   }
		   
	   }
	   
	   catch(Exception ex){
		   ex.printStackTrace();
	   }
	}
	
}
