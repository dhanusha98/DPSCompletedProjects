package emailmanagement;

public class Email {

	  private int emailID;
	  private String subject;
	  private String sender;
	  private String receiver;
	  private String message;
	  
	public int getEmailID() {
		return emailID;
	}
	public void setEmailID(int emailID) {
		this.emailID = emailID;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	 
}
