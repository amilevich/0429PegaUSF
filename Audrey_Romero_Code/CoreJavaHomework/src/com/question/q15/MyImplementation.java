package com.question.q15;
/**
 * This class implements an interface and its methods. These implementations, when called, perform
 * arithmetic operations on two integer values and print the result to the console.
 * @author Audrey Romero
 *
 */
public class MyImplementation implements MyInterface {

	// Implements addition of two integers.
	@Override
	public void add(int a, int b) {
		System.out.println(a + " + " + b + " is: " + (a + b));
	}

	// Implements subtraction of two integers.
	@Override
	public void subtract(int a, int b) {
		System.out.println(a + " - " + b + " is: " + (a - b));
	}

	// Implements multiplication of two integers.
	@Override
	public void multiply(int a, int b) {
		System.out.println(a + " * " + b + " is: " + (a * b));
	}

	// Implements division of two integers.
	@Override
	public void divide(int a, int b) {
		System.out.println(a + " / " + b + " is: " + (a / b));
	}

}
