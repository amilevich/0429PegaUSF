package com.example.bank;

import java.util.ArrayList;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {

	
	private String firstName;
	
	private String lastName;
	private String uuid;
	private byte[] pinHash;
	private ArrayList<Account>accounts;
	public User(String firstName, String lastName, String pin, Bank theBank) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.pinHash = pinHash;
  try {
		MessageDigest md =MessageDigest.getInstance("MDS");
		this.pinHash = md.digest(pin.getBytes());
	}catch(NoSuchAlgorithmException e) {
		e.printStackTrace();
	}
	
  this.uuid = theBank.getNewUserUUID();
  //makes an empty list of account
  this.accounts = new ArrayList<Account>();
	//make a log message
	
  System.out.printf("New User %s, %s with ID %s created.\n", lastName, firstName,
		  this.uuid);
	}

	public void addAccount(Account anAcct) {
		this.accounts.add(anAcct);
	}
	public String getUUID() {
		return this.uuid;
	}
	//checks to see if a pin matches it user pin
	//aPin checks to see if the pin is valid or not
	public boolean validatePin(String aPin) {
		
		try {
			MessageDigest md = MessageDigest.getInstance("MDS");
			return MessageDigest.isEqual(md.digest(aPin.getBytes()), this.pinHash);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return this.firstName;
	}
	public void printAccountSummary() {
		System.out.printf("\n\n%s's account summary", this.firstName);
		for(int a=0;  a < this.accounts.size(); a++) {
			System.out.printf("%d)%s\n", a+1);
			this.accounts.get(a).getSummaryLine();
		} 
		System.out.println();
	}

	public int numAccounts() {
		// TODO Auto-generated method stub
		return this.accounts.size();
	}

	public void printTranactionHistory(int acctIdx) {
		this.accounts.get(acctIdx).printTransHistory();
		
	}

	public double getAcctBalance(int acctIdxt) {
		// TODO Auto-generated method stub
		return this.accounts.get(acctIdxt).getBalance();
	}

	public String getAcctUUID(int acctIdx) {
		// TODO Auto-generated method stub
		return this.accounts.get(acctIdx).getUUID();
	}

	public void addAcctTransaction(int acctIdx, double amount, String memo) {
		// TODO Auto-generated method stub
		this.accounts.get(acctIdx).addTransaction(amount, memo);
		
	}
}

