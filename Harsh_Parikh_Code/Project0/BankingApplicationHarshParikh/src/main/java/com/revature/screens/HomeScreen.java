package com.revature.screens;

import java.util.Scanner;

import com.revature.beans.User;
import com.revature.daos.UserDao;
import com.revature.daos.UserSerializer;

public class HomeScreen implements Screen {
	private User current;

	private Scanner scan = new Scanner(System.in);
	private UserDao ud = UserDao.currentUserDao;
	private User u = UserSerializer.getCurrentUser();
	
	public HomeScreen(User currentUser) {
		this.current = currentUser;
	}

	public Screen start() {
		System.out.println("Please choose from following options: ");
		System.out.println("Enter 1 to deposit money");
		System.out.println("Enter 2 to withdraw money");
		System.out.println("Enter 3 to view balance");
		System.out.println("Enter 4 to view transaction history");
		System.out.println("Enter 5 to logout");
		String selection = scan.nextLine();
		switch (selection) {
		case "1":
			return new DepositScreen(current);
		case "2":
			return new WithdrawScreen(current);
		case "3":
			System.out.println("\n" + "Your balance is " + current.getBalance());
			break;
		case "4":
			System.out.println(current.getHistory());
			break;
		case "5":
			System.out.println("You've been logged out");
			return new StartScreen();
		default:
			break;
		}

		return this;
	}
}
