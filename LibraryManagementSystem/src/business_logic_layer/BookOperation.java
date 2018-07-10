package business_logic_layer;

public class BookOperation {

	private database_access_layer.BookDataAccessor bookDAObj=new database_access_layer.BookDataAccessor();
    private Book bookObj=new Book();
    
    public void searchBookData()
    {
    	if(String.valueOf(bookObj.getBookID()).equals(null)){
			System.out.println("PLEASE ENTER VALID BOOK ID !");
		} else {
			bookDAObj.searchBook();
		}
    }
	
    public void insertBookData()
    {
    	
    	if(String.valueOf(bookObj.getBookName()).equals(null) 
    	   || String.valueOf(bookObj.getBookCategory()).equals(null)
    	   || String.valueOf(bookObj.getAuthor()).equals(null) 
    	   || String.valueOf(bookObj.getPublisher()).equals(null)
    	   || String.valueOf(bookObj.getQuantity()).equals(null)
    	   || String.valueOf(bookObj.getPrice()).equals(null)){
 				
 				System.out.println("MANDATORY FIELDS ARE EMPTY !");
 				
 		 } else {
 				bookDAObj.insertBook();
 		 }
    	
    }
    
    public void updateBookData()
    {
    	
    	if(String.valueOf(bookObj.getBookID()).equals(null) 
    	   || String.valueOf(bookObj.getBookName()).equals(null) 
    	   || String.valueOf(bookObj.getBookCategory()).equals(null)
    	   || String.valueOf(bookObj.getAuthor()).equals(null) 
    	   || String.valueOf(bookObj.getPublisher()).equals(null)
    	   || String.valueOf(bookObj.getQuantity()).equals(null)
    	   || String.valueOf(bookObj.getPrice()).equals(null)){
    						
    		System.out.println("MANDATORY FIELDS ARE EMPTY !");
    						
    	} else {
    		    bookDAObj.updateBook();
    	}
    		
    }
    
    public void deleteBookData()
    {
    	
    	if(String.valueOf(bookObj.getBookID()).equals(null)){
			System.out.println("PLEASE ENTER VALID BOOK ID !");
		} else {
			bookDAObj.deleteBook();
		}
    }
}
