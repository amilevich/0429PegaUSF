package com.project0;

import java.util.Scanner;

public class NewName {

	public static String enterName() {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter Your Full Name: ");
		String userName = myObj.nextLine();
		Information.userName = userName;
		return userName;
	}
}
