package businessLogic;

import entityTypes.*;
import dataTier.*;
public class EnquiryMgtOperation {

	private Enquiry enqObj=new Enquiry();
	private EnquiryManagement enqMgtObj=new EnquiryManagement();
	
	/*private int enquiryID;
	private int enquiryHolderID;
	private String enquiryHolderName;
	private String emailAddress;
	private String subject;
	private String message;
	private String feedbackStatus;
	*/
	public void searchEnquiry(int enquiryID)
	{
		
		if(String.valueOf(enquiryID).isEmpty()){
			
			System.out.println("PLEASE ENQUIRY ID !");
		} else {
			
		    enqObj.setEnquiryID(enquiryID);
		    enqMgtObj.searchEnquiry();
		}
	}
	
	public void insertEnquiry(int enquiryHolderID, String enquiryHolderName, String emailAddress, 
            String subject, String message, String feedbackStatus)
	{
		
		if(String.valueOf(enquiryHolderID).isEmpty() || enquiryHolderName.isEmpty() || emailAddress.isEmpty() 
		   || subject.isEmpty() || message.isEmpty() || feedbackStatus.isEmpty()){
			System.out.println("MANDATORY FIELDS ARE EMPTY !");
		} else {
			
			enqObj.setEnquiryHolderID(enquiryHolderID);
			enqObj.setEnquiryHolderName(enquiryHolderName);
			enqObj.setEmailAddress(emailAddress);
			enqObj.setSubject(subject);
			enqObj.setMessage(message);
			enqObj.setFeedbackStatus(feedbackStatus);
			
			enqMgtObj.insertEnquiry();
		}
	}
	
	public void updateEnquiry(int enquiryID, int enquiryHolderID, String enquiryHolderName, String emailAddress, 
            String subject, String message, String feedbackStatus)
	{
		
		if(String.valueOf(enquiryID).isEmpty() || String.valueOf(enquiryHolderID).isEmpty() || enquiryHolderName.isEmpty() || emailAddress.isEmpty() 
				   || subject.isEmpty() || message.isEmpty() || feedbackStatus.isEmpty()){
					
			       System.out.println("MANDATORY FIELDS ARE EMPTY !");
		 } else {
					
					enqObj.setEnquiryHolderID(enquiryHolderID);
					enqObj.setEnquiryHolderName(enquiryHolderName);
					enqObj.setEmailAddress(emailAddress);
					enqObj.setSubject(subject);
					enqObj.setMessage(message);
					enqObj.setFeedbackStatus(feedbackStatus);
					
					enqMgtObj.insertEnquiry();
		  }
		
	}
	
	public void deleteEnquiry(int enquiryID)
	{
		
        if(String.valueOf(enquiryID).isEmpty()){
			
			System.out.println("PLEASE ENQUIRY ID !");
		} else {
			
		    enqObj.setEnquiryID(enquiryID);
		    enqMgtObj.deleteEnquiry();
		}
		
	}
}
