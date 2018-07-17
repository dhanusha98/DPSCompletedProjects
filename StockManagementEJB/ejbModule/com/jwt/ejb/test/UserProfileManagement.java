package com.jwt.ejb.test;

import java.util.Scanner;

import javax.naming.Context;

import com.jwt.ejb.business.MealProducts;
import com.jwt.ejb.businesslogic.Meal;

public class UserProfileManagement {
	
    private static Scanner sc=new Scanner(System.in);
	private static final String LOOKUP_STRING="UserLogicOperation/remote";
	private static final String PROVIDER_URL="jnp://localhost:1099";
	private static final String JNP_INTERFACES="org.jboss.naming:org.jnp.interfaces";
	private static final String INITIAL_CONTEXT_FACTORY="org.jnp.interfaces.NamingContextFactory";
	
	private static Context initialContext;
	
	private static MealProducts bean; //BEAN TO ACCESS BUSINESS LOGIC DATA
	private static Meal mealObj;
	
	
	public static void searchUserViewer() {
		
		System.out.println("====================================== SEARCH PRODUCTS =====================================");

	}
	
    public static void insertUserViewer() {
		
		System.out.println("====================================== INSERT PRODUCTS =====================================");

	}

    public static void updateUserViewer() {
	
		System.out.println("====================================== UPDATE PRODUCTS =====================================");

    }
    
    public static void deleteUserViewer() {
	
		System.out.println("====================================== DELETE PRODUCTS =====================================");

    }

	public static void main(String[] args) {
		
	}
}
