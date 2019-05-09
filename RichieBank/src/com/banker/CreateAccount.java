package com.banker;

import java.util.Random;
import java.util.Scanner;

public class CreateAccount{
	BankAccount JohnDoe = new BankAccount();
	public static void Register(BankAccount JohnDoe) {
		Scanner BankInput = new Scanner(System.in);
	
		System.out.print("First Name: ");
		String firstName = BankInput.nextLine();
		JohnDoe.setfirstName(firstName);
	
		System.out.print("Last Name: ");
		String lastName = BankInput.nextLine();
		JohnDoe.setlastName(lastName);
	
		System.out.print("Username: ");
		String username = BankInput.nextLine();
		JohnDoe.setUsername(username);
	
		System.out.print("Password: ");
		String password = BankInput.nextLine();
		JohnDoe.setPassword(password);
	
		System.out.println("Enter your initial deposit:");
		double balance=BankInput.nextFloat();
		JohnDoe.setBalance(balance);
	
		long range = 99999999999L;
		Random r1 = new Random();
		long number = (long)(r1.nextDouble()*range);
		JohnDoe.setAccount(number);
	
	}

}
