package com.jwt.ejb.dataAccessStructure;

import javax.ejb.Remote;

@Remote
public interface ClientManagement {
	
	//INTERFACE FOR DATA ACCESS LAYER OPERATIONS OF CLIENT OPERATIONS
	
	public boolean userValidation(String username, String password); //METHOD FOR USER VALIDATION FROM DATABASE
	public void viewOwnProfile(String username, String password); //METHOD TO RETRIEVE OWN USER PROFILE DETAILS FROM DATABASE
	public void searchProfile(int customerID); //METHOD FOR SEARCH PROFILE DETAILS FROM DATABASE
	public boolean insertProfile(String customerFullName, String username, String password, String otherDetails); //METHOD FOR INSERT PROFILE DETAILS FROM DATABASE
	public boolean updateProfile(int customerID, String customerFullName, String username, String password, String otherDetails); //METHOD FOR UPDATE PROFILE DETAILS FROM DATABASE
	public boolean deleteProfile(int customerID); //METHOD FOR DELETE PROFILE DETAILS FROM DATABASE

}
