package mainmenu;

import java.util.Scanner;

import userlogin.UserLogin;

public class MainMenu {

	static Scanner sc=new Scanner(System.in);
	
	static butter.ButterAdminMenu bt = new butter.ButterAdminMenu();
	static cake.CakeAdminMenu ck = new cake.CakeAdminMenu();
	static fruitjuice.FruitJuiceAdminMenu fj = new fruitjuice.FruitJuiceAdminMenu();
	
	
	public static void mainMenu(){
		
			try {
				
				System.out.println("------------------MAIN MENU---------------------------");
				
				System.out.println("1. Manage Cake Products \n");
				System.out.println("2. Manage FruitJuice Products \n");
				System.out.println("3. Manage Butter Products \n");
				System.out.println("4. Log out");
				
				System.out.println("Select function number to proceed " +
						           "(ex. Press 1 for 'Manage Cake Products': ");
				
				if(!(sc.hasNextInt())){
					
					String selectedValue=sc.next();
					System.out.println(selectedValue+ "is not a Valid Number !");
					
				}
				
				else if(sc.hasNextInt()){
					
					int selectedFunction=sc.nextInt();
					
					if (selectedFunction == 1) {

						ck.adminMenu();

					} else if (selectedFunction == 2) {

						fj.adminMenu();

					} else if (selectedFunction == 3){
						
						bt.adminMenu();
					}
					
					else if (selectedFunction == 4) {

						UserLogin.login();

					} else {

						System.out.println("No Matching Function Found ! Please Try Again!");
					}
						
				} 		
				
			}
			
			catch(Exception ex){
				
				ex.printStackTrace();
			}
		
			
		
	}
}
