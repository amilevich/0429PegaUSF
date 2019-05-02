package com.example.variables;

public class Main {
	
	/*
	 * what are variables?
	 * container for a value that is stored
	 * and identified in memory
	 * 
	 * variables have a type
	 *  -> determines what sort of value it stores
	 * variables have a name
	 *  -> is what makes it possible to access
	 *  	the value
	 *
	 *Primitive data types - variables that store
	 *simple values
	 *
	 * 8 in Java:
	 * 
	 * integer types
	 * Byte - 8 bits (1 byte)
	 * Short - 16 bits
	 * Int - 32 bits
	 * Long - 64 bits
	 * 
	 * floating-point types
	 * Float - 32 bits
	 * Double - 64 bits
	 *
	 * logical types
	 * Boolean - no memory allocation (1 bit)
	 * 
	 * character type:
	 * Char - 16 bits
	 */
	
	public static void main(String[] args) {
		
		int x; //the simplest variable declaration
		int y=5; //we can give variables their values
				// at declaration
		// initialization 
		
		double w = 2.0;
		byte b = 7;
		boolean bool = false;
		
		float f = 993.99f;
		// if there is no f, remains a double
		
		//what happens if I put an underscore
		// in the integer?
		int i = 362_893;
		System.out.println(i);
		// it makes it easier to read
		
		//naming variables
		// case sensitive
		// can only use numbers, 
		// letters, and $ and _ characters
		// cannot begin with a number
		// cannot be a reserved Java keyword
		
	}

}
