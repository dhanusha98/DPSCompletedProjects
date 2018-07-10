package emailmanagement;

import java.util.Scanner;

public class EmailSender {
	
	public static void main(String [] args){
		
	       try {
	    	   
				Email emObj = new Email();
				EmailDepartment emDepObj = new EmailDepartment();

				Scanner sc = new Scanner(System.in);

				System.out.println("=============================================");
				System.out.println("              EMAIL MANAGEMENT               ");
				System.out.println("=============================================");

				System.out.println();

				System.out.println("SUBJECT: ");
				String subject = sc.nextLine();

				System.out.println("TO: ");
				String receiver = sc.nextLine();

				System.out.println("FROM (YOUR EMAIL ADDRESS): ");
				String sender = sc.nextLine();

				System.out.println("MESSAGE: ");
				String message = sc.next();
				sc.nextLine();
				
				if(subject.equals("") || receiver.equals("") || sender.equals("") 
				   || receiver.equals("") || message.equals("")) {
					
					System.out.println("MANDATORY FIELDS ARE EMPTY ! PLEASE TRY AGAIN !!");
					
				} else {
					
					emObj.setSubject(subject);
					emObj.setSender(sender);
					emObj.setReceiver(receiver);
					emObj.setMessage(message);
		           
					emDepObj.addEmail();
				}

				
	       }
	       
	       catch(Exception ex){
	    	   ex.printStackTrace();
	       }
		}

}
