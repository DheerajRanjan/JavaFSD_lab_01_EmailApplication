package com.greatLearning.javafsd.emailApp.test;
import com.greatLearning.javafsd.emailApp.CredentialServiceImplementation;
import com.greatLearning.javafsd.emailApp.EmployeeDetails;

public class CredentialServiceImplementationTest {
	public static void main(String[] args) {
		CredentialServiceImplementation CredServImpl= new CredentialServiceImplementation();
		EmployeeDetails dheeraj=new EmployeeDetails("Dheeraj","Ranjan","Technical");
		String emailaddress=CredServImpl.generateEmailAddress(dheeraj);
		System.out.println(emailaddress);
		String password=CredServImpl.generatePassword();
		System.out.println("Generated Password is :" + password);
	}

}
