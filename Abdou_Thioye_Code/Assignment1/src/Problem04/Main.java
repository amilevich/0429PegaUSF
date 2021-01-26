package Problem04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.print("Please Inter a number to find its factorial: ");

		int num = reader.nextInt(); // Scans the next token of the input as an integer.
		// close the reader once finished
		reader.close();
		System.out.print("The facctoral of the number you have entered is:" + "-->'");
		System.out.print(factorial(num));
		System.out.println("'");

	}

	public static int factorial(int n) {
		// TODO Auto-generated method stub
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}
}