package presentation_layer;

import java.util.Scanner;

public class AdminMainMenu {

	public static void main(String [] args){
		
		try {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("======================================================");
			System.out.println("                      MAIN MENU                       ");
			System.out.println("======================================================");
		    	
		    System.out.println("1. BOOK MANAGEMENT");
		    System.out.println("2. CUSTOMER USER MANAGEMENT");
		    System.out.println("3. ADMIN PROFILE MANAGEMENT");
		    System.out.println("4. LOGOUT");
		    	 
		    System.out.println("PRESS NUMBER TO IMPLEMENT CORRESPONDING SERVICE");
		    int selectedFunction=sc.nextInt();
		    	 
		    	 switch(selectedFunction){
		    	     case 1:
		    	    	 BookManagement.main(new String[0]);
		    	    	 break;
		    	    	 
		    	     case 2:
	                     CustomerProfileManagement.main(new String[0]);
		    	    	 break;
		    	    	 
		    	     case 3:
		    	    	 AdminProfileManagement.main(new String[0]);
		    	    	 break;
		    	    	 
		    	     case 4:
		    	    	 Login.main(new String[0]);
		    	    	 break;
		    	    	 
		             default:
		            	 System.out.println("INVALID FUNCTION NUMBER ! PLEASE TRY AGAIN !!");
		        	     break;
		    	 }
		    	 
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
} 
