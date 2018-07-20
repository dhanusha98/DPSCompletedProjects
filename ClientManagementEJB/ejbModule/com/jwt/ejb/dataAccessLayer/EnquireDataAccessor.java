package com.jwt.ejb.dataAccessLayer;

import javax.ejb.Stateless;

import com.jwt.ejb.dataAccessStructure.EnquireManagement;

@Stateless
public class EnquireDataAccessor implements EnquireManagement {
	
	public void searchEnquiry(int enquiryID)
	{
		
	}
    public void insertEnquiry(String senderName, String telephoneNumber, String emailAddress, String address, String message, String feedback)
    {
    	
    }
    public void updateEnquiry(int enquiryID, String senderName, String telephoneNumber, String emailAddress, String address, String message, String feedback)
    {
    	
    }
    public void deleteEnquiry(int enquiryID)
    {
    	
    }

}
