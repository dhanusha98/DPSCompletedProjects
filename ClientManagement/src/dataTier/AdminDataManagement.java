package dataTier;

import java.sql.*;
import entityTypes.*;
public class AdminDataManagement {

	private MySQLDBConnection dbObj=new MySQLDBConnection();
	private String sql;

	private Administrator admObj=new Administrator();
	
	public void searchData(){
		
		try {
			dbObj.dbConnection();
			Statement selectStmt=dbObj.getConn().createStatement();
		
			sql="SELECT * FROM admin WHERE AdminID="+admObj.getAdminID()+"";
			ResultSet rs=selectStmt.executeQuery(sql);
			
			if(rs.next()){
				System.out.println("ADMIN ID: "+rs.getString(1));
				System.out.println("ADMIN NAME: "+rs.getString(2));
				System.out.println("USERNAME: "+rs.getString(3));
				System.out.println("PASSWORD: "+rs.getString(4));
				System.out.println("ACCOUNT EXPIRY DATE: "+rs.getString(5));
				System.out.println("OTHER DETAILS: "+rs.getString(6));
				
			} else {
				System.out.println("RECORD NOT FOUND !!");
			}
			        
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void insertData(){
		
		try {
			
			dbObj.dbConnection();
			Statement insertStmt=dbObj.getConn().createStatement();
			
			sql="INSERT INTO admin VALUES ('"+admObj.getAdminName()+"', '"+admObj.getAdminUserName()+"', '"+admObj.getAdminPassword()+"', '"+admObj.getAccountExpiryDate()+"', '"+admObj.getAdminOtherDetails()+"')";
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
	
	public void updateData(){
	
		try {
			
			dbObj.dbConnection();
			Statement updateStmt=dbObj.getConn().createStatement();
			
			sql="UPDATE admin SET FullName='"+admObj.getAdminName()+"', AdminUserName='"+admObj.getAdminUserName()+"', AdminPassword='"+admObj.getAdminPassword()+"', accountExpiryDate='"+admObj.getAccountExpiryDate()+"', adminOtherDetails='"+admObj.getAdminOtherDetails()+"' WHERE AdminID="+admObj.getAdminID()+"";
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
	
	public void deleteData(){
		
		try {
			
			dbObj.dbConnection();
			Statement deleteStmt=dbObj.getConn().createStatement();
	
			sql="DELETE FROM admin WHERE AdminID="+admObj.getAdminID()+"";
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
