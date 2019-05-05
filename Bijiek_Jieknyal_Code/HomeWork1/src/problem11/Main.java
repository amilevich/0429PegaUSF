package problem11;

import java.util.Scanner;

public class Main {

		

  public static void main(String[] args) {	
		    	Scanner input = new Scanner(System.in);
		    	
		    	// create getting float input
		    	System.out.print("Enter float: ");
		    	float myFloat = input.nextFloat();
		    	System.out.println("Float entered = " + myFloat);
		    	
		    	// used getting double input
		    	
		    	System.out.print("Enter double: ");
		    	double myDouble = input.nextDouble();
		    	System.out.println("Double entered = " + myDouble);
		    	
		    	// apply get String input
		    	
		    	System.out.print("Enter text: ");
		    	String myString = input.next();
		    	System.out.println("Text entered = " + myString);
		    }
		}
		

