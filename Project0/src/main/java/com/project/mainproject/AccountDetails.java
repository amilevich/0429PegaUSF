package com.project.mainproject;

public class AccountDetails extends CustomerModel {

	AccountDetails(String username, String password, String firstName, String lastName, float balance,
			float lastTransaction) {
		super(username, password, firstName, lastName, balance, lastTransaction);
	}

	@Override
	public String toString() {
		return username + "," + password + "," + firstName + "," + lastName + "," + balance + "," + lastTransaction;

	}

}
