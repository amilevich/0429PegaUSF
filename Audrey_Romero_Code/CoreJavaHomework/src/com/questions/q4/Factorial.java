package com.questions.q4;
/**
 * This program calculates the product of 5 factorial in a single for loop
 * no other methods are involved.
 * @author Audge
 *
 */
public class Factorial {
	/**
	 * Creates two new integer variables and assigns them a value of 5. 
	 * Utilizing a loop, calculates 5 factorial by multiplying <code>int product</code>
	 * by decrementing integer values of <code>int i</code> until it reaches 0.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 5;
		int product = n;
		
		for (int i = n - 1; i > 0; i--) {
			product *= i;
		}
		
		System.out.println(n + "! equals: \n");
		System.out.println(product);

	}

}
