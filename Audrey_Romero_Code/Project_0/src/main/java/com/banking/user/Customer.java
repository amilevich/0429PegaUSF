package com.banking.user;
import java.util.*;

/**
 * Class defines users who are banking customers. Customers are able to open new accounts,
 * deposit funds, withdraw funds, and transfer between accounts the customer owns.
 * @author Audrey Romero
 */
public class Customer extends User{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8305059749391639648L;
	private String username, password, name; 
	private List<BankAccount> accounts = new ArrayList<BankAccount>();
	
	public Customer() {
	}
	
	public Customer(String username, String password, String name) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
	}
	
	public void deposit(double amount, BankAccount acct) {
		UserData.readUser(UserData.getFilename());
		acct.balance += amount;
		System.out.println("\nDeposited " + amount + "." +
				           "\nCurrent balance:" + acct.getBalance());
		UserData.writeUser(UserData.getFilename(), UserData.getUserList());
	}
	
	public void withdraw(double amount, BankAccount acct) {
		UserData.readUser(UserData.getFilename());
		if (amount > acct.balance) {
			System.out.println("\nUnable to withdraw: Amount exceeds balance!\n");
		} else {
			acct.balance -= amount;
			System.out.println("\nWithdrew " + amount + "." +
			           "\nCurrent balance:" + acct.getBalance());
		}
		UserData.writeUser(UserData.getFilename(), UserData.getUserList());
	}
	
	public void transferFunds(double amount, BankAccount from, BankAccount to) {
		UserData.readUser(UserData.getFilename());
		if (amount > from.balance) {
			System.out.println("\nUnable to transfer: Amount exceeds balance!\n");
		} else {
			from.balance -= amount;
			to.balance += amount;
			System.out.println("Transfer successful!!\n");
		}
		UserData.writeUser(UserData.getFilename(), UserData.getUserList());
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<BankAccount> getAccounts() {
		return accounts;
	}
	
	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}
	
	public BankAccount getOneAccount(long l) {
		for (BankAccount acct : getAccounts()) {
			if (acct.getAccountNumber() == l) {
				return acct;
			}	
		}
		return null;
	}

	@Override
	public String toString() {
		return "Customer [username=" + username + ", password=" + password + ", name=" + name + "]";
	}
}
