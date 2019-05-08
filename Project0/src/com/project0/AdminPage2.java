package com.project0;

import java.util.Scanner;

public class AdminPage2 {
	private static Scanner myObj;
	private static Scanner myObj_2;

	public static void welcome(int x) {
		switch (x) {
		case 1:
			System.out.println("Hello !!!");
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
