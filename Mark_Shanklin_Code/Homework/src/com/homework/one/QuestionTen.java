package com.homework.one;

/*
 * Find the minimum of two numbers using ternary operators.
 */
public class QuestionTen {

	/*
	 * Main Driver
	 */
	public static void main(String[] args) {
		int one = 10;
		int two = 30;

		//print out the minimum of two integers
		System.out.println("out of the two ints: " + one + " and " + two + " the minimum is " + getMin(one, two));

	}

	/*
	 * Method used to return the minimum for two numbers
	 */
	public static int getMin(int one, int two) {
		//if one is less then two return one else return two
		return (one < two) ? one : two;
	}

}
