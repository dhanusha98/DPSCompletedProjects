package presentation_layer;

import java.util.*;
public class Welcome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		  Scanner sc=new Scanner(System.in);
		  Login loginObj=new Login();
		  
		  System.out.println("======================= WELCOME PAGE =======================");
		  
		  System.out.println("SELECT USER TYPE");
		  
		  System.out.println("1. ADMIN USER");
		  System.out.println("2. CUSTOMER");
		  
		  System.out.println("PRESS NUMBER TO IMPLEMENT CORRESPONDING FUNCTIONALITY: ");
		  int selectedFunction=sc.nextInt();
		  
		  switch(selectedFunction){
		  
		     case 1:
			      loginObj.setLogintype("ADMIN");
			      Login.main(new String[0]);
			      break;
			      
		     case 2:
		    	  loginObj.setLogintype("CUSTOMER");
			      Login.main(new String[0]);
			      break;
			      
		     default:
			      System.out.println("INVALID LOGIN TYPE");
			      break;
		  }
		  
	}

}
