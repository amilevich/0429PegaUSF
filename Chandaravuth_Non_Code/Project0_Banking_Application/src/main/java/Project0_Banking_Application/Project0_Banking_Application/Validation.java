package Project0_Banking_Application.Project0_Banking_Application;

import java.util.ArrayList;
import java.util.Scanner;

public class Validation {

	
	public Validation() {
		
	}
	
	public static void validNewAccount()
	{
		ArrayList<String> accList= new ArrayList<String>();
		String s;
		Scanner input = new Scanner(System.in);
		
    	System.out.print("Enter your first name: ");
    	System.out.println();
		s= input.nextLine();
		while(!s.matches("[a-zA-Z]*"))
		{
			System.out.println("Invalid input. Only Letters!");
			s= input.nextLine();
			System.out.println();
		}
		accList.add(s);
		
    	System.out.print("Enter your last name: ");
    	System.out.println();
    	s= input.nextLine();
		while(!s.matches("[a-zA-Z]*"))
		{
			System.out.println("Invalid input. Only Letters!");
			s= input.nextLine();
			System.out.println();
		}
		accList.add(s);
		
    	System.out.print("Enter your usernamer: ");
    	System.out.println();
    	s= input.nextLine();
		while(!s.matches("[a-zA-Z0-9]*"))
		{
			System.out.println("Invalid input. Only Letters and Numbers!");
			s= input.nextLine();
			System.out.println();
		}
		accList.add(s);
		
    	System.out.print("Enter your password: ");
    	System.out.println();
    	s= input.nextLine();
		while(!s.matches("[a-zA-Z0-9]*"))
		{
			System.out.println("Invalid input. Only Letters and Numbers!");
			s= input.nextLine();
			System.out.println();
		}
		accList.add(s);
		
    	System.out.print("Enter your initial deposit: ");
    	System.out.println();
    	s= input.nextLine();
		while(!s.matches("^(\\d{0,10})$"))
		{
			System.out.println("Invalid input. Only Positive Numbers!");
			s= input.nextLine();
			System.out.println();
		}
		accList.add(s);
		
		App.registerCustomer(accList.get(0),accList.get(1),accList.get(2),accList.get(3),accList.get(4));
		
		
		
	}
}
