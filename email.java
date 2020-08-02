package project_email_app;

import java.util.Scanner;

public class email {

	private String firstname;
	private String lastname;
	private String password;
	private String email;
	private String department;
	private int mailBoxCapacity= 500;
	private String alternateEmail;
	private String companySuffix;
	
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
		 
		 //combine element to generate email
		email = firstname.toLowerCase() +"."+lastname.toLowerCase()+"@"+ department +"."+ companySuffix + ".com";
		System.out.println("your email is : "+ email);
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
	
	// set the mailbox capacity
	
	public void setmaiboxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
	// get mailbox capacity
	
	public int getmailboxCapacity() {
		return mailBoxCapacity;
		}
	// set alternate email
	
	public void setAlternateEmail(String alter) {
		this.alternateEmail = alter;
	}
	// get alternate email
	
	public String getAlternateEmail() {return alternateEmail;}
	
	// change the password
	public void setChangePassword(String password) {
		this.password = password;
	}
	// get changed password
	public String getChangePassword() {
		return password;}
}

	
	// change the password
}
