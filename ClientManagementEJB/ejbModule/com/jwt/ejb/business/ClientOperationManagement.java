package com.jwt.ejb.business;

import javax.ejb.Remote;

@Remote
public interface ClientOperationManagement {

	public void searchProfile();
	public void insertProfile();
	public void updateProfile();
	public void deleteProfile();
}
