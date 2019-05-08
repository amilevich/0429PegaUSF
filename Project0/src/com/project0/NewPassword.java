package com.project0;

import java.util.Scanner;

public class NewPassword {
	public static String createPassword() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Your Password: ");
		String userPassword = myObj.nextLine();
		return userPassword;
	}
}
