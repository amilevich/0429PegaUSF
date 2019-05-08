package com.banker;

public class BankAccount extends User {
	  private long account;
	  private double balance;

	  public BankAccount() {
	    this(0, 0);
	  }

	  public BankAccount(long number, double amount) {
	    setAccount(number);
	    setBalance(amount);
	  }

	  public void deposit(double amount) {
	    balance += amount;
	  }

	  public void withdraw(double amount) throws Exception {
	    boolean overDraft = (balance > amount);
	    if (overDraft)
	      balance -= amount;
	    else
	      throw new Exception();
	  }

	  public long getAccount() {
	    return account;
	  }

	  public double getBalance() {
	    return balance;
	  }

	  public void setAccount(long number) {
	    account = number;
	  }

	  public void setBalance(double amount) {
	    balance = amount;
	  }
	}

