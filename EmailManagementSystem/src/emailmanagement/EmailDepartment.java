package emailmanagement;

import java.util.Arrays;

public class EmailDepartment {

	private String departmentID;
	private String departmentName;
	
	DatabaseAccess.AdminDataLayer admDataAccessObj = new DatabaseAccess.AdminDataLayer();
	DatabaseAccess.EmailDataLayer emDataAccessDObj = new DatabaseAccess.EmailDataLayer();
	
	emailmanagement.Email emCObj=new emailmanagement.Email();
	emailmanagement.EmailAdmin adminObj=new emailmanagement.EmailAdmin();
	
	public EmailDepartment(){
		this.departmentID="1000EMX";
		this.departmentName="DPS EMAIL DEPARTMENT";
	}
	
	/**
	 * @return the departmentID
	 */
	public String getDepartmentID() {
		return departmentID;
	}

	/**
	 * @return the departmentName
	 */
	public String getDepartmentName() {
		return departmentName;
	}

	public void viewAdmin(){
		int adminID=adminObj.getAdminID();
		admDataAccessObj.searchAdmin(adminID);
	}
	
	public void insertAdmin(){
		String adminName=adminObj.getAdminName();
		String adminType=adminObj.getAdmintype();
		String userRoles=Arrays.toString(adminObj.getUserRoles());
		
		admDataAccessObj.insertAdmin(adminName, adminType, userRoles);
	}
	
	public void updateAdmin(){
		int adminID=adminObj.getAdminID();
		String adminName=adminObj.getAdminName();
		String adminType=adminObj.getAdmintype();
		String userRoles=Arrays.toString(adminObj.getUserRoles());
		
		admDataAccessObj.updateAdmin(adminID, adminName, adminType, userRoles);
	}
	
	public void deleteAdmin(){
		int adminID=adminObj.getAdminID();
		admDataAccessObj.deleteAdmin(adminID);
	}
	
    public void viewEmail(){
    	int emailID=emCObj.getEmailID();
    	emDataAccessDObj.searchEmail(emailID);
	}
	
	public void addEmail(){
		String subject=emCObj.getSubject();
		String sender=emCObj.getSender();
		String receiver=emCObj.getReceiver();
		String message=emCObj.getMessage();
		
		emDataAccessDObj.insertEmail(subject, sender, receiver, message);
	}
	
	public void updateEmail(){
		int emailID=emCObj.getEmailID();
		String subject=emCObj.getSubject();
		String sender=emCObj.getSender();
		String receiver=emCObj.getReceiver();
		String message=emCObj.getMessage();
		
		emDataAccessDObj.updateEmail(emailID, subject, sender, receiver, message);
	}
	
	public void deleteEmail(){
		int emailID=emCObj.getEmailID();
		emDataAccessDObj.deleteEmail(emailID);
	}
}
