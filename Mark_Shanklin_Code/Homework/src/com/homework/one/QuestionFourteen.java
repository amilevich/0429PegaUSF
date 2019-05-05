package com.homework.one;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Write a program that demonstrates the switch case. 
 * Implement the following functionalities in the cases:
 * Case 1: Find the square root of a number using the Math class method. 
 * Case 2: Display today’s date.
 * Case 3: Split the following string and store it in a string array. 
 *		“I am learning Core Java”
 */
public class QuestionFourteen {

	public static void main(String[] args) {
		myMethod(1);
		myMethod(2);
		myMethod(3);
	}

	public static void myMethod(int num) {
		switch (num) {
		case 1:
			System.out.println("case " + num + ":");
			System.out.println("The sqrt of " + 9 + " is " + Math.sqrt(9));
			break;
		case 2:
			System.out.println("case " + num + ":");
			todaysDate();
			break;
		case 3:
			// given string
			String val = "I am learning Core Java";
			System.out.println("case " + num + ":");
			splitString(val);
			break;

		default:
			break;
		}
	}

	/*
	 * Method used to split and display a string
	 */
	public static void splitString(String val) {
		// fill array with string split by spaces
		String[] strArr = val.split(" ");
		// print array
		System.out.println("Array: ");
		for (String a : strArr) {
			System.out.println("[" + a + "]");
		}
	}

	/*
	 * Method used to display todays date
	 */
	public static void todaysDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
	}

}
