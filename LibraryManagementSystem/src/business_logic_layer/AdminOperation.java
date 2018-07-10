package business_logic_layer;

public class AdminOperation {
	
	private database_access_layer.AdminDataAccessor admDAObj=new database_access_layer.AdminDataAccessor();
    private Admin admObj=new Admin();
    
    public void userValidation()
    {
    	admDAObj.adminUserValidation();
    }
	
	public void searchAdminData()
	{
		
		if(String.valueOf(admObj.getAdminID()).equals(null)){
			System.out.println("PLEASE ENTER VALID ADMIN ID !");
		} else {
			admDAObj.searchAdmin();
		}
	}
	
	public void insertAdminData()
	{
		
		if(String.valueOf(admObj.getAdminFullName()).equals(null) || String.valueOf(admObj.getAdminUsername()).equals(null)
		   || String.valueOf(admObj.getAdminPassword()).equals(null) || String.valueOf(admObj.getUserroles()).equals(null)){
			
			System.out.println("MANDATORY FIELDS ARE EMPTY !");
			
		} else {
			admDAObj.insertAdmin();
		}
	}
	
	public void updateAdminData()
	{
		
		if(String.valueOf(admObj.getAdminFullName()).equals(null) 
		   || String.valueOf(admObj.getAdminFullName()).equals(null) 
		   || String.valueOf(admObj.getAdminUsername()).equals(null)
		   || String.valueOf(admObj.getAdminPassword()).equals(null) 
		   || String.valueOf(admObj.getUserroles()).equals(null)){
					
					System.out.println("MANDATORY FIELDS ARE EMPTY !");
					
		   } else {
					
			     admDAObj.updateAdmin();
		   }
	}
	
	public void deleteAdminData()
	{
		
		if(String.valueOf(admObj.getAdminID()).equals(null)){
			System.out.println("PLEASE ENTER VALID ADMIN ID !");
		} else {
			admDAObj.deleteAdmin();
		}
		
	}
}
