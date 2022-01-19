package email;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Emailvalid {
	
		 
		

		   public static void main(String[] args) {
		       List<String> emails = new ArrayList<String>();
		       // valid email addresses
		       emails.add("harshitha@example.com");
		       emails.add("harshithabob@example.com");
		       emails.add("harshi@example.me.org");
		       emails.add("aman.example.com");
		       emails.add("alvida..bob@example.com");
		       emails.add("alkaida@.example.com");
		       System.out.println("enter user");
	    	   
		       Scanner sc = new Scanner(System.in);
		       String input = sc.nextLine(); 
		      
		       if(emails.contains(input))
		       {
		    	   System.out.println("valid");
		    	   
		       }
		       else
		       {
		    	   System.out.println("invalid");
		    	   
		       }
		       
		    
		   }
}



