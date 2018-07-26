package com.jwt.ejb.presentationLayer;

import java.util.Properties;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jwt.ejb.business.AdminOperationManagement;
import com.jwt.ejb.businesslogicLayer.Admin;
import com.jwt.ejb.businesslogicLayer.AdminOperation;

public class AdminProfile {
	
	//ADMIN OWN USER PROFILE MANAGEMENT USER INTERFACE
	
	private static Admin admObj=new Admin(); //OBJECT TO ACCESS ADMIN ENTITY CLASS
	
	private static Scanner sc=new Scanner(System.in);
	private static String transactionResultStatus;
	
	private static final String LOOKUP_STRING="AdminOperation/remote"; //CLASS FOR OBJECT INSTANTIATION TO IMPLEMENT OPERATIONS
	private static final String INITIAL_CONTEXT_FACTORY="jnp://localhost:1099"; //URL FOR BEAN CONTEXT INITIALIZATION
	private static final String PROVIDER_URL="org.jboss.naming:org.jnp.interfaces"; //ENABLE JBOSS SUPPORT FOR EJB IMPLEMENTATIONS
	private static final String JNP_INTERFACES="org.jnp.interfaces.NamingContextFactory"; //PATH FOR NAMING CONTEXT FACTORY FOR BEAN CONTEXT INITIALIZATION
	
	private static Context initialContext; //BEAN CONTEXT INITALIZAR OBJECT
	private static AdminOperationManagement bean = doLookUp(); //CREATION AND INSTANTIATION OF BEAN TO ACCESS BUSINESS LOGIC FUNCTIONS
	
    public static Context getInitialContext() throws NamingException {
		
		//METHOD FOR BEAN CONTEXT INITIALIZATION
		
		if(initialContext == null) {
			
			Properties prop=new Properties();
			
			prop.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
			prop.put(Context.PROVIDER_URL, PROVIDER_URL);
			prop.put(Context.URL_PKG_PREFIXES, JNP_INTERFACES);
			
			initialContext=new InitialContext(prop);
			
		}
		
		return initialContext;
	}
	
	private static AdminOperationManagement doLookUp()
	{
		
		//METHOD FOR BEAN INSTANTIATION WITH REQUIRED BUSINESS LOGIC CLASS TO IMPLEMENT OPERATIONS
		
		Context context=null;
		AdminOperationManagement bean = null;
		
		try {
			
			context=getInitialContext();
			bean=(AdminOperationManagement)context.lookup(LOOKUP_STRING);
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
		   
		   admObj.setUsername(username);
		   admObj.setPassword(password);
		   bean.viewOwnProfile();
	   }
	   
	}
	
	public static void updateUserProfile()
	{
		
		//METHOD TO UPDATE USER PROFILE DETAILS
		
		   System.out.println("================================= UPDATE USER PROFILE DETAILS =================================");
		
		   System.out.println("***PLEASE VIEW 'USER PROFILE DETAILS' FUNCTION TO CHECK YOUR 'ADMIN ID' IF NECESSARY ****"); 
		   System.out.println();
		   
		   System.out.println("ENTER ADMIN ID: ");
			int adminID=sc.nextInt();
			
			System.out.println("ENTER ADMIN NAME: ");
			String adminName=sc.nextLine();
			
			System.out.println("ENTER USERNAME: ");
			String adminUsername=sc.nextLine();
			
			System.out.println("ENTER PASSWORD: ");
			String adminPassword=sc.nextLine();
					
			System.out.println("ENTER OTHER DETAILS: ");
			String otherDetails=sc.nextLine();
			
			if(String.valueOf(adminID).isEmpty() || adminName.isEmpty() || adminUsername.isEmpty() || 
			   adminPassword.isEmpty() || otherDetails.isEmpty())
			{
				System.out.println("MANDATORY FIELDS ARE EMPTY ! PLEASE TRY AGAIN !");
				
			} else {
				
				admObj.setAdminID(adminID);
				admObj.setAdminName(adminName);
				admObj.setUsername(adminUsername);
				admObj.setPassword(adminPassword);
				admObj.setOtherDetails(otherDetails);
				
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
	    	  AdminMainMenu.main(new String[0]);
	    	  break;
	    	
	        default:
	    	  System.out.println("INVALID FUNCTION NUMBER ! PLEASE TRY AGAIN !");
	    	  break;
	    	
	    }
		
	}
}
