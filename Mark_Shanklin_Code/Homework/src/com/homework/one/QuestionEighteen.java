package com.homework.one;

import com.homework.one.data.MySubClass;

/*
 * Write a program having a concrete subclass that inherits three abstract methods 
 * from a superclass. Provide the following three implementations in the subclass 
 * corresponding to the abstract methods in the superclass: 
 * 1. Check for upper-case characters in a string, and return ‘true’ or ‘false’ 
 * 		depending if any are found.
 * 2. Convert all of the lower case characters to upper-case in the input string, 
 * 		and return the result. 
 * 3. Convert the input string to integer and add 10, output the result to the console.
 *    Create an appropriate class having a main method to test the above setup.
 */
public class QuestionEighteen {
	/*
	 * Main Driver
	 */
	public static void main(String[] args) {
		MySubClass mc = new MySubClass();
		System.out.println("The string is \"Hello\"");
		System.out.println("To uppercase is " + mc.toUpper("Hello"));
		System.out.println("contain upper? " + mc.isUpper("Hello"));
		System.out.println("The string is \"1000\"");
		mc.toIntPlusTen("1000");

	}

}
