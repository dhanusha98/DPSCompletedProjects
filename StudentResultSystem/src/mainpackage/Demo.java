package mainpackage;

import java.util.*;

import studentDataAccessLayer.DBResultAccessLayer;
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		Student stObj=new Student();
		DBResultAccessLayer dbLayerObj=new DBResultAccessLayer();
		
		try {
			
			System.out.println("===============================================");
			System.out.println("               STUDENT RESULT SYSTEM           ");
			System.out.println("===============================================");
			
			
			System.out.println("ENTER STUDENT ID: ");
			int StudentID=sc.nextInt();
			
			stObj.setStudentID(StudentID);
			
			dbLayerObj.getResults(stObj.getStudentID());
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	}

}
