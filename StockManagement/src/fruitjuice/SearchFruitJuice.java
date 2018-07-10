package fruitjuice;

import java.util.Scanner;

public class SearchFruitJuice {

	private Scanner sc=new Scanner(System.in);
	private fruitJuiceDataLayer.Search searchObj=new fruitJuiceDataLayer.Search();
	
	public void searchOperation(){
		
        System.out.println("*******************SEARCH FRUIT JUICE PRODUCTS******************** \n");
		
		System.out.println("Enter Product Name: ");
		String productName=sc.next();
		
		System.out.println("\n Results: "+"\n");
		
		searchObj.searchData(productName);
	}
}
