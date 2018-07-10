package database_access_layer;

import java.sql.*;

public class BookDataAccessor implements BookAccessStructure {

	private DBConnection dbconnObj=new DBConnection();
	Connection dbconnection=dbconnObj.createDBConnection();
	String sql;
	
	business_logic_layer.Book bookObj=new business_logic_layer.Book();
	
	public void searchBook()
	{
		try {
			
			Statement selectStmt=dbconnection.createStatement();
			sql="SELECT * FROM book WHERE BookID="+bookObj.getBookID()+"";
			
			ResultSet rs=selectStmt.executeQuery(sql);
			
			if(rs.next()){
				
				System.out.println("BOOK ID: "+bookObj.getBookID());
				System.out.println("BOOK NAME: "+bookObj.getBookName());
				System.out.println("BOOK CATEGORY: "+bookObj.getBookCategory());
				System.out.println("AUTHOR: "+bookObj.getAuthor());
				System.out.println("PUBLISHER: "+bookObj.getPublisher());
				System.out.println("STOCK QUANTITY: "+bookObj.getQuantity());
				System.out.println("PRICE: "+bookObj.getPrice());

			} else {
				
				System.out.println("RECORD NOT FOUND !");
			}
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
		     
	}
	public void insertBook()
	{
        try {
			
			Statement insertStmt=dbconnection.createStatement();
            sql="INSERT INTO book VALUES ('"+bookObj.getBookName()+"', '"+bookObj.getBookCategory()+"', '"+bookObj.getAuthor()+"', '"+bookObj.getPublisher()+"', "+bookObj.getQuantity()+", '"+bookObj.getPrice()+"')";
            
            int result = insertStmt.executeUpdate(sql);
            
            if(result > 0){
            	System.out.println("BOOK SUCCESSFULLY INSERTED !");
            } else {
            	
            	System.out.println("BOOK INSERTION FAILED !");
            }
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public void updateBook()
	{
		
        try {
			
			Statement updateStmt=dbconnection.createStatement();
            sql="UPDATE Book SET BookName='"+bookObj.getBookName()+"', BookCategory='"+bookObj.getBookCategory()+"', Author='"+bookObj.getAuthor()+"', Publisher='"+bookObj.getPublisher()+"', Quantity="+bookObj.getQuantity()+", Price='"+bookObj.getPrice()+"' WHERE BookID="+bookObj.getBookID()+"";
            
            int result=updateStmt.executeUpdate(sql);
            
            if(result > 0){
            	System.out.println("BOOK DATA UPDATED SUCCESSFULLY !");
            } else {
            	System.out.println("BOOK DATA UPDATE FAILED !");
            }
		}
		
        catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	public void deleteBook()
	{
		
        try {
			
			Statement deleteStmt=dbconnection.createStatement();
            sql="DELETE FROM Book WHERE BookID="+bookObj.getBookID()+"";
            
            int result = deleteStmt.executeUpdate(sql);
            
            if(result > 0){
            	System.out.println("BOOK DELETION SUCCESSFUL !");
            } else {
            	System.out.println("BOOK DELETION FAILED !");
            }
		}
		
        catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
}
