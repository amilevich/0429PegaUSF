package question4;

// Name: Factorial.java
// Author: Joe Ruiz
// Date: 04/30/2019
// Factorial calculator program

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Factorial program finding n! (n factorial)
		int n;
		// Set starting product to 1
		int product = 1;
		// Open Scanner, prompt for and read the input, and close the Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		n = input.nextInt();
		input.close();
		// Calculate the factorial
		if (n > 0) {
			// Positive number n! = 1*2*...*n-1*n
			for (int i = 1; i <= n; i++) {
				product = product * i;
			}
			System.out.println(n + "! = " + product);
		} else if (n == 0) {
			// Zero, we already set product as 1 but doing it again because 0! = 1
			product = 1;
			System.out.println(n + "! = " + product);
		} else {
			// Negative number factorials are undefined
			System.out.println("Number must be positive");
		}
	}

}
