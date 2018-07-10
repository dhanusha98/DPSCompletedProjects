package cvformats;

public class ModerateLevelCV extends CV {
	
	private String organization;
	private String designation;
	private String jobDate;
	
	public ModerateLevelCV (String summary, String fullname, String dateOfBirth,
			String highschool, String contactInfo, String address,
			String highestQualification, String organization, String designation,
			String jobDate, String otherDetails, String referralName){
		
		this.setSummmary(summary);
		this.setFullname(fullname);
		this.setDateOfBirth(dateOfBirth);
		this.setHighschool(highschool);
		this.setContactInfo(contactInfo);
		this.setAddress(address);
		this.setHighestQualification(highestQualification);
		this.setOrganization(organization);
		this.setDesignation(designation);
		this.setJobDate(jobDate);
		this.setOtherDetails(otherDetails);
		this.setReferralName(referralName);
		
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

	@Override
	public void displayFormat(){
		
		System.out.println("**************======================================*******************");
		System.out.println("                        CURRICULAM VITAE                               ");
		System.out.println("**************=======================================*******************");
		
		System.out.println();
		
		System.out.println("SUMMARY"+"\n"+this.getSummmary());
		
		System.out.println("PERSONAL INFO: \n");
		
		System.out.println("Name :- "+this.getFullname());
		System.out.println("Date of Birth :- "+this.getDateOfBirth());
		System.out.println("High School :- "+this.getHighschool());
		System.out.println("Contact Info :- "+this.getContactInfo());
		System.out.println("Address :- "+this.getAddress());
		
		System.out.println("EDUCATION BACKGROUND: ");
		
		System.out.println("Qualification Details :- "+this.getHighestQualification());
		
		System.out.println("PROFESSIONAL EXPERIENCE: ");
		
		System.out.println("Organization :- "+this.getOrganization());
		System.out.println("Designation :- "+this.getDesignation());
		System.out.println("Date :- "+this.getDateOfBirth());
		
		System.out.println("OTHER INFO: ");
		
		System.out.println(this.getOtherDetails());
		
		System.out.println("REFERRALS: ");
		
		System.out.println("Referral Details :- "+this.getReferralName());

	}

}
