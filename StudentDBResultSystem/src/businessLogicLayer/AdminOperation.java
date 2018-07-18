package businessLogicLayer;

import dataAccessLayer.AdminDataAccessor;
import dataAccessLayer.StudentDataAccessor;

public class AdminOperation {

	private Admin admObj;
	private AdminDataAccessor admDAObj;
	
	public void searchProfile()
	{
	    int adminID=admObj.getAdminID();
	    admDAObj.searchProfile(adminID);
	}
	public void insertProfile()
	{
		
		String adminFullName=admObj.getAdminFullName();
		String adminUsername=admObj.getAdminUsername();
		String adminPassword=admObj.getAdminPassword();
		String otherDetails=admObj.getOtherDetails();
		
		admDAObj.insertProfile(adminFullName, adminUsername, adminPassword, otherDetails);
	}
	public void updateProfile()
	{
		
		int adminID=admObj.getAdminID();
		String adminFullName=admObj.getAdminFullName();
		String adminUsername=admObj.getAdminUsername();
		String adminPassword=admObj.getAdminPassword();
		String otherDetails=admObj.getOtherDetails();
		
		admDAObj.updateProfile(adminID, adminFullName, adminUsername, adminPassword, otherDetails);
	}
	public void deleteProfile()
	{
		int adminID=admObj.getAdminID();
		admDAObj.deleteProfile(adminID);
	}
}
