package com.greatLearning.javafsd.emailApp;

public interface ICredentialService {
	String generatePassword();
	String generateEmailAddress(EmployeeDetails employeeDetails);// accessing all properties of Employee details class
	void displayCredentials(EmployeeDetails employeeDetails);
}
