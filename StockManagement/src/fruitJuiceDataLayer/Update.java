package fruitJuiceDataLayer;

import java.sql.SQLException;
import java.sql.*;

import databaseconnection.*;

public class Update extends DatabaseConnection {

	public void updateData(String ProductID, String ProductName, String category, int quantity, String price){
		
		String sql;
		
		try {
			
			this.dbConnection();
			
		    sql="UPDATE fruitjuice SET fruitJuiceName='"+ProductName+"', Category='"+category+"', " +
		    		  "Quantity="+quantity+", Price='"+price+"' WHERE fruitJuiceID='"+ProductID+"'";
		    
		    Statement stmt=this.getConnection().createStatement();
		    int result=stmt.executeUpdate(sql);
		    
		    if(result > 0){
		    	System.out.println("Successfully Updated!");
		    	
		    } else {
		    	
		    	System.out.println("Not Updated!");
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
