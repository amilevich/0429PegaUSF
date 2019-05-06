package hw1.q8;

import java.util.ArrayList;

public class Question8 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> palindromesList = new ArrayList<String>();
		list.add("karan");
		list.add("madam");
		list.add("tom");
		list.add("civic");
		list.add("radar");
		list.add("sexes");
		list.add("jimmy");
		list.add("kayak");
		list.add("john");
		list.add("refer");
		list.add("billy");
		list.add("did");

		for (String s : list) {
			boolean palindrome = isPalindrome(s);
			if (palindrome) {
				palindromesList.add(s);
			}
		}
		System.out.println("List: " + list);
		System.out.println("Palindrome list: " + palindromesList);
	}

	public static boolean isPalindrome(String str) {
		if (str == null || str.isEmpty())
			return false;
		return new StringBuilder(str).reverse().toString().equals(str);
	}

}