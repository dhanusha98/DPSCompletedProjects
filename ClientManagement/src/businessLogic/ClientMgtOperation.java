package businessLogic;

import entityTypes.Customer;
import dataTier.*;
public class ClientMgtOperation {

	private Customer custObj=new Customer();
	private ClientDataManagement custDMObj=new ClientDataManagement();
	
	public void searchData(int customerID)
	{
		
		if(String.valueOf(customerID).isEmpty()) {
			System.out.println("PLEASE ENTER CUSTOMER ID !");
		} else {
			custObj.setCustomerID(customerID);
			custDMObj.searchData();
		}
	}
	
	public void insertData(String customerName, String contactInfo, String buyingHistory, String registeredDate, String targetProductDetails)
	{
		
		if(customerName.isEmpty() || contactInfo.isEmpty() || buyingHistory.isEmpty() 
		   || registeredDate.isEmpty() || targetProductDetails.isEmpty()){
			
			System.out.println("MANDATORY FIELDS ARE EMPTY !");
			
		} else {
			custObj.setCustomerName(customerName);
			custObj.setContactInfo(contactInfo);
			custObj.setBuyingHistory(buyingHistory);
			custObj.setRegisteredDate(registeredDate);
			custObj.setTargetProductDetails(targetProductDetails);
			
			custDMObj.insertData();
		}
		
	}
	
	public void updateData(int customerID, String customerName, String contactInfo, String buyingHistory, String registeredDate, String targetProductDetails)
	{
		
		if(customerName.isEmpty() || contactInfo.isEmpty() || buyingHistory.isEmpty() 
				   || registeredDate.isEmpty() || targetProductDetails.isEmpty()){
					
					System.out.println("MANDATORY FIELDS ARE EMPTY !");
					
		 } else {
			        custObj.setCustomerID(customerID);
					custObj.setCustomerName(customerName);
					custObj.setContactInfo(contactInfo);
					custObj.setBuyingHistory(buyingHistory);
					custObj.setRegisteredDate(registeredDate);
					custObj.setTargetProductDetails(targetProductDetails);
					
					custDMObj.insertData();
		  }
				
	}
	
	public void deleteData(int customerID){
		
		if(String.valueOf(customerID).isEmpty()){
			System.out.println();
		} else {
			custObj.setCustomerID(customerID);
		}
	}
}
