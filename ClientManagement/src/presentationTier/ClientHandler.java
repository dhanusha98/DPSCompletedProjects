package presentationTier;

import java.util.*;
import entityTypes.*;
import businessLogic.*;

public class ClientHandler {

	private static Scanner sc=new Scanner(System.in);
	private static ClientMgtOperation custMgtObj=new ClientMgtOperation();
	
	public static void searchFunction()
	{
		
		System.out.println("============================== SEARCH CLIENT ==============================");
		System.out.println();
		
		System.out.println("ENTER CLIENT ID: ");
		int customerID=sc.nextInt();
		
		custMgtObj.searchData(customerID);
	}

    public static void insertFunction()
    {
		
		System.out.println("============================== INSERT CLIENT ==============================");
        System.out.println();
        
        System.out.println("ENTER CUSTOMER NAME: ");
        String customerName=sc.nextLine();
        
        System.out.println("ENTER CONTACT INFO: ");
        String contactInfo=sc.nextLine();
        
        System.out.println("ENTER BUYING HISTORY: ");
        String buyingHistory=sc.nextLine();
        
        System.out.println("ENTER REGISTERED DATE: ");
        String registeredDate=sc.nextLine();
        
        System.out.println("ENTER TARGET PRODUCT DETAILS: ");
        String targetProductDetails=sc.nextLine();
        
        custMgtObj.insertData(customerName, contactInfo, buyingHistory, registeredDate, targetProductDetails);
	}
    
    public static void updateFunction()
    {
		
		System.out.println("============================== UPDATE CLIENT ==============================");
        System.out.println();
        
        System.out.println("ENTER CUSTOME ID: ");
        int customerID=sc.nextInt();
        
        System.out.println("ENTER CUSTOMER NAME: ");
        String customerName=sc.nextLine();
        
        System.out.println("ENTER CONTACT INFO: ");
        String contactInfo=sc.nextLine();
        
        System.out.println("ENTER BUYING HISTORY: ");
        String buyingHistory=sc.nextLine();
        
        System.out.println("ENTER REGISTERED DATE: ");
        String registeredDate=sc.nextLine();
        
        System.out.println("ENTER TARGET PRODUCT DETAILS: ");
        String targetProductDetails=sc.nextLine();
        
        custMgtObj.updateData(customerID, customerName, contactInfo, buyingHistory, registeredDate, targetProductDetails);
	}
    
    public static void deleteFunction()
    {
		
		System.out.println("============================== DELETE CLIENT ==============================");

		System.out.println("ENTER CLIENT ID: ");
		int customerID=sc.nextInt();
		
		custMgtObj.deleteData(customerID);
	}
	
    public static void main(String[] args) 
    {
    	
    	Scanner sc=new Scanner(System.in);
		
    	System.out.println("============================================================");
    	System.out.println("                   CLIENT MANAGEMENT                        ");
    	System.out.println("============================================================");
    	
    	System.out.println("PRESS FUNCTION NUMBER TO IMPLEMENT CORRESPONDING SERVICE");
    	
    	System.out.println("1. SEARCH CLIENT DATA");
    	System.out.println("2. INSERT CLIENT DATA");
    	System.out.println("3. UPDATE CLIENT DATA");
    	System.out.println("4. DELETE CLIENT DATA");
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
