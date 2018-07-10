package cvformats;

public class CV {

	private String summmary;          //OVERVIEW OF PROFILE

	private String fullname;
	private String dateOfBirth;
	private String highschool;           //PERSONAL INFO
	private String contactInfo;
	private String address;
	
	private String highestQualification;      //EDUCATION, WORK EXPERIENCE AND OTHER INFO
	private String professionalExperience;
	private String otherDetails;
	private String referralName;
	
	public CV(){
		
	}
	public CV(String summary, String fullname, String dateOfBirth, String highschool,
			  String contactInfo, String address,String highestQualification, 
			  String professionalExperience,String otherDetails, String referralName){
		
		this.summmary=summary;
		this.fullname=fullname;
		this.dateOfBirth=dateOfBirth;
		this.highschool=highschool;
		this.contactInfo=contactInfo;
		this.address=address;
		this.highestQualification=highestQualification;
		this.professionalExperience=professionalExperience;
		this.otherDetails=otherDetails;
		this.referralName=referralName;
	}

	/**
	 * @return the fullname
	 */
	public String getFullname() {
		return fullname;
	}

	/**
	 * @param fullname the fullname to set
	 */
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the highschool
	 */
	public String getHighschool() {
		return highschool;
	}

	/**
	 * @param highschool the highschool to set
	 */
	public void setHighschool(String highschool) {
		this.highschool = highschool;
	}

	/**
	 * @return the summmary
	 */
	public String getSummmary() {
		return summmary;
	}

	/**
	 * @param summmary the summmary to set
	 */
	public void setSummmary(String summmary) {
		this.summmary = summmary;
	}

	/**
	 * @return the highestQualification
	 */
	public String getHighestQualification() {
		return highestQualification;
	}

	/**
	 * @param highestQualification the highestQualification to set
	 */
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	/**
	 * @return the professionalExperience
	 */
	public String getProfessionalExperience() {
		return professionalExperience;
	}

	/**
	 * @param professionalExperience the professionalExperience to set
	 */
	public void setProfessionalExperience(String professionalExperience) {
		this.professionalExperience = professionalExperience;
	}

	/**
	 * @return the referralName
	 */

	
	/**
	 * @return the contactInfo
	 */
	public String getContactInfo() {
		return contactInfo;
	}

	/**
	 * @return the referralName
	 */
	public String getReferralName() {
		return referralName;
	}
	/**
	 * @param contactInfo the contactInfo to set
	 */
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the otherDetails
	 */
	public String getOtherDetails() {
		return otherDetails;
	}

	/**
	 * @param otherDetails the otherDetails to set
	 */
	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}

	/**
	 * @param referralName the referralName to set
	 */
	public void setReferralName(String referralName) {
		this.referralName = referralName;
	}
	
	public void displayFormat(){
			
		/*private String fullname;
		private String dateOfBirth;
		private String highschool;
		private String summmary;
		private String highestQualification;
		private String professionalExperience;
		private String otherDetails;
		private String referralName;*/
		
		
		System.out.println("                        CURRICULAM VITAE                               ");
		System.out.println("                        ================                               ");
		
		System.out.println();
		
		System.out.println("SUMMARY"+ "\n"+this.getSummmary());
		
		System.out.println("PERSONAL INFO: ");
		
		System.out.println("Name :- "+this.fullname);
		System.out.println("Date of Birth :- "+this.dateOfBirth);
		System.out.println("High School :- "+this.highschool);
		System.out.println("Contact Info :- "+this.contactInfo);
		System.out.println("Address :- "+this.address);
		
		System.out.println("EDUCATION BACKGROUND: ");
		
		System.out.println("Qualification Details :- "+this.getHighestQualification());
		
		System.out.println("PROFESSIONAL EXPERIENCE: ");
		
		System.out.println("Professional Experience Details :- "+this.getProfessionalExperience());
		
		System.out.println("OTHER INFO: ");
		
		System.out.println(this.otherDetails);
		
		System.out.println("REFERRALS: ");
		
		System.out.println("Referral Details :- "+this.getReferralName());
	}
}
