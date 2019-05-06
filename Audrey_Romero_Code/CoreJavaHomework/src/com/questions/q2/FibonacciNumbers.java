package com.questions.q2;
/**
 * This program prints to the console the first 25 Fibonacci numbers.
 * @author Audrey Romero
 */
public class FibonacciNumbers {
	/**
	 * If the parameter is 1 or 0, returns that number. Otherwise,
	 * the next number in the sequence must be (n - 1) + (n - 2).
	 * Does not allow negative values.
	 * @param n
	 * @return the nth element of the Fibonacci sequence
	 */
	public static int fibonacci(int n) {
		if (n <= 1 & n >= 0) {
			return n;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
	/**
	 * Prints to the console the first 25 Fibonacci numbers.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("The first 25 Fibonacci numbers are: \n");
		for (int i = 0; i < 25; i++) {
			System.out.print(fibonacci(i) + "  ");
		}

	}

}
