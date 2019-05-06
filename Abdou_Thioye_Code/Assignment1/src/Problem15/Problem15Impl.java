package Problem15;

import java.util.Scanner;

public class Problem15Impl {
	public void addition()
	{

		int nOne, nTwo;
		Scanner reader = new Scanner(System.in);

		System.out.println("Addition");

		System.out.print("\nFirst Number: ");
		nOne = reader.nextInt();

		System.out.print("\nSecond Number: ");
		nTwo = reader.nextInt();

		reader.close();
		System.out.println("\nSum: " + nOne + " + " + nTwo + " = " + (nOne + nTwo));
	}

	public void subtraction() {
		int nOne, nTwo;
		Scanner reader = new Scanner(System.in);

		System.out.println("Subtraction");

		System.out.print("\nFirst Number: ");
		nOne = reader.nextInt();

		System.out.print("\nSecond Number: ");
		nTwo = reader.nextInt();

		reader.close();
		System.out.println("\nSum: " + nOne + " - " + nTwo + " = " + (nOne - nTwo));
	}

	public void division() {
		double nOne, nTwo;
		Scanner reader = new Scanner(System.in);

		System.out.println("Division");

		System.out.print("\nFirst Number: ");
		nOne = reader.nextDouble();

		System.out.print("\nSecond Number: ");
		nTwo = reader.nextDouble();

		reader.close();
		System.out.println("\nSum: " + nOne + " / " + nTwo + " = " + (nOne / nTwo));
	}

	public void multiplication() {
		double nOne, nTwo;
		Scanner reader = new Scanner(System.in);

		System.out.println("Multiplication");

		System.out.print("\nFirst Number: ");
		nOne = reader.nextDouble();

		System.out.print("\nSecond Number: ");
		nTwo = reader.nextDouble();

		reader.close();
		System.out.println("\nSum: " + nOne + " x " + nTwo + " = " + (nOne * nTwo));
	}

}


