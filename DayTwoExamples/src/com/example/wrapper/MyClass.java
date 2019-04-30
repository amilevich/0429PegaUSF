package com.example.wrapper;

import java.util.ArrayList;

public class MyClass {

	// primitives
	/*
	 * int -> Integer short byte long boolean -> Boolean double float char
	 */
	// wrapper is a class that encapsulates primitive
	// data types
	public static void main(String[] args) {
		Integer i = new Integer(2);
		System.out.println(i);
		
		//boxing (autoboxing) 
		// primitive to Wrapper
		//unboxing
		// Wrapper to primitive
		
		Float f = 998f; //boxing
		float tempFloat = f; //unboxing
		
		Integer integ = 5;
		
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		

	}
}
