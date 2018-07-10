package cake;

import java.util.Scanner;

import mainmenu.MainMenu;
public class CakeAdminMenu {
	
    static Scanner sc=new Scanner(System.in);
	
    static cake.SearchCake scobj=new cake.SearchCake();
    static cake.InsertCake icobj=new cake.InsertCake();
    static cake.UpdateCake ucobj=new cake.UpdateCake();
    static cake.DeleteCake dcobj=new cake.DeleteCake();
    
    public void adminMenu(){
		
        try {
			
            System.out.println("======================Cake Product Admin Menu============================");
			
			System.out.println("1. Search Cake Products");
			System.out.println("2. Insert Cake Products");
			System.out.println("3. Update Cake Products");
			System.out.println("4. Delete Cake Products");
			System.out.println("5. Back to Main Menu");
			
			System.out.println("Select function number to proceed " +
	        "(ex. Press 1 for 'Search Cake Products': ");
						
			if(!(sc.hasNextInt())){
				
				String selectedValue=sc.next();
				System.out.println(selectedValue+ " is not a Valid Number !");
			}
			
			else if(sc.hasNextInt()){
				
			   int selectedFunction=sc.nextInt();
				
			  switch (selectedFunction) {

				case 1:
	                scobj.searchOperation();
					break;

				case 2:
					icobj.insertOperation();
					break;

				case 3:
					ucobj.updateOperation();
					break;

				case 4:
					dcobj.deleteOperation();
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
