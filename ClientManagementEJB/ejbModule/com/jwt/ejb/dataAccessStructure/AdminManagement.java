package com.jwt.ejb.dataAccessStructure;

import javax.ejb.Remote;

@Remote
public interface AdminManagement {

	public boolean userValidation(String username, String password);
	public void searchProfile(int adminID);
	public boolean insertProfile(String adminName, String username, String password, String otherDetails);
	public boolean updateProfile(int adminID, String adminName, String username, String password, String otherDetails);
	public boolean deleteProfile(int adminID);
	
}
