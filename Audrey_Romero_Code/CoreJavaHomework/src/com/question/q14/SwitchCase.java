package com.question.q14;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
/**
 * This program demonstrates the switch case. The user is prompted to enter a number between
 * 1 and 3. Each case has a unique outcome, depending on which number the user chooses.
 * @author Audrey Romero
 *
 */
public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate todaysDate = LocalDate.now();
		String str = "I am learning Core Java";
		
		do {
		System.out.print("SWITCH DEMO:\n\n" +
		                   "Enter a 1, 2, or 3 --> ");
		input = scan.nextInt();
		System.out.println();
		} while (input > 3 | input < 1); // Prompt repeats until user enters a 1, 2, or 3.
		
		// Example of a switch
		switch (input) {
		// If user enters 1 - Calculates the square root of a number.
		case 1: 
			System.out.println("The square root of 49 is: " + Math.sqrt(49));
			break;
		// If user enters 2 - Prints to the console today's date.
		case 2:	
			System.out.println("Today's date is: " + dtf.format(todaysDate));
			break;
		// If user enters 3 - Splits a string and store it in a string array.
		case 3: 
			String splitAt = " "; // Indicates where to split the string.
			String[] strArray = str.split(splitAt);
			
			for (String s : strArray) {
			    System.out.println(s);
			}
			break;
		}
		
		scan.close();

	}

}
