package defaultpackage;

import java.sql.Statement;
import java.util.*;
public class SignUp {
	
	//private static DBOperations dblObj=new DBOperations();

    public static void main(String [] args){
    	
    	try {
    		
    		DBBusinessLogic obj=new DBBusinessLogic();
    		
        	Scanner sc=new Scanner(System.in);
        	
        	System.out.println("===============================================");
    		System.out.println("         SIGN UP PAGE                          ");
    		System.out.println("===============================================");
        	
        	System.out.println("FULLNAME: ");
        	String fullName=sc.nextLine();
        	
        	System.out.println("USERNAME: ");
        	String userName=sc.nextLine();
        	
        	System.out.println("PASSWORD: ");
        	String password=sc.nextLine();
        	
        	System.out.println("DESCRIPTION (EX. OTHER DETAILS IF NECESSARY: ");
        	String otherDetails=sc.nextLine();
        	
        	System.out.println("TYPE 'SUBMIT'  TO CREATE THE ACCOUNT: ");
        	String submitStatus=sc.nextLine();
        	
        	if(submitStatus.equalsIgnoreCase("SUBMIT")){
        		//dblObj.insertUserAccount(fullName, userName, password, otherDetails);
        	} else {
        		SignUp.main(new String[0]);
        	}
        	
    	}
    	
    	catch(Exception ex){
    		ex.printStackTrace();
    	}
    	
	}
}
