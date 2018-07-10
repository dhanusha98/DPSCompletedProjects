package presentation_layer;

import java.util.*;
import business_logic_layer.*;
public class ViewBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book bookObj=new Book();
		BookOperation bopObj=new BookOperation();
		
		Scanner sc=new Scanner(System.in);
		
		try {
			
			System.out.println("=====================================================");
			System.out.println("             FIND BOOKS                              ");
			System.out.println("=====================================================");
			
			System.out.println("ENTER BOOK ID: ");
			int bookID=sc.nextInt();
			
			bookObj.setBookID(bookID);
			bopObj.searchBookData();
			
			
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
		     
		     
	}

}
