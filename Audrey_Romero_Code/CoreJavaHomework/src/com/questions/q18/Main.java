package com.questions.q18;
/**
 * This program demonstrates the use of a concrete subclass that inherits three
 * abstract methods from a superclass. These methods take an input string
 * and performs various functions with them.
 * @author Audrey Romero
 *
 */
public class Main {

	public static void main(String[] args) {
		MyImplementations function = new MyImplementations();
		String test = "Hello"; // Input String
		
		System.out.println("Input string: \"" + test + "\"\n" );
		
		// Print boolean result.
		System.out.println("Uppercase characters?: " + 
		                   function.containsUppercase(test) + "\n");
		
		// Print input string converted to all uppercase.
		System.out.println("Input string all uppdercase: " + 
		                   function.convertToUppercase(test) + "\n");
		
		System.out.print("String converted to int plus 10: ");
		// Converts string to an integer value, adds 10, prints result.
		function.stringToInt(test);

	}

}
