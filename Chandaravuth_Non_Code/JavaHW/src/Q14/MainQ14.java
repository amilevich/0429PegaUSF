package Q14;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainQ14 {

	public static void main(String[] args) {
		Scanner keybord = new Scanner(System.in);
		System.out.println("Enter number 1: -> use to square root");
		System.out.println("Enter number 2: -> to print the DATE");
		System.out.println("Enter number 3: -> to use CASE 3");

		int n = keybord.nextInt();
		switchcase(n);

		// squareRoot(16);
		// printDate();
		// casethree();
	}

	public static void squareRoot(double n) {
		double result;

		result = Math.sqrt(n);
		System.out.println(result);

	}

	public static void printDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(dtf.format(ldt));

	}

	public static void casethree() {
		{
			String s = "I am learning Core Java";
			String[] s1 = s.split("Core");

			for (String s2 : s1) {
				System.out.println(s2);
			}

		}
	}

	public static void switchcase(int n) {
		switch (n) {
		case 1:
			Scanner input = new Scanner(System.in);
			System.out.println("Please input the number to find square-root");
			double num = input.nextDouble();
			squareRoot(num);
			break;
		case 2:
			System.out.print("current date is: ->");
			printDate();
			break;
		case 3:
			casethree();
			break;
		default:
			System.out.println("ERROR");

		}
	}

}
