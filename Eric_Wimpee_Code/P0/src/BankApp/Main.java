package BankApp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main implements java.io.Serializable

{

	Map<String, Customer> customerMap;

	Main()

	{

		customerMap = new HashMap<String, Customer>();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Customer customer;

		String username, password;
		double amount;

		Main bank = new Main();

		int choice;

		outer: while (true)

		{

			System.out.println("\n-------------------");

			System.out.println("FirSTS National (Data)Bank");

			System.out.println("-------------------\n");

			System.out.println("1. Register account.");

			System.out.println("2. Login.");

			System.out.println("3. Update accounts.");

			System.out.println("4. Login as Bank employee.");

			System.out.println("5. Exit.");

			System.out.print("\nEnter your choice : ");

			choice = sc.nextInt();

			sc.nextLine();

			switch (choice)

			{

			case 1:

				System.out.print("Enter customer Name : ");

				String name = sc.nextLine();

				System.out.print("Enter your Address: ");

				String address = sc.nextLine();

				System.out.print("Enter contact number: ");

				String phone = sc.nextLine();

				System.out.println("Select Username: ");

				username = sc.next();

				while (bank.customerMap.containsKey(username))

				{

					System.out.println("Username already exists. Please select another username: ");

					username = sc.next();

				}

				System.out.println(
						"Please set a password (minimum 8 chars; minimum 1 digit, 1 lowercase, 1 uppercase, 1 special character[!@#$%^&*_]) :");
				password = sc.next();

				sc.nextLine();

				while (!password.matches((("(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*_]).{8,}"))))

				{

					System.out.println("Invalid password condition. Please set again:");

					password = sc.next();

				}

				System.out.print("Please enter your initial deposit amount: ");

				amount = sc.nextDouble();

				customer = new Customer(username, password, name, address, phone, amount, new Date());

				bank.customerMap.put(username, customer);

				break;

			case 2:

				System.out.println("Enter username: ");

				username = sc.next();

				sc.nextLine();

				System.out.println("Enter password: ");

				password = sc.next();

				sc.nextLine();

				if (bank.customerMap.containsKey(username))

				{

					customer = bank.customerMap.get(username);

					if (customer.password.equals(password))

					{

						while (true)

						{

							System.out.println("\n-------------------");

							System.out.println("W E L C O M E");

							System.out.println("-------------------\n");

							System.out.println("1. Deposit.");

							System.out.println("2. Transfer.");

							System.out.println("3. Last 5 transactions.");

							System.out.println("4. User information.");

							System.out.println("5. Log out.");
							System.out.print("\nEnter your choice : ");

							choice = sc.nextInt();

							sc.nextLine();

							switch (choice)

							{

							case 1:

								System.out.print("Enter amount : ");

								while (!sc.hasNextDouble())

								{

									System.out.println("Invalid amount. Please enter the amount to deposit:");

									sc.nextLine();

								}

								amount = sc.nextDouble();

								sc.nextLine();

								customer.deposit(amount, new Date());

								break;

							case 2:

								System.out.print("Enter Username of transfer Receiver: ");

								username = sc.next();

								sc.nextLine();

								System.out.println("Enter amount: ");

								while (!sc.hasNextDouble())

								{

									System.out.println("Invalid amount. Please enter amount to transfer:");

									sc.nextLine();

								}

								amount = sc.nextDouble();

								sc.nextLine();

								if (amount > 300000)

								{

									System.out.println("Transfer limit exceeded. Please contact customer support.");

									break;

								}

								if (bank.customerMap.containsKey(username))

								{

									Customer payee = bank.customerMap.get(username);

									payee.deposit(amount, new Date());

									customer.withdraw(amount, new Date());

								}

								else

								{

									System.out.println("Username does not exist. Please enter a valid Username.");

								}

								break;

							case 3:

								for (String transactions : customer.transactions)

								{

									System.out.println(transactions);

								}

								break;

							case 4:

								System.out.println("Accountholder name : " + customer.name);

								System.out.println("Accountholder address : " + customer.address);

								System.out.println("Accountholder contact : " + customer.phone);

								break;

							case 5:

								continue outer;

							default:

								System.out.println("Invalid choice!");
							}

						}

					}

					else

					{

						System.out.println("Invalid username/password.");

					}

				}

				else

				{

					System.out.println("Invalid username/password.");

				}

				break;

			case 4:

				System.out.println("Enter username : ");

				username = sc.next();

				sc.nextLine();

				System.out.println("Enter password : ");

				password = sc.next();

				sc.nextLine();

				if (username.equals("emp") && password.equals("1234")) // sample Employee Login

				{

					while (true)

					{

						System.out.println("\n-------------------");

						System.out.println("W E L C O M E");

						System.out.println("-------------------\n");

						System.out.println("1. View account information of all the customers.");

						System.out.println("2. Log out.");

						System.out.print("\nPlease enter your selection: ");

						choice = sc.nextInt();

						sc.nextLine();

						switch (choice)

						{

						case 1:

							System.out.println("Customer's information");

							System.out.println("username name address phone balance");

							for (Customer v : bank.customerMap.values()) {

								System.out.println(
										v.username + " " + v.name + " " + v.address + " " + v.phone + " " + v.balance);

							}

							break;

						case 2:
							continue outer;

						}

					}

				}

				break;

			case 5:

				String filename = "information.txt";

				// Serialization of all the Bank details.

				try

				{

					// Saving of object in a file

					FileOutputStream file = new FileOutputStream(filename);

					ObjectOutputStream out = new ObjectOutputStream(file);

					out.writeObject(bank);

					out.close();

					file.close();

					System.out.println("Object has been serialized");

				}

				catch (IOException ex) {

				}

				System.out.println("\nThank you for choosing FirSTS National (Data)Bank.");

				System.exit(1);

				break;

			default:

				System.out.println("Invalid choice. Please make a selection.");

			}

		}

	}

}
