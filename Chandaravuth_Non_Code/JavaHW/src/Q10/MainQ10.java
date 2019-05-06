package Q10;

import java.util.Scanner;

public class MainQ10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your first number");
		double firstNumber = input.nextDouble();
		System.out.println("Please enter your Second number");
		double secNumber = input.nextDouble();

		findMinimumNumber(firstNumber, secNumber);

	}

	public static void findMinimumNumber(double first, double sec) {
		double result = (first < sec) ? first : sec;

		System.out.println("The minimum number between " + first + " and " + sec + " are: ***" + result + "***");

	}

}
