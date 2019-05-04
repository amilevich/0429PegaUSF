package question10;

// Name: MinimumNum.java
// Author: Joe Ruiz
// Date: 05/03/2019
// Don't do this please

import java.util.Scanner;

public class MinimumNum {

	public static void main(String[] args) {
		// Open Scanner, read and store input and close it
		int num1, num2, min;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		num1 = input.nextInt();
		System.out.print("Enter a second number: ");
		num2 = input.nextInt();
		input.close();
		// Test for the minimum using syntax I was told NOT to use
		min = (num1 < num2) ? num1 : num2;
		// Then print the value
		System.out.println("The minimum is " + min);
	}

}
