package com.jwt.ejb.test;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jwt.ejb.business.UserLogin;
import com.jwt.ejb.businesslogic.*;
import java.util.Scanner;

public class UserLoginViewer {

	private static final String LOOKUP_STRING="UserLoginOperation/remote";
	private static final String PROVIDER_URL="jnp://localhost:1099";
	private static final String JNP_INTERFACES="org.jboss.naming:org.jnp.interfaces";
	private static final String INITIAL_CONTEXT_FACTORY="org.jnp.interfaces.NamingContextFactory";
	
    private static Context initialContext;
    
    public static Context getInitialContext() throws NamingException {
    	
    	try {
    		
    		if(initialContext !=null) {
        		
    			Properties prop=new Properties();
        		prop.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
        		prop.put(Context.PROVIDER_URL, PROVIDER_URL);
        		prop.put(Context.URL_PKG_PREFIXES, JNP_INTERFACES);
        		
        		initialContext=new InitialContext(prop);
        	}
    	}
    	
    	catch(NamingException ex) {
    		ex.printStackTrace();
    	}
    	catch(Exception ex) {
    		ex.printStackTrace();
    	}
    	
    	return initialContext;
    }
    
    private static UserLogin doLookUp() {
    	
    	Context context=null;
    	UserLogin bean=null;
    	
    	try {
    		
    		context=getInitialContext();
    		bean=(UserLogin)context.lookup(LOOKUP_STRING);
    		
    	}
    	
    	catch(NamingException ex) {
    		ex.printStackTrace();
    	}
    	
    	return bean;
    }
	
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		
		UserLogin bean=doLookUp();
		User userObj=new User();
		
	   System.out.println("================================================================================");
	   System.out.println("                                  USER LOGIN                                    ");
	   System.out.println("================================================================================");
	   
	   System.out.println();
	   
	   System.out.println("ENTER USERNAME: ");
	   String username=sc.nextLine();
	   
	   System.out.println("ENTER PASSWORD: ");
	   String password=sc.nextLine();

	   userObj.setUsername(username);
	   userObj.setPassword(password);
	   
	   boolean validationStatus=bean.formValidation();
	   
	   if(validationStatus == true) {
		  
		   String userValidation=bean.LoginTransaction();
		   
		   if(userValidation.equalsIgnoreCase("LOGIN SUCCESSFUL !")) {
			   MainMenu.main(new String[0]);
		   } else {
			   System.out.println("INVALID USER AUTHENTICATIONS !");
		   }
		  
	   } else {
			System.out.println("USERNAME OR PASSWORD FIELD IS EMPTY !");
	   }
	}
}
