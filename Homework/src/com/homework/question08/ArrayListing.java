package com.homework.question08;

import java.util.ArrayList;
import java.util.List;

public class ArrayListing {

	//a method that determines if a word is a palindrome or not
	public static boolean stringIsAPalindrome(String value) {

		if (value == null || value.isEmpty()) {
			return false;
		}

		return new StringBuilder(value).reverse().toString().equals(value);
	}

	public static void main(String[] args) {

		//three arraylists are created: the first includes all words, the second only features palindromes, and the third houses all other words
		List<String> aList = new ArrayList<>();
		List<String> pList = new ArrayList<>();
		List<String> rList = new ArrayList<>();

		aList.add("karan");
		aList.add("madam");
		aList.add("tom");
		aList.add("civic");
		aList.add("radar");
		aList.add("sexes");
		aList.add("jimmy");
		aList.add("kayak");
		aList.add("john");
		aList.add("refer");
		aList.add("billy");
		aList.add("did");

		System.out.println("List of words: " + aList);

		
		//this for loop checks for palindromes and includes a boolean to determine whether a word is a palindrome
		for (String palinDrome : aList) {

			boolean isPalindrome = stringIsAPalindrome(palinDrome);

			
			//palindromes are added to the palindrome arraylist
			if (isPalindrome) {

				pList.add(palinDrome);

			} else {
				rList.add(palinDrome);
			}
		}
		
		System.out.println("Palindromes: " + pList);

	}

}
