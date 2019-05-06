package com.homework.question10;

public class MainDriver {

	public static void main(String[] args) {
		
		int n1 = 15;
		int n2 = 606;
		
		System.out.println("Minimum of " + n1 + " and " + n2 + ": ");
		
		//an int min is set to a ternary operator
		//if int n1 is less than int n2, then n1 is true and n2 is false
		int min = (n1 < n2) ? n1 : n2;
		
		System.out.println(min);

	}

}
