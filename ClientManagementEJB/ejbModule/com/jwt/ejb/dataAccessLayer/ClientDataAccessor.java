package com.jwt.ejb.dataAccessLayer;

import javax.ejb.Stateless;

import com.jwt.ejb.dataAccessStructure.ClientManagement;

@Stateless
public class ClientDataAccessor implements ClientManagement {

	public void searchProfile(int customerID) {
		
	}
	public void insertProfile(String customerFullName, String username, String password, String otherDetails) {
		
	}
	public void updateProfile(int customerID, String customerFullName, String username, String password, String otherDetails) {
		
	}
	public void deleteProfile(int customerID) {
		
	}
}
