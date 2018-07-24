package com.jwt.ejb.presentationLayer;

import java.util.Scanner;

import com.jwt.ejb.businesslogicLayer.Admin;
import com.jwt.ejb.businesslogicLayer.AdminOperation;

public class AdminProfile {
	
	private static Admin admObj=new Admin();
	private static AdminOperation admOPObj=new AdminOperation();
	
	private static Scanner sc=new Scanner(System.in);
	private static String transactionResultStatus;
	
	public static void viewUserProfile()
	{
		
	   System.out.println("================================= VIEW USER PROFILE DETAILS =================================");
		
	   System.out.println("ENTER ADMIN ID: ");
	   int adminID=sc.nextInt();
	   
	   admObj.setAdminID(adminID);
	   admOPObj.searchProfile();
	}
	
	public static void updateUserProfile()
	{
		
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
				
				transactionResultStatus=admOPObj.updateProfile();
				
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
	    	  AdminMainMenu.main(new String[0]);
	    	  break;
	    	
	        default:
	    	  System.out.println("INVALID FUNCTION NUMBER ! PLEASE TRY AGAIN !");
	    	  break;
	    	
	    }
		
	}
}
