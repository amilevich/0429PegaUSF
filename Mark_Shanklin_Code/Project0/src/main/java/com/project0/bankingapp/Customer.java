package com.project0.bankingapp;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer implements User, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6209484244817085847L;

	String username;

	String password;

	int ID;

	Permissions permit = Permissions.CUSTOMER;

	List<Account> accountList = new ArrayList<Account>();

	@Override
	public boolean withdraw(Account account, double amount) {
		try {
			if (account.getStatus().equals(AccountStatus.OPEN)) {
				if (account.getAccountBalance() >= amount) {
					account.setAccountBalance(account.getAccountBalance() - amount);
					DecimalFormat df = new DecimalFormat("#,###0.00");
					System.out.println("Cash is Being Dispensed $" + df.format(amount));
					// TODO logging of transaction
					return true;
				} else {
					return false;
				}
			} else {
				System.out.println("Account Status Must Be OPEN!");
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String name) {
		this.username = name;
	}

	public Customer(String username, String password, int iD, Permissions permit, List<Account> accountList) {
		super();
		this.username = username;
		this.password = password;
		ID = iD;
		this.permit = permit;
		this.accountList = accountList;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
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

	public Permissions getPermit() {
		return permit;
	}

	public void setPermit(Permissions permit) {
		this.permit = permit;
	}

	@Override
	public boolean deposit(Account account, double amount) {
		try {
			if (account.getStatus().equals(AccountStatus.OPEN)) {
				if (amount > 0.0) {
					account.setAccountBalance(account.getAccountBalance() + amount);
					DecimalFormat df = new DecimalFormat("###,###,##0.00");
					System.out.println("Cash Deposited in the amount of $" + df.format(amount));
					System.out.println(account);
					// TODO logging of transaction
					return true;
				} else {
					return false;
				}
			} else {
				System.out.println("Account Status Must Be OPEN!");
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean transfer(Account accountSource, Account accountDest, double amount) {
		try {
			if (amount > 0.0) {
				if (accountSource.getAccountBalance() >= amount) {
					accountDest.setAccountBalance(accountSource.getAccountBalance() + amount);
					accountSource.setAccountBalance(accountSource.getAccountBalance() - amount);
					DecimalFormat df = new DecimalFormat("###,###,##0.00");
					System.out.println("Cash transfered in the amount of $" + df.format(amount) + "\nFrom "
							+ accountSource.getAccountType() + "# " + accountSource.getAccountNumber() + "\nInto "
							+ accountDest.getAccountType() + "# " + accountDest.getAccountNumber());
					// TODO logging of transaction
					return true;
				}
			} else {
				return false;
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public String toString() {
		return permit + " [Username=" + username + ", Password=" + password + ", User ID=" + ID + ", Accounts List="
				+ accountList + "]";
	}

	public Customer(String name, String password, int ID, Permissions permit) {
		this.username = name;
		this.password = password;
		this.ID = ID;
		this.permit = permit;
	}

	public void CheckBalance() {
		for (Account a : accountList) {
			System.out.println(a);
		}
	}

	public void CheckBalance(TypeOfAccount type) {
		for (Account a : accountList) {
			if (a.getAccountType().equals(type)) {
				System.out.println(a);
			}
		}
	}

	public void applyForAccount(TypeOfAccount type) {

		Account temp = new Account(type, this.ID);
		temp.setAccountNumber(temp.getAccountNumber() + accountList.size());
		accountList.add(temp);
	}

}
