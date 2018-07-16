package com.jwt.ejb.test;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jwt.ejb.business.BMICalculator;
import java.util.*;

public class Client {
	
	
	private static final String LOOKUP_STRING="BMIResultMeasurement/remote";
	private static final String PROVIDER_URL="jnp://localhost:1099";
	private static final String JNP_INTERFACES="org:jboss.naming:org.jnp.interfaces";
	private static final String INITIAL_CONTEXT_FACTORY="org.jnp.interfaces.NamingContextFactory";
	
	private static Context initialContext;
	
    public static Context getInitialContext() throws NamingException {
		
    	if(initialContext == null) {
    		
    		Properties prop=new Properties();
    		
    		prop.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
    		prop.put(Context.PROVIDER_URL, PROVIDER_URL);
    		prop.put(Context.URL_PKG_PREFIXES, JNP_INTERFACES);
    		initialContext=new InitialContext(prop);
    		
    	}
    	
    	return initialContext;
	}
	
	
	private static BMICalculator doLookUp() {
		
		Context context=null;
		BMICalculator bean=null;
		
		try {
			
			context=getInitialContext();
			bean= (BMICalculator) context.lookup(LOOKUP_STRING);
			
		} catch(NamingException ex) {
			ex.printStackTrace();
			
		} catch(Exception ex) {
			ex.printStackTrace();
			
		}
		
		return bean;
	}
	
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		BMICalculator bean=doLookUp();
		
		System.out.println("============================== BMI CALCULATOR ==============================");
		
		System.out.println("ENTER YOUR HEIGHT ('Metres'): ");
		double height=sc.nextDouble();
		
		System.out.println("ENTER YOUR WEIGHT ('Kg'): ");
		double weight=sc.nextDouble();
		
		double bmiScore = bean.calculateBMIScore(height, weight);
		String bmiCategory=bean.getBMICategory(bmiScore);
		String bmiRecommendation=bean.bmiRecommendation(bmiCategory);
		
		System.out.println(" BMI RESULTS -------");
		
		System.out.println("BMI SCORE: "+bmiScore);
		System.out.println("BMI CATEGORY: "+bmiCategory);
		System.out.println("BMI RECOMMENDATIONS: "+bmiRecommendation);
	}

}
