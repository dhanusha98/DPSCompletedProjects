package com.jwt.ejb.businesslogicLayer;

import javax.ejb.Stateless;

import com.jwt.ejb.business.EnquireOperationManagement;
import com.jwt.ejb.dataAccessLayer.EnquireDataAccessor;

@Stateless
public class EnquireOperation implements EnquireOperationManagement {
	
	private Enquiry enqObj=new Enquiry();
	private EnquireDataAccessor enqDAObj=new EnquireDataAccessor();
	
	private String transactionStatus=""; //VARIABLE TO DISPLAY TRANSACTIONS STATUS OF INSERT, UPDATE AND DELETE OPERATIONS
	private boolean queryResult; //QUERY RESULT STATUS IN DATA ACCESS LAYER OPERATIONS

	 public void searchEnquiry()
	 {
		 
		//SEARCH ENQUIRY OPERATION
			
		//IN FOLLOWING, GET PROVIDED ADMIN DETAILS TO IMPLEMENT 'SEARCH OPERATION'
		 
		 int enquiryID=enqObj.getEnquiryID();
		 enqDAObj.searchEnquiry(enquiryID);
		 
	 }
	 public String insertEnquiry()
	 {
		 
		//INSERT ENQUIRY OPERATION
			
		//IN FOLLOWING, GET PROVIDED ADMIN DETAILS TO IMPLEMENT 'INSERT OPERATION'
		 
		 String senderName=enqObj.getSenderName();
	     String telephoneNumber=enqObj.getTelephoneNumber();
		 String emailAddress=enqObj.getEmailAddress();
		 String address=enqObj.getAddress();
		 String message=enqObj.getMessage();
		 String feedback=enqObj.getFeedback();
		 
		 queryResult=enqDAObj.insertEnquiry(senderName, telephoneNumber, emailAddress, address, message, feedback);
		 
		 if (queryResult == true) {
				transactionStatus="SUCCESFULLY INSERTED !";
	     } else {
				transactionStatus="INSERTION FAILED !";
		 }
			
		return transactionStatus;

	 }
	 public String updateEnquiry()
	 {
		 
		//UPDATE ENQUIRY OPERATION
			
		//IN FOLLOWING, GET PROVIDED ADMIN DETAILS TO IMPLEMENT 'UPDATE OPERATION'
		 
		 int enquiryID=enqObj.getEnquiryID();
		 String feedback=enqObj.getFeedback();
		 
		 queryResult=enqDAObj.updateEnquiry(enquiryID, feedback);
		 
		 if (queryResult == true) {
				transactionStatus="FEEDBACK PROVIDED !";
		 } else {
				transactionStatus="UPDATION FAILED !";
		 }
			
	    return transactionStatus;
			
	 }
	 
	 public String deleteEnquiry()
	 {
		 
		//DELETE ENQUIRY OPERATION
			
	   //IN FOLLOWING, GET PROVIDED ADMIN DETAILS TO IMPLEMENT 'DELETE OPERATION'
		 
		 int enquiryID=enqObj.getEnquiryID();
		
		 queryResult=enqDAObj.deleteEnquiry(enquiryID);
		 
		 if (queryResult == true) {
			  transactionStatus="SUCCESFULLY DELETED !";
		} else {
			  transactionStatus="DELETION FAILED !";
		}
			
		return transactionStatus;
			
	 }
	
}
