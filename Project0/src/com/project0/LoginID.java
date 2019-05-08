package com.project0;

import java.util.Scanner;

public class LoginID {
	public static String loginID() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter User ID: ");
		String x = myObj.nextLine();
		return x;
	}
}
