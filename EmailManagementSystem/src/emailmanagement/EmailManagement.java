package emailmanagement;

import java.util.*;
public class EmailManagement {
	
	private static Scanner sc=new Scanner(System.in);
	private EmailDepartment emDepObj=new EmailDepartment();
	private Email emObj=new Email();
	
	public void searchEmail(){
		System.out.println("******************** SEARCH EMAIL ********************");
		System.out.println();
		
		System.out.println("ENTER EMAIL ID: ");
		int emailID=sc.nextInt();
		
		if(String.valueOf(emailID).equals("")){
			System.out.println("PLEASE ENTER EMAIL ID ! TRY AGAIN !!");
			
		} else {
			
			emObj.setEmailID(emailID);
			emDepObj.viewEmail();
		}
	}
	
	public void insertEmail(){
		
		System.out.println("******************** INSERT EMAIL ********************");
        System.out.println();
        
		System.out.println("SUBJECT: ");
		String subject=sc.nextLine();
		
		System.out.println("SENDER EMAIL ADDRESS: ");
		String senderEmail=sc.nextLine();
		
		System.out.println("RECEIVER EMAIL ADDRESS: ");
		String receiverEmail=sc.nextLine();
		
		System.out.println("MESSAGE: ");
		String message=sc.next();
		sc.nextLine();
		
		if(subject.equals("") || senderEmail.equals("") ||
		   receiverEmail.equals("") || message.equals("")){
			
			System.out.println("PLEASE ENTER EMAIL ID ! TRY AGAIN !!");
			
		} else {
			
			emObj.setSubject(subject);
			emObj.setSender(senderEmail);
			emObj.setReceiver(receiverEmail);
			emObj.setMessage(message);
           
			emDepObj.addEmail();
		}
		
	}
	
	public void updateEmail(){
		
		System.out.println("******************** UPDATE EMAIL ********************");
        System.out.println();
        
        System.out.println("EMAIL ID: ");
		int emailID=sc.nextInt();
        
		System.out.println("SUBJECT: ");
		String subject=sc.nextLine();
		
		System.out.println("SENDER EMAIL ADDRESS: ");
		String senderEmail=sc.nextLine();
		
		System.out.println("RECEIVER EMAIL ADDRESS: ");
		String receiverEmail=sc.nextLine();
		
		System.out.println("MESSAGE: ");
		String message=sc.next();
		sc.nextLine();
		
		if(String.valueOf(emailID).equals("") || subject.equals("") || senderEmail.equals("") ||
		   receiverEmail.equals("") || message.equals("")){
			
			System.out.println("MANDATORY FIELDS ARE EMPTY ! TRY AGAIN !!");
			
		} else {
			
			emObj.setEmailID(emailID);
			emObj.setSubject(subject);
			emObj.setSender(senderEmail);
			emObj.setReceiver(receiverEmail);
			emObj.setMessage(message);
           
			emDepObj.updateEmail();
		}
	}
	
	public void deleteEmail(){
		
		System.out.println("******************** DELETE EMAIL ********************");
        System.out.println();
        
        System.out.println("EMAIL ID: ");
		int emailID=sc.nextInt();

		if(String.valueOf(emailID).equals("")){
			System.out.println("PLEASE ENTER EMAIL ID ! TRY AGAIN !!");
			
		} else {
			
			emObj.setEmailID(emailID);
			emDepObj.deleteEmail();
		}
	}
	
	public static void main(String [] args){
		
		EmailManagement emailMgObj=new EmailManagement();
		
		System.out.println("=============================================");
		System.out.println("              EMAIL MANAGEMENT               ");
		System.out.println("=============================================");
		
		System.out.println();
		System.out.println("PRESS FUNCTION NUMBER FROM FOLLOWING TO IMPLEMENT CORRESPONDING SERVICE");
		
		System.out.println("1. SEARCH EMAIL");
		System.out.println("2. INSERT EMAIL");
		System.out.println("3. UPDATE EMAIL");
		System.out.println("4. DELETE EMAIL");
		
		System.out.println("FUNCTION NUMBER: ");
		int selectedFunction=sc.nextInt();
		
		switch(selectedFunction){
		
		     case 1:
		    	 emailMgObj.searchEmail();
		    	 break;
		    	 
		     case 2:
		    	 emailMgObj.insertEmail();
		    	 break;
		    	 
		     case 3:
		    	 emailMgObj.updateEmail();
		    	 break;
		    	 
		     case 4:
		    	 emailMgObj.deleteEmail();
		    	 break;
		    	 
		     default:
		    	 System.out.println("INVALID FUNCTION NUMBER. PLEASE TRY AGAIN!");
		    	 break;
		}

	}
}
