package com.project0.bankingapp;

public interface User {

	public abstract boolean withdraw(Account account, double amount);
	
	public abstract boolean deposit(Account account, double amount);
	
	public abstract boolean transfer(Account accountSource, Account accountDest, double amount);
	
}
