package com.project0;

public class OpenAccount {
	private static String userName;
	private static String userID;
	private static String userPassword;
	private static Double userBalance;
	
	public static void openAccount() {
		String userName = NewName.enterName();
		String userID = NewID.createID();
		String userPassword = NewPassword.createPassword();
		Double userBalance = NewBalance.insertBalance();
		Information info = new Information(userName, userID, userPassword, userBalance);
		// saveInformation();
	}
	
	public static String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public static String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public static String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public static Double getUserBalance() {
		return userBalance;
	}

	public void setUserBalance(Double userBalance) {
		this.userBalance = userBalance;
	}

	public OpenAccount(String userName, String userID, String userPassword, Double userBalance) {
		super();
		this.userName = userName;
		this.userID = userID;
		this.userPassword = userPassword;
		this.userBalance = userBalance;
	}


}
