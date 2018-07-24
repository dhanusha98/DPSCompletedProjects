package com.jwt.ejb.business;

import javax.ejb.Remote;

@Remote
public interface AdminOperationManagement {

	public void searchProfile();
	public String insertProfile();
	public String updateProfile();
	public String deleteProfile();

}
