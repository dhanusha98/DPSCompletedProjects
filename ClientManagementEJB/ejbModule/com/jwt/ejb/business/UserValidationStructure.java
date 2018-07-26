package com.jwt.ejb.business;

import javax.ejb.Remote;

@Remote
public interface UserValidationStructure {
	
	//INTERFACE FOR USER AUTHENITCATION VALIDATION FUNCTIONALITIES IN 'LOGIN' FOR BOTH 'CUSTOMER' AND 'ADMIN' USER

	public String clientUserValidation();
	public String adminUserValidation();
}
