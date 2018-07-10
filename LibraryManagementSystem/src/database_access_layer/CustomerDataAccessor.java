package database_access_layer;

import java.sql.*;

public class CustomerDataAccessor implements CustomerAccessStructure {

	private DBConnection dbconnObj=new DBConnection();
	Connection dbconnection=dbconnObj.createDBConnection();
	String sql;
	
	business_logic_layer.Customer custObj=new business_logic_layer.Customer();
	
	public boolean customerUserValidation()
	{
		
		boolean result=false;
		
		try {
			
			Statement userValStmt=dbconnection.createStatement();
			sql="SELECT * FROM customer WHERE CustomerUsername='"+custObj.getCustomerUsername()+"' AND CustomerPassword='"+custObj.getCustomerPassword()+"'";
			
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
	
	public void searchCustomer()
	{
	  try {
		  
		  Statement selectStmt=dbconnection.createStatement();
		  sql="SELECT * FROM customer WHERE CustomerID="+custObj.getCustomerID()+"";
		  
		  ResultSet rs=selectStmt.executeQuery(sql);
		  
		  if(rs.next()){
			  
			  System.out.println("CUSTOMER ID: "+rs.getString(1));
			  System.out.println("FULL NAME: "+rs.getString(2));
			  System.out.println("USERNAME: "+rs.getString(3));
			  System.out.println("PASSWORD: "+rs.getString(4));
			  System.out.println("DETAILS: "+rs.getString(5));
			  
		  } else {
			  System.out.println("RECORD NOT FOUND !");
		  }
	  }
	  
	  catch(Exception ex){
		  ex.printStackTrace();
	  }
	}
	
	public void insertCustomer()
	{
	   try {
		   
		   Statement insertStmt=dbconnection.createStatement();
		   sql="INSERT INTO customer VALUES ('"+custObj.getCustomerFullName()+"', '"+custObj.getCustomerUsername()+"', '"+custObj.getCustomerPassword()+"', '"+custObj.getDetails()+"')";
		   
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
	
	public void updateCustomer()
	{
		
	  try {
		  
		  Statement updateStmt=dbconnection.createStatement();
		  sql="UPDATE customer SET CustomerName='"+custObj.getCustomerFullName()+"', CustomerUsername='"+custObj.getCustomerUsername()+"', CustomerPassword='"+custObj.getCustomerPassword()+"', Details='"+custObj.getDetails()+"' WHERE CustomerID="+custObj.getCustomerID()+"";
		  
		  int result=updateStmt.executeUpdate(sql);
		  
		  if(result > 0) {
			  System.out.println("ACCOUNT UPDATED SUCCESSFULLY !");
		  } else {
			  System.out.println("ACCOUNT UPDATE FAILED !");
		  }
	  }
	  
	  catch(Exception ex){
		  ex.printStackTrace();
	  }
		
	}
	
	public void deleteCustomer()
	{
		
	  try {
			  
		 Statement deleteStmt=dbconnection.createStatement();
		 sql="DELETE FROM customer WHERE CustomerID="+custObj.getCustomerID()+"";
		 
		 int result = deleteStmt.executeUpdate(sql);
		 
		 if(result > 0){
			 System.out.println("ACCOUNT DELETED SUCCESSFULLY !");
		 } else {
			 System.out.println("ACCOUNT DELETE FAILED !");
		 }
	  }
		  
	  catch(Exception ex){
			  ex.printStackTrace();
	  }
		
	}
}
