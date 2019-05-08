package com.project0;

public class LoginPage {
	private static String loginPassword;
	private static String loginID;

	public static void login() {
		loginID = LoginID.loginID();
		loginPassword = LoginPassword.loginPassword();
		
	}
}
