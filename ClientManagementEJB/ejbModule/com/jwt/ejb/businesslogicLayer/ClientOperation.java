package com.jwt.ejb.businesslogicLayer;

import javax.ejb.Stateless;

import com.jwt.ejb.business.ClientOperationManagement;
import com.jwt.ejb.dataAccessLayer.ClientDataAccessor;

@Stateless
public class ClientOperation implements ClientOperationManagement{
	
	private Client clObj=new Client();
	private ClientDataAccessor clDAObj=new ClientDataAccessor();
	
	private String transactionStatus=""; //VARIABLE TO DISPLAY TRANSACTIONS STATUS OF INSERT, UPDATE AND DELETE OPERATIONS
	private boolean queryResult; //QUERY RESULT STATUS IN DATA ACCESS LAYER OPERATIONS
	
	public void viewOwnProfile()
	{
		
		String username=clObj.getUsername();
		String password=clObj.getPassword();
		
		clDAObj.viewOwnProfile(username, password);
	}

	public void searchProfile()
	{
		
		//SEARCH CUSTOMER PROFILE OPERATION
		
		//IN FOLLOWING, GET PROVIDED ADMIN DETAILS TO IMPLEMENT 'SEARCH OPERATION'
		
		int customerID=clObj.getCustomerID();
		clDAObj.searchProfile(customerID);
		
	}
	public String insertProfile()
	{
		
		//INSERT CUSTOMER PROFILE OPERATION
		
		//IN FOLLOWING, GET PROVIDED ADMIN DETAILS TO IMPLEMENT 'INSERT OPERATION'
		
		String customerFullName=clObj.getCustomerFullName();
		String username=clObj.getUsername();
		String password=clObj.getPassword();
		String otherDetails=clObj.getOtherDetails();
		
		queryResult=clDAObj.insertProfile(customerFullName, username, password, otherDetails);
		
        if (queryResult == true) {
			
			transactionStatus="SUCCESFULLY INSERTED !";
		} else {
			
			transactionStatus="INSERTION FAILED !";
		}
		
		return transactionStatus;
	}
	public String updateProfile()
	{
		
		//UPDATE CUSTOMER PROFILE OPERATION
		
		//IN FOLLOWING, GET PROVIDED ADMIN DETAILS TO IMPLEMENT 'UPDATE OPERATION'
		
		int customerID=clObj.getCustomerID();
		String customerFullName=clObj.getCustomerFullName();
		String username=clObj.getUsername();
		String password=clObj.getPassword();
		String otherDetails=clObj.getOtherDetails();
		
		queryResult=clDAObj.updateProfile(customerID, customerFullName, username, password, otherDetails);
		
        if (queryResult == true) {
			
			transactionStatus="SUCCESFULLY UPDATED !";
		} else {
			
			transactionStatus="UPDATION FAILED !";
		}
		
		return transactionStatus;
		
	}
	public String deleteProfile()
	{
		
		//DELETE CUSTOMER PROFILE OPERATION
		
	    //IN FOLLOWING, GET PROVIDED ADMIN DETAILS TO IMPLEMENT 'DELETE OPERATION'
		
		int customerID=clObj.getCustomerID();
		
		queryResult=clDAObj.deleteProfile(customerID);
		
         if (queryResult == true) {
			
			transactionStatus="SUCCESFULLY DELETED !";
		} else {
			
			transactionStatus="DELETION FAILED !";
		}
		
		return transactionStatus;
	}
}
