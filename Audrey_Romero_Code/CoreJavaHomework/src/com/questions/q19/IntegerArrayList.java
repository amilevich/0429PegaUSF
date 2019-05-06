package com.questions.q19;
import java.util.*;
import com.questions.q9.PrimeNumbers;
/**
 * This program creates a new ArrayList and stores Integers 1 through 10 inclusive.
 * The list is then printed to console, followed by the sum of all even numbers and
 * the sum of all odd numbers. Finally, all prime numbers in the list are identified
 * and removed, the remaining elements of the list are printed to the console.
 * @author Audrey Romero
 *
 */
public class IntegerArrayList {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		int evenSum = 0;
		int oddSum = 0;
		
		// Fills the ArrayList with Integer values
		for (int i = 0; i < 10; i++) {
			numbers.add(new Integer(i + 1));
		}
		
		System.out.println("My array list:");
		
		/*
		 * Iterates through all elements of the the list. If the current element is
		 * even, it will be added to the current sum of all even numbers. Otherwise,
		 * the element is odd, and will be added to the current sum of all odd numbers.
		 */
		for (int j : numbers) {
			System.out.print(j + " ");
			if (j % 2 == 0) {
				evenSum += j;
			} else {
				oddSum += j;
			}
		}
		 
		System.out.println("\n\nSum of all even numbers is: " + evenSum);
		
		System.out.println("\nSum of all odd numbers is: " + oddSum);
		
		/*
		 * Checks all elements of the list for prime numbers. If an element is prime,
		 * that element will be removed from the list.
		 */
		System.out.println("\nArray list with prime numbers removed:");
		for (int k = 0; k < numbers.size(); k++) {
			// Note: Uses method from class PrimeNumbers in com.questions.q9 package.
			if (PrimeNumbers.isPrime(numbers.get(k))) { 
				numbers.remove(k);
				k--; // k must be decremented, or else the following element will be skipped
			} else {
				System.out.print(numbers.get(k) + " ");
			}
		}
		
	}

}
