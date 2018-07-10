package presentationTier;

import java.util.Scanner;

import businessLogic.*;

public class EnquiryHandler {

	private static EnquiryMgtOperation enqMgtObj=new EnquiryMgtOperation();
    private static Scanner sc=new Scanner(System.in);
    
	public static void searchFunction()
	{
		
		System.out.println("============================== SEARCH ENQUIRY ==============================");
		System.out.println();
		
		System.out.println("ENTER ENQUIRY ID: ");
		int enquiryID=sc.nextInt();
		
		enqMgtObj.searchEnquiry(enquiryID);
	}

    public static void insertFunction()
    {
    	
    	/*private int enquiryID;
    	private int enquiryHolderID;
    	private String enquiryHolderName;
    	private String emailAddress;
    	private String subject;
    	private String message;
    	private String feedbackStatus;*/
		
		System.out.println("============================== INSERT ENQUIRY ==============================");
        System.out.println();
        
        System.out.println("ENQUIRY HOLDER ID: ");
        int enquiryHolderID=sc.nextInt();
        
        System.out.println("ENQUIRY HOLDER NAME: ");
        String enquiryHolderName=sc.nextLine();
        
        System.out.println("EMAIL ADDRESS: ");
        String emailAddress=sc.nextLine();
        
        System.out.println("SUBJECT: ");
        String subject=sc.nextLine();
        
        System.out.println("MESSAGE: ");
        String message=sc.nextLine();
        
        System.out.println("FEEDBACK STATUS: ");
        String feedbackStatus=sc.nextLine();
        
        enqMgtObj.insertEnquiry(enquiryHolderID, enquiryHolderName, emailAddress, subject, message, feedbackStatus);
	}
    
    public static void updateFunction()
    {
		
		System.out.println("============================== UPDATE ENQUIRY ==============================");
        System.out.println();
        
        System.out.println("ENQUIRY ID: ");
        int enquiryID=sc.nextInt();
        
        System.out.println("ENQUIRY HOLDER ID: ");
        int enquiryHolderID=sc.nextInt();
        
        System.out.println("ENQUIRY HOLDER NAME: ");
        String enquiryHolderName=sc.nextLine();
        
        System.out.println("EMAIL ADDRESS: ");
        String emailAddress=sc.nextLine();
        
        System.out.println("SUBJECT: ");
        String subject=sc.nextLine();
        
        System.out.println("MESSAGE: ");
        String message=sc.nextLine();
        
        System.out.println("FEEDBACK STATUS: ");
        String feedbackStatus=sc.nextLine();
        
        enqMgtObj.updateEnquiry(enquiryID, enquiryHolderID, enquiryHolderName, emailAddress, subject, message, feedbackStatus);
	}
    
    public static void deleteFunction()
    {
		
		System.out.println("============================== DELETE ENQUIRY ==============================");
        System.out.println();
        
        System.out.println("ENQUIRY ID: ");
        int enquiryID=sc.nextInt();
        
        enqMgtObj.deleteEnquiry(enquiryID);
	}
	
    public static void main(String[] args) 
    {
    	
    	Scanner sc=new Scanner(System.in);
		
    	System.out.println("============================================================");
    	System.out.println("                   CLIENT MANAGEMENT                        ");
    	System.out.println("============================================================");
    	
    	System.out.println("PRESS FUNCTION NUMBER TO IMPLEMENT CORRESPONDING SERVICE");
    	
    	System.out.println("1. SEARCH ENQUIRY");
    	System.out.println("2. INSERT ENQUIRY");
    	System.out.println("3. UPDATE ENQUIRY");
    	System.out.println("4. DELETE ENQUIRY");
    	System.out.println("5. BACK TO MAIN MENU");

    	System.out.println("PRESS FUNCTION NUMBER: ");
    	int selectedFunction=sc.nextInt();
    	
    	switch(selectedFunction){
    	
    	case 1:
    		searchFunction();
    		break;
    		
    	case 2:
    		insertFunction();
    		break;
    		
    	case 3:
    		updateFunction();
    		break;
    		
    	case 4:
    		deleteFunction();
    		break;
    		
    	case 5:
    		MainMenu.main(new String[0]);
    		break;
    		
    	default:
    		System.out.println("INVALID FUNCTION NUMBER ! PLEASE TRY AGAIN !");
    		break;
    	
    	}
    }
}
