package com.jwt.ejb.dataAccessStructure;

import javax.ejb.Remote;

@Remote
public interface ClientManagement {

	public void searchProfile(int customerID);
	public void insertProfile(String customerFullName, String username, String password, String otherDetails);
	public void updateProfile(int customerID, String customerFullName, String username, String password, String otherDetails);
	public void deleteProfile(int customerID);

}
