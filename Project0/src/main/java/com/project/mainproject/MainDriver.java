package com.project.mainproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MainDriver {

	public static void main(String[] args) throws IOException {

		ArrayList<AccountDetails> myAccounts = new ArrayList<>();
		myAccounts = FileIn();

		boolean attemptLogin = true;
		boolean loginSuccess = true;

		int ch2;
		System.out.println("Welcome! \n Please press 1 to log in or 2 to create an account. ");
		Scanner lo = new Scanner(System.in);
		ch2 = lo.nextInt();

		if (ch2 == 1) {

			String sign = "Please log in.";
			signBorder(sign);

		} else if (ch2 == 2) {

			NewAccount();

		}

		while (attemptLogin) {

			loginSuccess = true;

			String[] person = login();
			String username = person[0].toLowerCase();
			String password = person[1].toLowerCase();
			String firstName = person[2].toLowerCase();
			String lastName = person[3].toLowerCase();

			while (loginSuccess) {
				for (AccountDetails acc : myAccounts) {
					if ((acc.username.equals(username) && acc.password.equals(password)
							&& acc.firstName.equals(firstName) && acc.lastName.equals(lastName))) {
						myAccounts.remove(acc);
						System.out.println("");
						System.out.println("*****Welcome To JAVA Bank, " + firstName.toUpperCase() + "!*****");
						System.out.println("");
						int choice;
						choice = menu();

						AccountDetails userAccount = new AccountDetails(acc.username, acc.password, acc.firstName,
								acc.lastName, acc.balance, acc.lastTransaction);
						AccountDetails account = gatheredData(userAccount, choice);
						if (choice == 5) {
							System.out.println("*****Thanks for choosing JAVA Bank!*****");
							myAccounts.add(account);
							FileOut(myAccounts);
							loginSuccess = false;
							FileIn();
							break;
						}
						myAccounts.add(account);
						attemptLogin = false;
						FileOut(myAccounts);
						loginSuccess = true;
						break;
					} else if (!(acc.username.equals(username)) || !(acc.password.equals(password))
							|| !(acc.firstName.equals(firstName) || !(acc.lastName.equals(lastName)))) {
						attemptLogin = true;
						loginSuccess = false;
					}
				}
			}
		}

		FileOut(myAccounts);
	}

	public static String[] login() {
		String[] person = scanForUser();
		return person;
	}

	public static void signBorder(String sign) {
		for (int i = 0; i < sign.length() + 3; i++) {
			System.out.print("-");
		}
		System.out.println("\n| " + sign + " | ");
		for (int i = 0; i < sign.length() + 3; i++) {
			System.out.print("-");
		}
		System.out.println("");
	}

	public static int menu() {
		int choice;
		System.out.println("Main Menu:");
		while (true) {

			for (int i = 0; i < 15; i++) {
				System.out.print("=");
			}
			System.out.println("");
			System.out.println("1. Deposit");
			System.out.println("2. Withdrawal ");
			System.out.println("3. View Current Balance");
			System.out.println("4. View Previous Transaction");
			System.out.println("5. Log Out");
			Scanner sc = new Scanner(System.in);

			try {
				choice = Integer.parseInt(sc.next());
				break;
			} catch (NumberFormatException ignore) {
				System.out.println("Please select one of the available choices.");
			}
		}
		return choice;
	}

	public static String[] scanForUser() {
		String username;
		String password;
		String firstName;
		String lastName;
		String[] person = new String[4];

		Scanner un = new Scanner(System.in);
		System.out.println("Please enter username: ");
		username = un.nextLine();

		person[0] = username;

		Scanner pw = new Scanner(System.in);
		System.out.println("Please enter password: ");
		password = pw.nextLine();

		person[1] = password;

		Scanner fn = new Scanner(System.in);
		System.out.print("Please enter your first name: ");
		firstName = fn.nextLine();

		person[2] = firstName;

		Scanner one1 = new Scanner(System.in);
		System.out.print("Please enter your last name: ");
		lastName = one1.nextLine();

		person[3] = lastName;

		return person;
	}

	public static AccountDetails gatheredData(AccountDetails data, int choice) throws IOException {

		float depositMoney;
		float widthdrawMoney;

		switch (choice) {
		case 1:
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter desired deposit amount.");
			while (true) {
				try {
					depositMoney = Float.parseFloat(sc.next());
					break;
				} catch (NumberFormatException ignore) {
					System.out.println("Please enter a numeric value.");
				}
			}
			data.deposit(depositMoney);
			break;
		case 2:
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Please enter desired withdrawal amount.");
			while (true) {
				try {
					widthdrawMoney = Float.parseFloat(sc2.next());
					break;
				} catch (NumberFormatException ignore) {
					System.out.println("Please enter a numeric value.");
				}
			}
			data.withdraw(widthdrawMoney);
			break;
		case 3:
			data.checkBalance();
			break;
		case 4:
			System.out.println("View Previous Transaction");
			data.getLastTransaction();
			break;
		case 5:
			System.out.println("Log out\n");
			return data;
		default:
			try {
				throw new IOInvalidChoiceException("What would you like to do?");

			} catch (IOInvalidChoiceException ex) {
				ex.printStackTrace();
				System.out.println("Please pick one of the available choices.");
			}

		}
		return data;
	}

	private static ArrayList FileIn() throws IOException {

		System.out.println("Accounts in file: ");
		ArrayList<AccountDetails> myAccounts = new ArrayList<>();

		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader("src/main/resources/Accounts"));
			String line;
			int count = 0;
			while ((line = reader.readLine()) != null) {
				count++;
				String[] data = line.split(",");

				String username = data[0];
				String password = data[1];
				String first = data[2];
				String last = data[3];
				float amount = Float.parseFloat(data[4]);
				float lastTransaction = Float.parseFloat(data[5]);

				AccountDetails userAccount = new AccountDetails(username, password, first, last, amount,
						lastTransaction);
				System.out.println("Username: " + data[0] + "Password: " + data[1] + "First name: " + data[2]
						+ " | Last: " + data[3]);
				myAccounts.add(userAccount);
			}
			System.out.println(count + " Accounts in File\n");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
		System.out.println("");
		return myAccounts;
	}

	private static void FileOut(ArrayList myAccounts) throws IOException {

		FileWriter writer = null;
		try {
			writer = new FileWriter("src/main/resources/Accounts");

			for (int i = 0; i < myAccounts.size(); i++) {
				writer.write(String.valueOf(myAccounts.get(i)) + "\n");
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (writer != null) {
				writer.close();
			}
		}
	}

	public static void NewAccount() throws IOException {
		String[] person = new String[6];

		String username = null;
		String password = null;
		String firstName = null;
		String lastName = null;
		float stipend = 0.0f;
		float thatNumber = 0.0f;

		@SuppressWarnings("resource")
		Scanner us = new Scanner(System.in);
		System.out.print("Please enter your username: ");
		username = us.nextLine();
		person[0] = username;
		;

		@SuppressWarnings("resource")
		Scanner pa = new Scanner(System.in);
		System.out.print("Please enter your password: ");
		password = pa.nextLine();
		person[1] = password;

		@SuppressWarnings("resource")
		Scanner fi = new Scanner(System.in);
		System.out.print("Please enter your first name: ");
		firstName = fi.nextLine();
		person[2] = firstName;

		@SuppressWarnings("resource")
		Scanner la = new Scanner(System.in);
		System.out.print("Please enter your last name: ");
		lastName = la.nextLine();
		person[3] = lastName;

		@SuppressWarnings("resource")
		Scanner st = new Scanner(System.in);
		System.out.println("Please enter a stipend to create the account: ");
		stipend = st.nextFloat();

		person[4] = Float.toString(stipend);

		person[5] = Float.toString(thatNumber);

		Files.write(Paths.get("src/main/resources/Accounts"),
				Collections.singleton(Arrays.toString(person).replaceAll("\\s+|\\[+|\\]+", "")),
				StandardOpenOption.APPEND);

		System.out.println("Account successfully created. Welcome!");

	}

	public static void Employee() throws IOException {

		String username;
		String password;
		String firstName;
		String lastName;
		String[] person = new String[4];

		Scanner u = new Scanner(System.in);
		System.out.print("Please enter a username: ");
		username = u.nextLine();

		person[0] = username;

		Scanner p = new Scanner(System.in);
		System.out.print("Please enter a password: ");
		password = p.nextLine();

		person[1] = password;

		Scanner f = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		firstName = f.nextLine();

		person[2] = firstName;

		Scanner l = new Scanner(System.in);
		System.out.println("Please enter your last name: ");
		lastName = l.nextLine();

		person[3] = lastName;

		ArrayList<AccountDetails> myAccounts = new ArrayList<>();

		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader("Resources/Account1"));
			String line;
			int count = 0;
			while ((line = reader.readLine()) != null) {
				count++;
				String[] data = line.split(",");

				String user = data[0];
				String pass = data[1];
				String first = data[2];
				String last = data[3];
				float amount = Float.parseFloat(data[4]);
				float lastTransaction = Float.parseFloat(data[5]);

				AccountDetails userAccount = new AccountDetails(user, pass, first, last, amount, lastTransaction);
				FileIn1();

				System.out.println("Select the number of the account you wish to manipulate.");
				System.exit(0);

			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
		System.out.println("");

	}

	public static ArrayList FileIn1() throws IOException {

		ArrayList<AccountDetails> myAccounts = new ArrayList<>();

		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader("Resources/Accounts"));
			String line;
			int count = 0;
			while ((line = reader.readLine()) != null) {
				count++;
				String[] data = line.split(",");

				String user = data[0];
				String pass = data[1];
				String first = data[2];
				String last = data[3];
				float amount = Float.parseFloat(data[4]);
				float lastTransaction = Float.parseFloat(data[6]);

				AccountDetails userAccount = new AccountDetails(user, pass, first, last, amount, lastTransaction);
				System.out.println(count + ". Username: " + data[0] + " | Password: " + data[1] + " | First Name: "
						+ data[2] + " | Last Name: " + data[3]);
				myAccounts.add(userAccount);
			}
			System.out.println("\n" + count + " -->Total Accounts in File\n");

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (reader != null) {
				reader.close();
			}
		}
		System.out.println("");
		return null;
	}

}
