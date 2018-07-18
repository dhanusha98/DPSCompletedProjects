package com.jwt.ejb.test;

import java.util.Properties;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jwt.ejb.business.ManageBeverage;
import com.jwt.ejb.business.ManageFruit;
import com.jwt.ejb.business.UserProfile;
import com.jwt.ejb.businesslogic.Beverage;
import com.jwt.ejb.businesslogic.Fruit;

public class BeverageManagement {

    private static Scanner sc=new Scanner(System.in);
	
	private static final String LOOKUP_STRING="BeverageProductOperation/remote";
	private static final String PROVIDER_URL="jnp://localhost:1099";
	private static final String JNP_INTERFACES="org.jboss.naming:org.jnp.interfaces";
	private static final String INITIAL_CONTEXT_FACTORY="org.jnp.interfaces.NamingContextFactory";
	
	private static Context initialContext;
	
	private static ManageBeverage bean; //BEAN TO ACCESS BUSINESS LOGIC DATA
	private static Beverage beverageObj;
		
	public static Context getInitialContext() throws NamingException {
		
		if(initialContext ==null) {
			Properties prop=new Properties();
			
			prop.put(Context.PROVIDER_URL, PROVIDER_URL);
			prop.put(Context.URL_PKG_PREFIXES, JNP_INTERFACES);
			prop.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
			
			initialContext=new InitialContext(prop); 
		}
		
		return initialContext;
	}
	
	private static ManageBeverage doLookUp() {
		
		Context context=null;
		ManageBeverage bean=null;
		
		try {
			
			context=getInitialContext();
			bean=(ManageBeverage)context.lookup(LOOKUP_STRING);
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return bean;
	}
		
	
	public static void searchBeverageViewer() {
				
		System.out.println("====================================== SEARCH PRODUCTS =====================================");
		System.out.println();
		
		System.out.println("ENTER BEVERAGE ID: ");
		int beverageID=sc.nextInt();
		
		beverageObj.setBeverageID(beverageID);
		
		bean.searchProduct();
	}
	
	public static void insertBeverageViewer() {
				
		System.out.println("====================================== INSERT PRODUCTS =====================================");
		System.out.println();
		
		System.out.println("ENTER BEVERAGE NAME: ");
		String beverageName=sc.nextLine();
		
		System.out.println("ENTER PRODUCT CATEGORY: ");
		String productCategory=sc.nextLine();
		
		System.out.println("ENTER PRICE: ");
		String price=sc.nextLine();
		
		System.out.println("ENTER OTHER DETAILS: ");
		String otherDetails=sc.nextLine();
		
		beverageObj.setBeverageName(beverageName);
		beverageObj.setProductCategory(productCategory);
		beverageObj.setPrice(price);
		beverageObj.setOtherDetails(otherDetails);
		
		bean.insertProduct();
	}
	
	public static void updateBeverageViewer() {
				
		System.out.println("====================================== UPDATE PRODUCTS =====================================");
		System.out.println();
		
		System.out.println("ENTER BEVERAGE ID: ");
		int beverageID=sc.nextInt();
		
		System.out.println("ENTER BEVERAGE NAME: ");
		String beverageName=sc.nextLine();
		
		System.out.println("ENTER PRODUCT CATEGORY: ");
		String productCategory=sc.nextLine();
		
		System.out.println("ENTER PRICE: ");
		String price=sc.nextLine();
		
		System.out.println("ENTER OTHER DETAILS: ");
		String otherDetails=sc.nextLine();
		
		beverageObj.setBeverageID(beverageID);
		beverageObj.setBeverageName(beverageName);
		beverageObj.setProductCategory(productCategory);
		beverageObj.setPrice(price);
		beverageObj.setOtherDetails(otherDetails);
		
		bean.updateProduct();
	}
	
	public static void deleteBeverageViewer() {
				
		System.out.println("====================================== DELETE PRODUCTS =====================================");
		System.out.println();
		
		System.out.println("ENTER BEVERAGE ID: ");
		int beverageID=sc.nextInt();
		
		beverageObj.setBeverageID(beverageID);
		bean.deleteProduct();
		
	}
	
	public static void main(String[] args) {
				
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
			searchBeverageViewer();
			break;
			
		case 2:
			insertBeverageViewer();
			break;
			
		case 3:
			updateBeverageViewer();
			break;
			
		case 4:
			deleteBeverageViewer();
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
