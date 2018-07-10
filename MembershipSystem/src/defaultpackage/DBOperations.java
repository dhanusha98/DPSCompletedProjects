package defaultpackage;

import java.sql.*;

public class DBOperations implements DBAccessStructure {
	
	private static Connection conn;
	private String dbUserName="root";
	private String dbPassword="123";

	private String sql;
	
	private DBOperations DBOobj=new DBOperations();
	
	private void dbConnection(){
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", dbUserName, dbPassword);
			
		    System.out.println("SUCCESSFULLY CONNECTED TO DATABASE !!");
		}
		
		catch(SQLException ex){
			ex.printStackTrace();
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	public Connection getDBConnection(){
		return conn;
	}
	
	public void searchUserAccount(int UserID){
		
		try{
			
			Statement selectStmt=DBOobj.getDBConnection().createStatement();
			sql="SELECT * FROM useraccount WHERE UserID="+UserID+"";
			
            ResultSet rs=selectStmt.executeQuery(sql);
            
            if(rs.next()){
            	System.out.println("USER ID: "+rs.getString(1));
            	System.out.println("ACCOUNT HOLDER NAME: "+rs.getString(2));
            	System.out.println("USERNAME: "+rs.getString(3));
            	System.out.println("PASSWORD: "+rs.getString(4));
            	System.out.println("OTHER DETAILS: "+rs.getString(5));
            	
            } else {
            	System.out.println("RECORD NOT FOUND !!");
            }
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void insertUserAccount(String fullname, String UserName, String Password, String otherDetails){
		
		try {
			
			Statement insertStmt=DBOobj.getDBConnection().createStatement();
			sql="INSERT INTO useraccount VALUES ('"+fullname+"', '"+UserName+"', '"+Password+"', '"+otherDetails+"')";
			int x=insertStmt.executeUpdate(sql);
			
			if(x > 0){
				System.out.println("RECORD INSERTED !");
				
			} else {
				System.out.println("RECORD NOT INSERTED !");
			}
		} 
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void updateUserAccount(int UserID, String fullname, String UserName, String Password, String otherDetails){
		
		try {
			
			Statement updateStmt=DBOobj.getDBConnection().createStatement();
			sql="UPDATE useraccount SET FullName='"+fullname+"', UserName='"+UserName+"', Password='"+Password+"'," +
					"OtherDetails='"+otherDetails+"', WHERE UserID="+UserID+"";
			
			int x=updateStmt.executeUpdate(sql);
			
			if(x > 0){
				System.out.println("ACCOUNT UPDATED SUCCESSFULLY !!");
				
			} else {
				System.out.println("NOT UPDATED !!");
			}
			        
			
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void deleteUserAccount(int UserID){
		
		try {
			
			Statement deleteStmt=DBOobj.getDBConnection().createStatement();
			sql="DELETE FROM useraccount WHERE UserID="+UserID+"";
			
			int x=deleteStmt.executeUpdate(sql);
			
			if(x > 0){
				System.out.println("ACCOUNT DELETED !");
				
			} else {
				System.out.println("ACCOUNT NOT DELETED !");
			}
			        
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
