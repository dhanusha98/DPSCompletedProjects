package dataTier;

import java.sql.*;

import entityTypes.Customer;
public class ClientDataManagement {
	
	
	private MySQLDBConnection dbObj=new MySQLDBConnection();
	private String sql;
	private Customer custObj=new Customer();
	
	public void searchData(){
		
		try {
			
			dbObj.dbConnection();
			Statement selectStmt=dbObj.getConn().createStatement();
			
			sql="SELECT * FROM customer WHERE CustomerID="+custObj.getCustomerID()+"";
			
			ResultSet rs=selectStmt.executeQuery(sql);
			
			if(rs.next()){
				System.out.println("CUSTOMER ID: "+rs.getString(1));
				System.out.println("CUSTOMER NAME: "+rs.getString(2));
				System.out.println("CONTACT INFO: "+rs.getString(3));
				System.out.println("BUYING HISTORY: "+rs.getString(4));
				System.out.println("REGISTERED DATE: "+rs.getString(5));
				System.out.println("TARGET PRODUCT DETAILS: "+rs.getString(6));
				
			} else {
				System.out.println("CUSTOMER PROFILE DETAILS NOT FOUND !");
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
	    	 
	    	 sql="INSERT INTO customer VALUES ('"+custObj.getCustomerName()+"', '"+custObj.getContactInfo()+"', '"+custObj.getBuyingHistory()+"', '"+custObj.getRegisteredDate()+"', '"+custObj.getTargetProductDetails()+"')";
	    	 int result=insertStmt.executeUpdate(sql);
	    	 
	    	 if(result > 0){
	    		 System.out.println("CUSTOMER DETAILS SUCCESSFULLY INSERTED !");
	    	 } else {
	    		 System.out.println("CUSTOMER DETAILS NOT INSERTED !");
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
	    	 
	    	 sql="UPDATE customer SET CustomerName='"+custObj.getCustomerName()+"', ContactInfo='"+custObj.getContactInfo()+"', BuyingHistory='"+custObj.getBuyingHistory()+"', RegisteredDate='"+custObj.getRegisteredDate()+"', TargetProductDetails='"+custObj.getTargetProductDetails()+"', WHERE CustomerID="+custObj.getCustomerID()+"";
	    	 
	    	 int result=updateStmt.executeUpdate(sql);
	    	 
	    	 if(result > 0){
	    		 System.out.println("CUSTOMER DETAILS UPDATED SUCCESSFULLY !");
	    	 } else {
	    		 System.out.println("FAILED TO UPDATE CUSTOMER DETAILS !");
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
			
			sql="DELETE FROM customer WHERE CustomerID="+custObj.getCustomerID()+"";
			
			int result=deleteStmt.executeUpdate(sql);
			
			if(result > 0){
				System.out.println("CUSTOMER DETAILS DELETED SUCCESSFULLY !");
			} else {
				System.out.println("CUSTOMER DETAILS DELETION FAILED !");
			}
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
