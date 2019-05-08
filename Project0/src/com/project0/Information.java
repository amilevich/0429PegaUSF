package com.project0;

import java.io.Serializable;

public class Information implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -316888039938730966L;
	static String userName;
	static String userID;
	static String userPassword;
	static Double userBalance;

	public Information(String userName, String userID, String userPassword, Double userBalance) {
		super();
		Information.userName = userName;
		Information.userID = userID;
		Information.userPassword = userPassword;
		Information.userBalance = userBalance;
	}
}
