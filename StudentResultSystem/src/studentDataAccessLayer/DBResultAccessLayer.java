package studentDataAccessLayer;

import java.sql.*;

public class DBResultAccessLayer {

	private static Connection conn;
	
	private static String dbSource="jdbc:mysql://localhost:8080/StudentResultDB";
	private static String username="root";
	private static String password="123";
	
	public static Connection dbConnection(){
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			conn=DriverManager.getConnection(dbSource, username, password);
			System.out.println("SUCCESSFULLY CONNECTED TO THE DATABASE !!");
		}
		
		catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		catch(Exception ex){	
			ex.printStackTrace();
		}
		     
		return conn;
	}
	
	public void getResults(int StudentID){
		
		try {
			
			Statement selectStmt=dbConnection().createStatement();
			
			String sql="SELECT * FROM Student WHERE StudentID="+StudentID+"";
			ResultSet rs=selectStmt.executeQuery(sql);
			
			if(rs.next()){
				
				System.out.println("STUDENT ID: "+rs.getString(1));
				System.out.println("STUDENT FULLNAME: "+rs.getString(2));
				System.out.println("STUDENT RESULT: "+rs.getString(3));
				System.out.println("STUDENT GRADE: "+rs.getString(4));
				
			} else {
				System.out.println("RECORD NOT FOUND !");
			}
		}
		
		catch(SQLException ex){
			ex.printStackTrace();
		}
		
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
