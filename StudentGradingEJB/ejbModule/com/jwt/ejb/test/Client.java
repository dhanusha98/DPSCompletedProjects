package com.jwt.ejb.test;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.jwt.ejb.business.StudentPerformance;
import java.util.*;

public class Client {
	
	private static final String LOOKUP_STRING="PerformanceCalculator/remote";
	private static final String PROVIDER_URL="jnp://localhost:1099";
	private static final String JNP_INTERFACES="org.jboss.naming:org.jnp.interfaces";
	private static final String INITIAL_CONTEXT_FACTORY="org.jnp.interfaces.NamingContextFactory";
	
	private static Context initialContext;
	
       public static Context getInitialContext() throws NamingException {
        
    	if (initialContext == null) {
            // Properties extends HashTable
            Properties prop = new Properties();
            prop.put(Context.INITIAL_CONTEXT_FACTORY, INITIAL_CONTEXT_FACTORY);
            prop.put(Context.URL_PKG_PREFIXES, JNP_INTERFACES);
            prop.put(Context.PROVIDER_URL, PROVIDER_URL);
            initialContext = new InitialContext(prop);
        }
    	
        return initialContext;
        
       }
       
       private static StudentPerformance doLookup() {
           Context context = null;
           StudentPerformance bean = null;
           try {
               // 1. Obtaining Context
               context = getInitialContext();
               // 2. Lookup and cast
               bean = (StudentPerformance) context.lookup(LOOKUP_STRING);
           } catch (NamingException e) {
               e.printStackTrace();
           }
           return bean;
       }
	
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		
		StudentPerformance bean=doLookup();
		
	    System.out.println("Student Name: ");
	    String studentName=sc.nextLine();
	    
	    System.out.println("JAVA Marks: ");
	    double javaMarks=sc.nextDouble();
	    
	    System.out.println("C# Marks: ");
	    double csharpMarks=sc.nextDouble();
	    
	    System.out.println("Python Marks: ");
	    double pythonMarks=sc.nextDouble();
	    
	    double total=bean.getTotal(javaMarks, csharpMarks, pythonMarks);
	    double average=bean.getAvg(total);
	    
	    String grade=bean.getGrade(average);
	   
	    System.out.println(studentName + " \' \'s Result Profile ----------------");
	    System.out.println("TOTAL: "+total);
	    System.out.println("AVERAGE: "+average);
	    System.out.println("GRADE: "+grade);
	    
	    
	}

}
