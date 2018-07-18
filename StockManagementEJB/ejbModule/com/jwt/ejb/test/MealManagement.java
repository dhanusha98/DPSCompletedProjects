package com.jwt.ejb.test;

import java.util.Properties;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jwt.ejb.business.ManageFruit;
import com.jwt.ejb.business.MealProducts;
import com.jwt.ejb.businesslogic.Beverage;
import com.jwt.ejb.businesslogic.Meal;

public class MealManagement {
	
    private static Scanner sc=new Scanner(System.in);
	
	private static final String LOOKUP_STRING="BeverageProductOperation/remote";
	private static final String PROVIDER_URL="jnp://localhost:1099";
	private static final String JNP_INTERFACES="org.jboss.naming:org.jnp.interfaces";
	private static final String INITIAL_CONTEXT_FACTORY="org.jnp.interfaces.NamingContextFactory";
	
	private static Context initialContext;
	
	private static MealProducts bean=doLookUp(); //BEAN TO ACCESS BUSINESS LOGIC DATA
	private static Meal mealObj;
	
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
	
	private static MealProducts doLookUp() {
		
		Context context=null;
		MealProducts bean=null;
		
		try {
			context=getInitialContext();
			bean=(MealProducts)context.lookup(LOOKUP_STRING);
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return bean;
	}
	
	public static void searchMeal() {
		
		System.out.println("====================================== SEARCH PRODUCTS =====================================");
		
		System.out.println("ENTER MEAL ID: ");
		int mealID=sc.nextInt();
		
		mealObj.setMealID(mealID);
		
		bean.searchProduct();
	}
	
    public static void insertMeal() {
		
		System.out.println("====================================== INSERT PRODUCTS =====================================");
        System.out.println();
		
		System.out.println("ENTER MEAL NAME: ");
		String mealName=sc.nextLine();
		
		System.out.println("ENTER MEAL CATEGORY: ");
		String mealCategory=sc.nextLine();
		
		System.out.println("ENTER PRICE: ");
		String price=sc.nextLine();
		
		System.out.println("ENTER OTHER DETAILS: ");
		String otherDetails=sc.nextLine();
		
		mealObj.setMealName(mealName);
		mealObj.setMealCategory(mealCategory);
		mealObj.setPrice(price);
		mealObj.setOtherDetails(otherDetails);
		
		bean.insertProduct();
    }

    public static void updateMeal() {
 	
		System.out.println("====================================== UPDATE PRODUCTS =====================================");
		System.out.println();

		System.out.println("ENTER MEAL ID: ");
		int mealID=sc.nextInt();
		
		System.out.println("ENTER MEAL NAME: ");
		String mealName=sc.nextLine();
		
		System.out.println("ENTER MEAL CATEGORY: ");
		String mealCategory=sc.nextLine();
		
		System.out.println("ENTER PRICE: ");
		String price=sc.nextLine();
		
		System.out.println("ENTER OTHER DETAILS: ");
		String otherDetails=sc.nextLine();
		
		mealObj.setMealID(mealID);
		mealObj.setMealName(mealName);
		mealObj.setMealCategory(mealCategory);
		mealObj.setPrice(price);
		mealObj.setOtherDetails(otherDetails);
		
		bean.updateProduct();
    }

    public static void deleteMeal() {
	
		System.out.println("====================================== DELETE PRODUCTS =====================================");

		System.out.println("ENTER MEAL ID: ");
		int mealID=sc.nextInt();
		
		mealObj.setMealID(mealID);
		
		bean.deleteProduct();
    }

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
				
		System.out.println("=================================================================================");
		System.out.println("                              MEAL PRODUCT MANAGEMENT                             ");
		System.out.println("=================================================================================");
		
		System.out.println();
		
		System.out.println("PRESS A FUNCTION NUMBER TO IMPLEMENT CORRESPONDING SERVICE");
		
		System.out.println("1. SEARCH MEAL PRODUCTS");
		System.out.println("2. INSERT MEAL PRODUCTS");
		System.out.println("3. UPDATE MEAL PRODUCTS");
		System.out.println("4. DELETE MEAL PRODUCTS");
		System.out.println("5. BACK TO MAIN MENU");
		
		System.out.println("FUNCTION NUMBER: ");
		int selectedFunction=sc.nextInt();
		
		switch(selectedFunction) {
		
		case 1:
			searchMeal();
			break;
			
		case 2:
			insertMeal();
			break;
			
		case 3:
			updateMeal();
			break;
			
		case 4:
			deleteMeal();
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
