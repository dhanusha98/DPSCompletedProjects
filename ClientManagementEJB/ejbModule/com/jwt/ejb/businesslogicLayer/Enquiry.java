package com.jwt.ejb.businesslogicLayer;

public class Enquiry {
	
	//ENQUIRY ENTITY WITH ITS ATTRIBUTES AND METHODS TO ACCESS AND SET VALUES FOR THEM

	
	private int enquiryID;
	private String senderName;
	private String telephoneNumber;
	private String emailAddress;
	private String address;
	private String message;
	private String feedback;
	
	public int getEnquiryID() {
		return enquiryID;
	}
	public void setEnquiryID(int enquiryID) {
		this.enquiryID = enquiryID;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
}
