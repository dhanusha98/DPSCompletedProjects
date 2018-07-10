package presentationTier;

import java.util.*;
import businessLogic.*;
public class MainMenu {
	
	private static AdminHandler admObj=new AdminHandler();
	private static ClientHandler clObj=new ClientHandler();
	private static EnquiryHandler enqObj=new EnquiryHandler();
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("=========================================================");
		System.out.println("                      MAIN MENU                          ");
		System.out.println("=========================================================");
		
		System.out.println("SELECT A FUNCTION TO IMPLEMENT CORRESPONDING SERVICE");
		
		System.out.println("1. CLIENT PROFILE MANAGEMENT");
		System.out.println("2. MANAGE YOUR PROFILE DETAILS");
		System.out.println("3. MANAGE ADMIN PROFILES");
		System.out.println("4. SEND ENQUIRY");
		System.out.println("5. ENQUIRY MANAGEMENT");
		System.out.println("6. LOGOUT");
		
	    System.out.println();
	    System.out.println("PRESS FUNCTION NUMBER: ");
	    int selectedFunction=sc.nextInt();
	    
	    switch(selectedFunction){
	    
	    case 1:
	    	ClientHandler.main(new String[0]);
	    	break;
	    	
	    case 2:
	    	UserProfileHandler.main(new String[0]);
	    	break;
	    	
	    case 3:
	    	AdminHandler.main(new String[0]);
	    	break;
	    	
	    case 4:
	    	EnquirySender.main(new String[0]);
	    	break;
	    	
	    case 5:
	    	EnquiryHandler.main(new String[0]);
	    	break;
	    	
	    case 6:
	    	Login.main(new String[0]);
	    	break;
	    	
	    default:
	    	System.out.println("INVALID FUNCTION NUMBER. PLEASE TRY AGAIN !");
	    	break;
	    }
	}

}
