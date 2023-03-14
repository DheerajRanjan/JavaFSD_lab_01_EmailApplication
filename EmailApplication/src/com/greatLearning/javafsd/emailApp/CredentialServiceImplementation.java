package com.greatLearning.javafsd.emailApp;

import java.util.Random;

public class CredentialServiceImplementation 
		implements ICredentialService{

	@Override
	public String generatePassword() {
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String number="0987654321";
		String specialChar="!@#$%^&*()_:><";
		String combinedFrame=capitalLetters  + smallLetters + number+specialChar;
		Random randomObj=new Random();
		
		StringBuilder passwordBuilder=new StringBuilder();
		
		for(int index=1; index<=6; index ++) {
			int length=combinedFrame.length();
		//	System.out.println("Length: " + length);
			
			int randomIndex=randomObj.nextInt(length);
			//System.out.println("Randon Access :" + randomIndex);
			char charValue=combinedFrame.charAt(randomIndex);
			//System.out.println(charValue);
			passwordBuilder.append(charValue);
		}
		String password=passwordBuilder.toString();
		return password;
	} 

	@Override
	public String generateEmailAddress(EmployeeDetails employeeDetails) {
		String firstName=employeeDetails.getFirstname();
		String lastName=employeeDetails.getLastName();
		String dept=employeeDetails.getDepartment();
		StringBuilder emailBuilder=new StringBuilder();
		emailBuilder.append(firstName.toLowerCase());
		emailBuilder.append(".");
		emailBuilder.append(lastName.toLowerCase());
		emailBuilder.append("@");
		emailBuilder.append(dept);
		emailBuilder.append(".abc.com");

		String emailAddress=emailBuilder.toString();
		employeeDetails.setEmailAddress(emailAddress);
		return emailAddress;
	}

	@Override
	public void displayCredentials(EmployeeDetails employeeDetails) {
		
		//Dear <Firstnme> your generated credential are as follow: 
		//Email   --> <FirstName>.<LastName>@<Dept>.abc.com
		//password --> <random Password>
		
		StringBuilder displayMsg=new StringBuilder();
		displayMsg.append("Dear ");
		displayMsg.append(employeeDetails.getFirstname());
		displayMsg.append(" your generated credential are as follow:");
		
		String newLine=System.getProperty("line.separator");
		displayMsg.append(newLine);
		displayMsg.append("Email --- >");
		displayMsg.append(employeeDetails.getEmailAddress());
		displayMsg.append(newLine);
		displayMsg.append("Password --- >");
		displayMsg.append(generatePassword()); // appending the generated password
		String finalMsg=displayMsg.toString();
		System.out.println(finalMsg);
		
	}
		

}
 