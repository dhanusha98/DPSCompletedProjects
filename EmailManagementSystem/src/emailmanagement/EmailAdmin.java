package emailmanagement;

public class EmailAdmin {

	private int adminID=0;
	private String adminName;
	private String admintype;
	private String [] userRoles;
	
	public EmailAdmin(){
		adminID++;
	}
	public int getAdminID() {
		return adminID;
	}
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdmintype() {
		return admintype;
	}
	public void setAdmintype(String admintype) {
		this.admintype = admintype;
	}
	public String[] getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(String[] userRoles) {
		this.userRoles = userRoles;
	}
	
}
