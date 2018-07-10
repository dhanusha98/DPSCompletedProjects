package emailmanagement;

import java.util.Arrays;
import java.util.Scanner;

public class AdminManagement {
	
	private static Scanner sc=new Scanner(System.in);
	private EmailDepartment emDepObj=new EmailDepartment();
	private EmailAdmin adminObj=new EmailAdmin();
	
	public void searchAdmin(){
		
		System.out.println("******************** SEARCH ADMIN PROFILE ********************");
		System.out.println();
		
		System.out.println("ENTER ADMIN ID: ");
		int adminID=sc.nextInt();
		
		if(String.valueOf(adminID).equals("")){
			System.out.println("PLEASE ENTER ADMIN ID ! TRY AGAIN !!");
		} else {
			
			adminObj.setAdminID(adminID);
			emDepObj.viewAdmin();
		}
	}
	
    public void insertAdmin(){
		
    	System.out.println("******************** INSERT ADMIN PROFILE ********************");
		System.out.println();
		
		/*int adminID=adminObj.getAdminID();
		String adminName=adminObj.getAdminName();
		String adminType=adminObj.getAdmintype();
		String userRoles=Arrays.toString(adminObj.getUserRoles());*/
		
		System.out.println("ENTER ADMIN NAME: ");
		String adminName=sc.nextLine();
		
		System.out.println("ENTER ADMIN TYPE: ");
		String adminType=sc.nextLine();
		
		System.out.println("ENTER USER ROLES (USE ',' TO SEPARATE EACH ROLE: ");
		String userroles=sc.next();
		sc.nextLine();
		
		String [] userRolesArr = userroles.split(",");
		
		
		if(adminName.equals("") || adminType.equals("") || userroles.equals("")){
			System.out.println("MANDATORY FIELDS ARE EMPTY ! TRY AGAIN !!");
		} else {
			
			adminObj.setAdminName(adminName);
			adminObj.setAdmintype(adminType);
			adminObj.setUserRoles(userRolesArr);
			
			emDepObj.insertAdmin();
		}
		
    }
    
    public void updateAdmin(){
		
    	System.out.println("******************** UPDATE ADMIN PROFILE ********************");
		System.out.println();
		
		System.out.println("ENTER ADMIN ID: ");
		int adminID=sc.nextInt();
		
		System.out.println("ENTER ADMIN NAME: ");
		String adminName=sc.nextLine();
		
		System.out.println("ENTER ADMIN TYPE: ");
		String adminType=sc.nextLine();
		
		System.out.println("ENTER USER ROLES (USE ',' TO SEPARATE EACH ROLE: ");
		String userroles=sc.next();
		sc.nextLine();
		
		String [] userRolesArr = userroles.split(",");
		
		if(String.valueOf(adminID).equals("") || adminName.equals("") || adminType.equals("") || userroles.equals("")){
			System.out.println("MANDATORY FIELDS ARE EMPTY ! TRY AGAIN !!");
		} else {
			
			adminObj.setAdminID(adminID);
			adminObj.setAdminName(adminName);
			adminObj.setAdmintype(adminType);
			adminObj.setUserRoles(userRolesArr);
			
			emDepObj.updateAdmin();
		}
		
	}
    
    public void deleteAdmin(){
		
    	System.out.println("******************** DELETE ADMIN PROFILE ********************");
		System.out.println();
		
		System.out.println("ENTER ADMIN ID: ");
		int adminID=sc.nextInt();
		
		if(String.valueOf(adminID).equals("")){
			System.out.println("PLEASE ENTER ADMIN ID ! TRY AGAIN !!");
		} else {
			
			adminObj.setAdminID(adminID);
			emDepObj.deleteAdmin();
		}
	}

	public static void main(String [] args){
		
         try {
        	
			AdminManagement adminMgObj = new AdminManagement();

			System.out.println("=============================================");
			System.out.println("              ADMIN MANAGEMENT               ");
			System.out.println("=============================================");

			System.out.println();
			System.out.println("PRESS FUNCTION NUMBER FROM FOLLOWING TO IMPLEMENT CORRESPONDING SERVICE");

			System.out.println("1. SEARCH ADMIN PROFILE");
			System.out.println("2. INSERT ADMIN PROFILE");
			System.out.println("3. UPDATE ADMIN PROFILE");
			System.out.println("4. DELETE ADMIN PROFILE");

			System.out.println("FUNCTION NUMBER: ");
			int selectedFunction = sc.nextInt();

			switch (selectedFunction) {

			  case 1:
				adminMgObj.searchAdmin();
				break;

			  case 2:
				adminMgObj.insertAdmin();
				break;

			  case 3:
				adminMgObj.updateAdmin();
				break;

			  case 4:
				adminMgObj.deleteAdmin();
				break;

			  default:
				System.out.println("INVALID FUNCTION NUMBER. PLEASE TRY AGAIN!");
				break;
			}

		}
        
         catch(Exception ex){
        	 ex.printStackTrace();
         }
	}

}