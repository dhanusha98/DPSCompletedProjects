package butter;

import java.util.Scanner;


public class InsertButter {

	private Scanner sc=new Scanner(System.in);
	private butterDataLayer.Insert insertObj=new butterDataLayer.Insert();
	
	public void insertOperation(){
		
		System.out.println("*******************INSERT BUTTER PRODUCTS******************** \n");
		
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
		
        insertObj.insertData(productID, productName, productCategory, quantity, price);
        
	}
}
