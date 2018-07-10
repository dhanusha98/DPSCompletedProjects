package entityTypes;

public class Administrator {
	
	private int adminID;
	private String adminName;
	private String adminUserName;
	private String adminPassword;
	private String accountExpiryDate;
	private String adminOtherDetails;
	
	public Administrator(){}
	
	public Administrator(int adminID, String adminName, String adminUserName, String adminPassword, String accountExpiryDate, String adminOtherDetails){
		
		this.adminID=adminID;
		this.adminName=adminName;
		this.adminUserName=adminUserName;
		this.adminPassword=adminPassword;
		this.accountExpiryDate=accountExpiryDate;
		this.adminOtherDetails=adminOtherDetails;
	}

	/**
	 * @return the adminID
	 */
	public int getAdminID() {
		return adminID;
	}

	/**
	 * @param adminID the adminID to set
	 */
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}

	/**
	 * @return the adminName
	 */
	public String getAdminName() {
		return adminName;
	}

	/**
	 * @param adminName the adminName to set
	 */
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	/**
	 * @return the adminUserName
	 */
	public String getAdminUserName() {
		return adminUserName;
	}

	/**
	 * @param adminUserName the adminUserName to set
	 */
	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}

	/**
	 * @return the adminPassword
	 */
	public String getAdminPassword() {
		return adminPassword;
	}

	/**
	 * @param adminPassword the adminPassword to set
	 */
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	/**
	 * @return the accountExpiryDate
	 */
	public String getAccountExpiryDate() {
		return accountExpiryDate;
	}

	/**
	 * @param accountExpiryDate the accountExpiryDate to set
	 */
	public void setAccountExpiryDate(String accountExpiryDate) {
		this.accountExpiryDate = accountExpiryDate;
	}

	/**
	 * @return the adminOtherDetails
	 */
	public String getAdminOtherDetails() {
		return adminOtherDetails;
	}

	/**
	 * @param adminOtherDetails the adminOtherDetails to set
	 */
	public void setAdminOtherDetails(String adminOtherDetails) {
		this.adminOtherDetails = adminOtherDetails;
	}
}
