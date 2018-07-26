package com.jwt.ejb.presentationLayer;

import java.util.Properties;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jwt.ejb.business.ClientOperationManagement;
import com.jwt.ejb.businesslogicLayer.Client;
import com.jwt.ejb.businesslogicLayer.ClientOperation;

public class ClientManagementViewer {
	
	//CUSTOMER PROFILE MANAGEMENT USER INTERFACE
	
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
		
		if(initialContext == null)
		{
			
			Properties prop=new Properties();
			
			prop.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
			prop.put(Context.PROVIDER_URL, PROVIDER_URL);
			prop.put(Context.URL_PKG_PREFIXES, JNP_INTERFACES);

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
	
	public static void searchClient()
	{
		
		System.out.println("==================================== SEARCH CLIENT PROFILE ====================================");
		
		System.out.println("ENTER CLIENT ID: ");
		int customerID=sc.nextInt();
		
		clientObj.setCustomerID(customerID);
		
		bean.searchProfile();
	}
	
	public static void insertClient()
	{
		
		System.out.println("==================================== INSERT CLIENT PROFILE ====================================");
		
		System.out.println("ENTER CUSTOMER FULL NAME: ");
		String customerFullName=sc.nextLine();
		
		System.out.println("ENTER USERNAME: ");
		String username=sc.nextLine();
		
		System.out.println("ENTER PASSWORD: ");
		String password=sc.nextLine();
		
		System.out.println("ENTER OTHER DETAILS: ");
		String otherDetails=sc.nextLine();
		
		if(customerFullName.isEmpty() || username.isEmpty() || password.isEmpty() || otherDetails.isEmpty()) {
			System.out.println("MANDATORY FIELDS ARE EMPTY ! PLEASE TRY AGAIN !");
			
		} else {
			
			clientObj.setCustomerFullName(customerFullName);
			clientObj.setUsername(username);
			clientObj.setPassword(password);
			clientObj.setPassword(password);
			clientObj.setOtherDetails(otherDetails);
			
			transactionResultStatus=bean.insertProfile();
			
			System.out.println(transactionResultStatus);
		}
		
	}
	
	public static void updateClient()
	{
		
		System.out.println("==================================== UPDATE CLIENT PROFILE ====================================");
		
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
	
	public static void deleteClient()
	{
		
		System.out.println("==================================== DELETE CLIENT PROFILE ====================================");

		System.out.println("ENTER CUSTOMER ID: ");
		int customerID=sc.nextInt();
		
		if(String.valueOf(customerID).isEmpty()) {
			System.out.println("PLEASE ENTER CUSTOMER ID !");
			
		} else {

			clientObj.setCustomerID(customerID);
			
			transactionResultStatus=bean.deleteProfile();
			
			System.out.println(transactionResultStatus);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("==================================================================================");
		System.out.println("                              CLIENT PROFILE MANAGEMENT                                   ");
		System.out.println("==================================================================================");
		
		System.out.println();
		
        System.out.println("PRESS FUNCTION NUMBER IN FOLLOWING LIST TO START CORRESPONDING SERVICE");
        
        System.out.println("1. SEARCH CLIENT PROFILE");
        System.out.println("2. INSERT CLIENT PROFILE");
        System.out.println("3. UPDATE CLIENT PROFILE");
        System.out.println("4. DELETE CLIENT PROFILE");
        System.out.println("5. BACK TO MAIN MENU");
        
        System.out.println("FUNCTION NUMBER: ");
        int selectedFunction=sc.nextInt();
        
        switch(selectedFunction)
        {
        
            case 1:
        	searchClient();
        	break;
        	
            case 2:
        	insertClient();
        	break;
        	
            case 3:
        	updateClient();
        	break;
        	
            case 4:
        	deleteClient();
        	break;
        	
            case 5:
        	AdminMainMenu.main(new String[0]);
        	break;
        	
            default:
        	System.out.println("INVALID NUMBER ! PLEASE TRY AGAIN !");
        	break;
        	
        }
	}
}
