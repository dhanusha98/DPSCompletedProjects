package cakeDataLayer;

import databaseconnection.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Search extends DatabaseConnection {

	public void searchData(String productName) {
		
        productName="AOS Butter";
		productName=productName.toUpperCase();

		String sql;
		
		try {
			
			this.dbConnection(); //BUILD DATABASE CONNECTION
			
			sql="SELECT * FROM cake WHERE CakeName = '"+ productName  +"'";
			Statement stmt=this.getConnection().createStatement();
			
			ResultSet rs=stmt.executeQuery(sql);
			
		   if(rs.next()){
			   
			   System.out.println("Product ID: "+rs.getString(1));
			   System.out.println("Product Name: "+rs.getString(2));
			   System.out.println("Category: "+rs.getString(3));
			   System.out.println("Quantity: "+rs.getString(4));
			   System.out.println("Price: "+rs.getString(5));
			   
		   } else {
			   
			   System.out.println("No Matching Product Found!");
		   }
			
		} 
		
		catch(SQLException ex){
			
			ex.printStackTrace();
		}
		
		catch(Exception ex){
			
			ex.printStackTrace();
		}
	}
}
