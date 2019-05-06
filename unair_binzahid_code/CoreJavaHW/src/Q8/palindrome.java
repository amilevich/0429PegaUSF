package Q8;

import java.util.ArrayList;

public class palindrome {

	public static void main(String[] args) {

		ArrayList<String> myList = new ArrayList<String>(); //creating array list for names
		ArrayList<String> yesPalin = new ArrayList<String>(); //creating array list to place palindromes
		ArrayList<String> noPalin = new ArrayList<String>(); //creating array list to place non palindromes
		myList.add("karan"); //adding all names to list
		myList.add("madam");
		myList.add("tom");
		myList.add("civic");
		myList.add("radar");
		myList.add("sexes");
		myList.add("jimmy");
		myList.add("kayak");
		myList.add("john");
		myList.add("refer");
		myList.add("billy");
		myList.add("did");

		for (String palin : myList) {

			boolean palindrome = isPalindrome(palin); //creating a boolean object to check if palindrome or not

			if (palindrome) { //if it is palindrome (true), adds it to yes list
				
				yesPalin.add(palin);
			} else {
				// adds the non palindrome to the no list
				noPalin.add(palin);
			}
		}
		// print out the list to the console
		System.out.println("Original List: ");
		System.out.println(myList);

		System.out.println("Palindrome list: ");
		System.out.print(yesPalin);

	}

	public static boolean isPalindrome(String value) { //boolean object created above defined here
		if (value == null || value.isEmpty())
			return false;

		return new StringBuilder(value).reverse().toString().equals(value);
	}	//if the reverse of the string char are same then it's true

}