package presentation_layer;

import java.util.Scanner;

import business_logic_layer.*;
public class AdminProfileManagement {

	private static Scanner sc=new Scanner(System.in);
	private Admin admObj=new Admin();
	private AdminOperation adminOpObj=new AdminOperation();
	
	public void searchAdminProfile()
	{
		
		System.out.println("================== SEARCH ADMIN PROFILES ==================");
		
		System.out.println("ENTER ADMIN PROFILE ID: ");
		int adminID=sc.nextInt();
		
		admObj.setAdminID(adminID);
		adminOpObj.searchAdminData();
	}
	
	public void insertAdminProfile()
	{
		
		/*private int adminID;
		private String adminFullName;
		private String adminUsername;
		private String adminPassword;
		private String userroles;*/
		
		System.out.println("================== INSERT ADMIN PROFILES ==================");
		
		System.out.println("FULL NAME: ");
		String fullname=sc.nextLine();
		
		System.out.println("USERNAME: ");
		String username=sc.nextLine();
		
		System.out.println("PASSWORD: ");
		String password=sc.nextLine();
		
		System.out.println("USER ROLES: ");
		String userroles=sc.nextLine();
		
		admObj.setAdminFullName(fullname);
		admObj.setAdminUsername(username);
		admObj.setAdminPassword(password);
		admObj.setUserroles(userroles);
		
		adminOpObj.insertAdminData();
	}
	
	public void updateAdminProfile()
	{
		System.out.println("================== UPDATE ADMIN PROFILES ==================");
				
		System.out.println("ENTER ADMIN PROFILE ID: ");
		int adminID=sc.nextInt();
		
		System.out.println("FULL NAME: ");
		String fullname=sc.nextLine();
		
		System.out.println("USERNAME: ");
		String username=sc.nextLine();
		
		System.out.println("PASSWORD: ");
		String password=sc.nextLine();
		
		System.out.println("USER ROLES: ");
		String userroles=sc.nextLine();
		
		admObj.setAdminID(adminID);
		admObj.setAdminFullName(fullname);
		admObj.setAdminUsername(username);
		admObj.setAdminPassword(password);
		admObj.setUserroles(userroles);
		
		adminOpObj.updateAdminData();
		
	}
	
	public void deleteAdminProfile()
	{
		System.out.println("================== DELETE ADMIN PROFILES ==================");
		
		System.out.println("ENTER ADMIN PROFILE ID: ");
		int adminID=sc.nextInt();
		
		admObj.setAdminID(adminID);
		adminOpObj.deleteAdminData();
		
	}
	
	public static void main(String[] args) {
		
		AdminProfileManagement admObj=new AdminProfileManagement();
		Scanner sc=new Scanner(System.in);
		try {
			
			System.out.println("=====================================================");
			System.out.println("             ADMIN PROFILE MANAGEMENT                ");
			System.out.println("=====================================================");
			
			System.out.println("SELECT A FUNCTION FOR IMPLEMENTATION");
			
			System.out.println("1. SEARCH ADMIN PROFILE");
			System.out.println("2. INSERT ADMIN PROFILE");
			System.out.println("3. UPDATE ADMIN PROFILE");
			System.out.println("4. DELETE ADMIN PROFILE");
			System.out.println("5. BACK TO MAIN MENU");
			
			System.out.println("PRESS A NUMBER TO IMPLEMENT CORRESPONDING SERVICE");
			int selectedFunction=sc.nextInt();
			
			switch(selectedFunction){
			
			    case 1:
			    	System.out.println();
			    	break;
			    	
			    case 2:
			    	System.out.println();
			    	break;
			    	
			    case 3:
			    	System.out.println();
			    	break;
			    	
			    case 4:
			    	System.out.println();
			    	break;
			    	
			    case 5:
			    	System.out.println();
			    	break;
			    	
			    default:
				    System.out.println();
				    break;
			}
			
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
