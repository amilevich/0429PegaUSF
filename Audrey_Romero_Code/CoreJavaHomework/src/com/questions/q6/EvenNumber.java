package com.questions.q6;
import java.util.Scanner;
/**
 * This program checks a number input by the user and prints to the console
 * whether it is even or odd without using the modulus operator.
 * @author Audge
 *
 */
public class EvenNumber {
	/**
	 * Prompts user to enter any integer and divides the integer by two. If the 
	 * integer is odd, the decimal portion of the result is truncated. The dividend
	 * is then multiplied by 2. If the result is equal to the user's input, then
	 * the number must be even, otherwise the number must be odd.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter any integer --> ");
		int number = input.nextInt();
		int dividend = number;
		
		dividend = number / 2;
		
		dividend *= 2;
		
		if (dividend == number) {
			System.out.println("The number " + number + " is even");
		} else {
			System.out.println("The number " + number + " is odd");
		}
		
		input.close();
	}

}
