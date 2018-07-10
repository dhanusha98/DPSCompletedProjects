package presentation_layer;

import java.util.*;
import business_logic_layer.*;
public class CustomerProfileManagement {	

	private static Scanner sc=new Scanner(System.in);
	private Customer custObj=new Customer();
	private CustomerOperation custOpObj=new CustomerOperation();
	
	public void searchCustomerProfile()
	{
		
		System.out.println("================== SEARCH CUSTOMER PROFILES ==================");
		
		System.out.println("ENTER CUSTOMER PROFILE ID: ");
		int customerID=sc.nextInt();
		
		custObj.setCustomerID(customerID);
		custOpObj.searchCustomer();
	}
	
	public void insertCustomerProfile()
	{
		
		System.out.println("================== INSERT CUSTOMER PROFILES ==================");

		System.out.println("ENTER CUSTOMER FULL NAME: ");
		String customerName=sc.nextLine();
		
		System.out.println("USERNAME: ");
		String username=sc.nextLine();
		
		System.out.println("PASSWORD: ");
		String password=sc.nextLine();
		
		System.out.println("DETAILS: ");
		String details=sc.nextLine();
		
		custObj.setCustomerFullName(customerName);
		custObj.setCustomerUsername(username);
		custObj.setCustomerPassword(password);
		custObj.setDetails(details);
		
		custOpObj.insertCustomer();

	}
	
	public void updateCustomerProfile()
	{
		
		System.out.println("================== UPDATE CUSTOMER PROFILES ==================");

		System.out.println("ENTER CUSTOMER ID: ");
		int customerID=sc.nextInt();
		
		System.out.println("ENTER CUSTOMER FULL NAME: ");
		String customerName=sc.nextLine();
		
		System.out.println("USERNAME: ");
		String username=sc.nextLine();
		
		System.out.println("PASSWORD: ");
		String password=sc.nextLine();
		
		System.out.println("DETAILS: ");
		String details=sc.nextLine();
		
		custObj.setCustomerID(customerID);
		custObj.setCustomerFullName(customerName);
		custObj.setCustomerUsername(username);
		custObj.setCustomerPassword(password);
		custObj.setDetails(details);
		
		custOpObj.updateCustomer();
	}
	
	public void deleteCustomerProfile()
	{
		
		System.out.println("================== DELETE CUSTOMER PROFILES ==================");

		System.out.println("ENTER CUSTOMER ID: ");
		int customerID=sc.nextInt();
		
		custObj.setCustomerID(customerID);
		custOpObj.deleteCustomer();
		
	}
	
	public static void main(String[] args) 
	{
		
		CustomerProfileManagement custproObj=new CustomerProfileManagement();
		try {
			
			System.out.println("=====================================================");
			System.out.println("             CUSTOMER PROFILE MANAGEMENT             ");
			System.out.println("=====================================================");
			
			System.out.println("SELECT A FUNCTION FOR IMPLEMENTATION");
			
			System.out.println("1. SEARCH CUSTOMER PROFILE");
			System.out.println("2. INSERT CUSTOMER PROFILE");
			System.out.println("3. UPDATE CUSTOMER PROFILE");
			System.out.println("4. DELETE CUSTOMER PROFILE");
			System.out.println("5. BACK TO MAIN MENU");
			
			System.out.println("PRESS A NUMBER TO IMPLEMENT CORRESPONDING SERVICE");
			int selectedFunction=sc.nextInt();
			
			switch(selectedFunction){
			
			    case 1:
			    	custproObj.searchCustomerProfile();
			    	break;
			    	
			    case 2:
			    	custproObj.insertCustomerProfile();
			    	break;
			    	
			    case 3:
			    	custproObj.updateCustomerProfile();
			    	break;
			    	
			    case 4:
			    	custproObj.deleteCustomerProfile();
			    	break;
			    	
			    case 5:
			    	AdminMainMenu.main(new String[0]);
			    	break;
			    	
			    default:
			    	System.out.println("INVALID FUNCTION NUMBER ! PLEASE TRY AGAIN !");
				    break;
			}
			
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
		     
	}
}
