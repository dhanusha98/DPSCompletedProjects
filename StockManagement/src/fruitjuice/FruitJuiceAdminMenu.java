package fruitjuice;

import java.util.Scanner;

import mainmenu.MainMenu;

public class FruitJuiceAdminMenu {

    static Scanner sc=new Scanner(System.in);
	
	static fruitjuice.SearchFruitJuice sfobj=new fruitjuice.SearchFruitJuice();
	static fruitjuice.InsertFruitJuice ifobj=new fruitjuice.InsertFruitJuice();
	static fruitjuice.UpdateFruitJuice ufobj=new fruitjuice.UpdateFruitJuice();
	static fruitjuice.DeleteFruitJuice dfobj=new fruitjuice.DeleteFruitJuice();
	
	
    public void adminMenu(){
		
        try {
			
            System.out.println("======================Butter Product Admin Menu============================");
			
			System.out.println("1. Search Fruit Juice Products");
			System.out.println("2. Insert Fruit Juice Products");
			System.out.println("3. Update Fruit Juice Products");
			System.out.println("4. Delete Fruit Juice Products");
			System.out.println("5. Back to Main Menu");
			
			System.out.println("Select function number to proceed " +
	        "(ex. Press 1 for 'Search Fruit Juice Products': ");
						
			if(!(sc.hasNextInt())){
				
				String selectedValue=sc.next();
				System.out.println(selectedValue+ " is not a Valid Number !");
			}
			
			else if(sc.hasNextInt()){
				
			   int selectedFunction=sc.nextInt();
				
			  switch (selectedFunction) {

				case 1:
	                sfobj.searchOperation();
					break;

				case 2:
					ifobj.insertOperation();
					break;

				case 3:
					ufobj.updateOperation();
					break;

				case 4:
					dfobj.deleteOperation();
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
