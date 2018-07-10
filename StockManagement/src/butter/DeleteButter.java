package butter;

import java.util.Scanner;

public class DeleteButter {

	private Scanner sc=new Scanner(System.in);
	private butterDataLayer.Delete deleteObj=new butterDataLayer.Delete();
	
	public void deleteOperation(){
		
		System.out.println("*******************DELETE BUTTER PRODUCTS******************** \n");
		
		System.out.println("Product ID: ");
		String productID=sc.next();
		
		deleteObj.deleteData(productID);
	}
}
