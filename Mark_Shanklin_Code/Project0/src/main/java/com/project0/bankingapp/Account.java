package com.project0.bankingapp;

import java.io.Serializable;
import java.text.DecimalFormat;

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3946567313806146029L;

	private TypeOfAccount accountType;

	private AccountStatus status;

	private int accountNumber;

	private int uID;

	private double accountBalance;

	public Account(TypeOfAccount at, int uId) {
		uID = uId;
		accountType = at;
		if (at.equals(TypeOfAccount.CHECKING)) {
			accountNumber = Integer.parseInt("500" + uID + "01");
		} else {
			accountNumber = Integer.parseInt("500" + uID + "01");
		}

		status = AccountStatus.PENDING;

		accountBalance = 0;
	}

	public Account(TypeOfAccount accountType, AccountStatus status, int accountNumber, int uID, double accountBalance) {
		super();
		this.accountType = accountType;
		this.status = status;
		this.accountNumber = accountNumber;
		this.uID = uID;
		this.accountBalance = accountBalance;
	}

	public int getuID() {
		return uID;
	}

	public void setuID(int uID) {
		this.uID = uID;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

	public TypeOfAccount getAccountType() {
		return accountType;
	}

	public void setAccountType(TypeOfAccount accountType) {
		this.accountType = accountType;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("###,###,##0.00");
		DecimalFormat df2 = new DecimalFormat("9-##");
		return status + " " + accountType + " ACCOUNT # " + df2.format(accountNumber) + " BALANCE: $"
				+ df.format(accountBalance);
	}

}
