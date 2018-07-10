package cake;

import java.util.Scanner;

public class DeleteCake {

	private Scanner sc=new Scanner(System.in);
	private cakeDataLayer.Delete deleteObj=new cakeDataLayer.Delete();
	
    public void deleteOperation(){
		

		System.out.println("*******************DELETE CAKE PRODUCTS******************** \n");
		
		System.out.println("Product ID: ");
		String productID=sc.next();
		
		deleteObj.deleteData(productID);
	}
}
