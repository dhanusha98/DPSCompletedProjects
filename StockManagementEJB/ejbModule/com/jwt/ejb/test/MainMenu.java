package com.jwt.ejb.test;

import java.util.Scanner;
public class MainMenu {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("==========================================================================================");
		System.out.println("                                MAIN MENU                                                 ");
		System.out.println("==========================================================================================");
		
		System.out.println();
		
		System.out.println("PRESS NUMBER FROM FOLLOWING LIST TO IMPLEMENT CORRESPONDING SERVICE");
		System.out.println("\n");
		
		System.out.println("1. MEAL MANAGEMENT");
		System.out.println("2. FRUIT MANAGEMENT");
		System.out.println("3. BEVERAGE MANAGEMENT");
		System.out.println("4. USER PROFILE MANAGEMENT");
		System.out.println("5. LOGOUT");
		
		System.out.println();
		
		System.out.println("FUNCTION NUMBER: ");
		int selectedFunction=sc.nextInt();
		
		switch(selectedFunction) {
		
		     case 1:
		    	 MealManagement.main(new String[0]);
		    	 break;
		    	 
		     case 2:
		    	 FruitManagement.main(new String[0]);
		    	 break;
		    	 
		     case 3:
		    	 BeverageManagement.main(new String[0]);
		    	 break;
		    	 
		     case 4:
		    	 UserProfileManagement.main(new String[0]);
		    	 break;
		    	 
		     case 5:
		    	 UserLoginViewer.main(new String[0]);
		    	 break;
		    	 
		     default:
		    	 System.out.println("INVALID NUMBER !");
		    	 break;
			
		}
	}

}
