package com.banking.user;

import java.io.Serializable;

/**
 * Class defines customer bank account. Accounts contain a unique account number, a balance, an owner,
 * and account status. Customers can only view accounts they own, employees and administrators
 * can view/edit all accounts regardless of owner.
 * @author Audrey Romero
 *
 */
public class BankAccount implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2702593568687409983L;
	double balance;
	long accountNumber;
	String status; // Status can be "open", "closed", "pending approval"
	
	public BankAccount() {
	}
	
	public BankAccount(double balance, long accountNumber, String status) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.status = status;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + ", accountNumber=" + accountNumber + ", status="
				+ status + "]";
	}
	
}
