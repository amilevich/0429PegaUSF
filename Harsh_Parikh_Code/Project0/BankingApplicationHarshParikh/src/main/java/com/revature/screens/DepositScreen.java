package com.revature.screens;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.beans.User;
import com.revature.daos.UserDao;
import com.revature.daos.UserSerializer;

public class DepositScreen implements Screen {
	
	private Scanner scan = new Scanner(System.in);
	private User current;
	private User u = UserSerializer.getCurrentUser();
	private Logger log = Logger.getRootLogger();
	
	public DepositScreen(User currentUser) {
		this.current = currentUser;
	}

	@Override
	public Screen start() {
		// TODO Auto-generated method stub
		log.debug("started deposit screen");
		System.out.println("How much money would you like to deposit?: ");
		double amount = scan.nextDouble();		
		u.depositYeet(amount);
		u.addHistory("Deposited " + amount + ", Balance = "  + u.getBalance() + "\n");
		UserSerializer.us.updateUser(u);
		return new HomeScreen(current);
	}

	public Logger getLog() {
		return log;
	}

	public void setLog(Logger log) {
		this.log = log;
	}

}
