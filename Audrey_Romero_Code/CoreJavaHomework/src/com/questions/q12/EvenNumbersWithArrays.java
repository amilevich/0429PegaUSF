package com.questions.q12;
/**
 * This program creates a new integer array and fills it with values from 1 to 100.
 * Using an enhanced for loop, all even numbers in the array are printed to the console.
 * @author Audge
 *
 */
public class EvenNumbersWithArrays {
	
	public static void main (String[] args) {
		int[] numbers = new int[100];
		
	    fillArray(numbers);
	    // Enhanced for loop, iterates through the array and assigns each value to int i
	    // i can then be evaluated for an even number, if even, print to console
	    for (int i : numbers) { 
	    	if (i % 2 == 0) {
	    		System.out.print(i + " ");	
	    	}
	    }
	}
	/**
	 * Fills a given array with integer values.
	 * @param n    Array to be filled
	 */
	public static void fillArray(int[] n) {
		for (int i = 0; i < n.length; i++) {
	    	n[i] = i + 1;
	    }
	}
}
