package com.jwt.ejb.dataAccessStructure;

import javax.ejb.Remote;

@Remote
public interface EnquireManagement {

	public void searchEnquiry(int enquiryID);
    public boolean insertEnquiry(String senderName, String telephoneNumber, String emailAddress, String address, String message, String feedback);
    public boolean updateEnquiry(int enquiryID, String feedback);
    public boolean deleteEnquiry(int enquiryID);
}
