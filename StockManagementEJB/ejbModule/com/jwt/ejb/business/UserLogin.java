package com.jwt.ejb.business;

import javax.ejb.Remote;

@Remote
public interface UserLogin {

	public boolean formValidation();
	public String LoginTransaction();
	
}
