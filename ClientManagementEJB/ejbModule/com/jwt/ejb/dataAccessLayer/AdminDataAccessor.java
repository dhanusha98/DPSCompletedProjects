package com.jwt.ejb.dataAccessLayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.ejb.Stateless;

import com.jwt.ejb.dataAccessStructure.AdminManagement;

@Stateless
public class AdminDataAccessor implements AdminManagement {
	
	private DatabaseConnection dbconnObj=new DatabaseConnection();
	private String sql; //VARIABLE TO USE FOR SQL QUERIES
	
	private Connection conn=dbconnObj.dbConnection();	

	public boolean userValidation(String username, String password) 
	{
		
		//DATABASE INFORMATION ACCESSOR FOR USER VALIDATIONS
		
		boolean isValid=false;
		
		try {
			
			Statement validationStmt=conn.createStatement();
			sql="SELECT * FROM admin WHERE AdminUsername='"+username+"', AND AdminPassword='"+password+"'";
			
			ResultSet rs=validationStmt.executeQuery(sql);
			
			if(rs.next())
			{
				isValid=true;
			} else {
				isValid=false;
			}
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return isValid;
	}

	public void viewOwnProfile(String username, String password)
	{
		
         try {
			
			Statement validationStmt=conn.createStatement();
			sql="SELECT * FROM admin WHERE AdminUsername='"+username+"', AND AdminPassword='"+password+"'";
			
			ResultSet rs=validationStmt.executeQuery(sql);
			
			if(rs.next())
			{
				System.out.println("ADMIN ID: "+rs.getString(1));
				System.out.println("ADMIN FULL NAME: "+rs.getString(2));
				System.out.println("ADMIN USERNAME: "+rs.getString(3));
				System.out.println("ADMIN PASSWORD: "+rs.getString(4));
				System.out.println("OTHER DETAILS: "+rs.getString(5));
				
			} else {
				
				System.out.println("CAN'T FIND THE PROFILE DETAILS !");
			}
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

	public void searchProfile(int adminID)
	{
		
		//SEARCH PROFILE DATA ACCESSING OPERATION

		try {
			
			Statement selectStmt=conn.createStatement();
			sql="SELECT * FROM admin WHERE AdminID="+adminID+"";
			
			ResultSet rs=selectStmt.executeQuery(sql);
			
			if(rs.next()) {
				
				System.out.println("ADMIN ID: "+rs.getString(1));
				System.out.println("ADMIN FULL NAME: "+rs.getString(2));
				System.out.println("ADMIN USERNAME: "+rs.getString(3));
				System.out.println("ADMIN PASSWORD: "+rs.getString(4));
				System.out.println("OTHER DETAILS: "+rs.getString(5));

			} else {
				System.out.println("CAN'T FIND THE PROFILE DETAILS !");
			}
		}
		
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public boolean insertProfile(String adminName, String username, String password, String otherDetails)
	{
		
		//INSERT PROFILE DATA TO DATABASE

		boolean insertionStatus=false;
		
		try {
			
			Statement insertStmt=conn.createStatement();
			sql="INSERT INTO admin VALUES ('"+adminName+"', '"+username+"', '"+password+"', '"+otherDetails+"')";
			
			int result=insertStmt.executeUpdate(sql);
			
			if(result > 0) {
				insertionStatus=true;
			} else {
				insertionStatus=false;
			}
			
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return insertionStatus;
		
	}
	public boolean updateProfile(int adminID, String adminName, String username, String password, String otherDetails)
	{
		
		//UPDATE PROFILE DATA IN THE DATABASE
		
		boolean updateStatus=false;
		
		try {
			
			Statement updateStmt=conn.createStatement();
			sql="UPDATE admin SET AdminName='"+adminName+"', Username='"+username+"', Password='"+password+"', OtherDetails='"+otherDetails+"' WHERE AdminID="+adminID+"";
			
			int result=updateStmt.executeUpdate(sql);
			
			if(result > 0)
			{
				updateStatus=true;
			} else {
				updateStatus=false;			
			}
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return updateStatus;
		
	}
	public boolean deleteProfile(int adminID)
	{
		
		//DELETE PROFILE DATA IN THE DATABASE
		
		boolean deleteStatus=false;
		
		try {
			
			Statement deleteStmt=conn.createStatement();
			sql="DELETE FROM admin WHERE AdminID="+adminID+"";
			
			int result = deleteStmt.executeUpdate(sql);
			
			if(result > 0) {
				deleteStatus=true;
			} else {
				deleteStatus=false;
			}
		} 
		
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return deleteStatus;
	}

}
