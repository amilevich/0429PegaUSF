package com.project0;

import java.util.Scanner;

public class WelcomePage {
	private static Scanner myObj;
	private static Scanner myObj_2;

	public static void Welcome(int x) {
		switch (x) {
		case 1:
			System.out.println("Hello !!!");
			System.out.println("___________________________________________");
			OpenAccount.openAccount();
			System.out.println("___________________________________________");
			System.out.println("Thank You for Your Registration ! ");
			System.out.println("Please Login to You Account");
			System.out.println("___________________________________________");
			LoginPage.login();
			InfoPage.infoPage();
			int y = 0;
			while (y < 5) {
				CustomerMenu.menu();
				myObj = new Scanner(System.in);
				y = myObj.nextInt();
				CustomerMenu.customerMenu(y);
			}
			break;
		case 2:
			System.out.println("Login");
			LoginPage.login();
			int k = 0;
			while (k < 5) {
				CustomerMenu.menu();
				myObj_2 = new Scanner(System.in);
				y = myObj_2.nextInt();
				CustomerMenu.customerMenu(k);
			}
			break;
		case 3:
			System.out.println("Exiting ...");
			break;
		}
	}
}
