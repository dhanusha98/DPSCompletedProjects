package com.jwt.ejb.businesslogicLayer;

import com.jwt.ejb.dataAccessLayer.AdminDataAccessor;
import com.jwt.ejb.dataAccessLayer.ClientDataAccessor;

public class UserValidation {
	
	private Admin admObj=new Admin();
	private Client custObj=new Client();

	private AdminDataAccessor admDAObj=new AdminDataAccessor();
	private ClientDataAccessor clObj=new ClientDataAccessor();
	
	public String clientUserValidation()
	{
		
		String username=custObj.getUsername();
		String password=custObj.getPassword();
		
		String userValidationStatus="";
				
		boolean userValidationResult=clObj.userValidation(username, password);
		
		if(userValidationResult == true) {
			
			userValidationStatus="LOGIN SUCCESSFUL !";
		} else {
			
			userValidationStatus="INVALID USER CREDENTIALS !";
		}
		
		return userValidationStatus;
		
	}
	public String adminUserValidation()
	{
		
		String username=admObj.getUsername();
		String password=admObj.getPassword();
		
		String userValidationStatus="";
		
		boolean userValidationResult=admDAObj.userValidation(username, password);
		
		if(userValidationResult == true) {
			
			userValidationStatus="LOGIN SUCCESSFUL !";
		} else {
			
			userValidationStatus="INVALID USER CREDENTIALS !";
		}
		
		return userValidationStatus;
	}

}
