package defaultpackage;

import java.util.*;
public class MainMenu {

	public static void main(String[] strings) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("===============================================");
		System.out.println("                  MAIN MENU                    ");
		System.out.println("===============================================");
		
		System.out.println("SELECT NUMBER TO IMPLEMENT PARTICULAR SERVICE");
		System.out.println();
		
		System.out.println("1. USER MANAGEMENT SERVICE");
		System.out.println("2. LOGOUT");
		
		System.out.println();

		System.out.println("PLEASE SELECT THE NUMBER: ");
		int selectedFunction=sc.nextInt();
		
		switch(selectedFunction){
		
		case 1:
			 UserManagement.main(new String[0]);
			 break;
			 
		case 2:
			 System.out.println("DO YOU WANT TO LOGOUT? (Press Y/N)");
			 char logoutstatus=sc.next().charAt(0);
		     if(logoutstatus =='Y'){
		    	 Login.main(new String[0]);
		    	 
		     } else if(logoutstatus =='N'){
		          MainMenu.main(new String[0]);
		     }
		     break;
			 
		default:
			 System.out.println("INVALID NUMBER. PLEASE TRY AGAIN");
			 MainMenu.main(new String[0]);
		}
	}
}
