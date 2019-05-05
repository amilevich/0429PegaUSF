package com.homework.one;

/*
 * Write a program to compute N factorial.
 */
public class QuestionFour {

	public static void main(String[] args) {
		double nFactorial, startVal = 5;
		// used just so i have a before and after to print out
		nFactorial = startVal;

		// loop starting one less then our number and going to 1
		for (double i = nFactorial - 1; i > 0; i--) {
			// multiply our number by the number before it.
			nFactorial *= i;
		}
		// once done you have taken the number 5 and multiplied it like this
		// 5 * 4 * 3 * 2 * 1
		// giving the factorial of 5 which is 120.
		// but this can be done with any number tell it gets too big factorial numbers
		// grow
		// rapidly
		System.out.println("the \"Nth\" Factorial of " + startVal + " equals " + nFactorial);
	}

}
