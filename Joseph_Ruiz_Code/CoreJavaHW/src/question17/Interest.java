package question17;

// Name: Interest.java
// Author: Joe Ruiz
// Date: 05/03/2019
// simple interest calculator

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		int t;
		double i, p, r;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the principal: ");
		p = input.nextDouble();
		System.out.print("Enter the interest rate: ");
		r = input.nextDouble();
		System.out.print("Enter the number of years: ");
		t = input.nextInt();
		input.close();
		i = p * r * t;
		System.out.printf("The interest is $%.2f\n", i);
	}

}
