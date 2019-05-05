package com.homework.one;

/*
 * Write a substring method that accepts a string str and an integer idx and 
 * returns the substring contained between 0 and idx-1 inclusive.  
 * Do NOT use any of the existing substring methods in the String, 
 * StringBuilder, or StringBuffer APIs.
 */
public class QuestionFive {
	/*
	 * Main Driver
	 */
	public static void main(String[] args) {
		String startString = "Mantis";
		String subString = substring(startString, 3);
		System.out.println(subString);
		System.out.println(startString.substring(3));
	}

	/*
	 * Method used to create my custom substring function
	 */
	public static String substring(String str, int idx) {
		//used to store the substring for returning
		String retVal = "";
		
		//could be a message instead saying not valid index
		if (idx < 0) {
			throw new StringIndexOutOfBoundsException(idx);
		}
		//loop through and create substring
		for (int i = 0; i < idx; i++) {
			retVal += str.charAt(i);
		}
		//return sub string
		return (String) retVal;

	}

}
