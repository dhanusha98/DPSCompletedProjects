package businessLogic;

import dataTier.*;
import entityTypes.Administrator;

public class AdminMgtOperation {
	
	 Administrator adminObj=new Administrator();
     AdminDataManagement adminMgtObj=new AdminDataManagement();
	 
     public void searchOperation(int adminID){
    	 
    	 if(String.valueOf(adminID).isEmpty()){	 
    		 System.out.println("PLEASE ENTER ADMIN ID !");
    		 
    	 } else {
    		 adminObj.setAdminID(adminID);
    		 adminMgtObj.searchData();
    	 }
     }
     
     public void insertOperation(String adminName, String adminUserName, String adminPassword, String accountExpiryDate, String adminOtherDetails){
    	 
    	if(adminName.isEmpty() || adminUserName.isEmpty() 
    	   || adminPassword.isEmpty() || accountExpiryDate.isEmpty() 
    	   || adminOtherDetails.isEmpty()){
    		
    		System.out.println("MANDATORY FIELDS ARE EMPTY !");
    		
    	} else {
    		adminObj.setAdminName(adminName);
    		adminObj.setAdminUserName(adminUserName);
    		adminObj.setAdminPassword(adminPassword);
    		adminObj.setAccountExpiryDate(accountExpiryDate);
    		adminObj.setAdminOtherDetails(adminOtherDetails);
    		
    		adminMgtObj.insertData();
    	}
     }
     
     public void updateOperation(int adminID, String adminName, String adminUserName, String adminPassword, String accountExpiryDate, String adminOtherDetails){
    	 
     	if(String.valueOf(adminID).isEmpty() || adminName.isEmpty() || 
     	   adminUserName.isEmpty() || adminPassword.isEmpty() || 
     	   accountExpiryDate.isEmpty() || adminOtherDetails.isEmpty()){
     		
     		System.out.println("MANDATORY FIELDS ARE EMPTY !");
     		
     	} else {
     		
     		adminObj.setAdminID(adminID);
     		adminObj.setAdminName(adminName);
     		adminObj.setAdminUserName(adminUserName);
     		adminObj.setAdminPassword(adminPassword);
     		adminObj.setAccountExpiryDate(accountExpiryDate);
     		adminObj.setAdminOtherDetails(adminOtherDetails);
     		
     		adminMgtObj.updateData();
     	}
     }
     
     public void deleteOperation(int adminID){
    	 
    	 if(String.valueOf(adminID).isEmpty()){	 
    		 System.out.println("PLEASE ENTER ADMIN ID !");
    		 
    	 } else {
    		 adminObj.setAdminID(adminID);
    		 adminMgtObj.deleteData();
    	 }
     }

}
