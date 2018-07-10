package presentationTier;

import java.util.*;
import entityTypes.*;
public class EnquirySender {

	private static Enquiry enqObj=new Enquiry();
	
    public static void main(String[] args) {
		
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("==========================================================");
    	System.out.println("                     ENQUIRY                              ");
    	System.out.println("==========================================================");
    	
    	System.out.println("ACCOUNT ID: ");
    	int enquiryHolderID=sc.nextInt();
    	
    	System.out.println("NAME: ");
    	String name=sc.nextLine();
    	
    	System.out.println("EMAIL ADDRESS: ");
    	String emailAddress=sc.nextLine();
    	
    	System.out.println("SUBJECT: ");
    	String subject=sc.nextLine();
    	
    	System.out.println("MESSAGE: ");
    	String message=sc.nextLine();
    	
    	System.out.println("FEEDBACK STATUS: ");
    	String feedbackStatus=sc.nextLine();
    	
    	enqObj.setEnquiryHolderID(enquiryHolderID);
    	enqObj.setEnquiryHolderName(name);
    	enqObj.setEmailAddress(emailAddress);
    	enqObj.setSubject(subject);
    	enqObj.setMessage(message);
    	enqObj.setFeedbackStatus(feedbackStatus);
    	
	}
}
