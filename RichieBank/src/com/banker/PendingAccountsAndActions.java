package com.banker;

import java.io.FileNotFoundException;
import java.util.Scanner;

//The purpose of this class is to write a text file with relevant Bank Account
//Information. It will store customer requests and transactions until they are 
//approved by either an administrator or an employee.

//All transactions will be written driven to master.txt

public class PendingAccountsAndActions extends Documenting {
	
	
	
	public String fileName="PendingAccountsAndActions.txt";
	
	public void approveAccount(long AccountNumber){
		//Acounts are approved by moving serialized text files to the Master Folder
		String filename=Long.toString(AccountNumber)+".txt";
		Serialization ToMaster = new Serialization();
		BankAccount JohnDoe=new BankAccount();
		String filenameStringFormat ="PendingFiles/"+filename;
		JohnDoe=ToMaster.readObject(filenameStringFormat);
		String newFilewDir="MasterFiles/"+Long.toString(JohnDoe.getAccount())+".txt";
		ToMaster.writeObject(newFilewDir, JohnDoe);
		writetoMaster(JohnDoe);	
	}
	
	public void writeToPending (BankAccount JohnDoe) {
		String input=JohnDoe.getUsername()+":"
		+Long.toString(JohnDoe.getAccount())+":"
		+Double.toString(JohnDoe.getBalance());
		addToList("PendingFiles/PendingAccountsAndActions.txt", input);
		
	}
	
	public void writetoMaster (BankAccount JohnDoe) {
		String input=(JohnDoe.getUsername()+":"
		+JohnDoe.getPassword()+ ":"
		+Long.toString(JohnDoe.getAccount()));
		addToList("MasterFiles/UsernamePasswordsAccounts.txt", input);
		
	}
	
	public void DocumentDeposit(BankAccount JohnDoe) {
		
	}
	
	public void DocumentWithdrawal(BankAccount JohnDoe) {
		
	}

}
