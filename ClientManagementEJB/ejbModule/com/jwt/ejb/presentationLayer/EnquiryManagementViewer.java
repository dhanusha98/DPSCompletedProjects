package com.jwt.ejb.presentationLayer;

import java.util.Properties;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jwt.ejb.businesslogicLayer.EnquireOperation;
import com.jwt.ejb.businesslogicLayer.Enquiry;
import com.jwt.ejb.business.*;

public class EnquiryManagementViewer {
	
	private static Enquiry enqObj=new Enquiry();
	private static EnquireOperation enquireOPObj=new EnquireOperation();
	
	private static String transactionResultStatus;
	
	private static Scanner sc=new Scanner(System.in);
	
	private static final String LOOKUP_STRING="EnquiryOperation/remote";
	private static final String INITIAL_CONTEXT_FACTORY="jnp://localhost:1099";
	private static final String PROVIDER_URL="org.jboss.naming:org.jnp.interfaces";
	private static final String JNP_INTERFACES="org.jnp.interfaces.NamingContextFactory";
	
	private static Context initialContext;
	
	private static EnquireOperationManagement bean=doLookUp();
	
	public static Context getInitialContext() throws NamingException 
	{
		
		if(initialContext == null) {
			
			Properties prop=new Properties();
			
			prop.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
			prop.put(Context.PROVIDER_URL, PROVIDER_URL);
			prop.put(Context.URL_PKG_PREFIXES, JNP_INTERFACES);
			
			initialContext=new InitialContext();
		}
		
		return initialContext;
	}
	
    private static EnquireOperationManagement doLookUp()
    {
    	
    	Context context=null;
    	EnquireOperationManagement bean=null;
    	
    	try {
    		
    		context=getInitialContext();
    		bean=(EnquireOperationManagement) context.lookup(LOOKUP_STRING);
    	}
    	
    	catch(Exception ex) {
    		ex.printStackTrace();
    	}
    	
    	return bean;
    }
	
	public static void searchEnquiry()
	{
		
		System.out.println("==================================== SEARCH ENQUIRY ====================================");

		System.out.println("ENTER ENQUIRY ID: ");
		int enquiryID=sc.nextInt();
		
		if(String.valueOf(enquiryID).isEmpty()) {
			
			System.out.println("ENQUIRY ID IS EMPTY !");
		} else {
			
			enqObj.setEnquiryID(enquiryID);			

			bean.searchEnquiry();
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
			
			transactionResultStatus=bean.insertEnquiry();
			
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
					
				transactionResultStatus=bean.updateEnquiry();
					
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
			
			transactionResultStatus=bean.deleteEnquiry();
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