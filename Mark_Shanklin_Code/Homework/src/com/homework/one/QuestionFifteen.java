package com.homework.one;

import com.homework.one.data.MyClass;

/*
 * Write a program that defines an interface having the following methods: 
 * addition, subtraction, multiplication, and division.  
 * Create a class that implements this interface and provides appropriate functionality 
 * to carry out the required operations. Hard code two operands in a test class
 * having a main method that calls the implementing class.
 */
public class QuestionFifteen {

	/*
	 * Main Driver
	 */
	public static void main(String[] args) {
		//my class that implements my interface
		MyClass test = new MyClass();

		int a = 2;
		int b = 2;
		
		//test each method in MyClass
		System.out.println(a + " + " + b + " = " + test.addition(a, b));
		System.out.println(a + " - " + b + " = " + test.subtraction(a, b));
		System.out.println(a + " * " + b + " = " + test.multiplication(a, b));
		System.out.println(a + " / " + b + " = " + test.division(a, b));
	}

}
