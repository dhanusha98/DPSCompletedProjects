package cvformats;

public class AdvanceCV extends CV {
	
	private String organization;
	private String designation;          //COMPLETE INFO FOR PROFESSIONAL EXPERIENCE
	private String jobDate;
	
	private String qualificationName;
	private String grade;                  //COMPLETE INFO FOR EDUCATION BACKGROUND
	private String completionDate; 
	
	private String referralName;
	private String referralDesignation;     //COMPLETE INFO FOR REFERRAL DATA
	private String referralOrganization;        
	private String referralContactInfo;

	public AdvanceCV(String summary, String fullname, String dateOfBirth,
			String highschool, String contactInfo, String address,
			String qualificationName, String grade, String completionDate,
			String organization, String designation, String jobDate,
			String otherDetails, String referralName, String referralDesignation, 
			String referralOrganization, String referralContactInfo) {
		
		this.setSummmary(summary);
		this.setFullname(fullname);
		this.setDateOfBirth(dateOfBirth);
		this.setHighschool(highschool);
		this.setContactInfo(contactInfo);
		this.setAddress(address);
		
		this.setQualificationName(qualificationName);
		this.setGrade(grade);
		this.setCompletionDate(completionDate);
		
		this.setOrganization(organization);
		this.setDesignation(designation);
		this.setJobDate(jobDate);
		
		this.setOtherDetails(otherDetails);
		
		this.setReferralName(referralName);
		this.setReferralDesignation(referralDesignation);
		this.setReferralOrganization(referralOrganization);
		this.setReferralContactInfo(referralContactInfo);
	}

	/**
	 * @return the organization
	 */
	public String getOrganization() {
		return organization;
	}

	/**
	 * @param organization the organization to set
	 */
	public void setOrganization(String organization) {
		this.organization = organization;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the jobDate
	 */
	public String getJobDate() {
		return jobDate;
	}

	/**
	 * @param jobDate the jobDate to set
	 */
	public void setJobDate(String jobDate) {
		this.jobDate = jobDate;
	}

	/**
	 * @return the qualificationName
	 */
	public String getQualificationName() {
		return qualificationName;
	}

	/**
	 * @param qualificationName the qualificationName to set
	 */
	public void setQualificationName(String qualificationName) {
		this.qualificationName = qualificationName;
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * @return the completionDate
	 */
	public String getCompletionDate() {
		return completionDate;
	}

	/**
	 * @param completionDate the completionDate to set
	 */
	public void setCompletionDate(String completionDate) {
		this.completionDate = completionDate;
	}

	/**
	 * @return the referralName
	 */
	public String getReferralName() {
		return referralName;
	}

	/**
	 * @param referralName the referralName to set
	 */
	public void setReferralName(String referralName) {
		this.referralName = referralName;
	}

	/**
	 * @return the referralDesignation
	 */
	public String getReferralDesignation() {
		return referralDesignation;
	}

	/**
	 * @param referralDesignation the referralDesignation to set
	 */
	public void setReferralDesignation(String referralDesignation) {
		this.referralDesignation = referralDesignation;
	}

	/**
	 * @return the referralOrganization
	 */
	public String getReferralOrganization() {
		return referralOrganization;
	}

	/**
	 * @param referralOrganization the referralOrganization to set
	 */
	public void setReferralOrganization(String referralOrganization) {
		this.referralOrganization = referralOrganization;
	}

	/**
	 * @return the referralContactInfo
	 */
	public String getReferralContactInfo() {
		return referralContactInfo;
	}

	/**
	 * @param referralContactInfo the referralContactInfo to set
	 */
	public void setReferralContactInfo(String referralContactInfo) {
		this.referralContactInfo = referralContactInfo;
	}

	@Override
	public void displayFormat(){
		
		System.out.println("=======================================================================");
		System.out.println("+                        CURRICULAM VITAE                             +");
		System.out.println("=======================================================================");
		
		System.out.println();
		
		System.out.println("SUMMARY" + "\n"+this.getSummmary());
		
		System.out.println("PERSONAL INFO: ");
		
		System.out.println("Name :- "+this.getFullname());
		System.out.println("Date of Birth :- "+this.getDateOfBirth());
		System.out.println("High School :- "+this.getHighschool());
		System.out.println("Contact Info :- "+this.getContactInfo());
		System.out.println("Address :- "+this.getAddress());
		
		System.out.println("EDUCATION BACKGROUND: ");
		
		System.out.println("Qualification Name :- "+this.getQualificationName());
		System.out.println("Grade :- "+this.getGrade());
		System.out.println("Date :- "+this.getCompletionDate());
		
		System.out.println("PROFESSIONAL EXPERIENCE: ");
		
		System.out.println("Organization :- "+this.getOrganization());
		System.out.println("Designation :- "+this.getDesignation());
		System.out.println("Date :- "+this.getDateOfBirth());
		
		System.out.println("OTHER INFO: ");
		
		System.out.println(this.getOtherDetails());
		
		System.out.println("REFERRALS: ");
		
		System.out.println("Referral Name :- "+this.getReferralName());
		System.out.println("Designation :- "+this.getDesignation());
		System.out.println("Organization :- "+this.getOrganization());
		System.out.println("Contact Info :- "+this.getContactInfo());
	}
}
