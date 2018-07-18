package com.jwt.ejb.test;

import java.util.Properties;
import java.util.*;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jwt.ejb.business.ManageFruit;
import com.jwt.ejb.businesslogic.Fruit;

public class FruitManagement {
	
	private static Scanner sc=new Scanner(System.in);
	
	private static final String LOOKUP_STRING="FruitProductOperation/remote";
	private static final String PROVIDER_URL="jnp://localhost:1099";
	private static final String JNP_INTERFACES="org.jboss.naming:org.jnp.interfaces";
	private static final String INITIAL_CONTEXT_FACTORY="org.jnp.interfaces.NamingContextFactory";
	
	private static Context initialContext;
	
	private static ManageFruit bean=doLookUp(); //BEAN TO ACCESS BUSINESS LOGIC DATA
	private static Fruit fruitObj;
	
	public static Context getInitialContext() throws NamingException {

		if(initialContext ==null) {
			Properties prop=new Properties();
			
			prop.put(Context.PROVIDER_URL, PROVIDER_URL);
			prop.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
			prop.put(Context.URL_PKG_PREFIXES, JNP_INTERFACES);
			
			initialContext=new InitialContext(prop);
		}
		
		return initialContext;
	}
	
	private static ManageFruit doLookUp() {
		
		Context context=null;
		ManageFruit bean=null;
		
		try {
			
			context=getInitialContext();
			bean=(ManageFruit)context.lookup(LOOKUP_STRING);
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return bean;
	}
	
	public static void searchFruitViewer() {
				
		System.out.println("====================================== SEARCH PRODUCTS =====================================");
		
		System.out.println("ENTER FRUIT ID: ");
		int fruitID=sc.nextInt();
		
		fruitObj.setFruitID(fruitID);
		
		bean.searchProduct();
	}
	
	public static void insertFruitViewer() {
						
		System.out.println("====================================== INSERT PRODUCTS =====================================");
		
		System.out.println("ENTER FRUIT NAME: ");
		String fruitName=sc.nextLine();
		
		System.out.println("ENTER PRODUCT CATEGORY: ");
		String productCategory=sc.nextLine();
		
		System.out.println("ENTER PRICE: ");
		String price=sc.nextLine();
		
		System.out.println("ENTER OTHER DETAILS: ");
		String otherDetails=sc.nextLine();

		fruitObj.setFruitName(fruitName);
		fruitObj.setProductCategory(productCategory);
		fruitObj.setPrice(price);
		fruitObj.setOtherDetails(otherDetails);
		
		bean.insertProduct();
	}
	
	public static void updateFruitViewer() {
						
		System.out.println("====================================== UPDATE PRODUCTS =====================================");
		
		System.out.println("ENTER FRUIT ID: ");
		int fruitID=sc.nextInt();
		
		System.out.println("ENTER FRUIT NAME: ");
		String fruitName=sc.nextLine();
		
		System.out.println("ENTER PRODUCT CATEGORY: ");
		String productCategory=sc.nextLine();
		
		System.out.println("ENTER PRICE: ");
		String price=sc.nextLine();
		
		System.out.println("ENTER OTHER DETAILS: ");
		String otherDetails=sc.nextLine();

		fruitObj.setFruitID(fruitID);
		fruitObj.setFruitName(fruitName);
		fruitObj.setProductCategory(productCategory);
		fruitObj.setPrice(price);
		fruitObj.setOtherDetails(otherDetails);
		
		bean.updateProduct();
	}
	
	public static void deleteFruitViewer() {
				
		System.out.println("====================================== DELETE PRODUCTS =====================================");

		System.out.println("ENTER FRUIT ID: ");
		int fruitID=sc.nextInt();
		
		fruitObj.setFruitID(fruitID);
		
		bean.deleteProduct();
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
				
		System.out.println("=================================================================================");
		System.out.println("                              FRUIT MANAGEMENT                                   ");
		System.out.println("=================================================================================");
		
		System.out.println();
		
		System.out.println("PRESS A FUNCTION NUMBER TO IMPLEMENT CORRESPONDING SERVICE");
		
		System.out.println("1. SEARCH FRUIT PRODUCTS");
		System.out.println("2. INSERT FRUIT PRODUCTS");
		System.out.println("3. UPDATE FRUIT PRODUCTS");
		System.out.println("4. DELETE FRUIT PRODUCTS");
		System.out.println("5. BACK TO MAIN MENU");
		
		System.out.println("FUNCTION NUMBER: ");
		int selectedFunction=sc.nextInt();
		
		switch(selectedFunction) {
		
		case 1:
			searchFruitViewer();
			break;
			
		case 2:
			insertFruitViewer();
			break;
			
		case 3:
			updateFruitViewer();
			break;
			
		case 4:
			deleteFruitViewer();
			break;
			
		case 5:
			MainMenu.main(new String[0]);
			break;
			
		default:
			System.out.println("INVALID NUMBER !");
			break;
		
		}
	}
}
