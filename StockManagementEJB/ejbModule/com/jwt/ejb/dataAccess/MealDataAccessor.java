package com.jwt.ejb.dataAccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MealDataAccessor {

	private DatabaseConnection dbObj=new DatabaseConnection();
	private Connection getDBConnection=dbObj.createDBConnection();
	private String sql; //SQL Query;
	
	 public void searchProduct(int productID) {
		
        try {
			 
			 Statement selectStmt=getDBConnection.createStatement();
			 sql="SELECT * FROM meal WHERE MealProductID="+productID+"";
			 
			 ResultSet rs=selectStmt.executeQuery(sql);
			 
			 if(rs.next()) {
				 System.out.println("MEAL PRODUCT ID: "+rs.getString(1));
				 System.out.println("MEAL NAME: "+rs.getString(2));
				 System.out.println("CATEGORY: "+rs.getString(3));
				 System.out.println("PRICE: "+rs.getString(4));
				 System.out.println("OTHER DETAILS: "+rs.getString(5));
				 
			 } else {
				 System.out.println("NOT FOUND !");
			 }
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
		 
	 }
	 public void insertProduct(String productName, String productType, String price, String otherDetails) {
		 
          try {
       	 
       	 Statement insertStmt=getDBConnection.createStatement();
       	 
       	 sql="INSERT INTO meal VALUES ('"+productName+"', '"+productType+"', '"+price+"', '"+otherDetails+"')";
       	 
       	 int result=insertStmt.executeUpdate(sql);
       	 
       	 if(result > 0) {
       		 System.out.println("PRODUCT ADDED SUCCESSFULLY !");
       	 } else {
       		 System.out.println("PRODUCT INSERTION FAILED !");
       	 }
			 
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
		 
		 
	 }
	 public void updateProduct(int productID, String productName, String productType, String price, String otherDetails) {
		 
       try {
			 
       	 Statement updateStmt=getDBConnection.createStatement();
       	 
       	 sql="UPDATE meal SET MealName='"+productName+"', MealCategory='"+productType+"', MealPrice='"+price+"', MealOtherDetails='"+otherDetails+"', WHERE MealID="+productID+"";
       	 int result=updateStmt.executeUpdate(sql);
       	 
       	 if(result > 0) {
       		 System.out.println("PRODUCT DETAILS UPDATED SUCCESSFULLY !");
       	 } else {
       		 System.out.println("PRODUCT UPDATION FAILED ");
       	 }
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
		 
	 }
	 public void deleteProduct(int productID) {
		 
      try {
			 
       	 Statement deleteStmt=getDBConnection.createStatement();
       	 
       	 sql="DELETE FROM meal WHERE MealID="+productID+"";
       	 int result=deleteStmt.executeUpdate(sql);
       	 
       	 if(result > 0) {
       		 System.out.println("PRODUCT DELETED SUCCESSFULLY !");
       	 } else {
       		 System.out.println("PRODUCT DELETION FAILED !");
       	 }
		 }
		 
		 catch(Exception ex) {
			 ex.printStackTrace();
		 }
		 
	 }
	
}
