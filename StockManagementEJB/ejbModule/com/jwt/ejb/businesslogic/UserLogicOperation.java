package com.jwt.ejb.businesslogic;

import javax.ejb.Stateless;

import com.jwt.ejb.business.UserLogin;
import com.jwt.ejb.dataAccess.UserProfileDataAccessor;

@Stateless
public class UserLogicOperation implements UserLogin{

	private User userObj=new User();
	private UserProfileDataAccessor userDAObj=new UserProfileDataAccessor();
	
	public boolean formValidation(){
		
		boolean formValidationStatus;
		
		if(userObj.getUsername().isEmpty() || userObj.getPassword().isEmpty()) {
			formValidationStatus=false;
		} else {
			formValidationStatus=true;
		}
		
		return formValidationStatus;
	}
	public String LoginTransaction() {
		
		String userValidationResult="";
		
	    try {
	    	
	    	String username=userObj.getUsername();
	    	String password=userObj.getPassword();
	    	
	    	userValidationResult=userDAObj.userValidation(username, password);
	    }
	    
	    catch(Exception ex) {
	    	ex.printStackTrace();
	    }
	    
	    return userValidationResult;
	}
}
