package cake;

public class viewAllCake {

	private cakeDataLayer.ViewAllData viewObj=new cakeDataLayer.ViewAllData();
	
	public void viewAllProducts(){
		
        System.out.println("*******************VIEW ALL CAKE PRODUCTS******************** \n");
		
		System.out.println("Available Products: "+"\n");
		viewObj.displayAllData();

	}
}
