package com.jwt.ejb.test;

import java.util.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jwt.ejb.business.FoodFunction;
import com.jwt.ejb.businesslogic.Food;

public class OtherMealService {
	
	private static Food mealObj=new Food();
	private static String mealName; //PRODUCT NAME TO BE SET TO HANDLE PRICE CALCULATION TRANSACTION
	private static FoodFunction foodFuncObj=new FoodFunction();
	
	private static final String LOOKUP_STRING="FoodFunction/remote";
	private static final String INITIAL_CONTEXT_FACTORY="jnp://localhost:1099";
	private static final String PROVIDER_URL="org.jboss.naming:org.jnp.interfaces";
	private static final String JNP_INTERFACES="org.jnp.interfaces.NamingContextFactory";
	
	private static Context initialContext;
	
	public static Context getInitialContext() throws NamingException
	{
		
		if(initialContext == null)
		{
			
			Properties prop=new Properties();
			
			prop.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
			prop.put(Context.URL_PKG_PREFIXES, JNP_INTERFACES);
			prop.put(Context.PROVIDER_URL, PROVIDER_URL);
			
			initialContext=new InitialContext(prop);
		}
		
		return initialContext;
	}
	
	public static FoodFunction doLookUp()
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
	
	public static void main(String [] args)
	{
		
		FoodFunction bean=doLookUp();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("============================= MEAL ORDERING SERVICE =============================");
		
		System.out.println("OTHER MEAL PRODUCTS AVAILABLE: ");
		
		System.out.println("1. CHICKEN KOTTU");
		System.out.println("2. SPAGHETTI");
		System.out.println("3. STRING HOPPERS");
		System.out.println("4. CEAREALS");
		
		System.out.println("ENTER CUSTOMER FULL NAME: ");
		String customerFullName=sc.nextLine();
		   	   
	    System.out.println("ENTER CORRESPONDING NUMBER ('1' FOR 'CHICKEN KOTTU') OF MEAL: ");
		int selectedProductID=sc.nextInt();
		   
		System.out.println("QUANTITY: ");
		int quantity=sc.nextInt();
		   
		if(selectedProductID == 1)
		{
			
			mealName="CHICKEN KOTTU";
			
			mealObj.setFoodID(selectedProductID);
			mealObj.setFoodName(mealName);
			mealObj.setFoodType("KOTTU MEAL PRODUCTS");
			mealObj.setQuantity(quantity);
			mealObj.setDiscountRate(7);
			
		} else if(selectedProductID == 2) {
			
			mealName="SPAGHETTI";
			
			mealObj.setFoodID(selectedProductID);
			mealObj.setFoodName(mealName);
			mealObj.setFoodType("SPAGHETTI PRODUCTS");
			mealObj.setQuantity(quantity);
			mealObj.setDiscountRate(9);
			
		} else if(selectedProductID == 3) {
			
			mealName="STRING HOPPERS";
			
			mealObj.setFoodID(selectedProductID);
			mealObj.setFoodName(mealName);
			mealObj.setFoodType("STRING HOPPERS PRODUCTS");
			mealObj.setQuantity(quantity);
			mealObj.setDiscountRate(13);
			
		} else if(selectedProductID == 4) {
			
			mealName="CEAREALS";
			
			mealObj.setFoodID(selectedProductID);
			mealObj.setFoodName(mealName);
			mealObj.setFoodType("CEAREALS PRODUCTS");
			mealObj.setQuantity(quantity);
			mealObj.setDiscountRate(10);
			
		} else {
			
			System.out.println("INVALID MEAL ID ! PLEASE TRY AGAIN !!");
		}
		
		System.out.println("CUSTOMER: "+customerFullName);
		
		bean.getProductTransactionDetails();
	}
}
