package businessLogicLayer;

import dataAccessLayer.StudentDataAccessor;

public class StudentOperation {

	private Student stObj;
	private StudentDataAccessor stDAObj;
	
	public void searchProfile()
	{
		int studentID=stObj.getStudentID();
		stDAObj.searchProfile(studentID);
		
	}
	public void insertProfile()
	{
		
		String studentName=stObj.getStudentName();
		String course=stObj.getCourse();
		int overallMark=stObj.getOverallMark();
		
		stDAObj.insertProfile(studentName, course, overallMark);
	}
	public void updateProfile()
	{
		
		int studentID=stObj.getStudentID();
		String studentName=stObj.getStudentName();
		String course=stObj.getCourse();
		int overallMark=stObj.getOverallMark();
		
		stDAObj.updateProfile(studentID, studentName, course, overallMark);
	}
	public void deleteProfile()
	{
		int studentID=stObj.getStudentID();
		
		stDAObj.deleteProfile(studentID);
	}
}
