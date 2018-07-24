package com.jwt.ejb.business;

public interface UserValidationStructure {

	public void clientUserValidation(String username, String password);
	public void adminUserValidation(String username, String password);
}
