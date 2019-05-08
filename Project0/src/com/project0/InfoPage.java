package com.project0;

public class InfoPage {
	static String userName = Information.userName;
	static String userID = Information.userID;
	static String userPassword = Information.userPassword;
	static Double userBalance = Information.userBalance;

	public static void infoPage() {
		System.out.println("********************************");
		System.out.println("Hello " + userName.toUpperCase());
		System.out.println("Your Username: " + userID);
		System.out.println("Your Current Balance: $" + userBalance);
		System.out.println("********************************");

	}
}
