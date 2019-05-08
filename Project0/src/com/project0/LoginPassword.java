package com.project0;

import java.util.Scanner;

public class LoginPassword {
	public static String loginPassword() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter User Password: ");
		String x = myObj.nextLine();
		return x;
	}
}
