package com.homework.question04;

public class NFactorial {
	
	public static void main(String[] args) {
		
		System.out.println("N Factorials:");
		
		//an int i is given the fact functionality
		int i, fact = 1;
		
		//the int to be analyzed
		int n = 5;
		
		//a for loop that multiplies fact by int i if i is less than or equal to n
		for(i = 1; i <= n; i++) {
			fact = fact*i;
		}
		
		System.out.println(n + " factorial is " + fact);
	}

}
