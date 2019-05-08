package com.project0;

import java.util.Scanner;

public class Main {

	private static Scanner myObj;

	public static void main(String[] args) {
		
	// Introduction - Welcome Page 
		System.out.println("Welcome to ABCDEF Bank");
		System.out.println("*******************************************");
		System.out.println("Press 1 - Apply for New Bank Account");
		System.out.println("Press 2 - Login to Bank Account");
		System.out.println("Press 3 - Exit");
		System.out.println("*******************************************");
		myObj = new Scanner(System.in);
		Integer optionWelcomePage = myObj.nextInt();
		WelcomePage.Welcome(optionWelcomePage);
		ObjectIO.objectIO();


	}
}
