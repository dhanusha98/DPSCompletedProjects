package butter;

import java.util.Scanner;

import mainmenu.MainMenu;

public class ButterAdminMenu {

	static Scanner sc=new Scanner(System.in);
	
	static butter.SearchButter sbobj=new butter.SearchButter();
	static butter.InsertButter ibobj=new butter.InsertButter();
	static butter.UpdateButter ubobj=new butter.UpdateButter();
	static butter.DeleteButter dbobj=new butter.DeleteButter();
	
	
	public void adminMenu(){
		
		try {
			
            System.out.println("======================Butter Product Admin Menu============================");
			
			System.out.println("1. Search Butter Products");
			System.out.println("2. Insert Butter Products");
			System.out.println("3. Update Butter Products");
			System.out.println("4. Delete Butter Products");
			System.out.println("5. Back to Main Menu");
			
			System.out.println("Select function number to proceed " +
	        "(ex. Press 1 for 'Search Butter Products': ");
						
			if(!(sc.hasNextInt())){
				
				String selectedValue=sc.next();
				System.out.println(selectedValue+ " is not a Valid Number !");
			}
			
			else if(sc.hasNextInt()){
				
			   int selectedFunction=sc.nextInt();
				
			  switch (selectedFunction) {

				case 1:
	                sbobj.searchOperation();
					break;

				case 2:
					ibobj.insertOperation();
					break;

				case 3:
					ubobj.updateOperation();
					break;

				case 4:
					dbobj.deleteOperation();
					break;

				case 5:
					MainMenu.mainMenu();
					break;

				default:
					System.out.println("No Matching Function Found ! Please Try Again!");
					break;
				}
				
			} 
			
		} catch (Exception ex){
			ex.printStackTrace();
		}
		
			
	}
}
