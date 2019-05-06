package com.questions.q8;
import java.util.ArrayList;
/**
 * This program creates a new array of strings and stores them in an arrayList
 * <code>words</code>. Each string is then checked if it is a palindrome. If the 
 * string is a palindrome, it is stored in <code>palindrome</code>. All elements
 * of <code>palindrome</code> are then printed to the console.
 * @author Audge
 *
 */
public class Palindromes {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<String> palindrome = new ArrayList<String>();
		String data[] = {"karan", "madam", "tom", "civic", "radar", 
				              "sexes", "jimmy", "kayak", "john",  "refer",
				              "billy", "did"};
		
		// Adds value at each index in data[] to the words ArrayList
		for (int i = 0; i < data.length; i++) {
			words.add(data[i]);
		}
		
		// Checks each element in the words ArrayList for palindromes.
		for (int i = 0; i < words.size(); i++) {
			if(isPalindrome(words.get(i))) { // method call checks if the word is a palindrome
				palindrome.add(words.get(i)); // If the word is a palindrome, add to palindrome ArrayList 
			}
		}
		
		System.out.println(palindrome.toString()); // Output
	}
    
	/*
	 * 
	 * This method tests the equality of two characters in the String, moving in opposite directions
	 * in the index. If all character pairs are equal, the String must be a palindrome.
	 * @param s    A string value to be tested
	 */
	public static boolean isPalindrome(String s) {
		    int i = 0;
			int j = s.length() - 1;
			
			while (i < s.length()) {
			    if (s.charAt(i) != s.charAt(j)) {
				    return false;
		        }
			    i++;
			    j--;
			}
		return true;
	}
}


