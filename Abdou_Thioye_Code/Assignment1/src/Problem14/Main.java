package Problem14;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void doCase(int i) {
		// throw new Exception();

		switch (i) {
		case 1:
			try (Scanner reader = new Scanner(System.in)) {
				System.out.println("\nEnter a number to find its squareroot: ");
				double num = reader.nextFloat();
				Double squareroot = Math.sqrt(num);
				System.out.println("The square root of " + num + " is: " + squareroot);
			}
			break;
		case 2:

			Date today = Calendar.getInstance().getTime();
			System.out.println("\nToday's date is: " + today);
			break;
		case 3:

			System.out.println("\nI am Learning core java");

			break;
		default:
			System.out.println("\nYou Have entered a Wrong Number");
		}

	}

	public static void main(String[] args) {
		
//		int n ;
//		try (Scanner reader = new Scanner(System.in)) {
//
//			System.out.print("Please enter number 1, 2, or 3 to see case: ");
//			 n = reader.nextInt();
//			 }
//
//		 while (n == 1) {
		try (Scanner reader = new Scanner(System.in)) {

			System.out.print("Please enter number 1, 2, or 3 to see case: ");
			int num = reader.nextInt(); // Scans the next token of the input as an integer.
			doCase(num);
			System.out.println();
			//}
		}

	}

}