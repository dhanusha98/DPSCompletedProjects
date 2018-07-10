package presentation_layer;

import java.util.*;
public class CustomerMainMenu {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("======================================================");
		System.out.println("                      MAIN MENU                       ");
		System.out.println("======================================================");
		
	    try {
	    	
	    	 System.out.println("1. FIND A BOOK");
	    	 System.out.println("2. LOGOUT");
	    	 
	    	 System.out.println("PRESS NUMBER TO IMPLEMENT CORRESPONDING SERVICE");
	    	 int selectedFunction=sc.nextInt();
	    	 
	    	 switch(selectedFunction){
	    	     case 1:
	    	    	 ViewBook.main(new String[0]);
	    	    	 break;
	    	    	 
	    	     case 2:
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
