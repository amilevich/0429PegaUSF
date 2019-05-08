package com.project0.bankingapp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankingApp {

	public static Integer uIDCount = 100;
	static List<Customer> cList = new ArrayList<Customer>();
	static final String filename = "./UserList.txt";
	static final String cFilename = "./UserCount.txt";

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// writeObject(filename,cList);
		// writeObject(cFilename, uIDCount);
		uIDCount = (Integer) readObject(cFilename);
		cList = (List<Customer>) readObject(filename);

		// for (Customer c : cList) {
		// System.out.println(c);
		// }

		Scanner scan = new Scanner(System.in);

		displayMenu(scan);

		scan.close();

		writeObject(cFilename, uIDCount);
		writeObject(filename, cList);

	}

	static void displayMenu(Scanner scan) {

		String value;
		// boolean
		while (true) {
			System.out.println(
					"*************************************************************************************************\r\n"
							+ "*  ____              _    _                                    _ _           _   _              *\r\n"
							+ "* |  _ \\            | |  (_)                 /\\               | (_)         | | (_)             *\r\n"
							+ "* | |_) | __ _ _ __ | | ___ _ __   __ _     /  \\   _ __  _ __ | |_  ___ __ _| |_ _  ___  _ __   *\r\n"
							+ "* |  _ < / _` | '_ \\| |/ / | '_ \\ / _` |   / /\\ \\ | '_ \\| '_ \\| | |/ __/ _` | __| |/ _ \\| '_ \\  *\r\n"
							+ "* | |_) | (_| | | | |   <| | | | | (_| |  / ____ \\| |_) | |_) | | | (_| (_| | |_| | (_) | | | | *\r\n"
							+ "* |____/ \\__,_|_| |_|_|\\_\\_|_| |_|\\__, | /_/    \\_\\ .__/| .__/|_|_|\\___\\__,_|\\__|_|\\___/|_| |_| *\r\n"
							+ "*                                  __/ |          | |   | |                                     *\r\n"
							+ "*                                 |___/           |_|   |_|                                     *\r\n"
							+ "*                                                                                               *\r\n"
							+ "*************************************************************************************************\r\n");
			System.out.println("1.) Login\n" + "2.) Apply for User Account\n" + "3.) Exit");
			System.out.print("Please Enter your Selection: ");
			value = scan.next();
			switch (value) {
			case "1":
				userLogin(scan);
				break;
			case "2":
				applyForUserAccount(scan);
				break;
			case "3":
				return;
			case "4":
				hiddenMenu(scan);
				break;
			default:
				divider();
				System.out.println("Not a valid Input! Please try again.");
				divider();
				break;
			}
		}
	}

	static void userLogin(Scanner scan) {
		if (cList.isEmpty()) {
			divider();
			System.out.println("No Users");
			divider();
			return;
		}
		divider();
		String username = "";
		String password = "";
		System.out.println("Please enter a username? ");
		username = scan.next();
		divider();
		System.out.println("Please enter a password: ");
		password = scan.next();
		divider();
		for (Customer c : cList) {
			if (c.username.equals(username)) {
				if (c.password.equals(password)) {
					switch (c.permit) {
					case CUSTOMER:
						standardUser(c, scan);
						return;
					case EMPLOYEE:
						employeeUser(scan);
						return;
					case ADMIN:
						adminUser(scan);
						return;
					default:
						divider();
						System.out.println("Stuff went wrong!!!!!!!!");
						divider();
						break;
					}
				}
			}
		}
	}

	static void standardUser(Customer c, Scanner scan) {
		boolean notExit = true;
		while (notExit)
			if (c.accountList.isEmpty()) {
				divider();
				System.out.println("Apply for a Banking Account With This Institution?\n");
				applyForAccount(c, scan, notExit);
				divider();
			} else {
				System.out.println(
						" 1)Apply for Bank Account\n 2)Withdraw\n 3)Deposit\n 4)Transfer\n 5)View Accounts\n 6)Exit to Main Menu");
				switch (scan.nextInt()) {
				case 1:
					divider();
					applyForAccount(c, scan, notExit);
					divider();
					break;
				case 2:
					divider();
					withDraw(c, scan, notExit);
					divider();
					break;
				case 3:
					divider();
					deposit(c, scan, notExit);
					divider();
					break;
				case 4:
					divider();
					transfer(c, scan, notExit);
					divider();
					break;
				case 5:
					divider();
					for (Account a : c.accountList) {
						System.out.println(a);
						divider();
					}
					break;
				case 6:
					notExit = false;
					break;

				default:
					divider();
					System.out.println("Not Valid Input!");
					break;
				}
			}

	}

	static void deposit(Customer c, Scanner scan, boolean notExit) {
		int index = 1;
		for (Account a : c.accountList) {
			System.out.println(index++ + ")" + a);
		}
		System.out.println("Enter the number next to the account you want.");
		int val = scan.nextInt();
		System.out.println("Enter amount.");
		double amount = scan.nextDouble();
		try {
			if (c.deposit(c.accountList.get(val - 1), amount) == false) {
				System.out.println("Unable to withdraw");
			}
			;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	static void transfer(Customer c, Scanner scan, boolean notExit) {
		int index = 1;
		for (Account a : c.accountList) {
			System.out.println(index++ + ")" + a);
		}
		System.out.println("Enter the number next to the account you want to transfer from.");
		int val1 = scan.nextInt();
		System.out.println("Enter the number next to the account you want to transfer to.");
		int val2 = scan.nextInt();
		System.out.println("Enter amount.");
		double amount = scan.nextDouble();
		try {
			if (c.transfer(c.accountList.get(val1 - 1), c.accountList.get(val2 - 1), amount) == false) {
				System.out.println("Unable to withdraw");
			}
			;
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	static void withDraw(Customer c, Scanner scan, boolean notExit) {
		int index = 1;
		for (Account a : c.accountList) {
			System.out.println(index++ + ")" + a);
		}
		System.out.println("Enter the number next to the account you want.");
		int val = scan.nextInt();
		System.out.println("Enter amount.");
		double amount = scan.nextDouble();
		try {
			if (c.withdraw(c.accountList.get(val - 1), amount) == false) {
				System.out.println("Unable to withdraw");
			}
			;
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	// }if(!hasOpenAccount){System.out.println("No Open Accounts!");}}

	static void hiddenMenu(Scanner scan) {
		divider();
		System.out.println("Create?\n 1) Admin\n 2) Employee");
		switch (scan.nextInt()) {
		case 1:
			createAdmin(scan);
			break;
		case 2:
			createEmployee(scan);
			break;

		default:
			System.out.println("Not valid input!");
			break;
		}
		divider();
	}

	static void applyForAccount(Customer c, Scanner scan, boolean notExit) {

		System.out.println("1)Savings\n 2)Checking\n 3)Exit to Main Menu.");
		switch (scan.nextInt()) {
		case 1:
			c.applyForAccount(TypeOfAccount.SAVING);
			writeObject(cFilename, uIDCount);
			writeObject(filename, cList);
			break;
		case 2:
			c.applyForAccount(TypeOfAccount.CHECKING);
			writeObject(cFilename, uIDCount);
			writeObject(filename, cList);
			break;
		case 3:
			notExit = false;
			break;

		default:
			divider();
			System.out.println("Not valid choice!");
			divider();
			break;
		}
	}

	static void employeeUser(Scanner scan) {
		boolean exit = false;
		while (!exit) {
			divider();
			System.out.println(" 1) Approve/Deny Accounts\n 2) View Accounts\n 3) Exit to Main\n");
			switch (scan.nextInt()) {
			case 1:
				divider();
				approveDenyAccounts(scan);
				divider();
				break;
			case 2:
				divider();
				int count = 1;
				for (Customer c : cList) {
					System.out.println(count++ + ")" + c);
					divider();
				}
				System.out.println(" Enter the number next to the account you want.");
				int val = scan.nextInt();
				Customer temp = cList.get(val - 1);
				divider();
				System.out.println(temp);
				divider();
				System.out
						.println(" What would you like to do?\n 1)deposit\n 2)withdraw\n 3)transfer 4)view\n 5)Exit\n");
				switch (scan.nextInt()) {
				case 1:
					deposit(temp, scan, exit);
					break;
				case 2:
					withDraw(temp, scan, exit);
					break;
				case 3:
					transfer(temp, scan, exit);
					break;
				case 4:
					divider();
					for (Account a : temp.accountList) {
						System.out.println(a);
						divider();
					}
					break;
				case 5:

					break;
				default:
					System.out.println("Not Valid Input!");
					break;
				}

				divider();

				break;
			case 3:
				exit = true;
				break;
			default:
				divider();
				System.out.println("Not Valid Input!");
				break;
			}
		}
	}

	static void adminUser(Scanner scan) {
		boolean exit = false;
		while (!exit) {
			divider();
			System.out.println(" 1) Approve/Deny Accounts\n 2) View Accounts\n 3) Exit to Main\n");
			switch (scan.nextInt()) {
			case 1:
				divider();
				approveDenyAccounts(scan);
				divider();
				break;
			case 2:
				divider();
				int count = 1;
				for (Customer c : cList) {
					System.out.println(count++ + ")" + c);
					divider();
				}
				System.out.println(" Enter the number next to the account you want.");
				int val = scan.nextInt();
				Customer temp = cList.get(val - 1);
				divider();
				System.out.println(temp);
				divider();
				System.out.println(
						" What would you like to do?\n 1)deposit\n 2)withdraw\n 3)transfer\n 4)Edit\n 5)Exit\n");
				switch (scan.nextInt()) {
				case 1:
					deposit(temp, scan, exit);
					break;
				case 2:
					withDraw(temp, scan, exit);
					break;
				case 3:
					transfer(temp, scan, exit);
					break;
				case 4:
					editUser(temp, scan, exit);
					break;
				case 5:
					break;
				default:
					System.out.println("Not Valid Input!");
					break;
				}

				divider();

				break;
			case 3:
				exit = true;
				break;
			default:
				divider();
				System.out.println("Not Valid Input!");
				break;
			}
		}

	}

	static void editUser(Customer c, Scanner scan, boolean notExit) {
		System.out.println(c);
		divider();
		System.out.println(" what would you like to edit? ");
		switch (scan.next()) {
		case "username":
			System.out.println(" What would you like to change it to? ");
			c.setUserName(scan.next());
			break;
		case "password":
			System.out.println(" What would you like to change it to? ");
			c.setPassword(scan.next());
		case "permit":
			System.out.println(" What would you like to change it to?\n 1)Standard\n 2)Employee\n 3)Admin");
			switch (scan.nextInt()) {
			case 1:
				c.setPermit(Permissions.CUSTOMER);
				break;
			case 2:
				c.setPermit(Permissions.EMPLOYEE);
				break;
			case 3:
				c.setPermit(Permissions.ADMIN);
				break;
			default:
				System.out.println("Not a Valid Input!");
				break;
			}
			break;
		default:
			break;
		}
	}

	static void approveDenyAccounts(Scanner scan) {
		int temp = 0;
		for (Customer c : cList) {
			for (Account a : c.accountList) {
				if (a.getStatus().equals(AccountStatus.PENDING)) {
					temp++;
					divider();
					System.out.println(a);
					System.out.println(" 1)Approve\n 2)Deny");
					switch (scan.nextInt()) {
					case 1:
						a.setStatus(AccountStatus.OPEN);
						break;
					case 2:
						c.accountList.remove(a);
						break;

					default:
						break;
					}

				}
			}
		}
		if (temp == 0) {
			System.out.println("No Accounts Needing Approval!");
		}
		writeObject(filename, cList);
		writeObject(cFilename, uIDCount);
	}

	static void viewAccounts(Scanner scan) {
		divider();
		for (Customer c : cList) {
			System.out.println(c);
			divider();
		}

		System.out.println("Enter User ID to modify customer account");

		int ID = scan.nextInt();

		for (Customer c : cList) {
			if (c.ID == ID) {
				System.out.println("1)personal info\n 2)bank account info");
			}
		}
	}

	static void divider() {
		System.out.println(
				"\r\n*************************************************************************************************\r\n");
	}

	static void createEmployee(Scanner scan) {
		String username = "";
		String password = "";
		System.out.println("Please enter a username? ");
		username = scan.next();
		boolean temp = true;
		while (temp) {
			System.out.println("You Entered " + username + " is this correct? y or n ");
			switch (scan.next()) {

			case "y":
				temp = false;
				for (Customer c : cList) {
					if (c.getUserName().equals(username)) {
						System.out.println("User name already taken!");
						return;
					}
				}
				while (true) {
					System.out.println("Please enter a password: ");
					password = scan.next();
					System.out.println("Confirm password: ");
					if (password.equals(scan.next())) {
						temp = false;
						break;
					} else {
						System.out.println("Passwords don't match");
					}
				}
				break;

			case "n":
				System.out.println("Enter new username");
				username = scan.next();
				temp = true;
				break;

			default:
				System.out.println("Not a valid input, enter lowercase y or n ");
				break;
			}
		}

		Customer customer = new Customer(username, password, uIDCount++, Permissions.EMPLOYEE);
		cList.add(customer);
		writeObject(cFilename, uIDCount);
		writeObject(filename, cList);
	}

	static void createAdmin(Scanner scan) {
		String username = "";
		String password = "";
		System.out.println("Please enter a username? ");
		username = scan.next();
		boolean temp = true;
		while (temp) {
			System.out.println("You Entered " + username + " is this correct? y or n ");
			switch (scan.next()) {

			case "y":
				temp = false;
				for (Customer c : cList) {
					if (c.getUserName().equals(username)) {
						System.out.println("User name already taken!");
						return;
					}
				}
				while (true) {
					System.out.println("Please enter a password: ");
					password = scan.next();
					System.out.println("Confirm password: ");
					if (password.equals(scan.next())) {
						temp = false;
						break;
					} else {
						System.out.println("Passwords don't match");
					}
				}
				break;

			case "n":
				System.out.println("Enter new username");
				username = scan.next();
				temp = true;
				break;

			default:
				System.out.println("Not a valid input, enter lowercase y or n ");
				break;
			}

		}

		Customer customer = new Customer(username, password, uIDCount++, Permissions.ADMIN);
		cList.add(customer);
		writeObject(cFilename, uIDCount);
		writeObject(filename, cList);
	}

	static void applyForUserAccount(Scanner scan) {

		String username = "";
		String password = "";
		System.out.println("Please enter a username? ");
		username = scan.next();
		boolean temp = true;
		while (temp) {
			System.out.println("You Entered " + username + " is this correct? y or n ");
			switch (scan.next()) {

			case "y":
				temp = false;
				for (Customer c : cList) {
					if (c.getUserName().equals(username)) {
						System.out.println("User name already taken!");
						return;
					}
				}
				while (true) {
					System.out.println("Please enter a password: ");
					password = scan.next();
					System.out.println("Confirm password: ");
					if (password.equals(scan.next())) {
						temp = false;
						break;
					} else {
						System.out.println("Passwords don't match");
					}
				}
				break;

			case "n":
				System.out.println("Enter new username");
				username = scan.next();
				temp = true;
				break;

			default:
				System.out.println("Not a valid input, enter lowercase y or n ");
				break;
			}

		}

		Customer customer = new Customer(username, password, uIDCount++, Permissions.CUSTOMER);
		cList.add(customer);
		writeObject(cFilename, uIDCount);
		writeObject(filename, cList);

	}

	public static void writeObject(String filename, Object obj) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {

			oos.writeObject(obj);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Object readObject(String filename) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			Object obj = ois.readObject();
			return obj;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
