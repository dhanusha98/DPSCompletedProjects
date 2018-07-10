package presentationTier;

import java.util.Scanner;
import entityTypes.Administrator;
import businessLogic.AdminMgtOperation;

public class AdminHandler {
	
	private static Scanner sc=new Scanner(System.in);
	private static Administrator admObj=new Administrator();
	private static AdminMgtOperation admMgtObj=new AdminMgtOperation();
	
	public static void searchFunction()
	{
		
		System.out.println("============================== SEARCH ADMIN PROFILE ==============================");
		System.out.println();
		
		System.out.println("ADMIN ID: ");
		int adminID=sc.nextInt();
		
		admMgtObj.searchOperation(adminID);
	}

    public static void insertFunction()
    {
		
		System.out.println("============================== INSERT ADMIN PROFILE ==============================");
        System.out.println();
        
        System.out.println("ADMIN NAME: ");
        String adminName=sc.nextLine();
        
        System.out.println("ADMIN USERNAME: ");
        String adminUserName=sc.nextLine();
        
        System.out.println("ADMIN PASSWORD: ");
        String adminPassword=sc.nextLine();
        
        System.out.println("ACCOUNT EXPIRY DATE: ");
        String accountExpiryDate=sc.nextLine();
        
        System.out.println("ADMIN OTHER DETAILS: ");
        String adminOtherDetails=sc.nextLine();
        
        admMgtObj.insertOperation(adminName, adminUserName, adminPassword, accountExpiryDate, adminOtherDetails);
	}
    
    public static void updateFunction()
    {
		
		System.out.println("============================== UPDATE ADMIN PROFILE ==============================");
        System.out.println();
        
        System.out.println("ADMIN ID: ");
        int adminID=sc.nextInt();
        
        System.out.println("ADMIN NAME: ");
        String adminName=sc.nextLine();
        
        System.out.println("ADMIN USERNAME: ");
        String adminUserName=sc.nextLine();
        
        System.out.println("ADMIN PASSWORD: ");
        String adminPassword=sc.nextLine();
        
        System.out.println("ACCOUNT EXPIRY DATE: ");
        String accountExpiryDate=sc.nextLine();
        
        System.out.println("ADMIN OTHER DETAILS: ");
        String adminOtherDetails=sc.nextLine();
        
        admMgtObj.updateOperation(adminID, adminName, adminUserName, adminPassword, accountExpiryDate, adminOtherDetails);
        
	}
    
    public static void deleteFunction()
    {
		
		System.out.println("============================== DELETE ADMIN PROFILE ==============================");
        System.out.println();
        
        System.out.println("ADMIN ID: ");
		int adminID=sc.nextInt();
		
		admMgtObj.deleteOperation(adminID);
        
	}
	
    public static void main(String[] args) 
    {
    	
    	Scanner sc=new Scanner(System.in);
		
    	System.out.println("============================================================");
    	System.out.println("                   ADMIN PROFILE MANAGEMENT                 ");
    	System.out.println("============================================================");
    	
    	System.out.println("PRESS FUNCTION NUMBER TO IMPLEMENT CORRESPONDING SERVICE");
    	
    	System.out.println("1. SEARCH ADMIN PROFILE");
    	System.out.println("2. INSERT ADMIN PROFILE");
    	System.out.println("3. UPDATE ADMIN PROFILE");
    	System.out.println("4. DELETE ADMIN PROFILE");
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
