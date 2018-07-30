package com.jwt.ejb.dataAccessLayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.ejb.Stateless;

import com.jwt.ejb.dataAccessStructure.EnquireManagement;

@Stateless
public class EnquireDataAccessor implements EnquireManagement {

	private DatabaseConnection dbObj=new DatabaseConnection();
	Connection conn=dbObj.dbConnection();
	private String sql; //VARIABLE TO USE FOR SQL QUERIES
	
	public void searchEnquiry(int enquiryID)
	{
		
		//SEARCH ENQUIRY DATA ACCESSING OPERATION
		
		try {
			
			 Statement selectStmt=conn.createStatement();
			 sql="SELECT * FROM enquiry WHERE EnquiryID="+enquiryID+"";
			 
			 ResultSet rs=selectStmt.executeQuery(sql);
			 
			 if(rs.next()) {
				 
				 System.out.println("ENQUIRE ID: "+rs.getString(1));
				 System.out.println("SENDER NAME: "+rs.getString(2));
				 System.out.println("TELEPHONE NUMBER: "+rs.getString(3));
				 System.out.println("EMAIL ADDRESS: "+rs.getString(4));
				 System.out.println("ADDRESS: "+rs.getString(5));
				 System.out.println("MESSAGE: "+rs.getString(6));
				 System.out.println("FEEDBACK: "+rs.getString(7));
				 
			 } else {
				 System.out.println("ENQUIRY NOT FOUND !");
			 }
			 
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
    public boolean insertEnquiry(String senderName, String telephoneNumber, String emailAddress, String address, String message, String feedback)
    {
    	
    	//INSERT ENQUIRY DATA TO DATABASE
    	
    	boolean insertionStatus=false;
    	
    	try {
    		
    		Statement insertStmt=conn.createStatement();
    		sql="INSERT INTO enquiry (SenderName, TelephoneNumber, EmailAddress, Address, Message, Feedback) VALUES ('"+senderName+"', '"+telephoneNumber+"', '"+emailAddress+"', '"+address+"', '"+message+"', '"+feedback+"')";
    		    		
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
    public boolean updateEnquiry(int enquiryID, String feedback)
    {
    	
    	//UPDATE ENQUIRY IN THE DATABASE
    	
    	boolean updateStatus=false;

    	try {
    		
    		Statement updateStmt=conn.createStatement();
    		sql="UPDATE enquiry SET Feedback='"+feedback+"' WHERE enquiryID="+enquiryID+"";
    		
    		int result=updateStmt.executeUpdate(sql);
    		
    		if(result > 0) {
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
    public boolean deleteEnquiry(int enquiryID)
    {
    	
    	//DELETE ENQUIRY DATA IN THE DATABASE
    	
    	boolean deleteStatus=false;

    	try {
    		
    			Statement deleteStmt=conn.createStatement();
    			sql="DELETE FROM enquiry WHERE EnquiryID="+enquiryID+"";
    			
    			int result = deleteStmt.executeUpdate(sql);
    			
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

   /* public static void main(String[] args) {
		
    	EnquireDataAccessor edaObj = new EnquireDataAccessor();
    	
    	boolean result = edaObj.insertEnquiry("PIUMAL", "0712473462", "dhanusharoks@hotmail.com", "Colombo", "Hi", "No Feedback");
    	
    	if(result == true)
    	{
    		
    		System.out.println("INSERTED !");
    	} else {
    		
    		System.out.println("NOT INSERTED !");
    	}
	}*/
}
