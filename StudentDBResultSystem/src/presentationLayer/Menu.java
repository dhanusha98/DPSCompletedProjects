package presentationLayer;

import java.util.*;
public class Menu {

	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("=============================================================");
		System.out.println("                   DPS STUDENT RESULT MANAGEMENT             ");
		System.out.println("=============================================================");

		System.out.println();
		
		System.out.println("PRESS ANY FUNCTION NUMBER IN FOLLOWING TO IMPLEMENT CORRESPONDING SERVICE");
		
		System.out.println("1. STUDENT DETAIL MANAGEMENT");
		System.out.println("2. ADMIN PROFILE MANAGEMENT");
		
		System.out.println("FUNCTION NUMBER: ");
		int selectedFunction=sc.nextInt();
		
		switch(selectedFunction){
		
		case 1:
			StudentManagement.main(new String[0]);
			break;
			
		case 2:
			AdminManagement.main(new String[0]);
			break;
			
		default:
			System.out.println("INVALID FUNCTION NUMBER !");
			break;
		}
	}
}
