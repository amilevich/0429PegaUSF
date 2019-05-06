package Problem06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.print("Please Inter a number to find Wheither is Odd or Even number: ");
		int num = reader.nextInt(); // Scans the next token of the input as an integer.
		// close the reader once finished
		reader.close();

		if (isEven(num) == 0)
			System.out.print("This number is: Even");
		else
			System.out.print("This Number is: Odd");

	}

	// Returns 0 if n
	// is even, else odd
	static int isEven(int n) {

		// n&1 is 1, then
		// odd, else even
		return (n & 1);
	}
}