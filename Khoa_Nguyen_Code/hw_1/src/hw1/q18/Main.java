package hw1.q18;

import java.util.Scanner;

public class Main extends Question18 {

	public Main(String myString) {
		super(myString);
	}

	public static void main(String[] args) {
		String input;
		Question18 userInput;
		Scanner one = new Scanner(System.in);
		System.out.println("Enter String: ");
		input = one.nextLine();
		userInput = new Question18(input);
		boolean checkUpper = userInput.isUpperCase();
		if (checkUpper) {
			System.out.println(input + " Have Uppercase Letters");
		} else {
			System.out.println(input + " Don't Have Uppercase Letters");
		}
		String toUpper = userInput.convertToUpper();
		System.out.println("To UpperCase: " + toUpper);

		int addTen = userInput.convertToInt();
		System.out.println(input + " + 10 = " + addTen);
	}

}