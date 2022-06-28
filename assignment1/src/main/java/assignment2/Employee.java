package assignment2;

public class Employee {
	int empId;
	double sal = 0;
	double basic;
	double allowance;
	double deductions;
	String firstName;
	String lastName;
	String address;
	String pincode;
	public double getSal() {
		return sal;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String realName(){
		return firstName+lastName;
	}
	public void calcSalary(){
		double sal=0;
		sal= basic + allowance-deductions;
	}
	
	}

