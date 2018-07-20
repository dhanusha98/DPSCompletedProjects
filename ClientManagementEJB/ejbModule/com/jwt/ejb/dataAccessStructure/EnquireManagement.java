package com.jwt.ejb.dataAccessStructure;

import javax.ejb.Remote;

@Remote
public interface EnquireManagement {

	public void searchEnquiry(int enquiryID);
    public void insertEnquiry(String senderName, String telephoneNumber, String emailAddress, String address, String message, String feedback);
    public void updateEnquiry(int enquiryID, String senderName, String telephoneNumber, String emailAddress, String address, String message, String feedback);
    public void deleteEnquiry(int enquiryID);
}
