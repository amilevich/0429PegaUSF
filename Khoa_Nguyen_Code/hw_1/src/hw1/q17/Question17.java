package hw1.q17;

import java.util.Scanner;

class Question17 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);

		System.out.println("Please Enter Your Principal, Rate of Interest and Time: ");

		double principal = myObj.nextDouble();
		double rate = myObj.nextDouble();
		double time = myObj.nextDouble();

		Double interest = principal * rate * time;

		System.out.println("Your principal: " + principal);
		System.out.println("Your rate of interest: " + rate);
		System.out.println("Your number of years: " + time);
		System.out.println("Your interest: " + interest);
	};
}