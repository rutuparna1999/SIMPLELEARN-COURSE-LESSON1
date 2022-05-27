package jddic;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;
public class EmailValidation {

	
	static  ArrayList<String> email_database = new ArrayList<String>();
	
	private static void SearchEmail(String Email)
	{
		int status = 0;
		for(String email_id : email_database)
	     {
			if(Email.equals(email_id)) {
				System.out.println("Congratulations..Your Email Id is Present..");
				status = 1;
				break;
			}
	     }
		if(status == 0) {
			System.out.println("Email Id is Not Present..Please Go Back ..And Enter your Id  ");
		}
	}
	private static int  CheckEmail(String Email)
	{
		   String pattern = "^[A-Za-z0-9+_.-]+@(.+)$";
		    Pattern p = Pattern.compile(pattern);
		    Matcher c = p.matcher(Email);
		    if(c.find())
			{
				return 1;
				
			}else 
			{
				return 2;
				
			}
	}
	
	
	public static void main(String[] args) {
		email_database.add("panda.rituparna1999@gmail.com");
		email_database.add("panda.rituparna@gmail.com");
		email_database.add("kumar.ashwini@gmail.com");
		email_database.add("kumar.sipun1999@gmail.com");
		//System.out.println(email_database);
		EmailValidation Email = new EmailValidation();
		  System.out.println("****WELCOME TO SITE****");
	      Scanner sc= new Scanner(System.in);
	      String emailid;
		  System.out.println("Please Enter Your Email Id:");
		  emailid = sc.next();
		  System.out.println("Entered Email Id is:"+emailid);
		  int check_email_staus = Email.CheckEmail(emailid);
		  int cont;
		  if(check_email_staus == 1) {
			  System.out.println("Valid Email Id And To continue Enter 1");
			  cont = sc.nextInt();
			  if(cont == 1) {
				  Email.SearchEmail(emailid);
			  }
			  
		  }else {
			  System.out.println("InValid Email Id .please Run The App Again..");
		  }
		 
		  
		    
		
	}
}
