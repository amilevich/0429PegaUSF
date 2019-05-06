package Problem05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int idx = 4;
		String str = "Hello";
		System.out.println("original String: " + str);
		String sub = SubString(str, idx);
		System.out.println(
				"This is the substring: " + sub + " (substring contained between 0 and " + idx + "-1 inclusive)");
	}

	public static String SubString(String str, int idx) {
		// declare a substring that is the length of the index specified
		char[] subString = new char[idx];

		// iterate till you hit the index
		for (int i = 0; i <= idx - 1; i++) {
			// iterate through the string and assign the character till idx-1 to the
			// substring character array
			subString[i] = str.charAt(i);
		}
		// convert the subString character array to a string
		String subStr = new String(subString);
		// return the substring
		return subStr;
	}
}
