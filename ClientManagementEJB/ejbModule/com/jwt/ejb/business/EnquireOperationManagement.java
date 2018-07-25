package com.jwt.ejb.business;

import javax.ejb.Remote;

@Remote
public interface EnquireOperationManagement {
	
	//INTERFACE FOR ENQUIRY DETAILS MANAGEMENT

    public void searchEnquiry(); //METHOD FOR SEARCH PROFILE DETAILS
    public String insertEnquiry(); //METHOD FOR INSERT PROFILE DETAILS
    public String updateEnquiry(); //METHOD FOR UPDATE PROFILE DETAILS
    public String deleteEnquiry(); //METHOD FOR DELETE PROFILE DETAILS
}
