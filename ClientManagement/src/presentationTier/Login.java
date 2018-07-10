package presentationTier;

import java.util.*;
import businessLogic.*;
public class Login {
	
	static LoginValidation lgObj=new LoginValidation();
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		try {
			
			System.out.println("=========================================================");
			System.out.println("                          LOGIN                          ");
			System.out.println("=========================================================");
			
			System.out.println();
			
			System.out.println("ENTER USERNAME: ");
			String username=sc.nextLine();
			
			System.out.println("ENTER PASSWORD: ");
			String password=sc.nextLine();
			
			lgObj.loginValidation(username, password);
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
