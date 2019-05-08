package com.project0;

import java.util.Scanner;

public class CustomerMenu {
	public static void menu() {
		System.out.println("___________________________________________");
		System.out.println("What do you want to do today?");
		System.out.println("Press 1 - Withdraw");
		System.out.println("Press 2 - Deposit");
		System.out.println("Press 3 - View Your Account Information");
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
			System.out.println("5/ Your Information");
			InfoPage.infoPage();
			break;
		case 4:
			System.out.println("4/Cancel Your Account");
			System.out.println("Are you sure? (y/n)");
			Scanner myObj3 = new Scanner(System.in);
			String s = myObj3.nextLine();
			if (s.equals("y") || (s.equals("Y"))) {
				System.out.println("Withdraw all your balance now ");
				System.out.println("The process is DONE ");
				Information.userName = null;
				Information.userID = null;
				Information.userPassword = null;
				Information.userBalance = null;
				InformationObject information = new InformationObject(Information.userName, Information.userID,
						Information.userPassword, Information.userBalance);

				System.out.println(information);
			} else if (s.equals("n") || (s.equals("N"))) {
				System.out.println("To view your balance [Press 3]");
			} else {
				System.out.println("Wrong Input");
			}
			break;
		case 5:
			System.out.println("Thank you for your time ...");
			break;
		}
	}
}
