package com.banker;

import java.util.Scanner;

//The purpose of this class is to write a text file with relevant Bank Account
//Information. It will store customer requests and transactions until they are 
//approved by either an administrator or an employee.

//All transactions will be written driven to master.txt

public class PendingAccountsAndActions extends Documenting {
	
	
	
	public String fileName="/PendingFiles/PendingAccountsAndActions.txt";
	
	public void openAccount(){
		BankAccount JohnDoe = new BankAccount();
		Serialization ActivateAccount=new Serialization();
		Scanner Approval = new Scanner(System.in);
		filename=
		ActivateAccount.readObject("PendingFiles/")
		System.out.println("Approve Bank Account for" + 
		JohnDoe.getfirstName() + ' ' + JohnDoe.getlastName() + '?' + "***" +
		"Initial Deposit: " + JohnDoe.getBalance() + "(y/n)");
		char forward = Approval.next().charAt(0);
		if (forward=='y' | forward=='Y') {
			String filename =Long.toString(JohnDoe.getAccount())+".txt";
			
			ActivateAccount.writeObject("MasterFiles/" + filename, JohnDoe);
			BankAccount JaneDoe=new BankAccount();
			JaneDoe = readObject("MasterFiles/" +filename);
			System.out.println("Account Approved!");
		}
		else if(forward=='n' | forward=='N') {}
		else {System.out.println("Valid Characters Only!");}
		
		
	}
	
	public void cancelAccount(){
		
	}
	
	public void enableTransfer() {
		
	}
	
	public void approveDeposit() {
		
	}
	
	public void approveWithdrawal(){
		
	}
	
	public void writeToMaster(BankAccount JohnDoe) {
		String input=JohnDoe.getUsername()+":"
		+Long.toString(JohnDoe.getAccount())+":"
		+Double.toString(JohnDoe.getBalance());
		addToList("PendingFiles/PendingAccountsAndActions.txt", input);
		
	}
	
	public void DocumentDeposit(BankAccount JohnDoe) {
		
	}
	
	public void DocumentWithdrawal(BankAccount JohnDoe) {
		
	}

}
