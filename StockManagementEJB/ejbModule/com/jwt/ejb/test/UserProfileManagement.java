package com.jwt.ejb.test;

import java.util.Properties;
import java.util.Scanner;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jwt.ejb.business.MealProducts;
import com.jwt.ejb.business.UserProfile;
import com.jwt.ejb.businesslogic.Meal;
import com.jwt.ejb.businesslogic.User;

public class UserProfileManagement {
	
    private static Scanner sc=new Scanner(System.in);
	private static final String LOOKUP_STRING="UserLogicOperation/remote";
	private static final String PROVIDER_URL="jnp://localhost:1099";
	private static final String JNP_INTERFACES="org.jboss.naming:org.jnp.interfaces";
	private static final String INITIAL_CONTEXT_FACTORY="org.jnp.interfaces.NamingContextFactory";
	
	private static Context initialContext;
	
	private static UserProfile bean=doLookUp(); //BEAN TO ACCESS BUSINESS LOGIC DATA
	private static User userObj;
		
	public static Context getInitialContext() throws NamingException {
		
		if(initialContext == null) {
			
			Properties prop=new Properties();
			
			prop.put(Context.PROVIDER_URL, PROVIDER_URL);
			prop.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
			prop.put(Context.URL_PKG_PREFIXES, JNP_INTERFACES);
			
			initialContext=new InitialContext(prop);
		}
		
		return initialContext;
	}
	
	private static UserProfile doLookUp() {
		
		Context context=null;
		UserProfile bean=null;
		
		try {
			
			context=getInitialContext();
			bean=(UserProfile)context.lookup(LOOKUP_STRING);
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	    return bean;
	}
	
	public static void searchUserViewer() {
		
		System.out.println("====================================== SEARCH PRODUCTS =====================================");
				
		System.out.println("ENTER USER ID: ");
		int userID=sc.nextInt();
		
		userObj.setUserID(userID);				
		bean.searchProfile();
	}
	
    public static void insertUserViewer() {
		
		System.out.println("====================================== INSERT PRODUCTS =====================================");
		
		System.out.println("ENTER FULL NAME: ");
		String fullName=sc.nextLine();
		
		System.out.println("ENTER USERNAME: ");
		String username=sc.nextLine();
		
		System.out.println("ENTER PASSWORD: ");
		String password=sc.nextLine();
		
		System.out.println("ENTER OTHER DETAILS: ");
		String otherDetails=sc.nextLine();
		
        userObj.setFullname(fullName);
        userObj.setUsername(username);
        userObj.setPassword(password);
        userObj.setOtherDetails(otherDetails);
        
        bean.insertProfile();
	}

    public static void updateUserViewer() {
	
		System.out.println("====================================== UPDATE PRODUCTS =====================================");
		
		System.out.println("ENTER USER ID: ");
		int userID=sc.nextInt();
		
		System.out.println("ENTER FULL NAME: ");
		String fullName=sc.nextLine();
		
		System.out.println("ENTER USERNAME: ");
		String username=sc.nextLine();
		
		System.out.println("ENTER PASSWORD: ");
		String password=sc.nextLine();
		
		System.out.println("ENTER OTHER DETAILS: ");
		String otherDetails=sc.nextLine();
		
		userObj.setUserID(userID);
		userObj.setFullname(fullName);
		userObj.setUsername(username);
		userObj.setPassword(password);
		userObj.setOtherDetails(otherDetails);
		
        bean.updateProfile();
    }
    
    public static void deleteUserViewer() {
	
		System.out.println("====================================== DELETE PRODUCTS =====================================");
		UserProfile bean=doLookUp();
		
		System.out.println("ENTER USER ID: ");
		int userID=sc.nextInt();
		
		userObj.setUserID(userID);		
		bean.deleteProfile();
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
			searchUserViewer();
			break;
			
		case 2:
			insertUserViewer();
			break;
			
		case 3:
			updateUserViewer();
			break;
			
		case 4:
			deleteUserViewer();
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
