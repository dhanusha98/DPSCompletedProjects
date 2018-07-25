package com.jwt.ejb.presentationLayer;

import java.util.Properties;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jwt.ejb.business.ClientOperationManagement;
import com.jwt.ejb.businesslogicLayer.Client;
import com.jwt.ejb.businesslogicLayer.ClientOperation;

public class CustomerProfile {
	
	private static Client clientObj=new Client();
	private static ClientOperation clientOPObj=new ClientOperation();
	
	private static Scanner sc=new Scanner(System.in);
	
	private static String transactionResultStatus;
	
	private static final String LOOKUP_STRING="ClientOperation/remote";
	private static final String INITIAL_CONTEXT_FACTORY="jnp://localhost:1099";
	private static final String PROVIDER_URL="org.jboss.naming:org.jnp.interfaces";
	private static final String JNP_INTERFACES="org.jnp.interfaces.NamingContextFactory";
	
	private static Context initialContext;
	
	private static ClientOperationManagement bean=doLookUp();
	
	public static Context getInitialContext() throws NamingException 
	{
		
		if(initialContext == null) {
			
			Properties prop=new Properties();
			
			prop.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
			prop.put(Context.URL_PKG_PREFIXES, JNP_INTERFACES);
			prop.put(Context.PROVIDER_URL, PROVIDER_URL);
			
			initialContext=new InitialContext(prop);
		}
		
		return initialContext;
	}
	
	private static ClientOperationManagement doLookUp()
	{
		
		Context context=null;
		ClientOperationManagement bean=null;
		
		try {
			
			context=getInitialContext();
			bean=(ClientOperationManagement)context.lookup(LOOKUP_STRING);
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return bean;
	}
	
	public static void viewUserProfile()
	{
		
		   System.out.println("================================= VIEW USER PROFILE DETAILS =================================");

		   System.out.println("ENTER CUSTOMER ID: ");
		   int customerID=sc.nextInt();
		   
		   if(String.valueOf(customerID).isEmpty()) {
			   System.out.println("CUSTOMER ID IS EMPTY !");
			   
		   } else {
			   
			   clientObj.setCustomerID(customerID);			   
			   bean.searchProfile();
		   }
		   
	}
	
	public static void updateUserProfile()
	{
		
		   System.out.println("================================= UPDATE USER PROFILE DETAILS =================================");
		   
		   System.out.println("ENTER CUSTOMER ID: ");
		   int customerID=sc.nextInt();
		   
		   System.out.println("ENTER CUSTOMER FULL NAME: ");
		   String customerFullName=sc.nextLine();
		   
		   System.out.println("ENTER USERNAME: ");
		   String username=sc.nextLine();
		   
		   System.out.println("ENTER PASSWORD: ");
		   String password=sc.nextLine();
		   
		   System.out.println("ENTER OTHER DETAILS: ");
		   String otherDetails=sc.nextLine();
		   
		   if(String.valueOf(customerID).isEmpty() || customerFullName.isEmpty() || username.isEmpty() || password.isEmpty() || otherDetails.isEmpty()) {
				
				System.out.println("MANDATORY FIELDS ARE EMPTY ! PLEASE TRY AGAIN !");
				
			} else {
				
				clientObj.setCustomerID(customerID);
				clientObj.setCustomerFullName(customerFullName);
				clientObj.setUsername(username);
				clientObj.setPassword(password);
				clientObj.setPassword(password);
				clientObj.setOtherDetails(otherDetails);
				
				transactionResultStatus=bean.updateProfile();
				
				System.out.println(transactionResultStatus);
			}
		  
	}

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
		
		System.out.println("==================================================================================");
		System.out.println("                              MANAGE USER PROFILE                                 ");
		System.out.println("==================================================================================");
		
        System.out.println();
		
        System.out.println("PRESS FUNCTION NUMBER IN FOLLOWING LIST TO START CORRESPONDING SERVICE");
		
		System.out.println("1. VIEW USER PROFILE");
		System.out.println("2. UPDATE USER PROFILE");
		System.out.println("3. BACK TO MAIN MENU");
		
		System.out.println("FUNCTION NUMBER: ");
	    int selectedFunction=sc.nextInt();
	    
	    switch(selectedFunction)
	    {
	    
	        case 1:
	    	   viewUserProfile();
	    	   break;
	    	
	        case 2:
	    	   updateUserProfile();
	    	   break;
	    	
	        case 3:
	    	  CustomerMainMenu.main(new String[0]);
	    	  break;
	    	
	        default:
	    	  System.out.println("INVALID FUNCTION NUMBER ! PLEASE TRY AGAIN !");
	    	  break;
	    	
	    }
	}
}
