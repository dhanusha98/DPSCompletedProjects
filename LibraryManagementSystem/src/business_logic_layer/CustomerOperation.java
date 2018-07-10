package business_logic_layer;

public class CustomerOperation {

	private database_access_layer.CustomerDataAccessor custDAObj=new database_access_layer.CustomerDataAccessor();
    private Customer custObj=new Customer();
    
    public void userValidation()
    {
    	custDAObj.customerUserValidation();
    }
    
    public void searchCustomer()
    {
    	
    	if(String.valueOf(custObj.getCustomerID()).equals(null)){
			System.out.println("PLEASE ENTER VALID CUSTOMER ID !");
		} else {
			custDAObj.searchCustomer();
		}

    }
    
    public void insertCustomer()
    {
    	
    	if(String.valueOf(custObj.getCustomerFullName()).equals(null) 
    	  || String.valueOf(custObj.getCustomerUsername()).equals(null) 
    	  || String.valueOf(custObj.getCustomerPassword()).equals(null)
    	  || String.valueOf(custObj.getDetails()).equals(null)){
    						
    		System.out.println("MANDATORY FIELDS ARE EMPTY !");
    						
    	 } else {
    		   custDAObj.insertCustomer();
    	  }
    	
    }
    
    public void updateCustomer()
    {
    	
    	if(String.valueOf(custObj.getCustomerID()).equals(null)
    	   || String.valueOf(custObj.getCustomerFullName()).equals(null) 
    	   || String.valueOf(custObj.getCustomerUsername()).equals(null) 
    	   || String.valueOf(custObj.getCustomerPassword()).equals(null)
    	   || String.valueOf(custObj.getDetails()).equals(null)){
    		
    		System.out.println("MANDATORY FIELDS ARE EMPTY !");
    		
    	} else {
    		 custDAObj.updateCustomer();
    	}
    	
    }
    
    public void deleteCustomer()
    {
    	
    	if(String.valueOf(custObj.getCustomerID()).equals(null)){
			System.out.println("PLEASE ENTER VALID CUSTOMER ID !");
		} else {
			custDAObj.deleteCustomer();
		}

    	
    }
}
