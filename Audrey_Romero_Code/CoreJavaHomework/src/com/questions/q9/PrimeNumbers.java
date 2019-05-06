package com.questions.q9;
import java.util.ArrayList;
/**
 * This program instantiates a new ArrayList object and stores the integer values 1 to 100.
 * It then calculates which of those numbers are prime and prints them to the console.
 * @author Audrey Romero
 */
public class PrimeNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		System.out.println("Prime numbers between 1 and 100:\n");
		
		for (int i = 0; i < 100; i++) {
			Integer intObj = new Integer(i + 1); // Uses wrapper class to store primitive values.
			numbers.add(intObj);
			if (isPrime(numbers.get(i))) { // If the value added is a prime number, print to console.
			    System.out.print(intObj + " ");
			}
		}
	}
	/**
	 * Prime numbers should only have 2 divisible numbers: 1 and itself.
	 * Performs modulus operation on the parameter by all possible positive numbers, and 
	 * increments <code>int divisibleNumbers</code> if there is no remainder. If there are
	 * only 2 divisible numbers, the parameter must be prime, and the method returns true. 
	 * Otherwise returns false.
	 * @param n    Any integer
	 * @return
	 */
	public static boolean isPrime(Integer n) {
		int divisibleNumbers = 0;
		
		for (int i = 0; i < n; i++) {		
			if (n % (i + 1) == 0) {
				divisibleNumbers++;
			}
		}
		
		if(divisibleNumbers <= 2) {
			return true;
		} else {
		    return false;
		}
	}

}
