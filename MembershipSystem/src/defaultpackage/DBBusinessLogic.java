package defaultpackage;

import java.sql.Connection;

public class DBBusinessLogic {

	private DBAccessStructure dbObj=new DBOperations();
	
	public Connection getDBConnection(){
		return dbObj.getDBConnection();
	}
	public void searchUserAccount(int UserID){
		dbObj.searchUserAccount(UserID);
	}
	public void insertUserAccount(String fullname, String UserName, String Password, String otherDetails){
		dbObj.insertUserAccount(fullname, UserName, Password, otherDetails);
	}
	public void updateUserAccount(int UserID, String fullname, String UserName, String Password, String otherDetails){
		dbObj.updateUserAccount(UserID, fullname, UserName, Password, otherDetails);
	}
	public void deleteUserAccount(int UserID){
		dbObj.deleteUserAccount(UserID);
	}
	
	public static void main(String [] args){
		
		
	}
}
