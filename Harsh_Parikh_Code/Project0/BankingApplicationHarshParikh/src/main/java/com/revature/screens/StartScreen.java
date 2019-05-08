package com.revature.screens;

import java.util.Scanner;

//import org.apache.log4j.Logger;

public class StartScreen implements Screen {
	
	private Scanner scan = new Scanner(System.in);
//	private Logger log = Logger.getRootLogger();

	@Override
	public Screen start() {
		// TODO Auto-generated method stub
		//log.debug("started login screen");
		System.out.println("Enter 1 for User login page");
		System.out.println("Enter 2 for User registration page");
		System.out.println("Enter 3 for Admin login page");
		System.out.println("Enter 4 for Admin registration page");
		String choice = scan.nextLine();
		
		switch(choice) {
		case "1":
			return new UserLoginScreen();
		case "2":
			return new RegisterUserScreen();
		case "3":
			return new AdminLoginScreen();
		case "4":
			return new RegisterAdminScreen();
		}
		return this;
	}

}
