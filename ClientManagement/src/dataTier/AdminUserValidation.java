package dataTier;

import java.sql.*;

import entityTypes.Administrator;
public class AdminUserValidation implements UserValidationStructure {

	static MySQLDBConnection dbObj=new MySQLDBConnection();
	String sql;
	
	private Administrator admObj=new Administrator();
	
	public void userValidation(){
 
		try {
			
			dbObj.dbConnection();
			sql="SELECT * FROM admin WHERE AdminID='"+admObj.getAdminUserName()+"' AND AdminPassword='"+admObj.getAdminPassword()+"'";
			Statement selectStmt=dbObj.getConn().createStatement();
			
			ResultSet rs=selectStmt.executeQuery(sql);
			
			if(rs.next()){
				System.out.println("LOGIN SUCCESSFUL !");
			} else {	
				System.out.println("INVALID USER CREDENTIALS !");
			}
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
		
		
	}

}