package database_access_layer;

import java.sql.*;
public class AdminDataAccessor implements AdminDataAccessStructure {

	private DBConnection dbconnObj=new DBConnection();
	Connection dbconnection=dbconnObj.createDBConnection();
	String sql;
	
	business_logic_layer.Admin admObj=new business_logic_layer.Admin();
	
	public boolean adminUserValidation()
	{
		
		boolean result=false;
		
		try {
			
			Statement userValStmt=dbconnection.createStatement();
			sql="SELECT * FROM admin WHERE AdminUsername='"+admObj.getAdminUsername()+"' AND AdminPassword='"+admObj.getAdminPassword()+"'";
			
			ResultSet rs=userValStmt.executeQuery(sql);
			
			if(rs.next()){
				result = true;
			} else {
				result=false;
			}
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
		
		return result;
	}
	
	public void searchAdmin()
	{
		try{
			
			Statement selectStmt=dbconnection.createStatement();
			sql="SELECT * FROM admin WHERE AdminID="+admObj.getAdminID()+"";
			
			ResultSet rs=selectStmt.executeQuery(sql);
			
			if(rs.next()){
				System.out.println("ADMIN ID: "+rs.getString(1));
				System.out.println("FULL NAME: "+rs.getString(2));
				System.out.println("USERNAME: "+rs.getString(3));
				System.out.println("PASSWORD: "+rs.getString(4));
				System.out.println("USER ROLES: "+rs.getString(5));
				
			} else {
				System.out.println("RECORD NOT FOUND !");
			}
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public void insertAdmin()
	{
		
		try {
			
			Statement insertStmt=dbconnection.createStatement();
			sql="INSERT INTO ADMIN VALUES ('"+admObj.getAdminFullName()+"', '"+admObj.getAdminUsername()+"', " +
				"'"+admObj.getAdminPassword()+"', '"+admObj.getUserroles()+"')";
			
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
	public void updateAdmin()
	{
		
		try {
			
			Statement updateStmt=dbconnection.createStatement();
            sql="UPDATE ADMIN SET AdminFullName='"+admObj.getAdminFullName()+"', AdminUsername='"+admObj.getAdminUsername()+"', AdminPassword='"+admObj.getAdminPassword()+"', UserRoles='"+admObj.getUserroles()+"', WHERE AdminID="+admObj.getAdminID()+"";

            int result=updateStmt.executeUpdate(sql);
            
            if(result > 0){
            	System.out.println("ACCOUNT UPDATED SUCCESSFULLY !");
            } else {
            	
            	System.out.println("ACCOUNT UPDATE FAILED !");
            }
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
		     
	}
	public void deleteAdmin()
	{
		
		try {
			
			Statement deleteStmt=dbconnection.createStatement();
			sql="DELETE FROM ADMIN WHERE AdminID="+admObj.getAdminID()+"";
			
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
}
