package question3;

// Name: StringReverse.java
// Author: Joe Ruiz
// Date: 04/30/2019
// Reverse an input string

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		String s;
		Scanner input = new Scanner(System.in);	// Open the Scanner
		System.out.print("Enter a string: ");	// Prompt for input string
		s = input.nextLine();					// Read the string, using nextLine to allow spaces
		input.close();							// Close the scanner
		for (int i = s.length() - 1; i >= 0; i--) {
			// Print each character in the reverse order starting at the end
			System.out.print(s.charAt(i));
		}
	}

}
