package com.questions.q17;
import java.util.Scanner;
/**
 * This program is a simple interest calculator. Accepts user input with Scanner, user
 * specifies principal balance, interest rate, and the term in years. Calculates the result
 * and prints to the console.
 * @author Audrey Romero
 *
 */
public class SimpleInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double interest, principal, rate;
		int time;
		
		System.out.print("AUDREY'S SIMPLE INTEREST CALCULATOR\n" +
				         "\nEnter the principal --> ");
		principal = input.nextDouble(); // Obtains and stores double value from user input
		
		System.out.print("\nEnter the interest rate --> ");
		rate = input.nextDouble();
		
		System.out.print("\nEnter the number of years --> ");
		time = input.nextInt(); // Obtains and stores integer value from user input
		
		interest = principal * rate * time; // Calculates result based on user input
		
		/**
		 * Prints formatted result for readability: <code>%,.2f</code> denotes the result 
		 * will be a floating-point value with comma separators and 2 decimal places.
		 */
		System.out.printf("------------------------------------" +
		                 "\nThe interest is: $%,.2f", interest);
		
		input.close(); //Closes the Scanner before program terminates.
		
	}

}
