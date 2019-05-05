package com.homework.one;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Write a program that stores the following strings in an ArrayList and 
 * saves all the palindromes in another ArrayList.
 * “karan”, “madam”, ”tom”, “civic”, “radar”, “sexes”, “jimmy”, “kayak”, 
 * “john”,  “refer”, “billy”, “did”
 */
public class QuestionEight {

	/*
	 * Main Driver
	 */
	public static void main(String[] args) {
		// check and copy list palindromes
		savePalindromes(strList, paliList);
		// print lists
		printLists(strList, paliList);

	}

	// the initial list given in the home question
	static ArrayList<String> strList = new ArrayList<String>(Arrays.asList("Karan", "madam", "tom", "civic", "radar",
			"sexes", "jimmy", "kayak", "john", "refer", "billy", "did")

	);

	// used to store the palindromes
	static ArrayList<String> paliList = new ArrayList<String>(12);

	/*
	 * Method used to print out the lists
	 */
	public static void printLists(ArrayList<String> listOne, ArrayList<String> listTwo) {
		System.out.println("String Array List:\n" + listOne);
		System.out.println("Palindrome Array List:\n" + listTwo);
	}

	/*
	 * Method used to take palindromes from one array list and save them in another
	 * array list
	 */
	public static void savePalindromes(ArrayList<String> listOne, ArrayList<String> listTwo) {
		for (String str : listOne) {
			// use a method in Question three to compare strings
			if (QuestionThree.reverseString(str).equals(str)) {
				paliList.add(str);
			}
		}
	}

}
