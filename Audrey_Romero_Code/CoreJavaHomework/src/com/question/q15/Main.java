package com.question.q15;
/**
 * This program instantiates a new instance of MyImplementation, which includes implementations
 * of methods inherited by MyInterface. These methods allow arithmetic operations of two
 * integer values, and prints the results to the console.
 * @author Audrey Romero
 */
public class Main {

	public static void main(String[] args) {
		MyImplementation function = new MyImplementation();
		// Two hard-coded integer values to test the functionality of the implementations.
		int num1 = 12;
		int num2 = 2;
		
		// Passes the above integer values to methods implemented in MyImplementation.
		function.add(num1, num2);
		function.subtract(num1, num2);
		function.multiply(num1, num2);
		function.divide(num1, num2);
	}

}
