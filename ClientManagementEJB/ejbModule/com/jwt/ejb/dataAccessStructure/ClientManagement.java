package com.jwt.ejb.dataAccessStructure;

import javax.ejb.Remote;

@Remote
public interface ClientManagement {
	
	public boolean userValidation(String username, String password);
	public void searchProfile(int customerID);
	public boolean insertProfile(String customerFullName, String username, String password, String otherDetails);
	public boolean updateProfile(int customerID, String customerFullName, String username, String password, String otherDetails);
	public boolean deleteProfile(int customerID);

}
