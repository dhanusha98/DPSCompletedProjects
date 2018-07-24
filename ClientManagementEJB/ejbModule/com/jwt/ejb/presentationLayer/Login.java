package com.jwt.ejb.presentationLayer;

import java.util.Scanner;

import com.jwt.ejb.businesslogicLayer.Admin;
import com.jwt.ejb.businesslogicLayer.Client;
import com.jwt.ejb.businesslogicLayer.UserValidation;

public class Login {
	
	private static Scanner sc=new Scanner(System.in);
	
	private static Admin admObj=new Admin();
	private static Client clientObj=new Client();
	
	private static UserValidation uservalObj=new UserValidation();
	
	private static String username;
	private static String password;
	
	private static String userValidationStatus;
	
	public static void main(String [] args) {
		
		System.out.println("PRESS THE 'USER TYPE' NUMBER FROM FOLLOWING LIST");
		
		System.out.println("1. CUSTOMER");
		System.out.println("2. ADMININSTRATOR");
		
		System.out.println("ENTER USER TYPE NUMBER (EX. '1' FOR CUSTOMER USER, '2' FOR ADMINISTRATOR USER:    ");
		int selectedUserType=sc.nextInt();
		
		if(selectedUserType == 1) 
		{
			
			System.out.println("ENTER USERNAME: ");
			username=sc.nextLine();
			
			System.out.println("ENTER PASSWORD: ");
			password=sc.nextLine();
			
			if(!(username.isEmpty() || password.isEmpty()))
			{
				clientObj.setUsername(username);
				clientObj.setPassword(password);
				
				userValidationStatus=uservalObj.clientUserValidation();
				
				if(userValidationStatus.equalsIgnoreCase("LOGIN SUCCESSFUL !")) {
					CustomerMainMenu.main(new String[0]);

				} else {
					System.out.println(userValidationStatus);
				}
				
			} else {
				System.out.println("USERNAME OR PASSWORD IS EMPTY ! PLEASE TRY AGAIN !");
			}
			
			
		} else if (selectedUserType == 2) {
			
			System.out.println("ENTER USERNAME: ");
			username=sc.nextLine();
			
			System.out.println("ENTER PASSWORD: ");
			password=sc.nextLine();

			if(!(username.isEmpty() || password.isEmpty()))
			{
				admObj.setUsername(username);
				admObj.setPassword(password);
				
				userValidationStatus=uservalObj.adminUserValidation();
				
				if(userValidationStatus.equalsIgnoreCase("LOGIN SUCCESSFUL !")) {
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
