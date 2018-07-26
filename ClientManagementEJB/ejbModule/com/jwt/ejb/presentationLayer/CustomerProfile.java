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
	
	//CUSTOMER OWN PROFILE MANAGEMENT USER INTERFACE
	
	private static Client clientObj=new Client(); //OBJECT TO ACCESS CUSTOMER ENTITY
	
	private static Scanner sc=new Scanner(System.in);
	
	private static String transactionResultStatus;
	
	private static final String LOOKUP_STRING="ClientOperation/remote"; //CLASS FOR OBJECT INSTANTIATION TO IMPLEMENT OPERATIONS
	private static final String INITIAL_CONTEXT_FACTORY="jnp://localhost:1099"; //URL FOR BEAN CONTEXT INITIALIZATION
	private static final String PROVIDER_URL="org.jboss.naming:org.jnp.interfaces"; //ENABLE JBOSS SUPPORT FOR EJB IMPLEMENTATIONS
	private static final String JNP_INTERFACES="org.jnp.interfaces.NamingContextFactory"; //PATH FOR NAMING CONTEXT FACTORY FOR BEAN CONTEXT INITIALIZATION
	
	private static Context initialContext; //BEAN CONTEXT INITALIZAR OBJECT
	
	private static ClientOperationManagement bean=doLookUp(); //CREATION AND INSTANTIATION OF BEAN TO ACCESS BUSINESS LOGIC FUNCTIONS
	
	public static Context getInitialContext() throws NamingException 
	{
		
		//METHOD FOR BEAN CONTEXT INITIALIZATION
		
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
		
		//METHOD FOR BEAN INSTANTIATION WITH REQUIRED BUSINESS LOGIC CLASS TO IMPLEMENT OPERATIONS
		
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
		
		//METHOD TO DISPLAY USER PROFILE DETAILS
		
		   System.out.println("================================= VIEW USER PROFILE DETAILS =================================");
		  
		   System.out.println("ENTER USERNAME: ");
		   String username=sc.next();
		   sc.nextLine();
		   
		   System.out.println("ENTER PASSWORD: ");
		   String password=sc.next();
		   sc.nextLine();
		   
		   if(username.isEmpty() || password.isEmpty()) {
			   System.out.println("PLEASE PROVIDE USER AUTHENTICATIONS !");
			   
		   } else {
			   
			   clientObj.setUsername(username);
			   clientObj.setPassword(password);
			   bean.viewOwnProfile();
		   }
		     
	}
	
	public static void updateUserProfile()
	{
		
		//METHOD TO UPDATE USER PROFILE DETAILS
		
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
		
		//UI DISPLAY STRUCTURE
		
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
