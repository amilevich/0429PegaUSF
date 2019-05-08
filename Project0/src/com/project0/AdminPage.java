package com.project0;

import java.util.Scanner;

public class AdminPage {
	public static void menu() {
		System.out.println("___________________________________________");
		System.out.println("What do you want to do today?");
		System.out.println("Press 1 - Withdraw");
		System.out.println("Press 2 - Deposit");
		System.out.println("Press 3 - Approve/Deny Customer Account (A/D)");
		System.out.println("Press 4 - Cancel the Account");
		System.out.println("Press 5 - Logout");
		System.out.println("___________________________________________");
	}

	public static void customerMenu(int x) {

		switch (x) {
		case 1:
			System.out.println("1/ Withdraw Money");
			Scanner myObj1 = new Scanner(System.in);
			System.out.println("Enter The Amount to Withdraw: ");
			double amount_1 = myObj1.nextDouble();
			double sum_1 = Calculation.withdraw(amount_1, Information.userBalance);
			Information.userBalance = sum_1;
			System.out.println("Your Current Balance: $" + sum_1);
			break;
		case 2:
			System.out.println("2/ Deposit Money");
			Scanner myObj2 = new Scanner(System.in);
			System.out.println("Enter The Amount to Deposit: ");
			double amount_2 = myObj2.nextDouble();
			double sum_2 = Calculation.add(amount_2, Information.userBalance);
			Information.userBalance = sum_2;
			System.out.println("Your Current Balance: $" + sum_2);
			break;
		case 3:
			System.out.println("3/ Approve/Deny Customer Account (A/D)");
			Scanner myObj4 = new Scanner(System.in);
			String s = myObj4.nextLine();
			if (s.equals("D") || (s.equals("d"))) {
				System.out.println("The process is DONE ");
				Information.userName = null;
				Information.userID = null;
				Information.userPassword = null;
				Information.userBalance = null;
				InformationObject information = new InformationObject(Information.userName, Information.userID,
						Information.userPassword, Information.userBalance);

				System.out.println(information);
			} else if (s.equals("a") || (s.equals("A"))) {
				System.out.println("Approve the Application - DONE ");
			} else {
				System.out.println("Wrong Input");
			}
			break;
		case 4:
			System.out.println("4/ Delete Customer Account");
			System.out.println("Are you sure? (y/n)");
			Scanner myObj3 = new Scanner(System.in);
			String s1 = myObj3.nextLine();
			if (s1.equals("y") || (s1.equals("Y"))) {
				System.out.println("The process is DONE ");
				Information.userName = null;
				Information.userID = null;
				Information.userPassword = null;
				Information.userBalance = null;
				InformationObject information = new InformationObject(Information.userName, Information.userID,
						Information.userPassword, Information.userBalance);

				System.out.println(information);
			} else if (s1.equals("n") || (s1.equals("N"))) {
				System.out.println("You choose [N]");
			} else {
				System.out.println("Wrong Input");
			}
			break;
		case 5:
			System.out.println("Exiting ...");
			break;
		}
	}
}
