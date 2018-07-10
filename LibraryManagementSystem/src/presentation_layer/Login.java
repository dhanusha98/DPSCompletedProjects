package presentation_layer;

import java.util.*;
public class Login {
	
	private String logintype;
    
	/**
	 * @return the logintype
	 */
	public String getLogintype() {
		return logintype;
	}
	/**
	 * @param logintype the logintype to set
	 */
	public void setLogintype(String logintype) {
		this.logintype = logintype;
	}

	public static void main(String [] args){
		
		business_logic_layer.Admin adObj=new business_logic_layer.Admin();
		business_logic_layer.Customer csObj=new business_logic_layer.Customer();
		
		database_access_layer.AdminDataAccessor adminObj=new database_access_layer.AdminDataAccessor();
		database_access_layer.CustomerDataAccessor customerObj=new database_access_layer.CustomerDataAccessor();
		
		Login lg=new Login();
		
		boolean loginresult;
		
		Scanner sc=new Scanner(System.in);
		
		try {
			

		    System.out.println("========================================================");
		    System.out.println("                     LOGIN                              ");
		    System.out.println("========================================================");
		    
		    System.out.println("USERNAME: ");
		    String username=sc.nextLine();
		    
		    System.out.println("PASSWORD: ");
		    String password=sc.nextLine();
		    
		    if(lg.getLogintype().equals("CUSTOMER")){
		    	
		    	csObj.setCustomerUsername(username);
		    	csObj.setCustomerPassword(password);
		    	
		    	loginresult = customerObj.customerUserValidation();
		    	
		    	if(loginresult == true){
		    		
		    		System.out.println("LOGIN SUCCESSFUL !");
		    		CustomerMainMenu.main(new String [0]);
		    	} else {
		    		
		    		System.out.println("INVALID USER AUTHENTICATIONS !");
		    	}
		    	
		    } else if(lg.getLogintype().equals("ADMIN")){
		    	
		    	adObj.setAdminUsername(username);
		    	adObj.setAdminPassword(password);
		    	
		    	loginresult = adminObj.adminUserValidation();
		    	
	            if(loginresult == true){	
		    		
	            	System.out.println("LOGIN SUCCESSFUL !");
		    		AdminMainMenu.main(new String [0]);
		    	} else {
		    		
		    		System.out.println("INVALID USER AUTHENTICATIONS !");
		    	}
		    	
		    }
			
		}
		
		catch(InputMismatchException ex){
			ex.printStackTrace();
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
}
