package com.revature.screens;

import java.util.Scanner;

import com.revature.beans.Admin;
import com.revature.daos.AdminDao;

public class AdminHomeScreen implements Screen {
	private Admin current;

	private Scanner scan = new Scanner(System.in);
	private AdminDao ad = AdminDao.currentAdminDao;

	public AdminHomeScreen(Admin current) {
		super();
		this.current = current;
	}

	@Override
	public Screen start() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Admin screen.  Please choose from the following options: ");
		System.out.println("Enter 1 to view users");
		System.out.println("Enter 2 to get user transaction information");
		System.out.println("Enter 3 to Log out");
		String selection = scan.nextLine();
		switch (selection) {
		case "1":
			ad.viewAllUsers();
			break;
		case "2":
			return new ViewUserHistory(current);
		case "3":
			System.out.println("You have been logged out.");
			return new StartScreen();
		default:
			break;
		}
		return this;
	}

}
