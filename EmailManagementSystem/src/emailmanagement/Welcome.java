package emailmanagement;

import java.util.*;
public class Welcome {
	
	public static void main(String [] args){
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("==================================================");
		System.out.println("             DPS EMAIL MANAGEMENT SYSTEM          ");
		System.out.println("==================================================");
		
		System.out.println();
		
		System.out.println("PRESS THE NUMBER TO IMPLEMENT CORRESPONDING SERVICE");
		System.out.println();
		
		System.out.println("1. ADMIN MAIN MENU");
		System.out.println("2. EMAIL DEPARTMENT");
		
		System.out.println("PRESS THE NUMBER: ");
		int selectedFunction=sc.nextInt();
		
		switch(selectedFunction){
		
		   case 1:
			   AdminOperation.main(new String[0]);
			   break;
			   
		   case 2:
			   
			   break; 
			   
		   default:
			   System.out.println();
			   break;
			
		}
		
	}

}
