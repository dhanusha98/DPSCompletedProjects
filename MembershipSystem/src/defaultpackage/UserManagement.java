package defaultpackage;
import java.util.*;

public class UserManagement {
	
	private static DBBusinessLogic dblObj=new DBBusinessLogic();
    private static Scanner sc=new Scanner(System.in);
    
 public static void main(String [] args){
		
    	System.out.println("==========================================================");
		System.out.println("                  USER DATA MANAGEMENT                    ");
		System.out.println("==========================================================");
				
		System.out.println("SELECT NUMBER TO IMPLEMENT PARTICULAR SERVICE");
		System.out.println();
		
		System.out.println("1. SEARCH USER ACCOUNT");
		System.out.println("2. ADD USER ACCOUNT");
		System.out.println("3. UPDATE USER ACCOUNT");
		System.out.println("4. DELETE USER ACCOUNT");
		
		System.out.println();

		System.out.println("PLEASE SELECT THE NUMBER: ");
		int selectedFunction=sc.nextInt();
		
		switch(selectedFunction){
		
		  case 1:
			UserManagement.searchUser();
			break;
		  case 2:
			UserManagement.addUser();
			break;
			
		  case 3:
			UserManagement.updateUser();
			break;
			
		  case 4:
			UserManagement.deleteUser();
			break;
		
		  default:
			System.out.println("INVALID NUMBER. PLEASE TRY AGAIN !!");
			UserManagement.main(new String[0]);
			break;
			
		}
	}

	public static void searchUser(){
		
		System.out.println("\n");
		System.out.println("++++++++++++++++++++++++++ SEARCH USER SERVICE ++++++++++++++++++++++++++");
		
		System.out.println("ENTER USER ID NUMBER: ");
		int userid=sc.nextInt();
		
		dblObj.searchUserAccount(userid);
	}
	
	public static void addUser(){
		
		System.out.println("\n");
		System.out.println("++++++++++++++++++++++++++ ADD USER ACCOUNT SERVICE ++++++++++++++++++++++++++");
		
    	System.out.println("FULLNAME: ");
    	String fullName=sc.nextLine();
    	
    	System.out.println("USERNAME: ");
    	String userName=sc.nextLine();
    	
    	System.out.println("PASSWORD: ");
    	String password=sc.nextLine();
    	
    	System.out.println("DESCRIPTION (EX. OTHER DETAILS IF NECESSARY: ");
    	String otherDetails=sc.nextLine();
    	
    	System.out.println("TYPE 'SUBMIT'  TO CREATE THE ACCOUNT: ");
    	String submitStatus=sc.nextLine();
    	
    	if(submitStatus.equalsIgnoreCase("SUBMIT")){
    		dblObj.insertUserAccount(fullName, userName, password, otherDetails);
    		
    	} else {
    		SignUp.main(new String[0]);
    	}
    	
	}
	
	public static void updateUser(){
		
		System.out.println("\n");
		System.out.println("++++++++++++++++++++++++++ UPDATE USER ACCOUNT SERVICE ++++++++++++++++++++++++++");
		
		System.out.println("USER ID: ");
		int userID=sc.nextInt();
		
    	System.out.println("FULLNAME: ");
    	String fullName=sc.nextLine();
    	
    	System.out.println("USERNAME: ");
    	String userName=sc.nextLine();
    	
    	System.out.println("PASSWORD: ");
    	String password=sc.nextLine();
    	
    	System.out.println("DESCRIPTION (EX. OTHER DETAILS IF NECESSARY: ");
    	String otherDetails=sc.nextLine();
    	
    	System.out.println("TYPE 'SUBMIT'  TO UPDATE THE ACCOUNT: ");
    	String submitStatus=sc.nextLine();
    	
    	if(submitStatus.equalsIgnoreCase("SUBMIT")){
    		dblObj.updateUserAccount(userID, fullName, userName, password, otherDetails);
    		
    	} else {
    		SignUp.main(new String[0]);
    	}
    	
	}
	
	public static void deleteUser(){
		
		System.out.println("\n");
		System.out.println("++++++++++++++++++++++++++ DELETE USER ACCOUNT SERVICE ++++++++++++++++++++++++++");
		
		System.out.println("ENTER USER ID NUMBER: ");
		int userid=sc.nextInt();
		
		dblObj.deleteUserAccount(userid);
	}
   
}
