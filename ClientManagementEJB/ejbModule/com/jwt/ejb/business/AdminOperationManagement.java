package com.jwt.ejb.business;

import javax.ejb.Remote;

@Remote
public interface AdminOperationManagement {
	
	//INTERFACE FOR ADMIN PROFILE MANAGEMENT OPERATIONS

	public void viewOwnProfile(); //METHOD FOR VIEW OWN PROFILE DETAILS
	public void searchProfile();  //METHOD FOR SEARCH PROFILE DETAILS
	public String insertProfile(); //METHOD FOR INSERT PROFILE DETAILS
	public String updateProfile(); //METHOD FOR UPDATE PROFILE DETAILS
	public String deleteProfile(); //METHOD FOR DELETE PROFILE DETAILS

}
