package businessLogicLayer;

public class Student {

	private int studentID;
	private String studentName;
	private String course;
	private int overallMark;
	
	/**
	 * @return the studentID
	 */
	public int getStudentID() {
		return studentID;
	}
	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}
	/**
	 * @return the overallMark
	 */
	public int getOverallMark() {
		return overallMark;
	}
	/**
	 * @param overallMark the overallMark to set
	 */
	public void setOverallMark(int overallMark) {
		this.overallMark = overallMark;
	}
}
