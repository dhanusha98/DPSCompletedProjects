package com.jwt.ejb.dataAccessStructure;

import javax.ejb.Remote;

@Remote
public interface AdminManagement {
	
	//INTERFACE FOR DATA ACCESS LAYER OPERATIONS OF ADMIN OPERATIONS
	
	public boolean userValidation(String username, String password); //METHOD FOR USER VALIDATION FROM DATABASE
	public void viewOwnProfile(String username, String password); //METHOD TO RETRIEVE OWN USER PROFILE DETAILS FROM DATABASE
	public void searchProfile(int adminID); //METHOD FOR SEARCH PROFILE DETAILS FROM DATABASE
	public boolean insertProfile(String adminName, String username, String password, String otherDetails); //METHOD FOR INSERT PROFILE DETAILS FROM DATABASE
	public boolean updateProfile(int adminID, String adminName, String username, String password, String otherDetails); //METHOD FOR UPDATE PROFILE DETAILS FROM DATABASE
	public boolean deleteProfile(int adminID); //METHOD FOR DELETE PROFILE DETAILS FROM DATABASE
	
}
