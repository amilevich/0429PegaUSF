package com.homework.one;

/*
 * Write a program to determine if an integer is even without using the modulus operator (%)
 */
public class QuestionSix {

	/*
	 * Main Driver
	 */
	public static void main(String[] args) {
		// test numbers
		int testNumberOne = 4;
		int testNumberTwo = 5;
		System.out.println("Is " + testNumberOne + " even " + isEven(testNumberOne));
		System.out.println("Is " + testNumberTwo + " even " + isEven(testNumberTwo));
	}

	/*
	 * Method used to determine if number is even
	 */
	public static boolean isEven(int num) {
		boolean retVal = false;
		// is the last bit set using bit masking to determine odd or even
		if ((num & 1) != 1) {
			retVal = true;
		}

		return retVal;
	}
}
