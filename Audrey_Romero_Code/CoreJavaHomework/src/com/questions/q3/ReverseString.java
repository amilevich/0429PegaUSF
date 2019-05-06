package com.questions.q3;
/**
 * This program reverses the order of characters in a String without using a
 * temporary variable, StringBuffer, or StringBuilder.
 * @author Audrey Romero
 *
 */
public class ReverseString {

	public static void main(String[] args) {
		String str = "Audrey Romero";
		System.out.println("Original String:\n" + str);
		/**
		 * A new String is created for each iteration of the loop using the same
		 * reference. By concatenating a series of substrings each time, the
		 * order of characters in the string will eventually be reversed.
		 */
		for (int i = 0; i < str.length(); i++) {
			str = str.substring(1, str.length() - i) +
				  str.substring(0, 1) +
			      str.substring(str.length() - i, str.length());
		}
		
		System.out.println("\nReversed:\n" + str);
		
	}

}
