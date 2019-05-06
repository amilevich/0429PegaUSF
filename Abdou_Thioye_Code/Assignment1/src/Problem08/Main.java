package Problem08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
	// Declaring my array list and call it pal
	private static ArrayList<String> pal = new ArrayList<String>();

	// this is my palindromes method to look for them
	private static ArrayList<String> palindromes(ArrayList<String> list) {
		int comparsions, counter;

		// A for loop to go through the entire list it pass to
		for (String s : list) {
			// to check the number of the elements of the given string is Even or Odd
			if (s.length() % 2 == 0) {
				comparsions = s.length() / 2;
				counter = 0;

				for (int i = 0; i < comparsions; i++) {
					if (s.charAt(i) == s.charAt(s.length() - i - 1))
						counter++;

					if (counter == comparsions)
						pal.add(s);
				}
			} // end-if

			else {
				comparsions = (s.length() - 1) / 2;
				counter = 0;

				for (int j = 0; j < comparsions; j++) {
					if (s.charAt(j) == s.charAt(s.length() - j - 1))
						counter++;

					if (counter == comparsions)
						pal.add(s);
				}
			} // end-else

		} // end of for loop
		return pal;
	}// end-method

	public static void main(String[] args) {
		// Declare the array list and add elements the same time
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList("karan", "madam", "tom", "civic", "radar", "sexes",
				"jimmy", "kayak", "john", "refer", "billy", "did"));

//		try (BufferedWriter out = new BufferedWriter(new FileWriter("src/palindromes.txt"))) {
//			Iterator<String> iter = arr.iterator();
//
//			while (iter.hasNext())
//				out.write("\"" + iter.next() + "\", ");
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		System.out.println("ArrayList: " + arr);
		System.out.println("ArrayList palindromes: " + palindromes(arr));
	}
}