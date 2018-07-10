package cake;

import java.util.Scanner;

public class SearchCake {

	private Scanner sc=new Scanner(System.in);
	private cakeDataLayer.Search searchObj=new cakeDataLayer.Search();
	
	public void searchOperation(){
           System.out.println("*******************SEARCH CAKE PRODUCTS******************** \n");
		
		   System.out.println("Enter Product Name: ");
		   String productName=sc.next();
		
		   System.out.println("\n Results: "+"\n");
		
		   searchObj.searchData(productName);
	}
	
}
