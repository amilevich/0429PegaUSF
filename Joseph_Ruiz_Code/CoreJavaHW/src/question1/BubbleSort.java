package question1;

// Name: BubbleSort.java
// Author: Joe Ruiz
// Date: 04/30/2019
// A Bubble Sort implementation

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// The array contains 1,0,5,6,3,2,3,7,9,8,4 in that order
		int[] a = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4};
		int temp;	// temp int variable used for swap
		boolean s;	// boolean used to mark swaps
		System.out.println("Bubble sort");
		System.out.println("Before: " + Arrays.toString(a));			// format and print BEFORE
		do {
			s = false;									// make this false
			for (int i = 1; i <= a.length - 1; i++) {	// look at each element
				if (a[i - 1] > a[i]) {					// they are out of order
					temp = a[i];						// swap them
					a[i] = a[i - 1];
					a[i - 1] = temp;
					s = true;							// mark this as true
				}
			}											// go to the next element
		} while (s);									// end when there are no more swaps
		System.out.println("After:  " + Arrays.toString(a));			// format and print AFTER
	}

}
