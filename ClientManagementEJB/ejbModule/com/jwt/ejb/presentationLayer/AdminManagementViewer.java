package com.jwt.ejb.presentationLayer;

import java.util.Properties;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jwt.ejb.business.AdminOperationManagement;
import com.jwt.ejb.businesslogicLayer.Admin;
import com.jwt.ejb.businesslogicLayer.AdminOperation;

public class AdminManagementViewer {
	
	//ADMIN PROFILE MANAGEMENT USER INTERFACE
	
	private static Scanner sc=new Scanner(System.in);
	private static Admin admObj=new Admin();
	
	private static AdminOperation admOPObj=new AdminOperation();
	
	private static String transactionResultStatus;
	
	private static final String LOOKUP_STRING="AdminOperation/remote";
	private static final String INITIAL_CONTEXT_FACTORY="jnp://localhost:1099";
	private static final String PROVIDER_URL="org.jboss.naming:org.jnp.interfaces";
	private static final String JNP_INTERFACES="org.jnp.interfaces.NamingContextFactory";
	
	private static Context initialContext;
	
	private static AdminOperationManagement bean=doLookUp();
	
	public static Context getInitialContext() throws NamingException {
		
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
	
	private static AdminOperationManagement doLookUp()
	{
		
		Context context=null;
		AdminOperationManagement bean=null;
		
		try {
			
			context=getInitialContext();
			bean=(AdminOperationManagement)context.lookup(LOOKUP_STRING);
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return bean;
		
	}
	
	public static void searchAdminProfile()
	{
		
		System.out.println("==================================== SEARCH ADMIN PROFILE ====================================");
		
		System.out.println("ENTER ADMIN ID: ");
		int adminID=sc.nextInt();
		
		if(String.valueOf(adminID).isEmpty())
		{
			System.out.println("PLEASE ENTER ADMIN ID !");
			
		} else {
			
			//admOPObj.searchProfile();
			bean.searchProfile();
		}
	}
	
	public static void insertAdminProfie()
	{
		
		System.out.println("==================================== INSERT ADMIN PROFILE ====================================");

		System.out.println("ENTER ADMIN NAME: ");
		String adminName=sc.nextLine();
		
		System.out.println("ENTER USERNAME: ");
		String adminUsername=sc.nextLine();
		
		System.out.println("ENTER PASSWORD: ");
		String adminPassword=sc.nextLine();
				
		System.out.println("ENTER OTHER DETAILS: ");
		String otherDetails=sc.nextLine();
		
		if(adminName.isEmpty() || adminUsername.isEmpty() || adminPassword.isEmpty() || otherDetails.isEmpty())
		{
			System.out.println("MANDATORY FIELDS ARE EMPTY ! PLEASE TRY AGAIN !");
			
		} else {
			
			admObj.setAdminName(adminName);
			admObj.setUsername(adminUsername);
			admObj.setPassword(adminPassword);
			admObj.setOtherDetails(otherDetails);
			
			transactionResultStatus=bean.insertProfile();
			
			System.out.println(transactionResultStatus);
		}
		
	}
	
	public static void updateAdminProfile()
	{
		
		System.out.println("==================================== UPDATE ADMIN PROFILE ====================================");
		
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
	
	public static void deleteAdminProfile()
	{
		
		System.out.println("==================================== DELETE ADMIN PROFILE ====================================");
		
		System.out.println("ENTER ADMIN ID: ");
		int adminID=sc.nextInt();
		
		if(String.valueOf(adminID).isEmpty())
		{
			System.out.println("PLEASE ENTER ADMIN ID !");
			
		} else {
			
			admObj.setAdminID(adminID);
			
			transactionResultStatus=bean.deleteProfile();
			System.out.println(transactionResultStatus);

		}

	}
	
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
		
		System.out.println("==================================================================================");
		System.out.println("                              ADMIN PROFILE MANAGEMENT                            ");
		System.out.println("==================================================================================");
		
		System.out.println();
		
        System.out.println("PRESS FUNCTION NUMBER IN FOLLOWING LIST TO START CORRESPONDING SERVICE");
        
        System.out.println("1. SEARCH ADMIN PROFILE");
        System.out.println("2. INSERT ADMIN PROFILE");
        System.out.println("3. UPDATE ADMIN PROFILE");
        System.out.println("4. DELETE ADMIN PROFILE");
        System.out.println("5. BACK TO MAIN MENU");
        
        System.out.println("FUNCTION NUMBER: ");
        int selectedFunction=sc.nextInt();
        
        switch(selectedFunction)
        {
        
            case 1:
        	searchAdminProfile();
        	break;
        	
            case 2:
            insertAdminProfie();
        	break;
        	
            case 3:
            updateAdminProfile();
        	break;
        	
            case 4:
        	deleteAdminProfile();
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
