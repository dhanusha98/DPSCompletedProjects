package com.jwt.ejb.dataAccessStructure;

import javax.ejb.Remote;

@Remote
public interface AdminManagement {

	public void searchProfile(int adminID);
	public void insertProfile(String adminName, String username, String password, String otherDetails);
	public void updateProfile(int adminID, String adminName, String username, String password, String otherDetails);
	public void deleteProfile(int adminID);
	
}
