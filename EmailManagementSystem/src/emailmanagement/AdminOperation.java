package emailmanagement;

import java.util.*;

public class AdminOperation {
	
	DatabaseAccess.AdminDataLayer admObj=new DatabaseAccess.AdminDataLayer();
	
	public void viewProfile(int adminID){
		admObj.searchAdmin(adminID);
	}
	
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);

		try {
			
			AdminOperation aoObj=new AdminOperation();
			
			System.out.println("==================================================");
			System.out.println("               ADMIN MAIN MENU                    ");
			System.out.println("==================================================");
			
			System.out.println();
			
			System.out.println("1. VIEW PROFILE DETAILS");
			System.out.println("2. SEND A NEW EMAIL");
			
			System.out.println("PRESS FUNCTION NUMBER TO IMPLEMENT CORRESPONDING SERVICE");
			int selectedFunction=sc.nextInt();
			
			switch(selectedFunction){
			
			case 1:
				aoObj.viewProfile(1);
				break;
			case 2:
				EmailSender.main(new String[0]);
				break;
				
	        default:
	        	System.out.println("INVALID FUNCTION NUMBER. PLEASE TRY AGAIN LATER !!");
	        	break;
			}
		}
		
		catch(InputMismatchException ex){
			System.out.println("INVALID INPUT TYPE OF DATA. PLEASE TRY AGAIN !");
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
		
		finally{
			sc.close();
		}
		
	}
}
