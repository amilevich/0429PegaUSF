package com.questions.q18;
/**
 * Class implements abstract methods inherited from AbstractMethods.
 * @author Audrey Romero
 *
 */
public class MyImplementations extends AbstractMethods {
	/**
	 * Checks all characters in a string for uppercase letters, if uppercase letters
	 * are present, returns true. Returns false if not.
	 */
	@Override
	public boolean containsUppercase(String str) {	
		for (int i = 0; i < str.length(); i++) {
			// Checks for ASCII character values of uppercase letters in the string
			if (str.charAt(i) >= 65 & str.charAt(i) <= 90) {
				return true;
			}
		}
		return false;
	}
	
    /**
     * Converts the characters in a string to uppercase and returns the result.
     */
	@Override
	public String convertToUppercase(String str) {
		return str.toUpperCase();
	}
    
	/**
	 * Converts the string into an integer value of base 32, adds 10, and prints 
	 * the result.
	 */
	@Override
	public void stringToInt(String str) {
		int output = Integer.parseInt(str, 32);
		System.out.println(output + 10);
	}
	
	
}
