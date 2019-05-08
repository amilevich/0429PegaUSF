package com.example.bank;

import java.util.ArrayList;

public class Account {

	private String name;
	//private double balance;
	private String uuid;
	private User holder;
	private ArrayList<Transaction>transaction;
	
	public Account(String name, User holder, Bank theBank) {
		
		
		//get a new account uuid
		this.uuid = theBank.getNewAccountUUID();
		//initialize transaction
		this.transaction = new ArrayList<Transaction>();
		//add to holder and bank lists
		holder.addAccount(this);
		theBank.addAccount(this);
	}
	public String getUUID() {
		return this.uuid;
	}
	public String getSummaryLine() {
		// TODO Auto-generated method stub
		double balance =this.getBalance();
		 
		if (balance >= 0) {
			return String.format("%s: $%.02f : %s", this.uuid, balance, this.name);
		}else {
			return String.format("%s: $(%.02f) : %s", this.uuid, balance, this.name);
			
		}
	}
	public double getBalance() {
		double balance = 0;
		for(Transaction t : this.transaction) {
			balance += t.getAmount();
		}
		return balance;
	}
	public void printTransHistory() {
		// TODO Auto-generated method stub
		System.out.printf("Your Transaction History for account %s\n",
				this.uuid);
		for(int t = this.transaction.size()-1; t >= 0; t--) {
			System.out.printf(this.transaction.get(t).getSummaryLine());
		}
	}
	public void addTransaction(double amount, String memo) {
		// TODO Auto-generated method stub
		Transaction newTrans = new Transaction(amount, memo, this);
		this.transaction.add(newTrans);
		
	}
}
