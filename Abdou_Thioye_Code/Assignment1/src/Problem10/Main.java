package Problem10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.print("Please Inter two numbers to find which one is smaller: ");

		int num1 = reader.nextInt(); // Scans the next token of the input as an integer.
		int num2 = reader.nextInt();
		// close the reader once finished
		reader.close();

		// variable declaration and assign the inputs to them
		int n1 = num1;
		int n2 = num2;
		int min;

		// The smallest number check_up among the two
		min = (n1 < n2) ? n1 : n2;

		// Print the smallest number
		System.out.println("The smallest number between '" + n1 + "' and '" + n2 + "' is -->'" + min + "'. ");

	}

}
