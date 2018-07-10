package presentation_layer;

import java.util.Scanner;

import business_logic_layer.*;
import business_logic_layer.*;

public class BookManagement {
	
	private static Scanner sc=new Scanner(System.in);
	private Book bookObj=new Book();
	private BookOperation bookOpObj=new BookOperation();
	
	public void searchBook()
	{
		System.out.println("======================== SEARCH BOOK ========================");
		
		System.out.println("ENTER BOOKID: ");
		int bookID=sc.nextInt();
		
		bookObj.setBookID(bookID);
		bookOpObj.searchBookData();
	}
	
	public void insertBook()
	{
		System.out.println("======================== INSERT BOOK ========================");
		
		System.out.println("BOOK NAME: ");
		String bookName=sc.nextLine();
		
		System.out.println("BOOK CATEGORY: ");
		String bookCategory=sc.nextLine();
		
		System.out.println("AUTHOR: ");
		String author=sc.nextLine();
		
		System.out.println("PUBLISHER: ");
		String publisher=sc.nextLine();
		
		System.out.println("QUANTITY: ");
		int quantity=sc.nextInt();
		
		System.out.println("PRICE: ");
		String price=sc.nextLine();
		
		bookObj.setBookName(bookName);
		bookObj.setBookCategory(bookCategory);
		bookObj.setAuthor(author);
		bookObj.setPublisher(publisher);
		bookObj.setQuantity(quantity);
		bookObj.setPrice(price);
		
		bookOpObj.insertBookData();
	}
	
	public void updateBook()
	{
		System.out.println("======================== UPDATE BOOK ========================");
		
		System.out.println("ENTER BOOK ID: ");
		int bookID=sc.nextInt();
		
		System.out.println("BOOK NAME: ");
		String bookName=sc.nextLine();
		
		System.out.println("BOOK CATEGORY: ");
		String bookCategory=sc.nextLine();
		
		System.out.println("AUTHOR: ");
		String author=sc.nextLine();
		
		System.out.println("PUBLISHER: ");
		String publisher=sc.nextLine();
		
		System.out.println("QUANTITY: ");
		int quantity=sc.nextInt();
		
		System.out.println("PRICE: ");
		String price=sc.nextLine();
		
		bookObj.setBookID(bookID);
		bookObj.setBookName(bookName);
		bookObj.setBookCategory(bookCategory);
		bookObj.setAuthor(author);
		bookObj.setPublisher(publisher);
		bookObj.setQuantity(quantity);
		bookObj.setPrice(price);
		
		bookOpObj.updateBookData();
		
	}
	
	public void deleteBook()
	{
		System.out.println("======================== DELETE BOOK ========================");
		
		System.out.println("ENTER BOOKID: ");
		int bookID=sc.nextInt();
		
		bookObj.setBookID(bookID);
		bookOpObj.deleteBookData();
	}
	public static void main(String [] args){
		
		BookManagement bmObj=new BookManagement();
		Scanner sc=new Scanner(System.in);
		try {
			
			System.out.println("=====================================================");
			System.out.println("             BOOK DATA MANAGEMENT                    ");
			System.out.println("=====================================================");
			
			System.out.println("SELECT A FUNCTION FOR IMPLEMENTATION");
			
			System.out.println("1. SEARCH BOOKS ");
			System.out.println("2. INSERT BOOK");
			System.out.println("3. UPDATE BOOK");
			System.out.println("4. DELETE BOOK");
			System.out.println("5. BACK TO MAIN MENU");
			
			System.out.println("PRESS A NUMBER TO IMPLEMENT CORRESPONDING SERVICE");
			int selectedFunction=sc.nextInt();
			
			switch(selectedFunction){
			
			    case 1:
			    	System.out.println();
			    	break;
			    	
			    case 2:
			    	System.out.println();
			    	break;
			    	
			    case 3:
			    	System.out.println();
			    	break;
			    	
			    case 4:
			    	System.out.println();
			    	break;
			    	
			    case 5:
			    	System.out.println();
			    	break;
			    	
			    default:
				    System.out.println();
				    break;
			}
			
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
