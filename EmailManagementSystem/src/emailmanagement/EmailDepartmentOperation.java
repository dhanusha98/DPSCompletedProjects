package emailmanagement;

import java.util.*;
public class EmailDepartmentOperation {

	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("=============================================");
		System.out.println("              EMAIL/ADMIN MANAGEMENT         ");
		System.out.println("=============================================");
		
		System.out.println();
		
		System.out.println("PRESS FUNCTION NUMBER FOR IMPLEMENTATION");
		
		System.out.println("1. EMAIL MANAGEMENT");
		System.out.println("2. USER MANAGEMENT");
		
		System.out.println("SELECT A FUNCTION NUMBER: ");
		int selectedFunction=sc.nextInt();
		
		switch(selectedFunction){
		
		   case 1:
			  EmailManagement.main(new String[0]);
			  break;
		   case 2:
			  AdminManagement.main(new String[0]);
			  break;
			
		   default:
			 System.out.println("INVALID FUNCTION NUMBER. PLEASE TRY AGAIN!");
			 break;
		}
	}
}
