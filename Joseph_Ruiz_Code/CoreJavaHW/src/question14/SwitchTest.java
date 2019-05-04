package question14;

// Name: SwitchTest.java
// Author: Joe Ruiz
// Date: 05/02/2019
// Some things using a switch

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class SwitchTest {
	
	public static String currentDate() {
		// There does not seem to be a function that isn't deprecated
		// that can print out a readable date easily
		StringBuilder sb = new StringBuilder();
		Calendar now = Calendar.getInstance();
		// so use another switch to add the current month
		switch (now.get(Calendar.MONTH)) {
		case Calendar.JANUARY:
			sb.append("January");
			break;
		case Calendar.FEBRUARY:
			sb.append("February");
			break;
		case Calendar.MARCH:
			sb.append("March");
			break;
		case Calendar.APRIL:
			sb.append("April");
			break;
		case Calendar.MAY:
			sb.append("May");
			break;
		case Calendar.JUNE:
			sb.append("June");
			break;
		case Calendar.JULY:
			sb.append("July");
			break;
		case Calendar.AUGUST:
			sb.append("August");
			break;
		case Calendar.SEPTEMBER:
			sb.append("September");
			break;
		case Calendar.OCTOBER:
			sb.append("October");
			break;
		case Calendar.NOVEMBER:
			sb.append("November");
			break;
		case Calendar.DECEMBER:
			sb.append("December");
			break;
		}
		// Add the day
		sb.append(' ');
		sb.append(now.get(Calendar.DAY_OF_MONTH));
		// And add the year
		sb.append(", ");
		sb.append(now.get(Calendar.YEAR));
		// Return the String made by the StringBuilder
		return sb.toString();
	}

	public static void main(String[] args) {
		int num;
		double a;
		String testString = "I am learning Core Java";
		// Open the scanner and read input but leave open for square root case
		Scanner input = new Scanner(System.in);
		System.out.println("1: Find the square root of a number");
		System.out.println("2: Display today’s date");
		System.out.println("3: String array test");
		System.out.print("Select an option: ");
		num = input.nextInt();
		// Go to the correct case based on input
		switch (num) {
		case 1:
			// Read input (as a double) and print the square root
			System.out.print("Enter a number: ");
			a = input.nextDouble();
			System.out.println("The square root of " + a + " is " + Math.sqrt(a));
			break;
		case 2:
			// See currentDate() method above
			System.out.print("Today's date is " + currentDate());
			break;
		case 3:
			// Split a String into a String[] using split()
			System.out.println(testString);
			String[] testArray = testString.split(" ");
			System.out.println(Arrays.toString(testArray));
			break;
		default:
			// They entered something other than 1-3
			System.out.println("Invalid option " + num);
		}
		// Now close the scanner
		input.close();
	}

}
