package presentationLayer;

import java.util.*;

import businessLogicLayer.Admin;
import businessLogicLayer.AdminOperation;
public class AdminManagement {
	
    private static Scanner sc=new Scanner(System.in);
	
	private static Admin adminObj=new Admin();
	private static AdminOperation admOPObj=new AdminOperation();
	
	public static void searchProfileViewer()
	{
		
		System.out.println("======================= SEARCH PROFILES =======================");
		
		System.out.println("ENTER ADMIN ID: ");
		int adminID=sc.nextInt();
		
		adminObj.setAdminID(adminID);
		admOPObj.searchProfile();
	}
	
	public static void insertProfileViewer()
	{
		
		System.out.println("======================= INSERT PROFILES =======================");
		
		System.out.println("ENTER ADMIN FULLNAME: ");
		String adminFullName=sc.nextLine();
		
		System.out.println("ENTER ADMIN USERNAME: ");
		String adminUsername=sc.nextLine();
		
		System.out.println("ENTER ADMIN PASSWORD: ");
		String adminPassword=sc.nextLine();
		
		System.out.println("ENTER OTHER DETAILS: ");
		String otherDetails=sc.nextLine();
		
		adminObj.setAdminFullName(adminFullName);
		adminObj.setAdminUsername(adminUsername);
		adminObj.setAdminPassword(adminPassword);
		adminObj.setOtherDetails(otherDetails);
		
		admOPObj.insertProfile();
		
	}
	
	public static void updateProfileViewer()
	{
		
		System.out.println("======================= UPDATE PROFILES =======================");
		
		System.out.println("ENTER ADMIN ID: ");
		int adminID=sc.nextInt();
		
		System.out.println("ENTER ADMIN FULLNAME: ");
		String adminFullName=sc.nextLine();
		
		System.out.println("ENTER ADMIN USERNAME: ");
		String adminUsername=sc.nextLine();
		
		System.out.println("ENTER ADMIN PASSWORD: ");
		String adminPassword=sc.nextLine();
		
		System.out.println("ENTER OTHER DETAILS: ");
		String otherDetails=sc.nextLine();
		
		adminObj.setAdminID(adminID);
		adminObj.setAdminFullName(adminFullName);
		adminObj.setAdminUsername(adminUsername);
		adminObj.setAdminPassword(adminPassword);
		adminObj.setOtherDetails(otherDetails);
		
		admOPObj.updateProfile();
	}
	
	public static void deleteProfileViewer()
	{
		
		System.out.println("======================= DELETE PROFILES =======================");
		
		System.out.println("ENTER ADMIN ID: ");
		int adminID=sc.nextInt();
		
		adminObj.setAdminID(adminID);
		admOPObj.deleteProfile();
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("=============================================================");
		System.out.println("                       ADMIN MANAGEMENT                      ");
		System.out.println("=============================================================");
	
        System.out.println();
		System.out.println("PRESS ANY FUNCTION NUMBER IN FOLLOWING TO IMPLEMENT CORRESPONDING SERVICE");
		
		System.out.println("1. SEARCH ADMIN PROFILE");
		System.out.println("2. INSERT ADMIN PROFILE");
		System.out.println("3. UPDATE ADMIN PROFILE");
		System.out.println("4. DELETE ADMIN PROFILE");
		
		System.out.println("FUNCTION NUMBER: ");
		int selectedFunction=sc.nextInt();
		
		switch(selectedFunction){
		
		case 1:
			searchProfileViewer();
			break;
			
		case 2:
			insertProfileViewer();
			break;
			
		case 3:
			updateProfileViewer();
			break;
			
		case 4:
			deleteProfileViewer();
			break;
			
		default:
			System.out.println("INVALID FUNCTION NUMBER !");
			break;
		}
	}
}
