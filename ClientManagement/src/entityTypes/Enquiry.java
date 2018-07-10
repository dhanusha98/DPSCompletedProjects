package entityTypes;

public class Enquiry {

	private int enquiryID;
	private int enquiryHolderID;
	private String enquiryHolderName;
	private String emailAddress;
	private String subject;
	private String message;
	private String feedbackStatus;
	/**
	 * @return the enquiryID
	 */
	public int getEnquiryID() {
		return enquiryID;
	}
	/**
	 * @param enquiryID the enquiryID to set
	 */
	public void setEnquiryID(int enquiryID) {
		this.enquiryID = enquiryID;
	}
	/**
	 * @return the enquiryHolderID
	 */
	public int getEnquiryHolderID() {
		return enquiryHolderID;
	}
	/**
	 * @param enquiryHolderID the enquiryHolderID to set
	 */
	public void setEnquiryHolderID(int enquiryHolderID) {
		this.enquiryHolderID = enquiryHolderID;
	}
	/**
	 * @return the enquiryHolderName
	 */
	public String getEnquiryHolderName() {
		return enquiryHolderName;
	}
	/**
	 * @param enquiryHolderName the enquiryHolderName to set
	 */
	public void setEnquiryHolderName(String enquiryHolderName) {
		this.enquiryHolderName = enquiryHolderName;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the feedbackStatus
	 */
	public String getFeedbackStatus() {
		return feedbackStatus;
	}
	/**
	 * @param feedbackStatus the feedbackStatus to set
	 */
	public void setFeedbackStatus(String feedbackStatus) {
		this.feedbackStatus = feedbackStatus;
	}
	
}
