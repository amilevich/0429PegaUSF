package com.homework.one;

import java.util.ArrayList;

/*
 * Create an ArrayList and insert integers 1 through 10. 
 * Display the ArrayList. 
 * Add all the even numbers up and display the result.
 * Add all the odd numbers up and display the result.
 * Remove the prime numbers from the ArrayList and print out the remaining ArrayList.
 */
public class QuestionNineteen {
	/*
	 * Main Driver
	 */
	public static void main(String[] args) {
		ArrayList<Integer> nList = new ArrayList<Integer>(10);
		// add 1 - 100 into the list above
		for (int i = 1; i < 11; i++) {
			nList.add(i);
		}

		System.out.println("ArrayList: " + nList);
		int evenTotal = 0;
		int oddTotal = 0;
		// find the evens and odds
		for (int i : nList) {
			if (QuestionSix.isEven((int) i)) {
				evenTotal += i;
			} else {
				oddTotal += i;
			}
		}

		// remove the prime numbers
		for (int i = 0; i < nList.size(); i++) {
			if (QuestionNine.isPrime((int) nList.get(i))) {
				nList.remove(i);
				i = 0;
			}
		}

		System.out.println("The total of even numbers is " + evenTotal);
		System.out.println("The total of odd numbers is " + oddTotal);
		System.out.println("The list without primes is:" + nList);

	}

}
