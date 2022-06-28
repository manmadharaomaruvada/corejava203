package assignment1;
/***
 * 
 * @author mm22042
 *Create a class Student with StudentId,Name,MobileNo,Address,Course.
 *Write getters and setters for all the data members, Write a method
 *CalculateFee which returns the fee depending on the course taken.
 *Write child classes FastTrackBatchStudent, CorporateBatchStudent, 
 *WeekendBatchStudent, CorporateWeekendBatchStudent which overrides the 
 *Calculate Fee method and returns an appropriate fee.You need to identify 
 *what are the oops concepts involved. Develop the Java Application
 */
public class Student {
	private int studentId;
	private String name;
	private long mobilNo;
	private String address;
	private String course;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobilNo() {
		return mobilNo;
	}

	public void setMobilNo(long mobilNo) {
		this.mobilNo = mobilNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public double calculateFee(String course){
		double fee=0;
		if(course.equals("java")){
			fee=15000;
		}
		else if(course.equals("UI")){
			fee=12000;
		}
		else if(course.equals("testing")){
			fee=10000;
			
		}
		return fee;
	}

}
