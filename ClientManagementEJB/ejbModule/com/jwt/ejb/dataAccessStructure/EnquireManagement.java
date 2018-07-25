package com.jwt.ejb.dataAccessStructure;

import javax.ejb.Remote;

@Remote
public interface EnquireManagement {
	
	//INTERFACE FOR DATA ACCESS LAYER OPERATIONS OF ENQUIRY MANAGEMENT OPERATIONS

	public void searchEnquiry(int enquiryID); //METHOD FOR SEARCH ENQUIRY DETAILS FROM DATABASE
    public boolean insertEnquiry(String senderName, String telephoneNumber, String emailAddress, String address, String message, String feedback); //METHOD FOR INSERT ENQUIRE DETAILS FROM DATABASE
    public boolean updateEnquiry(int enquiryID, String feedback); //METHOD FOR UPDATE ENQUIRY DETAILS FROM DATABASE
    public boolean deleteEnquiry(int enquiryID); //METHOD FOR DELETE ENQUIRY DETAILS FROM DATABASE
}
