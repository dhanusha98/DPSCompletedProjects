package com.jwt.ejb.test;

import com.jwt.ejb.business.FoodFunction;
import com.jwt.ejb.businesslogic.Rice;
import com.jwt.ejb.businesslogic.RiceFunction;

import java.util.Properties;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class RiceService {
	
	private static Rice riceObj=new Rice();
	private static String riceName;
	private static RiceFunction riceFuncObj=new RiceFunction();
	
	private static final String LOOKUP_STRING="RiceFunction/remote";
	private static final String INITIAL_CONTEXT_FACTORY="jnp://localhost:1099";
	private static final String PROVIDER_URL="org.jboss.naming:org.jnp.interfaces";
	private static final String JNP_INTERFACES="org.jnp.interfaces.NamingContextFactory";
	
	private static Context initialContext;
	
	public static Context getInitialContext() throws NamingException {
		
		if(initialContext == null)
		{
			
			Properties prop=new Properties();
			
			prop.put(Context.PROVIDER_URL, PROVIDER_URL);
			prop.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
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
    	
		System.out.println("============================= RICE MEAL ORDERING SERVICE =============================");
		
		System.out.println("RICE MEAL PRODUCTS AVAILABLE: ");
		
		System.out.println("1. RICE AND CURRY MEAL");
		System.out.println("2. CHICKED FRIED RICE");
		System.out.println("3. MUTTON RICE");
		System.out.println("4. BIRIYANI");
		
		System.out.println("ENTER CUSTOMER FULL NAME: ");
		String customerFullName=sc.nextLine();
		
		System.out.println("ENTER CORRESPONDING NUMBER ('1' FOR 'RICE AND CURRY MEAL') OF RICE: ");
		int selectedRiceID=sc.nextInt();
		
		System.out.println("QUANTITY: ");
		int quantity=sc.nextInt();
		
		if(selectedRiceID == 1) {
			
			riceName="RICE AND CURRY MEAL";
			
			riceObj.setRiceMealID(1);
			riceObj.setRiceName(riceName);
			riceObj.setCategory("NORMAL RICE MEAL");
			riceObj.setQuantity(quantity);
			riceObj.setDiscountRate(14);
			
		} else if(selectedRiceID == 2) {
			
			riceName="CHICKED FRIED RICE";
			
			riceObj.setRiceMealID(2);
			riceObj.setRiceName(riceName);
			riceObj.setCategory("FRIED RICE MEAL");
			riceObj.setQuantity(quantity);
			riceObj.setDiscountRate(17);
			
		} else if(selectedRiceID == 3) {
			
			riceName="MUTTON RICE";
			
			riceObj.setRiceMealID(3);
			riceObj.setRiceName(riceName);
			riceObj.setCategory("NORMAL MUTTON RICE");
			riceObj.setQuantity(quantity);
			riceObj.setDiscountRate(9);
			
		} else if(selectedRiceID == 4) {
			
			riceName="BIRIYANI";
			
			riceObj.setRiceMealID(4);
			riceObj.setRiceName(riceName);
			riceObj.setCategory("BRIYANI RICE");
			riceObj.setQuantity(quantity);
			riceObj.setDiscountRate(25);
			
		} else {
			
			System.out.println("INVALID NUMBER ! PLEASE TRY AGAIN !!");
		}

		System.out.println("CUSTOMER: "+customerFullName);
		
		bean.getProductTransactionDetails();
	}
}
