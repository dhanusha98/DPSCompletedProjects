package cvformats;

import java.util.*;
public class UIClass {

	private Scanner sc=new Scanner(System.in);

	public void basicCVCreator(){
		
		
		System.out.println("====================== BASIC CV CREATOR ======================");
		
		System.out.println("ENTER DETAILS FOR FOLLOWING QUESTIONS TO BUILD YOUR CV");		
		
		System.out.println("ENTER PROFILE SUMMARY: ");
		String summary=sc.nextLine();
		
		System.out.println("ENTER FULL NAME: ");
		String fullname=sc.nextLine();
		
		System.out.println("ENTER DATE OF BIRTH: ");
		String dateOfBirth=sc.nextLine();
		
		System.out.println("NAME OF HIGH SCHOOL: ");
		String highschool=sc.nextLine();
		
		System.out.println("CONTACT INFO: ");
		String contactInfo=sc.nextLine();
		
		System.out.println("ADDRESS: ");
		String address=sc.nextLine();
		
		System.out.println("HIGHEST EDUCATION QUALIFICATION NAME AND DETAILS: ");
		String highestQualification=sc.nextLine();
		
		System.out.println("PROFESSIONAL EXPERIENCE DETAILS " +
				           "(ex. Company Name, Designation, Duration etc.): ");
		
		String professionalExperience=sc.nextLine();
		
		System.out.println("YOUR OTHER DETAILS (Ex. Extra Curricular Activities etc.):");
		String otherDetails=sc.nextLine();
		
		System.out.println("Referral Details: ");
        String referralDetails=sc.nextLine();
        
        CV cvObj=new CV(summary, fullname, dateOfBirth, highschool, contactInfo, address, highestQualification, professionalExperience, otherDetails, referralDetails);
        
        cvObj.displayFormat();
        
	}
	
	public void domesticCVCreator(){
		
		
		System.out.println("====================== DOMESTIC CV CREATOR ======================");

        System.out.println("ENTER DETAILS FOR FOLLOWING QUESTIONS TO BUILD YOUR CV");
		
		
		System.out.println("ENTER PROFILE SUMMARY: ");
		String summary=sc.nextLine();
		
		System.out.println("ENTER FULL NAME: ");
		String fullname=sc.nextLine();
		
		System.out.println("ENTER DATE OF BIRTH: ");
		String dateOfBirth=sc.nextLine();
		
		System.out.println("NAME OF HIGH SCHOOL: ");
		String highschool=sc.nextLine();
		
		System.out.println("CONTACT INFO: ");
		String contactInfo=sc.nextLine();
		
		System.out.println("ADDRESS: ");
		String address=sc.nextLine();
		
		System.out.println("HIGHEST EDUCATION QUALIFICATION NAME AND DETAILS: ");
		String highestQualification=sc.nextLine();
		
		System.out.println("PROFESSIONAL EXPERIENCE DETAILS " +
				           "(ex. Company Name, Designation, Duration etc.) \n");
		
		System.out.println("ORGANIZATION NAME: ");
		String organizationName=sc.nextLine();
		
		System.out.println("DESIGNATION: ");
		String designation=sc.nextLine();
		
		System.out.println("JOB DATE: ");
		String jobDate=sc.nextLine();
		
		System.out.println("YOUR OTHER DETAILS (Ex. Extra Curricular Activities etc.):");
		String otherDetails=sc.nextLine();
		
		System.out.println("Referral Details: ");
        String referralDetails=sc.nextLine();
        
        CV cvObj=new ModerateLevelCV(summary, fullname, dateOfBirth, highschool, contactInfo, address, highestQualification, organizationName, designation, jobDate, otherDetails, referralDetails);
        cvObj.displayFormat();
		
	}
	
	public void advanceCVCreator(){
		
		System.out.println("====================== ADVANCE CV CREATOR ======================");

        System.out.println("ENTER DETAILS FOR FOLLOWING QUESTIONS TO BUILD YOUR CV");
		
		System.out.println("ENTER PROFILE SUMMARY: ");
		String summary=sc.nextLine();
		
		System.out.println("ENTER FULL NAME: ");
		String fullname=sc.nextLine();
		
		System.out.println("ENTER DATE OF BIRTH: ");
		String dateOfBirth=sc.nextLine();
		
		System.out.println("NAME OF HIGH SCHOOL: ");
		String highschool=sc.nextLine();
		
		System.out.println("CONTACT INFO: ");
		String contactInfo=sc.nextLine();
		
		System.out.println("ADDRESS: ");
		String address=sc.nextLine();
		
		System.out.println("HIGHEST EDUCATION QUALIFICATION NAME AND DETAILS: \n");
		
		System.out.println("QUALIFICATION NAME: ");
		String qualificationName=sc.nextLine();
		
		System.out.println("GRADE: ");
		String grade=sc.nextLine();
		
		System.out.println("COMPLETION DATE: ");
        String completionDate=sc.nextLine();
		
		System.out.println("PROFESSIONAL EXPERIENCE DETAILS " +
				           "(ex. Company Name, Designation, Duration etc.) \n");
		
		System.out.println("ORGANIZATION NAME: ");
		String organizationName=sc.nextLine();
		
		System.out.println("DESIGNATION: ");
		String designation=sc.nextLine();
		
		System.out.println("JOB DATE: ");
		String jobDate=sc.nextLine();
		
		System.out.println("YOUR OTHER DETAILS (Ex. Extra Curricular Activities etc.):");
		String otherDetails=sc.nextLine();
		
		System.out.println("Referral Details: \n");
		
		System.out.println("REFERRAL NAME: ");
		String referralName=sc.nextLine();
		
		System.out.println("DESIGNATION: ");
		String referralDesignation=sc.nextLine();
		
		System.out.println("ORGANIZATION: ");
		String referralOrganization=sc.nextLine();
		
		System.out.println("CONTACT INFO: ");
		String referralContactInfo=sc.nextLine();
        
        CV cvObj=new AdvanceCV(summary, fullname, dateOfBirth, highschool, contactInfo, address, qualificationName, grade, completionDate, organizationName, designation, jobDate, otherDetails, referralName, referralDesignation, referralOrganization, referralContactInfo);
        cvObj.displayFormat();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UIClass uiObj=new UIClass();
		Scanner sc=new Scanner(System.in);
		
		try {
			
			System.out.println("======================================================");
			System.out.println("                     CV Builder                       ");
			System.out.println("======================================================");
			
			System.out.println();
			
			System.out.println("CV TYPE SELECTION");
			
			System.out.println("1. BASIC CV FORMAT (FREE)");
			System.out.println("2. DOMESTIC CV FORMAT (Price: $2 Per CV)");
			System.out.println("3. UK CV FORMAT (Price: $10 Per CV");
			
			System.out.println();
			
			System.out.println("PRESS NUMBER TO IMPLEMENT CORRESPONDING SERVICE");
			int selectedFunction =sc.nextInt();
			
			switch(selectedFunction){
			
			   case 1:
				   uiObj.basicCVCreator();
				   break;
				   
			   case 2:
				   uiObj.domesticCVCreator();
				   break;
				   
			   case 3:
				   uiObj.advanceCVCreator();
				   break;
			   default:
				   System.out.println("INVALID FUNCTION NUMBER. PLEASE TRY AGAIN !!");
			}
			
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
