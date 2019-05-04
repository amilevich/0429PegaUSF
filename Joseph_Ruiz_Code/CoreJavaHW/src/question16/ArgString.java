package question16;

// Name: ArgString.java
// Author: Joe Ruiz
// Date: 05/03/2019
// Argument string character counter

public class ArgString {

	public static void main(String[] args) {
		// Add all of the characters in the arguments and even spaces
		// but duplicate spaces may not all be counted
		int sum = 0;
		for (int i = 0; i <= args.length - 1; i++) {
			sum = sum + args[i].length();
			if (i != args.length - 1) {
				// Not at the end, add a space
				sum = sum + 1;
			}
		}
		System.out.println("The command line arguments contain " + sum + " characters");
	}

}
