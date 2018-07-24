package com.jwt.ejb.presentationLayer;

import java.util.Scanner;

import com.jwt.ejb.businesslogicLayer.EnquireOperation;
import com.jwt.ejb.businesslogicLayer.Enquiry;

public class EnquiryManagementViewer {
	
	private static Enquiry enqObj=new Enquiry();
	private static EnquireOperation enquireOPObj=new EnquireOperation();
	
	private static String transactionResultStatus;
	
	private static Scanner sc=new Scanner(System.in);
	
	public static void searchEnquiry()
	{
		
		System.out.println("==================================== SEARCH ENQUIRY ====================================");

		System.out.println("ENTER ENQUIRY ID: ");
		int enquiryID=sc.nextInt();
		
		if(String.valueOf(enquiryID).isEmpty()) {
			
			System.out.println("ENQUIRY ID IS EMPTY !");
		} else {
			
			enqObj.setEnquiryID(enquiryID);			
			enquireOPObj.searchEnquiry();
		}
	}
	
	public static void insertEnquiry()
	{
		
		System.out.println("==================================== INSERT ENQUIRY ====================================");

		System.out.println("ENTER SENDER NAME: ");
		String senderName=sc.nextLine();
		
		System.out.println("ENTER TELEPHONE NUMBER: ");
		String telephoneNumber=sc.nextLine();
		
		System.out.println("ENTER EMAIL ADDRESS: ");
		String emailAddress=sc.nextLine();
		
		System.out.println("ENTER ADDRESS: ");
		String address=sc.nextLine();
		
		System.out.println("ENTER MESSAGE: ");
		String message=sc.nextLine();
		
		System.out.println("ENTER FEEDBACK: ");
		String feedback=sc.nextLine();
		
		if(senderName.isEmpty() || telephoneNumber.isEmpty() || emailAddress.isEmpty() 
		   || address.isEmpty() || message.isEmpty() || feedback.isEmpty()) {
			
			System.out.println("MANDATORY FIELDS ARE EMPTY !");
			
		} else {
			
			enqObj.setSenderName(senderName);
			enqObj.setTelephoneNumber(telephoneNumber);
			enqObj.setEmailAddress(emailAddress);
			enqObj.setAddress(address);
			enqObj.setMessage(message);
			enqObj.setFeedback(feedback);
			
			transactionResultStatus=enquireOPObj.insertEnquiry();
			
			System.out.println(transactionResultStatus);
		}
	}
	
	public static void updateEnquiry()
	{
		
		System.out.println("==================================== UPDATE ENQUIRY ====================================");

		System.out.println("ENTER ENQUIRY ID: ");
		int enquiryID=sc.nextInt();
		
		System.out.println("ENTER SENDER NAME: ");
		String senderName=sc.nextLine();
		
		System.out.println("ENTER TELEPHONE NUMBER: ");
		String telephoneNumber=sc.nextLine();
		
		System.out.println("ENTER EMAIL ADDRESS: ");
		String emailAddress=sc.nextLine();
		
		System.out.println("ENTER ADDRESS: ");
		String address=sc.nextLine();
		
		System.out.println("ENTER MESSAGE: ");
		String message=sc.nextLine();
		
		System.out.println("ENTER FEEDBACK: ");
		String feedback=sc.nextLine();

		if(senderName.isEmpty() || telephoneNumber.isEmpty() || emailAddress.isEmpty() 
				   || address.isEmpty() || message.isEmpty() || feedback.isEmpty()) {
					
					System.out.println("MANDATORY FIELDS ARE EMPTY !");
					
		 } else {
					
			    enqObj.setEnquiryID(enquiryID);
			    enqObj.setSenderName(senderName);
			    enqObj.setTelephoneNumber(telephoneNumber);
			    enqObj.setEmailAddress(emailAddress);
				enqObj.setAddress(address);
				enqObj.setMessage(message);
				enqObj.setFeedback(feedback);
					
				transactionResultStatus=enquireOPObj.updateEnquiry();
					
				System.out.println(transactionResultStatus);
		}
		
	}
	
	public static void deleteEnquiry()
	{
		
		System.out.println("==================================== DELETE ENQUIRY ====================================");

		System.out.println("ENTER ENQUIRY ID: ");
		int enquiryID=sc.nextInt();
		
        if(String.valueOf(enquiryID).isEmpty()) {
        	
			System.out.println("ENQUIRY ID IS EMPTY !");
		} else {
			
			enqObj.setEnquiryID(enquiryID);			
			
			transactionResultStatus=enquireOPObj.deleteEnquiry();
			System.out.println(transactionResultStatus);

		}
		
	}
	
	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		
		System.out.println("=====================================================================================");
		System.out.println("                             ENQUIRY MAANGEMENT                                      ");
		System.out.println("=====================================================================================");
		
		System.out.println();
		
		System.out.println("PRESS A FUNCTION NUMBER IN FOLLOWING LIST TO IMPLEMENT CORRESPONDING SERVICE");
		System.out.println();
		
		System.out.println("1. SEARCH ENQUIRY");
		System.out.println("2. INSERT ENQUIRY");
		System.out.println("3. UPDATE ENQUIRY");
		System.out.println("4. DELETE ENQUIRY");
		System.out.println("5. BACK TO MAIN MENU");
		
		System.out.println();
		
		System.out.println("FUNCTION NUMBER: ");
		int selectedFunction=sc.nextInt();
		
		switch(selectedFunction) {
		
		     case 1:
		    	 searchEnquiry();
		    	 break;
		    	 
		     case 2:
		    	 insertEnquiry();
		    	 break;
		    	 
		     case 3:
		    	 updateEnquiry();
		    	 break;
		    	 
		     case 4:
		    	 deleteEnquiry();
		    	 break;
		    	 
		     case 5:
		    	 AdminMainMenu.main(new String[0]);
		    	 break;
		    	 
		     default:
		    	 System.out.println("INVALID FUNCTION NUMBER ! PLEASE TRY AGAIN !");
			    break;
		}
	}

}
