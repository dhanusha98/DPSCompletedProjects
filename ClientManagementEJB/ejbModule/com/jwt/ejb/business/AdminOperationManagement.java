package com.jwt.ejb.business;

import javax.ejb.Remote;

@Remote
public interface AdminOperationManagement {

	public void searchProfile();
	public void insertProfile();
	public void updateProfile();
	public void deleteProfile();

}
