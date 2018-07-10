package fruitjuice;

public class viewAllFruitJuice {

	private fruitJuiceDataLayer.ViewAllData viewObj=new fruitJuiceDataLayer.ViewAllData();

	public void viewAllProducts(){
		
        System.out.println("*******************VIEW ALL FRUIT JUICE PRODUCTS******************** \n");
		
		System.out.println("Available Products: "+"\n");
		viewObj.displayAllData();

	}
}
