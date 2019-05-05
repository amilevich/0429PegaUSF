package com.homework.one;

/*
 * Reverse a string without using a temporary variable.  
 * Do NOT use reverse() in the StringBuffer or the StringBuilder APIs.
 */
public class QuestionThree {
	// main driver
	public static void main(String[] args) {
		// create variable named reverseThis of type String with string literal content
		// of "Reverse!!"
		String reverseThis = "Reverse!!";

		// set length to length of reverseThis String
		int length = reverseThis.length();

		// start a zero and go to length of string
		for (int i = 0; i < length; i++) {
			reverseThis = reverseThis.substring(1, length - i) // copy second through last minus i
					+ reverseThis.substring(0, 1) // copy first element
					+ reverseThis.substring(length - i, length); // copy last minus i through last
		}
		// print out to console
		System.out.println("Reverse of entered string \"Reverse!!\" is: " + reverseThis);
	}

	/*
	 * Created to use for Question 8
	 */
	public static String reverseString(String str) {

		// temp used to keep the string taken in different the the one returned(for
		// question 8)
		String reverseThis = str;

		int length = reverseThis.length();

		// start a zero and go to length of string
		for (int i = 0; i < length; i++) {
			reverseThis = reverseThis.substring(1, length - i) // copy second through last minus i
					+ reverseThis.substring(0, 1) // copy first element
					+ reverseThis.substring(length - i, length); // copy last minus i through last
		}
		return reverseThis;
	}

}
