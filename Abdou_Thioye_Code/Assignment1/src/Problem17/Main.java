package Problem17;

import java.util.Scanner;

public class Main {

	private static double interest;

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {

			// prompt user, process input
			System.out.println("Enter the principal: ");
			double principal = scan.nextDouble();

			System.out.println("Enter the rate: ");
			final float rate = scan.nextFloat();

			System.out.println("Enter time (in years): ");
			float time = scan.nextFloat();
			interest = principal * rate * time;
		}

		System.out.printf("simple interest on the principal is: %.2f", interest);

	}

}
