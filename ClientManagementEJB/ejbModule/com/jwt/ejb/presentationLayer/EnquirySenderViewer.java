package com.jwt.ejb.presentationLayer;

import java.util.Properties;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jwt.ejb.business.EnquireOperationManagement;
import com.jwt.ejb.businesslogicLayer.EnquireOperation;
import com.jwt.ejb.businesslogicLayer.Enquiry;

public class EnquirySenderViewer {
	
	//ONLINE ENQUIRY SERVICE USER INTERFACE
	
	private static Enquiry enqObj=new Enquiry(); //OBJECT TO ACCESS ENQUIRY ENTITY
	
	private static String enquirySendStatus;
	
	private static final String LOOKUP_STRING="EnquireOperation/remote"; //CLASS FOR OBJECT INSTANTIATION TO IMPLEMENT OPERATIONS
    private static final String INITIAL_CONTEXT_FACTORY = "org.jnp.interfaces.NamingContextFactory"; //URL FOR BEAN CONTEXT INITIALIZATION
    private static final String PROVIDER_URL = "jnp://localhost:1099"; //ENABLE JBOSS SUPPORT FOR EJB IMPLEMENTATIONS
    private static final String JNP_INTERFACES = "org.jboss.naming:org.jnp.interfaces"; //PATH FOR NAMING CONTEXT FACTORY FOR BEAN CONTEXT INITIALIZATION
	
	private static Context initialContext; //BEAN CONTEXT INITALIZAR OBJECT
	
	//private static EnquireOperationManagement bean=doLookUp(); //CREATION AND INSTANTIATION OF BEAN TO ACCESS BUSINESS LOGIC FUNCTIONS
	
	public static Context getInitialContext() throws NamingException 
	{
		
		//METHOD FOR BEAN CONTEXT INITIALIZATION
		
		if(initialContext == null) {
			
			Properties prop = new Properties();
            prop.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
            prop.put(Context.URL_PKG_PREFIXES, JNP_INTERFACES);
            prop.put(Context.PROVIDER_URL, PROVIDER_URL);
            initialContext = new InitialContext(prop);
		}
		
		return initialContext;
	}
	
	private static EnquireOperationManagement doLookUp()
	{
		
		//METHOD FOR BEAN INSTANTIATION WITH REQUIRED BUSINESS LOGIC CLASS TO IMPLEMENT OPERATIONS
		
		Context context=null;
		EnquireOperationManagement bean=null;
		
		try {
			
			context=getInitialContext();
			bean=(EnquireOperationManagement)context.lookup(LOOKUP_STRING);
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return bean;
	}
	
	public static void main(String[] args) {
		
		//ONLINE ENQUIRY SERVICE
		
		EnquireOperationManagement bean=doLookUp();
		
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
		
		String feedback="NO FEEDACK YET"; //FEEDBACK FOR ENQUIRY. IT'S NOT TO BE PROVIDED IN HERE AS IT'S AN ADMIN ACTIVITY
		
		if(senderName.isEmpty() || telephoneNumber.isEmpty() || 
		   emailAddress.isEmpty() || address.isEmpty() || message.isEmpty())
		{
			
			System.out.println("MANDATORY FIELDS ARE EMPTY !");

			
		} else {
			
			enqObj.setSenderName(senderName);
			enqObj.setTelephoneNumber(telephoneNumber);
			enqObj.setEmailAddress(emailAddress);
			enqObj.setAddress(address);
			enqObj.setMessage(message);
			enqObj.setFeedback(feedback);
			
			enquirySendStatus=bean.insertEnquiry();
            System.out.println(enquirySendStatus);
			
		}
	}

}
