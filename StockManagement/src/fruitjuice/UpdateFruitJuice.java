package fruitjuice;

import java.util.Scanner;

public class UpdateFruitJuice {

	private Scanner sc=new Scanner(System.in);
	private fruitJuiceDataLayer.Update updateObj=new fruitJuiceDataLayer.Update();
	
	public void updateOperation(){
		
		 System.out.println("*******************UPDATE FRUIT JUICE PRODUCTS******************** \n");
			
			//String ProductID, String ProductName, String category, int quantity, String price

			System.out.println("Product ID: ");
			String productID=sc.next();
			
			System.out.println("Product Name: ");
			String productName=sc.next();
			
			System.out.println("Category: ");
			String productCategory=sc.next();
			
			System.out.println("Quantity: ");
			int quantity=sc.nextInt();
			
			System.out.println("Price: ");
			String price=sc.next();
			
	        updateObj.updateData(productID, productName, productCategory, quantity, price);
	}
}
