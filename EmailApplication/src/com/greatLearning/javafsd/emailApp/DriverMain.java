package com.greatLearning.javafsd.emailApp;

import java.util.Scanner;

public class DriverMain {
	public static void main(String[] args) {
		String FirstName="Dheeraj";
		String lastName="Ranjan";
		Scanner takeInput=new Scanner(System.in);
		System.out.println("Welcome to email Application !");
		System.out.println("To specify your department, enter the crossponding department number:  -->");
		System.out.println("1. Technical ");
		System.out.println("2. Admin ");
		System.out.println("3. HR ");
		System.out.println("4. Legal ");
		
		int dept=takeInput.nextInt();
		String deptName="";
		switch (dept) {
			case 1:{
				deptName="technical";
				break;
			}
			case 2:{
				deptName="admin";
				break;
			}
			case 3:{
				deptName="hr";
				break;
			}
			case 4:{
				deptName="legal";
				break;
			}
			default:{
				System.out.println("Incorrect department option chosen. Please select a value between 1 to 4");
				System.exit(-1);
			}
		}
		
		EmployeeDetails dheeraj=new EmployeeDetails(FirstName,lastName,deptName);
		//CredentialServiceImplementation CredServImpl= new CredentialServiceImplementation(); //calling using class object
		ICredentialService CredServImpl= new CredentialServiceImplementation(); // calling using Interface ref
		CredServImpl.generateEmailAddress(dheeraj);
		String password=CredServImpl.generatePassword();
		dheeraj.setPassword(password);
		CredServImpl.displayCredentials(dheeraj);
		
	}

}
