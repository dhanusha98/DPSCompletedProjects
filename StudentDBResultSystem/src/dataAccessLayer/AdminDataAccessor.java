package dataAccessLayer;

import java.sql.*;
public class AdminDataAccessor {

	private DatabaseConnection dbObj=new DatabaseConnection();
	private Connection dbConnection=dbObj.databaseConnection();
	private String sql;
	
    public void searchProfile(int adminID){
    	
    	try {
    		
    		Statement selectStmt=dbConnection.createStatement();
    		sql="SELECT * FROM admin WHERE AdminID="+adminID+"";
    		
    		ResultSet rs=selectStmt.executeQuery(sql);
    		
    		if(rs.next()){
    			System.out.println("STUDENT ID: "+rs.getString(1));
    			System.out.println("STUDENT NAME: "+rs.getString(2));
    			System.out.println("COURSE: "+rs.getString(3));
    			System.out.println("OVERALL MARK: "+rs.getString(4));
    			
    		} else {
    			System.out.println("RECORD NOT FOUND !");
    		}
    	}
    	
    	catch(Exception ex){
    		ex.printStackTrace();
    	}
	}
	
	public void insertProfile(String adminFullName, String adminUsername, String adminPassword, String otherDetails){
		
		try {
			
			Statement insertStmt=dbConnection.createStatement();
			sql="INSERT INTO student VALUES ('"+adminFullName+"', '"+adminUsername+"', '"+adminPassword+"', '"+otherDetails+"')";
			
			int result=insertStmt.executeUpdate(sql);
			
			if(result > 0){
				System.out.println("PROFILE CREATED !");
			} else {
				System.out.println("PROFILE CREATION FAILED !");
			}
			
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void updateProfile(int adminID, String adminFullName, String adminUsername, String adminPassword, String otherDetails){
		
        try {
			
        	Statement updateStmt=dbConnection.createStatement();
        	sql="UPDATE admin SET AdminFullName='"+adminFullName+"', AdminUsername='"+adminUsername+"', AdminPassword='"+adminPassword+"', AdminOtherDetails='"+otherDetails+"' WHERE AdminID="+adminID+"";
        	
        	int result=updateStmt.executeUpdate(sql);
        	
        	if(result > 0){
        		System.out.println("PROFILE UPDATED !");
        	} else {
        		System.out.println("PROFILE UPDATION FAILED !");
        	}
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void deleteProfile(int adminID){
		
        try {
			
        	Statement deleteStmt=dbConnection.createStatement();
        	sql="DELETE FROM admin WHERE AdminID="+adminID+"";
        	
        	int result=deleteStmt.executeUpdate(sql);
        	
        	if(result > 0){
        		System.out.println("PROFILE DELETED SUCCESSFULLY !");
        	} else {
        		System.out.println("PROFIEL DELETION FAILED !");
        	}
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
