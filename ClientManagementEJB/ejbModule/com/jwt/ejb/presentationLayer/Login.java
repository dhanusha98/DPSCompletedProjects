package com.jwt.ejb.presentationLayer;

import java.util.Properties;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jwt.ejb.business.UserValidationStructure;
import com.jwt.ejb.businesslogicLayer.Admin;
import com.jwt.ejb.businesslogicLayer.Client;
import com.jwt.ejb.businesslogicLayer.UserValidation;

public class Login {
	
	//USER LOGIN INTERFACE
		
	private static Admin admObj=new Admin();
	private static Client clientObj=new Client();
		
	private static String userValidationStatus; //VARIABLE TO DISPLAY USER VALIDATION RESULT
	
	private static final String LOOKUP_STRING="UserValidation/remote"; //CLASS FOR OBJECT INSTANTIATION TO IMPLEMENT OPERATIONS
	private static final String INITIAL_CONTEXT_FACTORY = "org.jnp.interfaces.NamingContextFactory"; //URL FOR BEAN CONTEXT INITIALIZATION
	
	private static final String PROVIDER_URL="jnp://localhost:1099"; //ENABLE JBOSS SUPPORT FOR EJB IMPLEMENTATIONS
	private static final String JNP_INTERFACES = "org.jboss.naming:org.jnp.interfaces"; //PATH FOR NAMING CONTEXT FACTORY FOR BEAN CONTEXT INITIALIZATION
	
	private static Context initialContext; //BEAN CONTEXT INITALIZAR OBJECT
	
	public static Context getInitialContext() throws NamingException {
		
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
	
	private static UserValidationStructure doLookUp()
	{
		
		//METHOD FOR BEAN INSTANTIATION WITH REQUIRED BUSINESS LOGIC CLASS TO IMPLEMENT OPERATIONS
		
		Context context=null;
		UserValidationStructure bean = null;
		
		try {
			
			context=getInitialContext();
			bean=(UserValidationStructure)context.lookup(LOOKUP_STRING);
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return bean;
	}
	
	//private static UserValidationStructure bean = doLookUp(); //CREATION AND INSTANTIATION OF BEAN TO ACCESS BUSINESS LOGIC FUNCTIONS

	
	public static void main(String [] args) {
		
		//UI DISPLAY STRUCTURE
		
		String username;
		String password;
	
		UserValidationStructure bean = doLookUp();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("PRESS THE 'USER TYPE' NUMBER FROM FOLLOWING LIST");
		
		System.out.println("1. CUSTOMER");
		System.out.println("2. ADMININSTRATOR");
		
		System.out.println("ENTER USER TYPE NUMBER (EX. '1' FOR CUSTOMER USER, '2' FOR ADMINISTRATOR USER:    ");
		int selectedUserType=sc.nextInt();
		
		if(selectedUserType == 1) 
		{
			
			System.out.println("ENTER USERNAME: ");
			username=sc.next();
			sc.nextLine();
			
			System.out.println("ENTER PASSWORD: ");
			password=sc.nextLine();
			
			if(!(username.isEmpty() || password.isEmpty()))
			{
				clientObj.setUsername(username);
				clientObj.setPassword(password);
				
				userValidationStatus=bean.clientUserValidation();
				
				if(userValidationStatus.equalsIgnoreCase("LOGIN SUCCESSFUL")) {
					CustomerMainMenu.main(new String[0]);

				} else {
					System.out.println(userValidationStatus);
				}
				
			} else {
				System.out.println("USERNAME OR PASSWORD IS EMPTY ! PLEASE TRY AGAIN !");
			}
			
			
		} else if (selectedUserType == 2) {
			
			System.out.println("ENTER USERNAME: ");
			username=sc.next();
			sc.nextLine();
			
			System.out.println("ENTER PASSWORD: ");
			password=sc.nextLine();

			if(!(username.isEmpty() || password.isEmpty()))
			{
				admObj.setUsername(username);
				admObj.setPassword(password);
				
				userValidationStatus=bean.adminUserValidation();
				
				if(userValidationStatus.equalsIgnoreCase("LOGIN SUCCESSFUL")) {
					AdminMainMenu.main(new String[0]);

				} else {
					System.out.println(userValidationStatus);
				}
				
			} else {
				System.out.println("USERNAME OR PASSWORD IS EMPTY ! PLEASE TRY AGAIN !");
			}
			
		} else {
			System.out.println("INVALID USER TYPE ID ! PLEASE TRY AGAIN !");
		}
		
	}

}
