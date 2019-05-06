package Question.Eighteen;

import java.util.Scanner;
import Question.Eighteen.NameAndAge; //import other class 

public class SubclassSuperclass extends NameAndAge {

		//Creating string variables for name and age 
		private static String name;
		private static String age;
		
		//Checking for uppercase in name inputer 
		@Override
		public boolean hasUpperCase() {
			
			for(int i = 0; i < name.length(); i++){
				//Iterating through code to check for upperCase 
				if( Character.isUpperCase( name.charAt(i) ) ) 
					return true; //If any of the characters do have upper case, then return true
			}
			
			return false;
		}
		
		
		//Requesting to change all characters to uppercase 
		@Override
		public void toUpperCase() {
			
			name = name.toUpperCase();	
			//Change entire string to uppercase 
		}

		
		@Override
		public int addTen() {
			return Integer.parseInt(age) + 10; //Add ten to the age input 	
		}
		
		
		//Will allow for input for the name and age parameters in order to run
		public static void main(String[] args)
		{
			SubclassSuperclass c1 = new SubclassSuperclass();
			
			Scanner scan = new Scanner(System.in);
			
			
			System.out.println("What is your name: ");
			name = scan.nextLine();
			
			
			System.out.println("How old are you: ");
			age = scan.nextLine();
			
			
			scan.close();
			
			
///THis is the code that will test all the parameters set for the input 
			
			//Test 1
			System.out.println("True or false: There are Capital Letters in "  + name + " --> " + c1.hasUpperCase() );
			
			//Test 2 
			c1.toUpperCase();
			System.out.println("\nChanging names to ALL CAPS: " + name );
			
			// Test 3 
			System.out.println("This is your age plus 10: " + c1.addTen());
			
		}
		
	}


