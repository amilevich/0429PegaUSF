package com.example.bank;

import java.util.Date;

public class Transaction {
private double amount;
private Date timestamp;
private String memo;
private Account inAccount;
//constructor
public Transaction(double amount, Account inAccount) {
	this.amount = amount;
	this.inAccount = inAccount;
	this.timestamp = new Date();
	this.memo = "";
	//if changes are made in this constructor they will auto change in the other Constructor
}
//constructor
public Transaction(double amount, String memo, Account inAccount) {
	//calls the 2 args constructor
	this(amount, inAccount);
	//set the memo
	this.memo = memo;
}
public double getAmount() {
	// TODO Auto-generated method stub
	return this.amount;
}
public String getSummaryLine() {
	if(this.amount >= 0) {
		return String.format("%s : $%.02f :%s", this.timestamp.toString(),
				this.amount, this.memo);
	}
	return null;
}
}
