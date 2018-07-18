package com.jwt.ejb.businesslogic;

import javax.ejb.Stateless;

import com.jwt.ejb.business.UserProfile;
import com.jwt.ejb.dataAccess.UserProfileDataAccessor;

@Stateless
public class UserProfileOperation implements UserProfile {

	private User userObj=new User();
	private UserProfileDataAccessor userDAObj=new UserProfileDataAccessor();
	
	public void searchProfile() {
		
		try {
			
			int userID=userObj.getUserID();
			userDAObj.searchProfile(userID);
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public void insertProfile() {
		
		try {
			
			String fullname=userObj.getFullname();
			String username=userObj.getUsername();
			String password=userObj.getPassword();
			String otherProfileDetails=userObj.getOtherDetails();
			
			userDAObj.insertProfile(fullname, username, password, otherProfileDetails);
			
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public void updateProfile() {
		
		try {
			
			int userID=userObj.getUserID();
			String fullname=userObj.getFullname();
			String username=userObj.getUsername();
			String password=userObj.getPassword();
			String otherProfileDetails=userObj.getOtherDetails();
			
			userDAObj.updateProfile(userID, fullname, username, password, otherProfileDetails);
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	public void deleteProfile() {
		
		try {
			
			int userID=userObj.getUserID();
			userDAObj.deleteProfile(userID);
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
