package com.jwt.ejb.businesslogic;

import javax.ejb.Stateless;

import com.jwt.ejb.business.UserProfile;
import com.jwt.ejb.dataAccess.UserProfileDataAccessor;

@Stateless
public class UserProfileOperation implements UserProfile {

	private User userObj=new User();
	private UserProfileDataAccessor userDAObj=new UserProfileDataAccessor();
	
	public void searchProfile() {
		
	}
	public void insertProfile() {
		
	}
	public void updateProfile() {
		
	}
	public void deleteProfile() {
		
	}
}
