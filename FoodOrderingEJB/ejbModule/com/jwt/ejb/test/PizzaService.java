package com.jwt.ejb.test;

import java.util.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jwt.ejb.business.FoodFunction;
import com.jwt.ejb.businesslogic.Pizza;
import com.jwt.ejb.businesslogic.PizzaFunction;
public class PizzaService {

	private static Pizza pizzaObj=new Pizza();
	private static String pizzaName; //PRODUCT NAME TO BE SET TO HANDLE PRICE CALCULATION TRANSACTION
	
	private static final String LOOKUP_STRING="PizzaFunction/remote";
	private static final String PROVIDER_URL="jnp://localhost:1099";
	private static final String JNP_INTERFACES="org.jboss.naming:org.jnp.interfaces";
	private static final String INITIAL_CONTEXT_FACTORY="org.jnp.interfaces.NamingContextFactory";
	
	private static Context initialContext;
	
	public static Context getInitialContext() throws NamingException {
		
		if(initialContext == null)
		{
			Properties prop=new Properties();
			
			prop.put(Context.URL_PKG_PREFIXES, JNP_INTERFACES);
			prop.put(Context.PROVIDER_URL, PROVIDER_URL);
			prop.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);	
			
			initialContext=new InitialContext(prop);

		}
		
		return initialContext;
	}
	
	private static FoodFunction doLookUp() {
		
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
		
		   System.out.println("============================= PIZZA ORDERING SERVICE =============================");
		   
		   System.out.println("PIZZA PRODUCTS AVAILABLE: ");
		   
		   System.out.println("1. CHEESE PIZZA");
		   System.out.println("2. CHICKEN PIZZA");
		   System.out.println("3. FISH PIZZA");
		   System.out.println("4. MIXED PIZZA");
		   System.out.println("5. NORMAL PIZZA");
		   
		   System.out.println("ENTER CUSTOMER FULL NAME: ");
		   String customerFullName=sc.nextLine();
		   	   
		   System.out.println("ENTER CORRESPONDING NUMBER ('1' FOR 'CHEESE PIZZA) OF PIZZA: ");
		   int selectedProductID=sc.nextInt();
		   
		   System.out.println("QUANTITY: ");
		   int quantity=sc.nextInt();
		   
		   if(selectedProductID == 1){
			   
			   pizzaName="CHEESE PIZZA";
			   
			   pizzaObj.setPizzaID(1);
			   pizzaObj.setPizzaName(pizzaName);
			   pizzaObj.setCategory("CHEESE PIZZA CATEGORY");
			   pizzaObj.setQuantity(quantity);
			   pizzaObj.setDiscountRate(10);
			   
		   } else if(selectedProductID == 2) {
			   
			   pizzaName="CHICKEN PIZZA";
			   
			   pizzaObj.setPizzaID(2);
			   pizzaObj.setPizzaName(pizzaName);
			   pizzaObj.setCategory("CHICKEN PIZZA CATEGORY");
			   pizzaObj.setQuantity(quantity);
			   pizzaObj.setDiscountRate(8);
			   
		   } else if(selectedProductID == 3) {
			   
			   pizzaName="FISH PIZZA";
			   
			   pizzaObj.setPizzaID(3);
			   pizzaObj.setPizzaName(pizzaName);
			   pizzaObj.setCategory("FISH PIZZA CATEGORY");
			   pizzaObj.setQuantity(quantity);
			   pizzaObj.setDiscountRate(14);
			   
		   } else if(selectedProductID == 4) {
			   
			   pizzaName="MIXED PIZZA";
			   
			   pizzaObj.setPizzaID(4);
			   pizzaObj.setPizzaName(pizzaName);
			   pizzaObj.setCategory("MIXED PIZZA CATEGORY");
			   pizzaObj.setQuantity(quantity);
			   pizzaObj.setDiscountRate(22);
			   
		   } else if(selectedProductID == 5) {
			   
			   pizzaName="NORMAL PIZZA";
			   
			   pizzaObj.setPizzaID(5);
			   pizzaObj.setPizzaName(pizzaName);
			   pizzaObj.setCategory("NORMAL PIZZA CATEGORY");
			   pizzaObj.setQuantity(quantity);
			   pizzaObj.setDiscountRate(5);
			   
		   } else {
			   
			   System.out.println("INVALID PIZZA ID. PLEASE TRY AGAIN !");
		   }
		   
		   System.out.println("CUSTOMER: "+customerFullName);
		 
		   bean.getProductTransactionDetails();
	}
}
