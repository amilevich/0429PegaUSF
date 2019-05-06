package com.homework.question06;

public class MainDriver {
	
	//a boolean isEven is initialized with an integer n 
	static boolean isEven(int n) {
		
		//the boolean isEven is made true to start the code
		boolean isEven = true;
		
		//this line determines that should an integer i is equal to 1, it is less than or equal to n, or if 1 is added to 1, then isEven is false and
		//the number is odd
		for(int i = 1; i <= n; i++) {
			
			isEven = !isEven;
			
		}
		
		//isEven is returned
		return isEven;
		
	}
	
	public static void main(String[] args) {
		
		//this assigns a value to int n. any whole number can be used
		int n = 450;
		//if statement for when n is even. this tells the console to print the following string
		if (isEven(n)) {
			System.out.println("This number is even");
		}
		
		//else statement for when n is odd. this tells the console to print the following string
		else {
			System.out.println("This number is odd");
		}
		
	}

}
