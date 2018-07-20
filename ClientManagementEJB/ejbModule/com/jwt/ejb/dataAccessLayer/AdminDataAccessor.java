package com.jwt.ejb.dataAccessLayer;

import javax.ejb.Stateless;

import com.jwt.ejb.dataAccessStructure.AdminManagement;

@Stateless
public class AdminDataAccessor implements AdminManagement {
	
	public void searchProfile(int adminID)
	{
		
	}
	public void insertProfile(String adminName, String username, String password, String otherDetails)
	{
		
	}
	public void updateProfile(int adminID, String adminName, String username, String password, String otherDetails)
	{
		
	}
	public void deleteProfile(int adminID)
	{
		
	}

}
