package DatabaseAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;
import java.sql.*;

public class AdminDataLayer {
	
	private static String dbSource="jdbc:mysql://localhost:3306/EmailManagementDB";
	private static String dbUserName="root";
	private static String dbPassword="1233";
	private static Connection conn;
	private String sql;
	
	public static Connection dbConnection(){
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(dbSource,dbUserName,dbPassword);
			
			System.out.println("SUCCESSFULLY CONNECTED TO DATABASE !!");
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
		
		return conn;
	}
	
	public void searchAdmin(int adminID){
		
		try {
			Statement selectStmt=dbConnection().createStatement();
			
			sql="SELECT * FROM adminprofile WHERE AdminID="+adminID+"";
			ResultSet rs=selectStmt.executeQuery("");
			
			if(rs.next()){
				
				System.out.println("ADMIN ID: "+rs.getString(1));
				System.out.println("ADMIN NAME: "+rs.getString(2));
				System.out.println("ADMIN TYPE: "+rs.getString(3));
				System.out.println("USER ROLES"+rs.getString(4));
				
			} else {
				System.out.println("NOT FOUND ANY MATCHING PROFILE");
			}
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
		
		finally{
			
			try {
				if(conn !=null){
					conn.close();
				}
			} 
			catch(Exception ex){
				ex.printStackTrace();
			}
		}
		
	}
	
	public void insertAdmin(String adminName, String adminType, String userRoles){
		
		
		try {
			Statement insertStmt=dbConnection().createStatement();
			
			sql="INSERT INTO adminprofile VALUES ('"+adminName+"', '"+adminType+"', '"+userRoles+"')";
			int result=insertStmt.executeUpdate(sql);
			
			if(result > 0){
				System.out.println("ACCOUNT CREATED SUCCESSFULLY !");
				
			} else {
				System.out.println("ACCOUNT CREATION FAILED !");
			}
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	public void updateAdmin(int adminID, String adminName, String adminType, String userRoles){
		
		try {
			
			Statement updateStmt=dbConnection().createStatement();
			sql="UPDATE adminprofile SET AdminName='"+adminName+"', AdminType='"+adminType+"', UserRoles='"+userRoles+"' WHERE AdminID="+adminID+"";
			
			int result=updateStmt.executeUpdate(sql);
			
			if(result >0){
				System.out.println("ACCOUNT UPDATED SUCCESSFULLY !");
			} else {
				System.out.println("ACCOUNT UPDATION FAILED !");
			}
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void deleteAdmin(int adminID){
	      
        try {
        	
        	Statement deleteStmt=dbConnection().createStatement();
        	sql="DELETE FROM adminprofile WHERE Admin="+adminID+"";
        	int result=deleteStmt.executeUpdate(sql);
        	
        	if(result > 0){
        		System.out.println("ACCOUNT DELETED SUCCESSFULLY !");
        		
        	} else {
        		System.out.println("ACCOUNT DELETION FAILED !");
        	}
        	
        }
        
        catch(Exception ex){
        	ex.printStackTrace();
        }
	}
	
	public void displayAllAdmins(){
		
		try {
			
			Statement selectStmt=dbConnection().createStatement();
			sql="SELECT * FROM admin";
			
			ResultSet rs=selectStmt.executeQuery(sql);
			
			while(rs.next()){
				
				System.out.println("ADMIN ID: "+rs.getString(1));
				System.out.println("ADMIN NAME: "+rs.getString(2));
				System.out.println("ADMIN TYPE: "+rs.getString(3));
				System.out.println("USER ROLES"+rs.getString(4));
			}
			
			if(!rs.next()){
				System.out.println("NO PROFILES AVAILABLE !");
			}
			
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
