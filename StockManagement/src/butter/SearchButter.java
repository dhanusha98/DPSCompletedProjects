package butter;

import java.util.Scanner;

public class SearchButter{

	private Scanner sc=new Scanner(System.in);
	private butterDataLayer.Search searchObj=new butterDataLayer.Search();
	
	public void searchOperation(){
		
		System.out.println("*******************SEARCH BUTTER PRODUCTS******************** \n");
		
		System.out.println("Enter Product Name: ");
		String productName=sc.next();
		
		System.out.println("\n Results: "+"\n");
		
		searchObj.searchData(productName);
	}
}
