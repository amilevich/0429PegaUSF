package com.project0;

import java.util.Scanner;

public class NewBalance {
	public static Double insertBalance() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Your Deposit Money: ");
		Double userBalance = myObj.nextDouble();
		Information.userBalance = userBalance;
		return userBalance;
	}
}
