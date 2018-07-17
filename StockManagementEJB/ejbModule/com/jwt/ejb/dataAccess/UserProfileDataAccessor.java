package com.jwt.ejb.dataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserProfileDataAccessor {

	private DatabaseConnection dbObj=new DatabaseConnection();
	 private Connection getDBConnection=dbObj.createDBConnection();
	 private String sql; //SQL Query;
	
	 public String userValidation(String username, String password) {
		 
		 String validationResult="";
		 
		 try {
			 
			 Statement userStmt=getDBConnection.createStatement();
			 sql="SELECT * FROM user WHERE UserName='"+username+"', Password='"+password+"'";
			 
			 ResultSet rs=userStmt.executeQuery(sql);
			 
			 if(rs.next()) {
				 validationResult="LOGIN SUCCESSFUL !";
			 } else {
				 validationResult="INVALID USER AUTHENTICATIONS !";
			 }
		 } 
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
		 
		 return validationResult;
	 }
	 
	 public void searchProfile(int userID) {
		 
		 try {
			 
			 Statement selectStmt=getDBConnection.createStatement();
			 sql="SELECT * FROM user WHERE UserID="+userID+"";
			 
			 ResultSet rs=selectStmt.executeQuery(sql);
			 
			 if(rs.next()) {
				 
				 System.out.println("USER ID: "+rs.getString(1));
				 System.out.println("FULL NAME: "+rs.getString(2));
				 System.out.println("USERNAME: "+rs.getString(3));
				 System.out.println("PASSWORD: "+rs.getString(4));
                 System.out.println("OTHER DETAILS: "+rs.getString(5));

			 } else {
				 System.out.println("USER ID NOT AVAILABLE !");
			 }
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
	 }
	 
	 public void insertProfile(String fullname, String username, String password, String otherProfileDetails) {
		 
		 try {
			 
			 Statement insertStmt=getDBConnection.createStatement();
			 sql="INSERT INTO user VALUES ('"+fullname+"', '"+username+"', '"+password+"', '"+otherProfileDetails+"')";
			 
			 int result=insertStmt.executeUpdate(sql);
			 
			 if(result > 0) {
				 System.out.println("USER PROFILE CREATED SUCCESSFULLY !");
			 } else {
				 System.out.println("USER PROFILE CREATION FAILED !");
			 }
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
	 }
	 
	 public void updateProfile(int userID, String fullname, String username, String password, String otherProfileDetails) {
		 
		 try {
			 
			 Statement updateStmt=getDBConnection.createStatement();
			 sql="UPDATE user SET FullName='"+fullname+"', Username='"+username+"', Password='"+password+"', OtherDetails='"+otherProfileDetails+"', WHERE UserID="+userID+"";
			 
			 int result=updateStmt.executeUpdate(sql);
			 
			 if(result > 0) {
				 System.out.println("USER PROFILE UPDATED SUCCESSFULLY !");
				 
			 } else {
				 System.out.println("USER PROFILE UPDATION FAILED !");
			 }
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
	 }
	 
	 public void deleteProfile(int userID) {
		 
		 try {
			 
			 Statement deleteStmt=getDBConnection.createStatement();
			 sql="DELETE FROM user WHERE UserID="+userID+"";
			 
			 int result=deleteStmt.executeUpdate(sql);
			 
			 if(result > 0) {
				 System.out.println("USER PROFILE DELETED SUCCESSFULLY !");
			 } else {
				 System.out.println("USER PROFILE DELETION FAILED !");
			 }
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
	 }
}
