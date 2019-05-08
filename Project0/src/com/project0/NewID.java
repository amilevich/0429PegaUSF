package com.project0;

import java.util.Scanner;

public class NewID {
	
	public static String createID() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Your Username: ");
		String userID = myObj.nextLine();
		Information.userID = userID;
		return userID;
	}
}
