package BankingApp;

import java.util.*;

 public class App{
	
	public App() {
		
	}
	
	public static void casemethod(int n)
	{
		switch(n)
		{
		
			
		case 1: 
		
		Customer c = new Customer();
		Scanner register = new Scanner (System.in);
		System.out.println("Please enter your first name: ");	
		String fName = register.next();
		c.setfName(fName);
		System.out.println("Please enter your last name: ");
		String lName = register.next();
		c.setlName(lName);
		System.out.println("Enter a username: ");
		String uName = register.next();
		c.setuName(uName);
		System.out.println("Enter a secure password: ");
		String pass = register.next();
		c.setPass(pass);
		
		System.out.println(c.toString());
		System.out.println("Would you like to apply to a new account with this info? \n"
				+ "1: YES \n"
				+ "2: NO");
		Scanner applyOption2 = new Scanner (System.in);
		int y = applyOption2.nextInt();
		if (y == 1)
			System.out.println("Your application has been submitted for approval.");
		if (y == 2)
			System.out.println("Oh, okay");
			break;
		
		case 2: System.out.println("Welcome returning user, please enter your username and password");
		Scanner rUser = new Scanner (System.in);
		System.out.println("Username: ");
		String r1 = rUser.next();
		System.out.println("Password: ");
		String r2 = rUser.next();
		System.out.println("Welcome " + r1 + ", what would you like to do? \n");
		System.out.println("\n --------------------------------------------- \n"
							+ "1: Withdraw \n"
							+ "2: Deposit \n"
							+ "3: Transfer \n");
		int r3;
		 	r3 = rUser.nextInt();
			switch(r3) {
			
			case 1: System.out.println("\n How much would you like to withdraw?");
			Scanner options = new Scanner(System.in);
			String o1 = options.next();
			System.out.println("\n Withdrawing: $" + o1);
			break;
			
			case 2: System.out.println("\n How much would you like to deposit?");
			Scanner options2 = new Scanner(System.in);
			String o2 = options2.next();
			System.out.println("\n Depositing: $" + o2);
			System.out.println("\n Are you done? \n1:Yes \n2:No");
			int o6 = options2.nextInt();
			if (o6 == 1) {
				System.out.println("Thank you, come again!");
			}
			break;
			
			case 3: System.out.println("\n How much would you like to transfer?");
			Scanner options3 = new Scanner(System.in);
			String o3 = options3.next();
			System.out.println("\n Which acc would you like to transfer to?"
					+ "\n Please enter username: ");
			String o4 = options3.next();
			System.out.println("\n Are you sure you want to send $" + o3 + " to " + o4 + "?");
			System.out.println("\n 1:YES \n 2:No");
			String o5 = options3.next();
			System.out.println("Confirmed! Sending " + o3 + " to " + o4);
			System.out.println("\n Are you done? \n1:Yes \n2:No");
			int o7 = options3.nextInt();
			if (o7 == 1) {
				System.out.println("Thank you, come again!");
			}
			break;
			
			
			}
			/*default: System.out.println("\nWould you like to end session? \n1:Yes \n2:NO");
			Scanner choice = new Scanner(System.in);
			
			int c1 = choice.nextInt();
			if (c1 == 1) {
				System.out.println("Thank you, come again!");
			} */
			
			break; 
			
		case 3: System.out.println("\nHello employee, please login");
		Scanner emp = new Scanner(System.in);
		System.out.println("\nUsername: ");
		String e1 = emp.nextLine();
		System.out.println("Password: ");
		String e2 = emp.next();
		System.out.println("\nWelcome " + e1 + ", what would you like to do?");
		System.out.println("\n 1: View accounts"
				+ "\n 2: View applications");
		int e3;
			e3 = emp.nextInt();
			switch(e3) {
			
			case 1: System.out.println("\nAccounts on file: "
					+ "\n[Username: LauraC, Name: Laura Chen, Password: elephant]"
					+ "\n	~~Balance: $450 "
					+ "\n[Username: Jeff43, Name: Jefferson Jay, Password: lemons]"
					+ "\n	~~Balance: $1300 "
					+ "\n[Username: Jimmyd, Name: Jimmy Do, Password: eatme]"
					+ "\n	~~Balance: $0");
			break;
			
			case 2: System.out.println("\nHere are current applications "
					+ "\nCustomer [FirstName: john, Last Name: le, Username: johnle, password: abcd] "
					+ "\n\nApprove account? \n1:Yes \n2:No");
			int e4;
		 		e4 = emp.nextInt();
		 		switch(e4) {
			
		 		case 1: System.out.println("\nApproved");
			
			
		 		case 2: System.out.println("\nDenied");
			 
			
		 		}
				default: System.out.println("\nWould you like to end session? \n1:Yes \n2:NO");
				Scanner choice1 = new Scanner(System.in);
			
				int c11 = choice1.nextInt();
				if (c11 == 1) {
				System.out.println("Thank you, come again!");
				}
			}
			/*default: System.out.println("\nWould you like to end session? \n1:Yes \n2:NO");
			Scanner choice6 = new Scanner(System.in);
			
			int c6 = choice6.nextInt();
			if (c6 == 1) {
			System.out.println("Thank you, come again!"); */
			break; 
			
			
		case 4: System.out.println("\nHello Admin, please enter your username and password");
		Scanner admin = new Scanner (System.in);
		System.out.println("Username: ");
		String a1 = admin.next();
		System.out.println("Password: ");
		String a2 = admin.next();
		System.out.println("\nWelcome Administrator, what would you like to do?");
		System.out.println("\n 1: View account applications"
				+ "\n 2: View account transactions"
				+ "\n 3: Cancel an account");
		int a3;
			a3 = admin.nextInt();
			switch (a3) {
			
			case 1: System.out.println("\nHere are the current applications");
					System.out.println("\nNone \n\n Recently Approved/Denied Applications: \n");
					System.out.println("\nCustomer [FirstName: john, Last Name: le, Username: johnle, password: abcd]"
							+ "\nStatus: Denied");
					System.out.println("\n Are you done? \n1:Yes \n2:No");
					int a4 = admin.nextInt();
					if (a4 == 1) {
						System.out.println("Thank you, come again!");
					} else if(a4 == 2) {
						System.out.println("\n2: View account transactions "
								+ "\n3: Cancel an account");
						int a7 = admin.nextInt();
						if (a7 == 3) {
							System.out.println("\nPlease select an account"
									+ "\n 1: LauraC, Laura Chan, pass: elephant, $450, -$75 \n"
									+ "\n 2: Jeff, Jefferson Jay, pass: lemons, $1300, +$650 \n"
									+ "\n 3: Jimmyd, Jimmy Do, pass: plays, $0, 0");
									Scanner choice3 = new Scanner(System.in);
									int c5 = choice3.nextInt();
									
									if (c5 == 3) {
										System.out.println("\nAre you sure? "
												+ "\n1: YES "
												+ "\n2: NO");
										int c6 = choice3.nextInt();
										System.out.println("\nDone, deleted"
												+ "\nAccounts on file: " 
												+ "\n~~LauraC, Laura Chan, pass: elephant, $450, -$75"
												+ "\n~~Jeff, Jefferson Jay, pass: lemons, $1300, +$650");
									}
									System.out.println("\n Are you done? \n1:Yes \n2:No");
									int a6 = admin.nextInt();
									if (a6 == 1) {
										System.out.println("Thank you, come again!");
									}
						}
					}
					break;
					
			case 2: System.out.println("\nAccounts on file: \n "
					+ "\n~~LauraC, Laura Chan, pass: elephant, $450, +$75 \n"
					+ "\n~~Jeff, Jefferson Jay, pass: lemons, $1300, +$650 \n"
					+ "\n~~Jimmyd, Jimmy Do, pass: plays, $0, 0 \n");
					System.out.println("\n Are you done? \n1:Yes \n2:No");
					int a5 = admin.nextInt();
					if (a5 == 1) {
						System.out.println("Thank you, come again!");
					}
					break;
			
			case 3: System.out.println("\nPlease select an account"
					+ "\n 1: LauraC, Laura Chan, pass: elephant, $450, -$75 \n"
					+ "\n 2: Jeff, Jefferson Jay, pass: lemons, $1300, +$650 \n"
					+ "\n 3: Jimmyd, Jimmy Do, pass: plays, $0, 0");
					Scanner choice3 = new Scanner(System.in);
					int c5 = choice3.nextInt();
					
					if (c5 == 3) {
						System.out.println("\nAre you sure? "
								+ "\n1: YES "
								+ "\n2: NO");
						int c6 = choice3.nextInt();
						System.out.println("\nDone, deleted"
								+ "\nAccounts on file: " 
								+ "\n~~LauraC, Laura Chan, pass: elephant, $450, -$75"
								+ "\n~~Jeff, Jefferson Jay, pass: lemons, $1300, +$650");
					}
					System.out.println("\n Are you done? \n1:Yes \n2:No");
					int a6 = admin.nextInt();
					if (a6 == 1) {
						System.out.println("Thank you, come again!");
					}
				break;
				
			}
		
			break;
		
		default: System.out.println("\nWould you like to end session? \n1:Yes \n2:NO");
		Scanner choice = new Scanner(System.in);
		
		int c1 = choice.nextInt();
		if (c1 == 1) {
			System.out.println("Thank you, come again!");
		}
			}
		
		}
		
		
	
	

	public static void main (String [] args) {
		
		System.out.println("Welcome, please select an option \n"
				+ "1: Create new account \n"
				+ "2: Returning User \n"
				+ "3: Employee Login \n"
				+ "4: Admin Login \n");
		Scanner option = new Scanner (System.in);
		int welcomeOption = option.nextInt();
		
		casemethod(welcomeOption);
		
		

		
		
		
				
	}
	
	
	

} 


