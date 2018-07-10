package dataTier;

import java.sql.*;
import entityTypes.Enquiry;

public class EnquiryManagement {

	MySQLDBConnection dbObj=new MySQLDBConnection();
	String sql;
	
	private Enquiry enqObj=new Enquiry();
	
	public void searchEnquiry(){
		
		try {
			
			dbObj.dbConnection();
			Statement selectStmt=dbObj.getConn().createStatement();
			
			sql="SELECT * FROM enquiry WHERE EnquiryID="+enqObj.getEnquiryID()+"";
			
			ResultSet rs=selectStmt.executeQuery(sql);
			
			if(rs.next()){
				
				System.out.println("ENQUIRY ID: "+rs.getString(1));
				System.out.println("ENQUIRY HOLDER ID: "+rs.getString(2));
				System.out.println("ENQUIRY HOLDER NAME: "+rs.getString(3));
				System.out.println("EMAIL ADDRESS: "+rs.getString(4));
				System.out.println("SUBJECT: "+rs.getString(5));
				System.out.println("MESSAGE: "+rs.getString(6));
				System.out.println("FEEDBACK STATUS: "+rs.getString(7));
				
			} else {
				System.out.println("ENQUIRY ID NOT FOUND !");
			}
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void insertEnquiry(){
		
		try {
			
			dbObj.dbConnection();
			Statement insertStmt=dbObj.getConn().createStatement();
			
			sql="INSERT INTO enquiry VALUES ("+enqObj.getEnquiryHolderID()+", '"+enqObj.getEnquiryHolderName()+"', '"+enqObj.getEmailAddress()+"', '"+enqObj.getSubject()+"', '"+enqObj.getMessage()+"', '"+enqObj.getFeedbackStatus()+"')";
			
			int result=insertStmt.executeUpdate(sql);
			
			if(result > 0){
				System.out.println("ENQUIRY SENT SUCCESSFULLY !");
				
			} else {
				System.out.println("FAILED TO SEND THE ENQUIRY !");
			}
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void updateEnquiry(){
		
		try {
			
			dbObj.dbConnection();
			Statement updateStmt=dbObj.getConn().createStatement();
			
			sql="UPDATE enquiry SET EnquiryHolderID='"+enqObj.getEnquiryHolderID()+"', EnquiryHolderName='"+enqObj.getEnquiryHolderName()+"', EmailAddress='"+enqObj.getEmailAddress()+"', Subject='"+enqObj.getSubject()+"', Message='"+enqObj.getMessage()+"', feedbackStatus='"+enqObj.getFeedbackStatus()+"', WHERE EnquiryID="+enqObj.getEnquiryID()+"";
			
			int result=updateStmt.executeUpdate(sql);
			
			if(result > 0){
				System.out.println("ENQUIRY UPDATED SUCCESSFULLY !");
			} else {
				System.out.println("FAILED TO UPDATE THE ENQUIRY !");
			}
		}
		
		catch(Exception ex){	
			ex.printStackTrace();
		}
	}
	
	public void deleteEnquiry(){
		
		try {
			
			dbObj.dbConnection();
			Statement deleteStmt=dbObj.getConn().createStatement();
			
			sql="DELETE FROM enquiry WHERE EnquiryID="+enqObj.getEnquiryID()+"";
			
			int result=deleteStmt.executeUpdate(sql);
			
			if(result > 0){
				System.out.println("ENQUIRY DELETED SUCCESSFULLY !");
			} else {
				System.out.println("FAILED TO DELETE THE ENQUIRY !");	
			}
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
