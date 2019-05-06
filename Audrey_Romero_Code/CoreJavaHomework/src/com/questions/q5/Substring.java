package com.questions.q5;
/**
 * This program is a demonstration of my substring method. This program does not utilize
 * any existing substring methods from String, StringBuilder, or StringBuffer.
 * @author Audrey Romero
 *
 */
public class Substring {
	/**
	 * Stores a String in a character array, and builds a new string from index 0 to
	 * the integer value parameter.
	 * @param str    Original String to build the substring from
	 * @param idx    The end index of the substring non-inclusive
	 * @return       The resulting substring.
	 */
	public static String substring(String str, int idx) {
		char[] contents = str.toCharArray();
		String sub = "";
		
		for (int i = 0; i <= idx - 1; i++) {
			sub += contents[i]; // Concatenates a character to the new string one at a time.
		}
		
		return sub;
	}

	public static void main(String[] args) {
		String data = "This is a test of my substring method";
		int index = 13;
		
		System.out.println("Original String:\n" + data);
		
		System.out.println("\nMy substring:\n" + substring(data, index));

	}

}
