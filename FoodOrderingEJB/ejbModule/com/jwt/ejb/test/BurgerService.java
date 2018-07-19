package com.jwt.ejb.test;

import java.util.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jwt.ejb.business.FoodFunction;
import com.jwt.ejb.businesslogic.Burger;
import com.jwt.ejb.businesslogic.BurgerFunction;

public class BurgerService {
	
	private static Burger burgerObj=new Burger();
	private static String burgerName; //PRODUCT NAME TO BE SET TO HANDLE PRICE CALCULATION TRANSACTION
	
	private static final String LOOKUP_STRING="BurgerFunction/remote";
	private static final String PROVIDER_URL="jnp://localhost:1099";
	private static final String JNP_INTERFACES="org.jboss.naming:org.jnp.interfaces";
	private static final String INITIAL_CONTEXT_FACTORY="org.jnp.interfaces.NamingContextFactory";
	
	private static Context initialContext;
	
	public static Context getInitialContext() throws NamingException 
	{
		
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
	
	private static FoodFunction doLookUp()
	{
		
		Context context=null;
		FoodFunction bean=null;
		
		try {
			
			context=getInitialContext();
			bean=(FoodFunction)context.lookup(LOOKUP_STRING);
			
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return bean;
	}
	
	public static void main(String[] args) {
		
		FoodFunction bean=doLookUp();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("============================= BURGER ORDERING SERVICE =============================");
		   
		System.out.println("BURGER PRODUCTS AVAILABLE: ");
		   
		System.out.println("1. CHEESE BURGER");
		System.out.println("2. CHICKEN BURGER");	
		System.out.println("3. MUTTON BURGER");
		System.out.println("4. CHEESE SPICY BURGER");
		
		System.out.println();
		
		System.out.println("ENTER CUSTOMER FULLNAME: ");
		String customerFullName=sc.nextLine();
		
		System.out.println("ENTER CORRESPONDING NUMBER ('1' FOR 'CHEESE BURGER') OF BURGER: ");
		int selectedBurgerID=sc.nextInt();
		
		System.out.println("QUANTITY: ");
	    int quantity=sc.nextInt();
	    
	    if(selectedBurgerID == 1) {
	    	
	    	burgerName="CHEESE BURGER";
	    	
	    	burgerObj.setBurgerID(1);
	    	burgerObj.setBurgerName(burgerName);
	    	burgerObj.setCategory("CHEESE BURGERS");
	    	burgerObj.setQuantity(quantity);
	    	burgerObj.setDiscountRate(13);
	    	
	    } else if(selectedBurgerID == 2) {
	    	
	    	burgerName="CHICKEN BURGER";
	    	
	    	burgerObj.setBurgerID(2);
	    	burgerObj.setBurgerName(burgerName);
	    	burgerObj.setCategory("CHICKEN BURGERS");
	    	burgerObj.setQuantity(quantity);
	    	burgerObj.setDiscountRate(10);
	    	
	    } else if(selectedBurgerID == 3) {
	    	
	    	burgerName="MUTTON BURGER";
	    	
	    	burgerObj.setBurgerID(3);
	    	burgerObj.setBurgerName(burgerName);
	    	burgerObj.setCategory("MUTTON BURGERS");
	    	burgerObj.setQuantity(quantity);
	    	burgerObj.setDiscountRate(20);
	    	
	    } else if(selectedBurgerID == 4) {
	    	
	    	burgerName="CHEESE SPICY BURGER";
	    	
	    	burgerObj.setBurgerID(4);
	    	burgerObj.setBurgerName(burgerName);
	    	burgerObj.setCategory("CHEESE SPICY BURGERS");
	    	burgerObj.setQuantity(quantity);
	    	burgerObj.setDiscountRate(17);
	    	
	    } else {
	    	System.out.println("INVALID NUMBER ! PLEASE TRY AGAIN !!");
	    }
	    
	    System.out.println("CUSTOMER NAME: "+customerFullName);
	    
	    bean.getProductTransactionDetails();
	}
}
