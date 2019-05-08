package com.banking.user;
import java.util.List;

/**
 * Class defines the Admin object. Admins have the same functionality as customers, 
 * however users of the Admin type have additional permissions.
 * @author Audrey Romero
 *
 */
public class Admin extends User {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6948104236366049410L;
	private String username, password, name;
	
	public Admin() {
	}
	
	public Admin(String username, String password, String name) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
	}
	
	public void approveAccount(BankAccount acct) {
		acct.setStatus("Open");
		
		System.out.println("\nNew account approved.");
	}
	
	public void denyAccount(BankAccount acct) {
		List<BankAccount> acctList = AccountData.getAccountList();
		acctList.remove(acctList.indexOf(acct));
		System.out.println("\nNew account denied.");
	}
	
	public void closeAccount(BankAccount acct) {
		acct.setStatus("Closed");
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

	@Override
	public String toString() {
		return "Admin [username=" + username + ", password=" + password + ", name=" + name + "]";
	}
	
}
