package com.homework.one;

import java.lang.Math;

/*
 * Write a program to display the first 25 Fibonacci numbers beginning at 0.
 */
public class QuestionTwo {

	static int n1 = 0, n2 = 1, n3 = 0;

	public static void main(String[] args) {

		// hard coded value to find the fibonacci sequence of
		int value = 25;

		System.out.println("Fibonacci by formula:");
		fibonacciFormula(value);
		System.out.println("Fibonacci by Iteration:");
		fibonacciIterative(value);
		System.out.println("Fibonacci by Recursion:");
		// print first two numbers of sequence
		System.out.print(n1 + " " + n2);
		fibonacciRecursive(value - 2);

	}

	/*
	 * Method using the fibonacci formula to get the sequence is more efficient if
	 * you only want the number at a certain point. would need to be edited to not
	 * return all number up to number
	 */
	public static void fibonacciFormula(int num) {

		// Phi is as follows
		double Phi = (1 + Math.sqrt(5)) / 2;
		// phi is as follows
		double phi = (1 - Math.sqrt(5)) / 2;
		// a sub n = [ Phi^n - (phi)^n ]/Sqrt[5].
		// a sub n is fib at nth spot
		int temp;

		// apply math formula for each number up to number.
		for (int i = 0; i < num; i++) {
			temp = (int) ((Math.pow(Phi, i) - Math.pow(phi, i)) / Math.sqrt(5));
			System.out.print(temp + " ");
		}
		System.out.println();
	}

	/*
	 * Method using an iterative way of getting the fibonacci sequence
	 */
	public static void fibonacciIterative(int num) {
		int val1 = 0, val2 = 1, val3 = 0;
		// print first numbers of sequence
		System.out.print(val1 + " " + val2);
		// Iterate through numbers
		for (int i = 2; i < num; i++) {
			// calculate current number
			val3 = val1 + val2;
			// print calculated number
			System.out.print(" " + val3);
			// swap numbers to next numbers
			val1 = val2;
			val2 = val3;
		}
		System.out.println();
	}

	/*
	 * Method using a recursive way of getting the fibonacci sequence
	 */
	public static void fibonacciRecursive(int num) {
		// continue until zero exclusive
		if (num > 0) {
			// calculate current number
			n3 = n1 + n2;
			// swap numbers to next numbers
			n1 = n2;
			n2 = n3;
			// print calculated number
			System.out.print(" " + n3);
			// recurse passing one less then current number
			fibonacciRecursive(num - 1);
		}
	}

}
