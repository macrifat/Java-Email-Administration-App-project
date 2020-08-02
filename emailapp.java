package project_email_app;

public class emailapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      email em1 = new email("John", "Smith");
		 em1.setChangePassword("mac@gmail.com");
      System.out.println("Alternate email is: "+ em1.getChangePassword());
	
	}

}
