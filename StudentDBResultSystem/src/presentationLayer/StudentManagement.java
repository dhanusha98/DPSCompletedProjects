package presentationLayer;

import dataAccessLayer.StudentDataAccessor;
import businessLogicLayer.Student;
import businessLogicLayer.StudentOperation;

import java.util.*;

public class StudentManagement {
	
	private static Scanner sc=new Scanner(System.in);
	
	private static Student studentObj=new Student();
	private static StudentOperation studOPObj=new StudentOperation();
	
	public static void searchProfileViewer()
	{
		
		System.out.println("======================= SEARCH PROFILES =======================");
		
		System.out.println("ENTER STUDENT ID: ");
		int studentID=sc.nextInt();
		
		studOPObj.searchProfile();
	}
	
	public static void insertProfileViewer()
	{
		
		System.out.println("======================= INSERT PROFILES =======================");
		
		System.out.println("ENTER STUDENT NAME: ");
		String studentName=sc.nextLine();
		
		System.out.println("ENTER COURSE: ");
		String course=sc.nextLine();
		
		System.out.println("ENTER OVERALL MARK: ");
		int overallMark=sc.nextInt();
		
		studentObj.setStudentName(studentName);
		studentObj.setCourse(course);
		studentObj.setOverallMark(overallMark);
		
		studOPObj.insertProfile();
	}
	
	public static void updateProfileViewer()
	{
		
		System.out.println("======================= UPDATE PROFILES =======================");
		
		System.out.println("ENTER STUDENT ID: ");
		int studentID=sc.nextInt();
		
		System.out.println("ENTER STUDENT NAME: ");
		String studentName=sc.nextLine();
		
		System.out.println("ENTER COURSE: ");
		String course=sc.nextLine();
		
		System.out.println("ENTER OVERALL MARK: ");
		int overallMark=sc.nextInt();
		
		studentObj.setStudentID(studentID);
		studentObj.setStudentName(studentName);
		studentObj.setCourse(course);
		studentObj.setOverallMark(overallMark);
		
		studOPObj.updateProfile();
	}
	
	public static void deleteProfileViewer()
	{
		System.out.println("======================= DELETE PROFILES =======================");
		
		System.out.println("ENTER STUDENT ID: ");
		int studentID=sc.nextInt();
		
		studentObj.setStudentID(studentID);
		
		studOPObj.deleteProfile();
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("=============================================================");
		System.out.println("                       ADMIN MANAGEMENT                      ");
		System.out.println("=============================================================");
		
		System.out.println();
		System.out.println("PRESS ANY FUNCTION NUMBER IN FOLLOWING TO IMPLEMENT CORRESPONDING SERVICE");
		
		System.out.println("1. SEARCH ADMIN PROFILE");
		System.out.println("2. INSERT ADMIN PROFILE");
		System.out.println("3. UPDATE ADMIN PROFILE");
		System.out.println("4. DELETE ADMIN PROFILE");
		
		System.out.println("FUNCTION NUMBER: ");
		int selectedFunction=sc.nextInt();
		
		switch(selectedFunction){
		
		case 1:
			searchProfileViewer();
			break;
			
		case 2:
			insertProfileViewer();
			break;
			
		case 3:
			updateProfileViewer();
			break;
			
		case 4:
			deleteProfileViewer();
			break;
			
		default:
			System.out.println("INVALID FUNCTION NUMBER !");
			break;
		}
		
	}
}
