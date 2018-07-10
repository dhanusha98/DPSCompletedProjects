package businessLogic;

import dataTier.*;
import entityTypes.*;
public class LoginValidation {

	   AdminUserValidation admUserObj=new AdminUserValidation();
	   Administrator adminObj=new Administrator();
	   
	   public void loginValidation(String username, String password){
		   
		   if(!(username.isEmpty() || password.isEmpty())){
			   
			   adminObj.setAdminUserName(username);
			   adminObj.setAdminPassword(password);
			   
			   admUserObj.userValidation();
			   
		   } else {
			   System.out.println("MANDATORY FIELDS ARE EMPTY !");
		   }
	   }
}
