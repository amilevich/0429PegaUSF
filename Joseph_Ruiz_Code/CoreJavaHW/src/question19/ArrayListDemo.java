package question19;

// Name: ArrayListDemo.java
// Author: Joe Ruiz
// Date: 05/03/2019
// ArrayList demo program

import java.util.ArrayList;

public class ArrayListDemo {
	
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
		int sum1 = 0;
		int sum2 = 0;
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i <= 9; i++) {
			a.add(i + 1);
		}
		System.out.println(a);
		// Test for even numbers and add them
		for (Integer j : a) {
			if (j % 2 == 0) {
				sum1 = sum1 + j;
			}
		}
		System.out.println("The sum of the even numbers is " + sum1);
		// Test for odd numbers and add them
		for (Integer k : a) {
			if (k % 2 != 0) {
				sum2 = sum2 + k;
			}
		}
		System.out.println("The sum of the odd numbers is " + sum2);
		// Test for prime numbers and remove them from the ArrayList
		// This loop is used because a.size() is updated each time
		for (int i = 0; i <= a.size() - 1; i++) {
			if (isPrime(a.get(i))) {
				a.remove(i);
			}
		}
		System.out.println(a);
	}

}
