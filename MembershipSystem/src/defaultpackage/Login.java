package defaultpackage;

import java.util.*;
public class Login {

	private static String un="DhanushaPS";
	private static String ps="123";
	private static MainMenu mObj=new MainMenu();
	
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("===============================================");
		System.out.println("                  LOGIN                        ");
		System.out.println("===============================================");
		
		System.out.println("\n");
		
		System.out.println("ENTER USERNAME: ");
		String username=sc.nextLine();
		
		System.out.println("ENTER PASSWORD: ");
		String password=sc.nextLine();
		
		if(username.equals(un) && password.equals(ps)){
			System.out.println("LOGIN SUCCESSFUL !");
			MainMenu.main(new String[0]);

			
		} else {
			System.out.println("LOGIN FAILED!");
		}
	}
}
