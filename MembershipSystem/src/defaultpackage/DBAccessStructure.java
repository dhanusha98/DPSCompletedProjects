package defaultpackage;

import java.sql.Connection;

public interface DBAccessStructure {

	public Connection getDBConnection();
	public void searchUserAccount(int UserID);
	public void insertUserAccount(String fullname, String UserName, String Password, String otherDetails);
	public void updateUserAccount(int UserID, String fullname, String UserName, String Password, String otherDetails);
	public void deleteUserAccount(int UserID);
	
}
