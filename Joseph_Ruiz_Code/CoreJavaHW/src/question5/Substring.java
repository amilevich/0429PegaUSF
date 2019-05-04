package question5;

// Name: Substring.java
// Author: Joe Ruiz
// Date: 05/01/2019
// Get a portion of a string

import java.util.Scanner;

public class Substring {
	
	public static String substring(String str, int idx) {
		// Make a StringBuilder object
		StringBuilder out = new StringBuilder();
		for (int i = 0; i <= idx - 1; i++) {
			// Copy each character up to the end index
			out.append(str.charAt(i));
		}
		// Return the result as a String
		return out.toString();
	}

	public static void main(String[] args) {
		int num;
		String s, s2;
		// open the Scanner, accept input and close the Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		s = input.nextLine();
		System.out.print("Enter an ending index: ");
		num = input.nextInt();
		input.close();
		// make sure the index isn't too big
		if (num > s.length()) {
			System.out.println("Index " + num + " past end of string index " + s.length());
			System.out.println("Returning whole string instead");
			// (that is instead of causing an Exception)
			// Do substring but it will return the whole string
			s2 = substring(s, s.length());
		} else {
			// Do substring method
			s2 = substring(s, num);
		}
		// Print the output
		System.out.println(s2);
	}

}
