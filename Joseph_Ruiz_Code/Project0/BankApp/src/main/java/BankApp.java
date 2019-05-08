// Name: BankApp.java
// Author: Joe Ruiz
// Date: 05/03/2019
// Bank program

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BankApp {

	private final static String pathBase = "./users/";
	private final static String pathBase2 = "./accounts/";
	private final static String ext = ".txt";
	private final static String accountPath = pathBase2 + "requests" + ext;
	private final static Employee employee = new Employee("employee", "343523");
	private final static Administrator admin = new Administrator("admin", "143545");

	private static boolean loggedIn;
	private static User u;
	private static String username, password;
	private static ArrayList<String> requests;

	private static Scanner input;

	private static void loginMenu() {
		int c;
		while (true) {
			System.out.println("Select an option:");
			System.out.println("1. New User");
			System.out.println("2. Returning User");
			System.out.println("3. Employee Login");
			System.out.println("4. Administrator Login");
			System.out.println("5. Exit");
			System.out.print("--> ");
			c = input.nextInt();
			if (c >= 1 && c <= 5) {
				break;
			} else {
				System.out.println("Please select an option");
			}
		}
		switch (c) {
		case 1:
			createUser();
			break;
		case 2:
			login();
			break;
		case 3:
			employeeLogin();
			break;
		case 4:
			adminLogin();
			break;
		case 5:
			return;
		}
	}

	private static void createUser() {
		System.out.println("Creating a new user");
		System.out.print("Username: ");
		username = input.next();
		String filename = pathBase + username + ext;
		try {
			BufferedInputStream is = new BufferedInputStream(new FileInputStream(filename));
			ObjectInputStream ois = new ObjectInputStream(is);
			u = (User) ois.readObject();
			ois.close();
			is.close();
			if (u != null) {
				System.out.println("User already exists! Exiting");
				return;
			}
		} catch (FileNotFoundException e) {
			// didn't find it so don't do anything
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.print("Password: ");
		password = input.next();
		System.out.print("First Name: ");
		String firstname = input.next();
		System.out.print("Last Name: ");
		String lastname = input.next();
		u = new Customer(firstname, lastname, username, password);
		saveUser(u);
		System.out.println("New user created");
		loggedIn = u.login(password);
		requestNewAccount();
	}

	private static void login() {
		System.out.print("Username: ");
		username = input.next();
		u = loadUser(username);
		System.out.print("Password: ");
		password = input.next();
		loggedIn = u.login(password);
	}

	private static void employeeLogin() {
		// we are only using the predefined employee
		// otherwise this would be similar to login()
		System.out.print("Username: ");
		username = input.next();
		if (!username.equals(employee.getUserName())) {
			System.out.println("User not found! Exiting");
			return;
		}
		System.out.print("Password: ");
		password = input.next();
		u = (User) employee;
		loggedIn = u.login(password);
	}

	private static void adminLogin() {
		// we are only using the predefined administrator
		// otherwise this would be similar to login()
		System.out.print("Username: ");
		username = input.next();
		if (!username.equals(admin.getUserName())) {
			System.out.println("User not found! Exiting");
			return;
		}
		System.out.print("Password: ");
		password = input.next();
		u = (User) admin;
		loggedIn = u.login(password);
	}

	private static void customerMenu() {
		int i;
		Customer c = (Customer) u;
		if (c.getAccounts().size() > 0) {
			while (true) {
				System.out.println("Select an option:");
				System.out.println("1. Deposit");
				System.out.println("2. Withdraw");
				System.out.println("3. Transfer");
				System.out.println("4. Apply for a new account");
				System.out.println("5. Exit");
				System.out.print("--> ");
				i = input.nextInt();
				switch (i) {
				case 1:
					depositMenu(c);
					break;
				case 2:
					withdrawMenu(c);
					break;
				case 3:
					transferMenu(c);
					break;
				case 4:
					requestNewAccount();
					break;
				case 5:
					return;
				default:
					System.out.println("Please select an option");
				}
			}
		} else {
			System.out.println("You have no open accounts. Exiting");
		}
	}

	private static void transferMenu(Customer c) {
		int i;
		double amt;
		boolean complete;
		Account a1, a2;
		while (true) {
			displayAccounts(c);
			System.out.println("Select an account to transfer from or enter 0 to exit");
			System.out.print("--> ");
			i = input.nextInt();
			if (i == 0) {
				System.out.println("Returning to menu");
				return;
			} else if (i >= 1 && i <= c.getAccounts().size()) {
				a1 = readAccount(c.getAccounts().get(i - 1));
				break;
			} else {
				System.out.println("Please select an account from the list");
			}
		}
		while (true) {
			displayAccounts(c);
			System.out.println("Select an account to transfer to or enter 0 to exit");
			System.out.print("--> ");
			i = input.nextInt();
			if (i == 0) {
				System.out.println("Returning to menu");
				return;
			} else if (i >= 1 && i <= c.getAccounts().size()) {
				a2 = readAccount(c.getAccounts().get(i - 1));
				break;
			} else {
				System.out.println("Please select an account from the list");
			}
		}
		while (true) {
			System.out.println("Enter an amount to transfer or 0 to exit");
			System.out.print("$");
			amt = input.nextDouble();
			if (amt == 0) {
				System.out.println("Returning to menu");
				break;
			} else {
				complete = a1.transfer(amt, a2);
				if (complete) {
					saveAccount(a1);
					saveAccount(a2);
					String an1 = Long.toString(a1.getAccountNumber());
					String an2 = Long.toString(a2.getAccountNumber());
					System.out.printf("Transferred $%.2f from Account XXXX%s to Account XXXX%s\n", amt,
							an1.substring(an1.length() - 4, an1.length()),
							an2.substring(an2.length() - 4, an2.length()));
					System.out.printf("Your balance for Account XXXX%s is $%.2f\n",
							an1.substring(an1.length() - 4, an1.length()), a1.getBalance());
					System.out.printf("Your balance for Account XXXX%s is $%.2f\n",
							an2.substring(an2.length() - 4, an2.length()), a2.getBalance());
				}
				break;
			}
		}
	}

	private static void withdrawMenu(Customer c) {
		int i;
		double amt;
		boolean complete;
		Account a;
		while (true) {
			displayAccounts(c);
			System.out.println("Select an account or enter 0 to exit");
			System.out.print("--> ");
			i = input.nextInt();
			if (i == 0) {
				System.out.println("Returning to menu");
				return;
			} else if (i >= 1 && i <= c.getAccounts().size()) {
				a = readAccount(c.getAccounts().get(i - 1));
				break;
			} else {
				System.out.println("Please select an account from the list");
			}
		}
		while (true) {
			System.out.println("Enter an amount to withdraw or 0 to exit");
			System.out.print("$");
			amt = input.nextDouble();
			if (amt == 0) {
				System.out.println("Returning to menu");
				break;
			} else {
				complete = a.withdraw(amt);
				if (complete) {
					saveAccount(a);
					String an = Long.toString(a.getAccountNumber());
					System.out.printf("Withdrawn $%.2f from Account XXXX%s\n", amt,
							an.substring(an.length() - 4, an.length()));
					System.out.printf("Your balance is $%.2f\n", a.getBalance());
				}
				break;
			}
		}
	}

	private static void depositMenu(Customer c) {
		int i;
		double amt;
		boolean complete;
		Account a;
		while (true) {
			displayAccounts(c);
			System.out.println("Select an account or enter 0 to exit");
			System.out.print("--> ");
			i = input.nextInt();
			if (i == 0) {
				System.out.println("Returning to menu");
				return;
			} else if (i >= 1 && i <= c.getAccounts().size()) {
				a = readAccount(c.getAccounts().get(i - 1));
				break;
			} else {
				System.out.println("Please select an account from the list");
			}
		}
		while (true) {
			System.out.println("Enter an amount to deposit or 0 to exit");
			System.out.print("$");
			amt = input.nextDouble();
			if (amt == 0) {
				System.out.println("Returning to menu");
				break;
			} else {
				complete = a.deposit(amt);
				if (complete) {
					saveAccount(a);
					String an = Long.toString(a.getAccountNumber());
					System.out.printf("Deposited $%.2f into Account XXXX%s\n", amt,
							an.substring(an.length() - 4, an.length()));
					System.out.printf("Your balance is $%.2f\n", a.getBalance());
				}
				break;
			}
		}
	}

	private static void displayAccounts(Customer c) {
		Account a;
		String an;
		System.out.println("Available accounts:");
		for (int i = 0; i <= c.getAccounts().size() - 1; i++) {
			a = readAccount(c.getAccounts().get(i));
			an = Long.toString(a.getAccountNumber());
			System.out.printf("%d: xxxx%s - $%.2f\n", i + 1, an.substring(an.length() - 4, an.length()),
					a.getBalance());
		}
	}

	private static void displayAccountsFullNumber(Customer c) {
		Account a;
		System.out.println("Available accounts:");
		for (int i = 0; i <= c.getAccounts().size() - 1; i++) {
			a = readAccount(c.getAccounts().get(i));
			System.out.printf("%d: %d - $%.2f\n", i + 1, a.getAccountNumber(), a.getBalance());
		}
	}

	private static void requestNewAccount() {
		readRequests();
		requests.add(u.getUserName());
		System.out.println("New account request sent");
		writeRequests();
	}

	private static void requests() {
		int i;
		readRequests();
		if (requests.size() == 0) {
			System.out.println("There are no new account requests");
			return;
		}
		while (true) {
			System.out.println("Select a request: ");
			for (int j = 0; j <= requests.size() - 1; j++) {
				System.out.println((j + 1) + ": " + requests.get(j));
			}
			System.out.print("--> ");
			i = input.nextInt();
			if (i >= 1 && i <= requests.size()) {
				break;
			} else {
				System.out.println("Select a request from the list");
			}
		}
		while (true) {
			System.out.println("Selected request " + i + " (" + requests.get(i - 1) + ")");
			System.out.println("1. Approve");
			System.out.println("2. Deny");
			System.out.println("3. Back");
			System.out.print("--> ");
			int k = input.nextInt();
			switch (k) {
			case 1:
				openAccount(requests.get(i - 1));
				requests.remove(i - 1);
				writeRequests();
				System.out.println("Request approved");
				return;
			case 2:
				denyRequest(i - 1);
				System.out.println("Request denied");
				return;
			case 3:
				return;
			default:
				System.out.println("Please select an option");
			}
		}
	}

	private static void openAccount(String name) {
		Customer c = (Customer) loadUser(name);
		Random r = new Random();
		long acctNum;
		while (true) {
			// Absolute value to prevent negative numbers
			acctNum = Math.abs(r.nextLong());
			try {
				FileInputStream f = new FileInputStream(pathBase2 + acctNum + ext);
				f.close();
			} catch (FileNotFoundException e) {
				// number doesn't exist, so...
				break;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		Account a = new Account(acctNum, name);
		c.getAccounts().add(acctNum);
		saveUser(c);
		saveAccount(a);
		System.out.println("Opened Account " + acctNum);
	}

	private static void viewCustomerInfo() {
		int i;
		String currentUserName;
		Customer current;
		System.out.print("Customer's username: ");
		currentUserName = input.next();
		current = (Customer) loadUser(currentUserName);
		while (true) {
			System.out.println("Select an option:");
			System.out.println("1. Personal Information");
			System.out.println("2. Account Information");
			System.out.println("3. Back");
			System.out.print("--> ");
			i = input.nextInt();
			switch (i) {
			case 1:
				System.out.println("Username: " + current.getUserName());
				System.out.println("First Name: " + current.getFirstName());
				System.out.println("Last Name: " + current.getLastName());
				break;
			case 2:
				displayAccountsFullNumber(current);
				break;
			case 3:
				return;
			}
		}
	}

	private static void editCustomerInfo() {
		int i;
		String fname, lname;
		String currentUserName;
		Customer current;
		System.out.print("Customer's username: ");
		currentUserName = input.next();
		current = (Customer) loadUser(currentUserName);
		while (true) {
			System.out.println("Select an option:");
			System.out.println("1. First Name");
			System.out.println("2. Last Name");
			System.out.println("3. Back");
			System.out.print("--> ");
			i = input.nextInt();
			switch (i) {
			case 1:
				System.out.println("Enter a new first name");
				System.out.print("--> ");
				fname = input.next();
				current.setFirstName(fname);
				System.out.println("First name updated");
				break;
			case 2:
				System.out.println("Enter a new last name");
				System.out.print("--> ");
				lname = input.next();
				current.setFirstName(lname);
				System.out.println("Last name updated");
				break;
			case 3:
				return;
			}
		}
	}

	private static void denyRequest(int idx) {
		requests.remove(idx);
		writeRequests();
	}

	private static void employeeMenu() {
		int i;
		while (true) {
			System.out.println("Select an option:");
			System.out.println("1. View customer information");
			System.out.println("2. View new account requests");
			System.out.println("3. Exit");
			System.out.print("--> ");
			i = input.nextInt();
			switch (i) {
			case 1:
				viewCustomerInfo();
				break;
			case 2:
				requests();
				break;
			case 3:
				return;
			default:
				System.out.println("Please select an option");
			}
		}
	}

	private static void adminAccountMenu() {
		int i;
		long acctNum;
		Account a;
		System.out.print("Account number: ");
		acctNum = input.nextLong();
		a = readAccount(acctNum);
		if (a == null)
			return;
		while (true) {
			System.out.println("Account " + a.getAccountNumber());
			System.out.println("Select an option:");
			System.out.println("1. Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Transfer");
			System.out.println("5. Close Account");
			System.out.println("6. Back");
			System.out.print("--> ");
			i = input.nextInt();
			switch (i) {
			case 1:
				System.out.printf("Account balance is $%.2f\n" + a.getBalance());
				break;
			case 2:
				adminDeposit(a);
				break;
			case 3:
				adminWithdraw(a);
				break;
			case 4:
				adminTransfer(a);
				break;
			case 5:
				adminCloseAccount(a);
				return;
			case 6:
				return;
			}
		}
	}
	
	private static void adminDeposit(Account a) {
		double amt;
		boolean complete;
		System.out.println("Enter an amount to deposit or 0 to exit");
		System.out.print("$");
		amt = input.nextDouble();
		if (amt == 0) return;
		complete = a.deposit(amt);
		if (complete) {
			saveAccount(a);
			System.out.printf("Deposited $%.2f into Account %d\n", amt, a.getAccountNumber());
			System.out.printf("Account balance is $%.2f\n", a.getBalance());
		}
	}
	
	private static void adminWithdraw(Account a) {
		double amt;
		boolean complete;
		System.out.println("Enter an amount to withdraw or 0 to exit");
		System.out.print("$");
		amt = input.nextDouble();
		if (amt == 0) return;
		complete = a.deposit(amt);
		if (complete) {
			saveAccount(a);
			System.out.printf("Withdrawn $%.2f from Account %d\n", amt, a.getAccountNumber());
			System.out.printf("Account balance is $%.2f\n", a.getBalance());
		}
	}
	
	private static void adminTransfer(Account a1) {
		double amt;
		long acctNum;
		boolean complete;
		System.out.println("Enter account number to transfer to or 0 to exit");
		System.out.print("--> ");
		acctNum = input.nextLong();
		if (acctNum == 0) return;
		Account a2 = readAccount(acctNum);
		System.out.println("Enter an amount to transfer or 0 to exit");
		System.out.print("$");
		amt = input.nextDouble();
		if (amt == 0) return;
		complete = a1.transfer(amt, a2);
		if (complete) {
			saveAccount(a1);
			saveAccount(a2);
			System.out.printf("Transferred $%.2f from Account %d to Account %d\n", amt, a1.getAccountNumber(), a2.getAccountNumber());
			System.out.printf("Your balance for Account %d is $%.2f\n", a1.getAccountNumber(), a1.getBalance());
			System.out.printf("Your balance for Account %d is $%.2f\n", a2.getAccountNumber(), a2.getBalance());
		}
	}
	
	private static void adminCloseAccount(Account a) {
		int i;
		String p;
		long acctNum = a.getAccountNumber();
		Customer c = (Customer) loadUser(a.getOwner());
		while (true) {
			System.out.println("Are you sure you want to close the following account?");
			System.out.println(acctNum);
			System.out.println("owned by " + c.getFirstName() + " " + c.getLastName());
			System.out.println("This action cannot be undone.");
			System.out.println("1. Yes");
			System.out.println("2. No");
			System.out.print("--> ");
			i = input.nextInt();
			switch (i) {
			case 1:
				System.out.print("Enter password to confirm: ");
				p = input.next();
				if (p.equals(u.getPassword())) {
					deleteAccount(a, c);
				}
				return;
			case 2:
				return;
			}
		}
	}

	private static void deleteAccount(Account a, Customer c) {
		long num = a.getAccountNumber();
		if (a.getOwner().equals(c.getUserName())) {
			File f = new File(pathBase2 + num + ext);
			boolean d = f.delete();
			if (d) {
				for (int i = 0; i <= c.getAccounts().size() - 1; i++) {
					if (c.getAccounts().get(i).longValue() == num) {
						c.getAccounts().remove(i);
					}
				}
				saveUser(c);
				System.out.println("Account " + num + " closed");
			}
		}
	}

	private static void adminMenu() {
		int i;
		while (true) {
			System.out.println("Select an option:");
			System.out.println("1. View customer information");
			System.out.println("2. Edit customer information");
			System.out.println("3. View new account requests");
			System.out.println("4. Manage/close an account");
			System.out.println("5. Exit");
			System.out.print("--> ");
			i = input.nextInt();
			switch (i) {
			case 1:
				viewCustomerInfo();
				break;
			case 2:
				editCustomerInfo();
				break;
			case 3:
				requests();
				break;
			case 4:
				adminAccountMenu();
				break;
			case 5:
				return;
			default:
				System.out.println("Please select an option");
			}
		}
	}

	// Serialization methods

	@SuppressWarnings("unchecked")
	protected static void readRequests() {
		try {
			BufferedInputStream is = new BufferedInputStream(new FileInputStream(accountPath));
			ObjectInputStream ois = new ObjectInputStream(is);
			requests = (ArrayList<String>) ois.readObject();
			ois.close();
			is.close();
		} catch (FileNotFoundException e) {
			// create the object for the first time
			requests = new ArrayList<String>();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	protected static void writeRequests() {
		try {
			BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(accountPath));
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(requests);
			oos.close();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	protected static User loadUser(String str) {
		User out = null;
		String filename = pathBase + str + ext;
		try {
			BufferedInputStream is = new BufferedInputStream(new FileInputStream(filename));
			ObjectInputStream ois = new ObjectInputStream(is);
			out = (User) ois.readObject();
			ois.close();
			is.close();
		} catch (FileNotFoundException e) {
			System.out.println("User not found");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return out;
	}

	protected static void saveUser(User o) {
		String filename = pathBase + o.getUserName() + ext;
		try {
			BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(filename));
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(o);
			oos.close();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	protected static Account readAccount(long num) {
		Account out = null;
		String filename = pathBase2 + num + ext;
		try {
			BufferedInputStream is = new BufferedInputStream(new FileInputStream(filename));
			ObjectInputStream ois = new ObjectInputStream(is);
			out = (Account) ois.readObject();
			ois.close();
			is.close();
		} catch (FileNotFoundException e) {
			System.out.println("Account not found");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return out;
	}

	protected static void saveAccount(Account a) {
		try {
			BufferedOutputStream os = new BufferedOutputStream(
					new FileOutputStream(pathBase2 + a.getAccountNumber() + ext));
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(a);
			oos.close();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return;
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	// Main

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Welcome to Bank");
		loginMenu();
		if (loggedIn) {
			System.out.println("Welcome, " + u.getUserName() + "!");
			if (u.getClass().getName().equals("Employee")) {
				employeeMenu();
			} else if (u.getClass().getName().equals("Administrator")) {
				adminMenu();
			} else {
				customerMenu();
			}
		}
		input.close();
		System.out.println("Thank you");
	}

}
