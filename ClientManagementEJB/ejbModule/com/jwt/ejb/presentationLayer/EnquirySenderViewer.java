package com.jwt.ejb.presentationLayer;

import java.util.Scanner;

import com.jwt.ejb.businesslogicLayer.EnquireOperation;
import com.jwt.ejb.businesslogicLayer.Enquiry;

public class EnquirySenderViewer {
	
	private static Enquiry enqObj=new Enquiry();
	private static EnquireOperation enqOPObj=new EnquireOperation();
	
	private static String enquirySendStatus;
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("=======================================================================================");
		System.out.println("                               ENQUIRY SERVICE");
		System.out.println("=======================================================================================");
		
		System.out.println();
		
		System.out.println("FULL NAME: ");
		String senderName=sc.nextLine();
		
		System.out.println("TELEPHONE NUMBER: ");
		String telephoneNumber=sc.nextLine();
	
		System.out.println("EMAIL ADDRESS: ");
		String emailAddress=sc.nextLine();
		
		System.out.println("ADDRESS: ");
		String address=sc.nextLine();
		
		System.out.println("MESSAGE: ");
		String message=sc.nextLine();
		
		String feedback=""; //FEEDBACK FOR ENQUIRY. IT'S NOT TO BE PROVIDED IN HERE AS IT'S AN ADMIN ACTIVITY
		
		if(!(senderName.isEmpty() || telephoneNumber.isEmpty() || 
		   emailAddress.isEmpty() || address.isEmpty() || message.isEmpty()))
		{
			
			enqObj.setSenderName(senderName);
			enqObj.setTelephoneNumber(telephoneNumber);
			enqObj.setEmailAddress(emailAddress);
			enqObj.setAddress(address);
			enqObj.setMessage(message);
			enqObj.setFeedback(feedback);
			
			enquirySendStatus=enqOPObj.insertEnquiry();
            System.out.println(enquirySendStatus);
			
		} else {
			System.out.println("MANDATORY FIELDS ARE EMPTY !");
		}
	}

}
