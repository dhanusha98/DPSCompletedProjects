package com.jwt.ejb.presentationLayer;

import java.util.Scanner;
public class CustomerMainMenu {
	
	//CUSTOMER MAIN MENU USER INTERFACE

	public static void main(String [] args) {
		
		//UI DISPLAY STRUCTURE CREATION
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("===============================================================================");
		System.out.println("                              MAIN MENU                                        ");
		System.out.println("===============================================================================");
		
		System.out.println("PRESS FUNCTION NUMBER IN FOLLOWING LIST TO START CORRESPONDING SERVICE");
		
		System.out.println("1. MANAGE YOUR PROFILE");
		System.out.println("2. SEND ENQUIRY");
		
		System.out.println("ENTER FUNCTION NUMBER (EX. '1' FOR MANAGE YOUR PROFILE): ");
		int selectedFunction=sc.nextInt();
		
		switch(selectedFunction) {
		
		case 1:
			CustomerProfile.main(new String[0]);
			break;
			
		case 2:
			EnquirySenderViewer.main(new String[0]);
			break;
			
		default:
			System.out.println("INVALID FUNCTION NUMBER ! PLEASE TRY AGAIN !");
			break;
			
		}
	}
}
