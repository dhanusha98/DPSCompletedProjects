package butterDataLayer;

import databaseconnection.*;
import java.sql.SQLException;
import java.sql.*;

public class Insert extends DatabaseConnection {

	public void insertData(String ProductID, String ProductName, String category, int quantity, String price){
		
		String sql;
		try {
			
			this.dbConnection();
			
			sql="INSERT INTO product VALUES ('" +ProductID+"', '"+ProductName+"', '"+category+"', "+quantity+"," +
					                         " '"+price+"')";
			
			Statement stmt=this.getConnection().createStatement();
			int result=stmt.executeUpdate(sql);
			
			if(result > 0){
				
				System.out.println("Successfully Inserted !!");
				
			} else {
				
				System.out.println("Not Inserted !! Please Try Again !!");
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
