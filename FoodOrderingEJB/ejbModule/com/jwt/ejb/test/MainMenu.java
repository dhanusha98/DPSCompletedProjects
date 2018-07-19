package com.jwt.ejb.test;

import java.util.*;
public class MainMenu {

	public static void main(String [] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("==============================================================");
		System.out.println("                       MAIN MENU                              ");
		System.out.println("==============================================================");
		
		System.out.println("PRESS ANY FUNCTION NUMBER AS FOLLOWS TO IMPLEMENT CORRESPONDING SERVICE");
		
		System.out.println("1. PIZZA ORDERS");
		System.out.println("2. BURGER ORDERS");
		System.out.println("3. RICE MEAL ORDERS");
		System.out.println("4. OTHER MEAL ORDERS");
		
		System.out.println("FUNCTION NUMBER: ");
		int selectedFunction=sc.nextInt();
		
		switch(selectedFunction)
		{
		
		    case 1:
		    	PizzaService.main(new String[0]);
			   break;
			
		    case 2:
		    	BurgerService.main(new String[0]);
			   break;
			
		    case 3:
		    	RiceService.main(new String[0]);
			   break;
			
		    case 4:
		    	OtherMealService.main(new String[0]);
			   break;
			
		    default:
		    	System.out.println("INVALID NUMBER !");
			   break;
		}
		
		
	}
}
