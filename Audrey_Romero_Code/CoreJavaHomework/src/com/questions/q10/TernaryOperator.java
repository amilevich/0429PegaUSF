package com.questions.q10;
/**
 * This program creates two integer values, calculates the minimum using
 * ternary operators, and prints the value to the console.
 * @author Audrey Romero
 *
 */
public class TernaryOperator {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 13;
		int min; // The minimum will be stored in this variable.
		
		/**
		 * Ternary operator! If the first number is less than the second, the first
		 * number must be the minimum. If the test result is false, the second
		 * number must be the minimum.
		 */
		min = (num1 < num2) ? (num1) : (num2);
		
		System.out.println("The minimum of " + num1 + " and " + num2 + " is: " + min);
	}

}
