package com.jwt.ejb.presentationLayer;

import java.util.Scanner;

import com.jwt.ejb.businesslogicLayer.Client;
import com.jwt.ejb.businesslogicLayer.ClientOperation;

public class ClientManagementViewer {
	
	private static Client clientObj=new Client();
	private static ClientOperation clientOPObj=new ClientOperation();
	
	private static Scanner sc=new Scanner(System.in);
	
	private static String transactionResultStatus;
	
	public static void searchClient()
	{
		
		System.out.println("==================================== SEARCH CLIENT PROFILE ====================================");
		
		System.out.println("ENTER CLIENT ID: ");
		int customerID=sc.nextInt();
		
		clientObj.setCustomerID(customerID);
		clientOPObj.searchProfile();
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
			
			transactionResultStatus=clientOPObj.insertProfile();
			
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
			
			transactionResultStatus=clientOPObj.updateProfile();
			
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
			
			transactionResultStatus=clientOPObj.deleteProfile();
			
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
