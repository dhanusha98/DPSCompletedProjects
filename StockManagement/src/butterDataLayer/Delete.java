package butterDataLayer;

import java.sql.SQLException;
import java.sql.*;

import databaseconnection.*;

public class Delete extends DatabaseConnection {

	public void deleteData(String productID){
		
		String sql;
		
		try {
			
			this.dbConnection();
			
			sql="DELETE FROM butter WHERE ButterID='"+productID+"'";
			
			Statement stmt=this.getConnection().createStatement();
			int result=stmt.executeUpdate(sql);
			
			if(result > 0){
				
				System.out.println("Successfully Deleted !!");
				
			} else {
				
				System.out.println("Deletion Failed ! Please Try Again !");
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
