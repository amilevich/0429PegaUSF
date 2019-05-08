package com.banking.prompt;
import java.util.Scanner;
import com.banking.user.*;
/**
 * Class stores all menu prompts and logic pertaining to user interaction with the
 * program.
 * @author Audrey Romero
 *
 */
public class Prompts {
	static Scanner scan = new Scanner(System.in);
	static String userInput;
	static Customer cust;
	static Admin admin;
	
	public static void login() {
		// ***INITIAL PROMPT***
		System.out.print("\nEnter username(New to Banking? Type \"register\" to continue) --> ");
		userInput = scan.next();
		
		if (userInput.equalsIgnoreCase("register")) {
			registration();
		} else if (UserData.matchUsername(userInput)) {
			if (UserData.getUser(userInput).toString().contains("Customer")) {
			    cust = (Customer)UserData.getUser(userInput);
			    enterPassword(cust);
			} else {
				admin = (Admin)UserData.getUser(userInput);
				enterPassword(admin);
			}
		} else {
			// Username not found
			System.out.println("Incorrect username!"); 
			login();
		}
	}
	
	public static void registration() {
		// ***REGISTRATION PROMPT***
		String name, username, password, confirmPass;
		
		scan.nextLine();
		
		System.out.print("Enter your full name --> ");
		name = scan.nextLine();

		System.out.print("Create a username --> ");
		username = scan.next();
		
		System.out.println(name + ", " + username);
		
		do {
		    System.out.print("Create a password --> ");
		    password = scan.next();
		
		    System.out.print("Confirm password --> ");
		    confirmPass = scan.next();
		
		    if (confirmPass.equals(password)) {
		    	UserData.addUser(username, password, name);
		    	UserData.writeUser(UserData.getFilename(), UserData.getUserList());
		    	cust = (Customer) UserData.getUser(username);
		    	System.out.println("REGISTRATION SUCCESSFUL!\n");
				mainMenu(cust);
		    } else {
			    System.out.println("Passwords do not match!");
		    }
		 } while (!confirmPass.equals(password));
		
	}
	
	public static void enterPassword(User u) {
		// ***PASSWORD PROMPT***
		String password;
		
		do {
		System.out.print("Enter password --> ");
		password = scan.next();
	
	    if (u.getPassword().equals(password)) {
	    	System.out.println("\nWelcome back, " + u.getName() + "!");
	    	mainMenu(u);
	    } else {
		    System.out.println("Passwords do not match!");
		    login();
	    }
	 } while (!u.getPassword().equals(password));
	}
	
	public static void mainMenu(User u) {
		// ***MAIN MENU***
		UserData.readUser(UserData.getFilename());
		int n;
		if (u.toString().contains("Customer")) { // Null Pointer
	        System.out.print("\n------ Main Menu ------" +
				             "\n1: Open Account" +
						     "\n2: Withdraw Funds" +
				             "\n3: Deposit Funds" +
						     "\n4: Transfer Funds" +
				             "\n\n0: Exit Banking App" +
	        		         "\n\nSelect an option --> ");
		    n = scan.nextInt();
		
		    switch (n) {
		    case 1:
			    openAccount();
			    mainMenu(cust);
			    break;
		    case 2:
			    withdrawMenu();
			    break;
		    case 3:
			    depositMenu();
			    break;
		    case 4:
			    transferMenu();
			    break;
		    case 0:
		    	break;
			default:
				System.out.println("Invalid response!");
		    }
		} else {
			System.out.print("\n------ Main Menu ------" +
					           "\n1: View/Edit User" +
						       "\n2: New Account Requests" +
				               "\n3: Close Account" +
						       "\n\n0: Exit Banking App" +
						       "\n-----------------------" +
				               "\n\nSelect an option --> ");

			switch (scan.nextInt()) {
			case 1:
				viewMenu();
				break;
			case 2:
				requestMenu();
				break;
		    case 3:
				closeAccount();
				break;
			case 0:
				break;
			default:
				System.out.println("Invalid response!");
				mainMenu(u);
			}
		
		}
    }
			
	public static void openAccount() {
		AccountData.readAccount(AccountData.getFilename());
		long acctNum = (long)(Math.random() * 101);
		BankAccount acct = new BankAccount(0.00, acctNum, "Pending");
		cust.getAccounts().add(acct);
		AccountData.addAccount(acct);
		System.out.println("\nWe have received your request to open a new account." +
		                   "An admin will review your request shortly.\n" +
				           "Thank you for your patience!\n");
		AccountData.writeAccount(AccountData.getFilename(), AccountData.getAccountList());
	}
	
	public static void withdrawMenu() {
	    BankAccount acct = null;
		double amt;
		AccountData.readAccount(AccountData.getFilename());
		scan.nextLine();
		
		System.out.print("Select an account:\n");
		AccountData.printAccountList();
		acct = AccountData.getAccount(scan.nextLong());

		    
		System.out.print("Amount to withdraw --> ");
        amt = scan.nextDouble();
			
	    cust.withdraw(amt, acct);
		AccountData.writeAccount(AccountData.getFilename(), AccountData.getAccountList());
		mainMenu(cust);
	}
	
	public static void depositMenu() {
		BankAccount acct = null;
		double amt;
		AccountData.readAccount(AccountData.getFilename());
		scan.nextLine();
		
		System.out.print("Select an account:\n");
		AccountData.printAccountList();

	    acct = AccountData.getAccount(scan.nextLong());
		scan.nextLine();
		    
		System.out.print("Amount to deposit --> ");
	    amt = scan.nextDouble();
			
		cust.deposit(amt, acct);
		AccountData.writeAccount(AccountData.getFilename(), AccountData.getAccountList());
		mainMenu(cust);

	}
	
	public static void transferMenu() {
		BankAccount from = null;
		BankAccount to = null;
		double amt;
		AccountData.readAccount(AccountData.getFilename());
		scan.nextLine();
		
		System.out.print("Select an account to transfer from:\n");
		AccountData.printAccountList();
		

		from = AccountData.getAccount(scan.nextLong());
		scan.nextLine();
		    
		System.out.print("Select an account to transfer to:\n");
		AccountData.printAccountList();
		    

	    to = AccountData.getAccount(scan.nextLong());
		scan.nextLine();
			     
	    System.out.print("Amount to deposit --> ");
		amt = scan.nextDouble();
					
		cust.transferFunds(amt, from, to);
		AccountData.writeAccount(AccountData.getFilename(), AccountData.getAccountList());
		mainMenu(cust);

	}

	public static void requestMenu() {
		BankAccount acct;
		int pendingAcct = 0;
		AccountData.readAccount(AccountData.getFilename());
		scan.nextLine();
		
		for (BankAccount a : AccountData.getAccountList()) {
			
			if (a.getStatus().equals("Pending")); {
				System.out.println("\n" + a.toString());
				pendingAcct++;
			}
		}
		
		if (pendingAcct == 0 ) {
			System.out.println("\nNo accounts found.");
			mainMenu(admin);
		} else {
			System.out.print("\nSelect an account --> ");
			acct = AccountData.getAccount(scan.nextLong());
			scan.nextLine();
			System.out.print("Enter 'A' (approve), 'D' (deny) --> ");
			if (scan.next().equalsIgnoreCase("A")) {
				admin.approveAccount(acct);
				AccountData.writeAccount(AccountData.getFilename(), AccountData.getAccountList());
				mainMenu(admin);
			} else if (scan.next().equalsIgnoreCase("D")) {
				admin.denyAccount(acct);
				AccountData.writeAccount(AccountData.getFilename(), AccountData.getAccountList());
				mainMenu(admin);
			} else {
				System.out.println("Invalid response!!");
				requestMenu();
			}
		}
		
	}
	    

	public static void viewMenu() {
		Customer c;
		UserData.readUser(UserData.getFilename());
		scan.nextLine();
		
		System.out.print("\nEnter customer username --> ");
		c = (Customer) UserData.getUser(scan.nextLine());
		
		System.out.println(c.toString());
		System.out.println(c.getAccounts());
		System.out.print("\n1: Edit User" +
		                   "\n2: Edit account" +
			               "\n\nWhat would you like to do? -> ");
		switch (scan.nextInt()) {
		case 1:
			editCustomer(c);
		case 2:
			editAccount(c);
		}
		
		
	}
	
	public static void closeAccount() { // Start here
		AccountData.readAccount(AccountData.getFilename());
		BankAccount acct;
		scan.nextLine();
		
		AccountData.printAccountList();
		System.out.print("Select account --> ");
		
		acct = AccountData.getAccount(scan.nextLong());
		
		admin.closeAccount(acct);
		AccountData.writeAccount(AccountData.getFilename(), AccountData.getAccountList());
		
		mainMenu(admin);
		
	}
	
	public static void editCustomer(Customer c) {
		System.out.print("\n1:Name\n2:Username\n3:Paswword" +
				           "\n\nWhat would you like to edit? -> ");
		switch (scan.nextInt()) {
		case 1:
			scan.nextLine();
			System.out.print("Enter new customer name --> ");
			c.setName(scan.nextLine());
			UserData.writeUser(UserData.getFilename(), UserData.getUserList());
			System.out.println("Customer name changed!");
			mainMenu(admin);
		case 2:
			scan.nextLine();
			System.out.print("Enter new username --> ");
			c.setUsername(scan.nextLine());
			UserData.writeUser(UserData.getFilename(), UserData.getUserList());
			System.out.println("Username changed!");
			mainMenu(admin);
		case 3:
			scan.nextLine();
			System.out.print("Enter new password --> ");
			c.setPassword(scan.nextLine());
			UserData.writeUser(UserData.getFilename(), UserData.getUserList());
			System.out.println("Password changed!");
			mainMenu(admin);
		default:
			System.out.println("Invalid response!");
			editCustomer(c);
		}
	}
	
	public static void editAccount(Customer c) {
		BankAccount acct;
		AccountData.readAccount(AccountData.getFilename());
		scan.nextLine();
		AccountData.printAccountList();
		System.out.print("\nSelect an account --> ");
		acct = AccountData.getAccount(scan.nextLong());
		System.out.println(acct.toString());
		System.out.println("\n1: Deposit Funds" +
				           "\n2: Withdraw Funds" +
				           "\n\nWhat would you like to do? -> ");
		switch (scan.nextInt()) {
		case 1:
			scan.nextLine();
			System.out.print("Enter deposit amount --> ");
			acct.setBalance(acct.getBalance() + scan.nextDouble());
			AccountData.writeAccount(AccountData.getFilename(), AccountData.getAccountList());
			System.out.println("\nDeposit successful!");
			mainMenu(admin);
		case 2:
			scan.nextLine();
			System.out.print("Enter withdraw amount -- > ");
			acct.setBalance(acct.getBalance() - scan.nextDouble());
			AccountData.writeAccount(AccountData.getFilename(), AccountData.getAccountList());
			System.out.println("\nWithdraw successful!!");
			mainMenu(admin);
		default:
			System.out.println("\nInvalid response!");
			editAccount(c);
		}
		
	}
}
