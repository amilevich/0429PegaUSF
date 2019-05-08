package com.example.bank;

import java.util.ArrayList;
import java.util.Random;

public class Bank {
private String name;
private ArrayList<User>users;
private ArrayList<Account>accounts;
 
//creates a new bank obj with empty list of user/accounts
public Bank(String name) {//name refer the name of bank
	this.name = name;
	this.users = new ArrayList<User>();
	this.accounts = new ArrayList<Account>();
}


public String getNewUserUUID() {
	// TODO Auto-generated method stub
	String uuid;
	Random rng = new Random();
	int len = 6;
	boolean nonUnique = false;
	do {
		uuid = "";
		for(int c = 0; c<len; c++) {
			uuid +=((Integer)rng.nextInt(10)).toString();
		}
		//check if The ID is Unique
		nonUnique = false;
		for(User u : this.users) {
			if(uuid.compareTo(u.getUUID())== 0) {
			nonUnique = true;
			break;
			}
		}
	}while(nonUnique);
	return uuid;
}
public String getNewAccountUUID() {
	String uuid;
	Random rng = new Random();
	int len = 10;
	boolean nonUnique = false;
	do {
		uuid = "";
		for(int c = 0; c<len; c++) {
			uuid +=((Integer)rng.nextInt(10)).toString();
		}
		//check if The ID is Unique
		nonUnique = false;
		for(Account a : this.accounts) {
			if(uuid.compareTo(a.getUUID())== 0) {
			nonUnique = true;
			break;
			}
		}
	}while(nonUnique);
	return uuid;
	
}
public void addAccount(Account anAcct) {
	this.accounts.add(anAcct);
}


public User addUser(String firstName, String lastName, String pin) {
	
	//create a new user object and add it to our list
	User newUser = new User(firstName, lastName, pin, this);
	this.users.add(newUser);
	
	//create a savings account for the user
	Account newAccount = new Account("Savings", newUser, this);
	newUser.addAccount(newAccount);
	this.accounts.add(newAccount);
	return newUser;
}
public User userLogin (String userID, String pin) {
	
	for(User u : this.users) {
		
		if(u.getUUID().compareTo(userID ) == 0 && u.validatePin(pin)) {
			return u;
		}
	}
	//if user is found but pin is wrong
	return null;
}
public String getName() {
	return this.name;
}
}
