package Q6;

import java.util.Scanner;

public class MainQ6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter Integer number to check EVEN or ODD number: ");
		int n = input.nextInt();

		checkEvenAndOddNumber(n);

	}

	public static void checkEvenAndOddNumber(int n) {
		while (n >= 2) {
			n = n - 2;
		}

		if (n == 0) {
			// System.out.println(n);
			System.out.println("EVEN");
		}

		else {
			// System.out.println(n);
			System.out.println("ODD");
		}

	}

}
