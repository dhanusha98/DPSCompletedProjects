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

	
	public void searchProfile(int adminID)
	{
		
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
	public void insertProfile(String adminName, String username, String password, String otherDetails)
	{
		
		try {
			
			Statement insertStmt=conn.createStatement();
			sql="INSERT INTO admin VALUES ('"+adminName+"', '"+username+"', '"+password+"', '"+otherDetails+"')";
			
			int result=insertStmt.executeUpdate(sql);
			
			if(result > 0) {
				
				System.out.println("SUCCESSFULLY INSERTED !");
			} else {
				System.out.println("INSERTION FAILED !");
			}
			
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	public void updateProfile(int adminID, String adminName, String username, String password, String otherDetails)
	{
		
		try {
			
			
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	public void deleteProfile(int adminID)
	{
		
	}

}
