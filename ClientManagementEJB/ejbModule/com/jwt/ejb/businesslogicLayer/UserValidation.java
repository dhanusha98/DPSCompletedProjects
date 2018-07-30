package com.jwt.ejb.businesslogicLayer;

import javax.ejb.Stateless;

import com.jwt.ejb.business.UserValidationStructure;
import com.jwt.ejb.dataAccessLayer.AdminDataAccessor;
import com.jwt.ejb.dataAccessLayer.ClientDataAccessor;

@Stateless
public class UserValidation implements UserValidationStructure {
	
	private Admin admObj=new Admin();
	private Client custObj=new Client();

	private AdminDataAccessor admDAObj=new AdminDataAccessor();
	private ClientDataAccessor clObj=new ClientDataAccessor();
	
	public String clientUserValidation()
	{
		
		//USER VALIDATION OPERATION FOR CUSTOMER USER ACCOUNTS
		
		String username=custObj.getUsername(); //GET PROVIDED USERNAME
		String password=custObj.getPassword(); //GET PROVIDED PASSWORD
		
		String userValidationStatus=""; //VARIABLE TO DISPLAY RESULT OF USER VALIDATION
				
		boolean userValidationResult=clObj.userValidation(username, password); //STORING USER VALIDATION RESULT IN THE VARIABLE
		
		if(userValidationResult == true) {
			
			userValidationStatus="LOGIN SUCCESSFUL"; //RESULT FOR CORRECT USER AUTHENTICATIONS
		} else {
			
			userValidationStatus="INVALID USER CREDENTIALS"; //RESULT FOR INVALID USER AUTHENTICATIONS
		}
		
		return userValidationStatus; 
		
	}
	public String adminUserValidation()
	{
		
		//USER VALIDATION OPERATION FOR ADMINISTRATOR USER ACCOUNTS
		
		String username=admObj.getUsername(); //GET PROVIDED USERNAME
		String password=admObj.getPassword(); //GET PROVIDED PASSWORD
		
		String userValidationStatus=""; //VARIABLE TO DISPLAY RESULT OF USER VALIDATION
		
		boolean userValidationResult=admDAObj.userValidation(username, password); //STORING USER VALIDATION RESULT IN THE VARIABLE
		
		if(userValidationResult == true) {
			
			userValidationStatus="LOGIN SUCCESSFUL"; //RESULT FOR CORRECT USER AUTHENTICATIONS
		} else {
			
			userValidationStatus="INVALID USER CREDENTIALS"; //RESULT FOR INVALID USER AUTHENTICATIONS
		}
		
		return userValidationStatus;
	}

}
