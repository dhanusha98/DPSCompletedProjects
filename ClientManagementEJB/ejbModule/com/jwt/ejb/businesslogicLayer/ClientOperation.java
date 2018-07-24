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

	public void searchProfile()
	{
		
		int customerID=clObj.getCustomerID();
		clDAObj.searchProfile(customerID);
		
	}
	public String insertProfile()
	{
		
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
