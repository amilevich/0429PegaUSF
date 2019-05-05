package com.homework.one;

import java.util.ArrayList;

/*
 * Create an ArrayList which stores numbers 
 * from 1 to 100 and prints out all the prime numbers to the console.
 */
public class QuestionNine {
	public static void main(String[] args) {
		ArrayList<Integer> nList = new ArrayList<Integer>(100);
		//add 1 - 100 into the list above
		for (int i = 1; i < 101; i++) {
			nList.add(i);
		}

		// loop to check each element in list and see if it is prime
		for (Integer i : nList) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}

	}

	/*
	 * Method used to check if number is Prime
	 */
	public static boolean isPrime(int num) {
		boolean retVal = false;
		// 0 and 1 are not prime
		if (num > 1) {
			// a number is prime if it is divisible evenly by itself and 1 only
			if (num % num == 0) {
				retVal = true;
			}
			// you have seen if it is divisible by itself now checking that
			// it isn't divisible by anything else up to itself (exclusive)
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					retVal = false;
					break;
				}
			}
		}

		return retVal;
	}

}
