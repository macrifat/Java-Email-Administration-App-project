package project_email_app;

import java.util.Scanner;

public class email {

	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int emailBoxCapacity;
	private String alternateEmail;
	
	//constructor to receive firstname and lastname
	
	 public email(String firstname, String lastname){
		
		this.firstname = firstname;
		this.lastname = lastname;
		System.out.println("Email Created : " + this.firstname + " "+ this.lastname );
		
		//asking for a method to select department---return department
		this.department = setDepartment();
		System.out.print("Department : " +this.department);
		
		// call a methode that return random password
		 this.password = randomPassword(8);
		System.out.println("Your password is : "+ this.password);
	}
	
	 
	// ask for the department
	private String setDepartment() {
		System.out.println("Department code: \n1 for sale \n2 for development \n3 for accounting \n Enter code for department: ");
		Scanner input = new Scanner(System.in);
		int depChoice = input.nextInt();
		 
		if( depChoice == 1) {return "sale";}
		else if( depChoice == 2){return "development";}
		else if( depChoice == 3){return "account";}
		else {return "";}
	}
	// generate a random password
	
	private String randomPassword(int length) {
		String setPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for (int i=0; i< length;i++) {
			int rand = (int)(Math.random()* setPassword.length());
			password[i]= setPassword.charAt(rand);
		}
		
		return  new String(password);
	}
	
	// set the mail capacity
	
	// change the password
}
