package dataAccessLayer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDataAccessor {

	private DatabaseConnection dbObj=new DatabaseConnection();
	private Connection dbConnection=dbObj.databaseConnection();
	private String sql;
	
	/*private int studentID;
	private String studentName;
	private String course;
	private String overallMark;*/
	
    public void searchProfile(int studentID){
		
    	try {
    		
    		Statement selectStmt=dbConnection.createStatement();
    		sql="SELECT * FROM student WHERE StudentID="+studentID+"";
    		
    		ResultSet rs=selectStmt.executeQuery(sql);
    		
    		if(rs.next()){
    			System.out.println("STUDENT ID: "+rs.getString(1));
    			System.out.println("STUDENT NAME: "+rs.getString(2));
    			System.out.println("COURSE: "+rs.getString(3));
    			System.out.println("OVERALL MARK: "+rs.getString(4));
    			
    		} else {
    			System.out.println("PROFILE NOT FOUND !");
    		}
    	}
    	
    	catch(Exception ex){
    		ex.printStackTrace();
    	}
	}
	
	public void insertProfile(String studentName, String course, int overallMark){
		
		try {
			
			Statement insertStmt=dbConnection.createStatement();
			sql="INSERT INTO student VALUES ('"+studentName+"', '"+course+"', "+overallMark+")";
			
			int result=insertStmt.executeUpdate(sql);
			
			if(result > 0){
				System.out.println("RECORD INSERTED !");
			} else {
				System.out.println("RECORD INSERTION FAILED !");
			}
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void updateProfile(int studentID, String studentName, String course, int overallMark){
		
		try {
			
			Statement updateStmt=dbConnection.createStatement();
			sql="UPDATE student SET StudentName='"+studentName+"', Course='"+course+"', OverallMark="+overallMark+" WHERE StudentID="+studentID+"";
			
			int result=updateStmt.executeUpdate(sql);
			
			if(result > 0){
				System.out.println("RECORD UPDATED SUCCESSFULLY !");
			} else {
				System.out.println("RECORD UPDATION FAILED !");
			}

		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public void deleteProfile(int studentID){
		
		try {
			
			Statement deleteStmt=dbConnection.createStatement();
			sql="DELETE FROM student WHERE StudentID="+studentID+"";
			
			int result=deleteStmt.executeUpdate(sql);
			
			if(result > 0){
				System.out.println("RECORD DELETED SUCCESSFULLY !");
			} else {
				System.out.println("RECORD DELETION FAILED !");
			}
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
