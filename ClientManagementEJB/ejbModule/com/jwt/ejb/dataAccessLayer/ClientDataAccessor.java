package com.jwt.ejb.dataAccessLayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.ejb.Stateless;

import com.jwt.ejb.dataAccessStructure.ClientManagement;

@Stateless
public class ClientDataAccessor implements ClientManagement {
	
	private DatabaseConnection dbconnObj=new DatabaseConnection();
	private String sql; //VARIABLE TO USE FOR SQL QUERIES
	
	private Connection conn=dbconnObj.dbConnection();	
	
	public boolean userValidation(String username, String password)
	{
		
		boolean isValid=false;
		
		try {
			
			Statement validationStmt=conn.createStatement();
			sql="SELECT * FROM customer WHERE CustomerUsername='"+username+"', AND CustomerPassword='"+password+"'";
			
			ResultSet rs=validationStmt.executeQuery(sql);
			
			if(rs.next())
			{
				isValid=true;
			} else {
				isValid=false;
			}
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return isValid;
		
	}

	public void searchProfile(int customerID) 
	{
		
		try {
			
			Statement selectStmt=conn.createStatement();
			sql="SELECT * FROM customer WHERE CustomerID="+customerID+"";
			
			ResultSet rs=selectStmt.executeQuery(sql);
			
			if(rs.next())
			{
				System.out.println("CUSTOMER ID: "+rs.getString(1));
				System.out.println("CUSTOMER FULL NAME: "+rs.getString(2));
				System.out.println("USERNAME: "+rs.getString(3));
				System.out.println("PASSWORD: "+rs.getString(4));
				System.out.println("OTHER DETAILS: "+rs.getString(5));
				
			} else {
				System.out.println("PROFILE DETAILS NOT FOUND !");
			}
			
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	public boolean insertProfile(String customerFullName, String username, String password, String otherDetails) 
	{
		
		boolean insertionStatus=false;
	
		try {
			
			Statement insertStmt=conn.createStatement();
			sql="INSERT INTO customer VALUES ('"+customerFullName+"', '"+username+"', '"+password+"', '"+otherDetails+"')";
			
			int result = insertStmt.executeUpdate(sql);
			
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
	public boolean updateProfile(int customerID, String customerFullName, String username, String password, String otherDetails)
	{
		
		boolean updateStatus=false;
		
		try {
			
			Statement updateStmt=conn.createStatement();
			sql="UPDATE customer SET CustomerFullName='"+customerFullName+"', Username='"+username+"', Password='"+password+"', OtherDetails='"+otherDetails+"' WHERE CustomerID="+customerID+"";
			
			int result = updateStmt.executeUpdate(sql);
			
			if (result > 0) {
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
	public boolean deleteProfile(int customerID) 
	{
		
		boolean deleteStatus=false;
		
		try {
			
			Statement deleteStmt=conn.createStatement();
			sql="DELETE FROM customer WHERE CustomerID="+customerID+"";
			
			int result=deleteStmt.executeUpdate(sql);
			
			if(result > 0) {
				deleteStatus=true;
			} else {
				deleteStatus=false;
			}
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return deleteStatus;
	}
}
