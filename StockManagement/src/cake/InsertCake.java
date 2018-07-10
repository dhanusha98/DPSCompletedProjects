package cake;

import java.util.Scanner;

public class InsertCake {

	private Scanner sc=new Scanner(System.in);
	private cakeDataLayer.Insert insertObj=new cakeDataLayer.Insert();
	
    public void insertOperation(){
		
	System.out.println("*******************INSERT CAKE PRODUCTS******************** \n");
				
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
		
        insertObj.insertData(productID, productName, productCategory, quantity, price);
        
	}
	
}
