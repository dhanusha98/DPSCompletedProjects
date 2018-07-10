package entityTypes;

public class Customer {

	private int customerID;
	private String customerName;
	private String contactInfo;
	private String buyingHistory;
	private String registeredDate;
	private String targetProductDetails;
	
	public Customer(){}
	
	public Customer(int customerID, String customerName, String contactInfo, String buyingHistory, String registeredDate, String targetProductDetails){
		
		this.customerID=customerID;
		this.customerName=customerName;
		this.contactInfo=contactInfo;
		this.buyingHistory=buyingHistory;
		this.registeredDate=registeredDate;
		this.targetProductDetails=targetProductDetails;
	}

	/**
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the contactInfo
	 */
	public String getContactInfo() {
		return contactInfo;
	}

	/**
	 * @param contactInfo the contactInfo to set
	 */
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	/**
	 * @return the buyingHistory
	 */
	public String getBuyingHistory() {
		return buyingHistory;
	}

	/**
	 * @param buyingHistory the buyingHistory to set
	 */
	public void setBuyingHistory(String buyingHistory) {
		this.buyingHistory = buyingHistory;
	}

	/**
	 * @return the registeredDate
	 */
	public String getRegisteredDate() {
		return registeredDate;
	}

	/**
	 * @param registeredDate the registeredDate to set
	 */
	public void setRegisteredDate(String registeredDate) {
		this.registeredDate = registeredDate;
	}

	/**
	 * @return the targetProductDetails
	 */
	public String getTargetProductDetails() {
		return targetProductDetails;
	}

	/**
	 * @param targetProductDetails the targetProductDetails to set
	 */
	public void setTargetProductDetails(String targetProductDetails) {
		this.targetProductDetails = targetProductDetails;
	}
	
}
