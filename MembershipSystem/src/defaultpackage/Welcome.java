package defaultpackage;

import java.util.*;
public class Welcome {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("===============================================");
		System.out.println("         WELCOME TO DPS USER MANAGEMENT        ");
		System.out.println("===============================================");
		
		System.out.println("DPS USER MANAGEMENT SYSTEM IS THE USER MANAGEMENT " +
				"SYSTEM OF DPS TECHNOLOGIES DEVELOPED AT 2012");
		
		System.out.println();
		
		System.out.println("PRESS FUNCTION NUMBER TO EITHER VIEW 'LOGIN SCREEN' OR " +
				           "'SIGN UP PAGE'");
		
		System.out.println("1. LOGIN SCREEN");
		System.out.println("2. SIGNUP PAGE");
		
		System.out.println("ENTER FUNCTION NUMBER: ");
		int functionNumber=sc.nextInt();
		
		if(functionNumber == 1){
			Login.main(new String[0]);
			
		} else if(functionNumber == 2){
			SignUp.main(new String[0]);
			
		} else {
			System.out.println("INVALID NUMBER ! PLEASE TRY AGAIN !!");
			Welcome.main(new String[0]);
		}
	}

}
