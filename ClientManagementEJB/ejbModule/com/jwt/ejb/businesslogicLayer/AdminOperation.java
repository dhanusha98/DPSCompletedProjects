package com.jwt.ejb.businesslogicLayer;

import javax.ejb.Stateless;

import com.jwt.ejb.business.AdminOperationManagement;
import com.jwt.ejb.dataAccessLayer.AdminDataAccessor;

@Stateless
public class AdminOperation implements AdminOperationManagement {
	
	private Admin admObj=new Admin();
	private AdminDataAccessor admDAObj=new AdminDataAccessor();
	
	private String transactionStatus=""; //VARIABLE TO DISPLAY TRANSACTIONS STATUS OF INSERT, UPDATE AND DELETE OPERATIONS
	private boolean queryResult; //QUERY RESULT STATUS IN DATA ACCESS LAYER OPERATIONS
	
	public void viewOwnProfile()
	{
		
		String username=admObj.getUsername();
		String password=admObj.getPassword();
		
		admDAObj.viewOwnProfile(username, password);
	}
	
	public void searchProfile()
	{	
		//SEARCH ADMIN PROFILE OPERATION
		
		//IN FOLLOWING, GET PROVIDED ADMIN DETAILS TO IMPLEMENT 'SEARCH OPERATION'
		
	    int adminID=admObj.getAdminID();
	    admDAObj.searchProfile(adminID);
		
	}
	
	public String insertProfile()
	{
		
		//INSERT ADMIN PROFILE OPERATION
		
		//IN FOLLOWING, GET PROVIDED ADMIN DETAILS TO IMPLEMENT 'INSERT OPERATION'
		
		String adminName=admObj.getAdminName();
		String username=admObj.getUsername();
		String password=admObj.getPassword();
		String otherDetails=admObj.getOtherDetails();
		
		queryResult=admDAObj.insertProfile(adminName, username, password, otherDetails);
		
		if (queryResult == true) {
			
			transactionStatus="SUCCESFULLY INSERTED !";
		} else {
			
			transactionStatus="INSERTION FAILED !";
		}
		
		return transactionStatus;
		
	}
	
	public String updateProfile()
	{
		
		//UPDATE ADMIN PROFILE OPERATION
		
		//IN FOLLOWING, GET PROVIDED ADMIN DETAILS TO IMPLEMENT 'UPDATE OPERATION'
				
		int adminID=admObj.getAdminID();
		String adminName=admObj.getAdminName();
		String username=admObj.getUsername();
		String password=admObj.getPassword();
		String otherDetails=admObj.getOtherDetails();
		
		queryResult=admDAObj.updateProfile(adminID, adminName, username, password, otherDetails);
		
        if (queryResult == true) {
			
			transactionStatus="SUCCESFULLY UPDATED !";
		} else {
			
			transactionStatus="UPDATION FAILED !";
		}
        
        return transactionStatus;
	}
	
	public String deleteProfile()
	{
		
		//DELETE ADMIN PROFILE OPERATION
		
		//IN FOLLOWING, GET PROVIDED ADMIN DETAILS TO IMPLEMENT 'DELETE OPERATION'
		
		int adminID=admObj.getAdminID();  
		queryResult=admDAObj.deleteProfile(adminID);
		
        if (queryResult == true) {
			
			transactionStatus="SUCCESFULLY UPDATED !";
		} else {
			
			transactionStatus="UPDATION FAILED !";
		}
        
        return transactionStatus;
	}

}
