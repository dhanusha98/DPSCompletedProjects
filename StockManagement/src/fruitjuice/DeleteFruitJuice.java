package fruitjuice;

import java.util.Scanner;

public class DeleteFruitJuice {

	private Scanner sc=new Scanner(System.in);
	private fruitJuiceDataLayer.Delete deleteObj=new fruitJuiceDataLayer.Delete();
	
	public void deleteOperation(){
		
        System.out.println("*******************DELETE FRUIT JUICE PRODUCTS******************** \n");
		
		System.out.println("Product ID: ");
		String productID=sc.next();
		
		deleteObj.deleteData(productID);
	}
}
