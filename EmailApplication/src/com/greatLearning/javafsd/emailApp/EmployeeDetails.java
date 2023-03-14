package com.greatLearning.javafsd.emailApp;

public class EmployeeDetails {
																																																																																																																																																																			
	
	private String firstname;
	private String lastName;
	private String department;
	private String emailAddress;
	private String password;
	
	public EmployeeDetails(String firstname, String lastName, String department) {
		
		this.firstname = firstname;
		this.lastName = lastName;
		this.department = department;	
	}
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
