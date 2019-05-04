package question9;

// Name: PrimeArrayList.java
// Author: Joe Ruiz
// Date: 05/03/2019
// Prime number ArrayList program

import java.util.ArrayList;

public class PrimeArrayList {
	
	public static boolean isPrime(int num) {
		// Test for prime numbers by dividing by every number from 2 to n/2
		// https://stackoverflow.com/questions/14650360/very-simple-prime-number-test-i-think-im-not-understanding-the-for-loop
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				// No remainder, can be divided by something other than 1 and n
				return false;
			}
		}
		// There was always a remainder
		return true;
	}

	public static void main(String[] args) {
		// Create and fill the ArrayList
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i <= 99; i++) {
			a.add(i + 1);
		}
		// Test each number and print prime numbers
		for (Integer j : a) {
			if (isPrime(j)) {
				System.out.println(j);
			}
		}
	}

}
