package com.jwt.ejb.presentationLayer;

import java.util.Scanner;

import com.jwt.ejb.businesslogicLayer.Client;
import com.jwt.ejb.businesslogicLayer.ClientOperation;

public class CustomerProfile {
	
	private static Client clientObj=new Client();
	private static ClientOperation clientOPObj=new ClientOperation();
	
	private static Scanner sc=new Scanner(System.in);
	
	private static String transactionResultStatus;
	
	public static void viewUserProfile()
	{
		
		   System.out.println("================================= VIEW USER PROFILE DETAILS =================================");

		   System.out.println("ENTER CUSTOMER ID: ");
		   int customerID=sc.nextInt();
		   
		   if(String.valueOf(customerID).isEmpty()) {
			   System.out.println("CUSTOMER ID IS EMPTY !");
			   
		   } else {
			   
			   clientObj.setCustomerID(customerID);
			   clientOPObj.searchProfile();
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
				
				transactionResultStatus=clientOPObj.updateProfile();
				
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
