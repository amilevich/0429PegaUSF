package question8;

// Name: Palindrome.java
// Author: Joe Ruiz
// Date: 05/01/2019
// Look at some words and find palindromes

import java.util.ArrayList;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		// Create a StringBuilder, reverse the string and compare
		// (this is probably not the fastest way to do any of this)
		boolean out;
		String str2;
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			// Append each character in the reverse order starting at the end
			sb.append(str.charAt(i));
		}
		str2 = sb.toString();  // convert the StringBuilder contents to a String
		// compare
		if (str.equals(str2)) {
			out = true;
		} else {
			out = false;
		}
		return out;
	}

	public static void main(String[] args) {
		// “karan”, “madam”, ”tom”, “civic”, “radar”, “sexes”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		// Add each element
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
		// Compare all of them
		for (String s : list) {
			if (isPalindrome(s)) {
				list2.add(s);
			}
		}
		// Print the lists
		System.out.println(list);
		System.out.println(list2);
	}

}
