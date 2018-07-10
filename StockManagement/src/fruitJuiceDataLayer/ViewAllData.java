package fruitJuiceDataLayer;

import databaseconnection.*;
import java.sql.SQLException;
import java.sql.*;

public class ViewAllData extends DatabaseConnection{

	public void displayAllData(){
		
		String sql;
		
		try {
			
			this.getConnection();

			sql="SELECT * FROM butter";
			Statement stmt=this.getConnection().createStatement();
			
			ResultSet rs=stmt.executeQuery(sql);
			
			while(rs.next()){
				
				System.out.println("Product ID: "+rs.getString(1));
				System.out.println("Product Name: "+rs.getString(2));
				System.out.println("Category: "+rs.getString(3));
				System.out.println("Quantity: "+rs.getString(4));
				System.out.println("Price: "+rs.getString(5));
				
				System.out.println("/n");
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
