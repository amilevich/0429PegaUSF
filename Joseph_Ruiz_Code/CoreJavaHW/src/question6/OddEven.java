package question6;

// Name: OddEven.java
// Author: Joe Ruiz
// Date: 05/01/2019
// Find if a number is odd or even

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int num, out;
		boolean even;
		// Open the Scanner, accept input and close it
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		num = input.nextInt();
		input.close();
		// Copy the entered value for output
		out = num;
		// Absolute value to remove negatives
		num = Math.abs(out);
		while (true) {
			if (num == 0) {
				even = true;
				break;
			} else if (num == 1) {
				even = false;
				break;
			}
			// Subtract 2 until we reach 0 (even) or 1 (odd)
			num = num - 2;
		}
		// Print if odd, even or zero
		if (out == 0) {
			System.out.println(out + " is zero");
		} else if (even) {
			System.out.println(out + " is even");
		} else {
			System.out.println(out + " is odd");
		}
	}

}
