package userlogin;

import java.util.*;
import mainmenu.*;

public class UserLogin {

	 static Scanner sc=new Scanner(System.in); 
	 private static String user="Dhanusha";
	 private static String pass="123";
	 
	 static mainmenu.MainMenu mObject=new mainmenu.MainMenu();
	 	 
	 public static void login(){
		
		 try {
			 
			 System.out.println("Enter Username: ");
			 String username=sc.nextLine();
			 
			 System.out.println("Enter Password: ");  
			 String password=sc.nextLine();
			 
			 if(username.equals(user) && password.equals(pass)){
				 
				 System.out.println("Login Successful!");
				 MainMenu.mainMenu();
				 
			 } else if(!(username.equals(user))){
				 
				 System.out.println("Invalid Username ! Please Try Again!");
				 
			 } else if(!(password.equals(pass))){
				 
				 System.out.println("Invalid Password ! Please Try Again!");
				 
			 } else if(!(username.equals(user) && (password.equals(pass)))){
				 
				 System.out.println("Invalid User Authentications ! Please Try Again!");
			 }
		 }
		 
		 catch(Exception ex){
			 
			 ex.printStackTrace();
		 }
		
	}
	 
	 public static void main(String[] args) {
		
		 UserLogin.login();
	}
}
