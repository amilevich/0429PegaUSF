package com.example.bank;
import java.util.Scanner;
public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Bank theBank = new Bank("Bank of Banks");
		
		//add user
		User aUser = theBank.addUser("Chris", "Ripple", "1224");
		
		//Account newAccount = new Account("Checking", aUser, theBank);
		
		//add a checking account for user
		Account newAccount = new Account("Checking", aUser, theBank);
		aUser.addAccount(newAccount);
		theBank.addAccount(newAccount);
		
		User curUser;
		while(true) {
			
			curUser = ATM.mainMenuPrompt(theBank, sc);
			 ATM.printUserMenu(curUser, sc);
		}

		
	}
	public static User mainMenuPrompt(Bank theBank, Scanner sc) {
		String userID;
		String pin;
		User authUser;
		
		//ask user for ID and Pin
		do {
			System.out.printf("\n\nWelcome to the %s\n\n", theBank.getName());
			System.out.println("Enter user ID: ");
			userID = sc.nextLine();
			System.out.println("Enter pin ");
			pin = sc.nextLine();
			
		 
		authUser = theBank.userLogin(userID, pin);
			if(authUser == null) {
				System.out.println("Incorrect combination!! Try Again");
			}
			//if it is a bad login and continue loop until correct
		}while(authUser == null);
		return authUser;
	}
public static void printUserMenu(User theUser, Scanner sc) {
	theUser.printAccountSummary();
	
	int choice;
	
	do {
		System.out.printf("Welcome %s, How can I help You Today? ",
				theUser.getFirstName());
		System.out.println("1). Account tranaction History");
		System.out.println("2). Withdrawl");
		System.out.println("3). Deposit");
		System.out.println("4). Transfer");
		System.out.println("5). Exit ");
		System.out.println();
		System.out.print("Enter a Choice");
		choice = sc.nextInt();
		
		if(choice < 1 || choice > 5) {
			System.out.println("Please choose between 1-5");
			
		}
	}while(choice < 1 || choice > 5);
	
	switch(choice) {
	case 1:
		ATM.showTranactionistory(theUser, sc);
		break;
	case 2:
		ATM.withdrawFunds(theUser, sc);
		break;
	case 3:
		ATM.depositFunds(theUser, sc);
	case 4:
		ATM.transferFunds(theUser, sc);
		break;
	}
	
	//show menu until user quits
	if (choice != 5) {
		ATM.printUserMenu(theUser, sc);
	}
}

public static void showTranactionistory(User theUser, Scanner sc) {
  int theAcct;
  
  do {
	  System.out.printf("Enter the number (1-%d) of the account you would"
	  		+ "like to see: ", theUser.numAccounts()) ;
	  theAcct = sc.nextInt()-1;
	  if(theAcct< 0 || theAcct >+ theUser.numAccounts()) {
		  System.out.println("Try Again, The Account is Invalid");
	  }	  
  }while(theAcct < 0 || theAcct >= theUser.numAccounts());
  
  //print the history
  theUser.printTranactionHistory(theAcct);
	
}
public static void transferFunds(User theUser, Scanner sc) {
	  int fromAcct;
	  int toAcct;
	  double amount;
	  double acctBal;
	  
	  do {
		  System.out.printf("Enter the number (1-%d) of the account you would"
		  		+ "like to see: ", theUser.numAccounts()) ;
		 fromAcct = sc.nextInt()-1;
		  if(fromAcct< 0 || fromAcct >+ theUser.numAccounts()) {
			  System.out.println("Try Again, The Account is Invalid");
		  }	  
	  }while(fromAcct < 0 || fromAcct >= theUser.numAccounts());
	  acctBal = theUser.getAcctBalance(fromAcct);
	  
	  //get account to trans funds
	  do {
		  System.out.printf("Enter the number (1-%d) of the account you would"
		  		+ "like to transfer to: ", theUser.numAccounts()) ;
		 toAcct = sc.nextInt()-1;
		  if(toAcct< 0 || toAcct >+ theUser.numAccounts()) {
			  System.out.println("Try Again, The Account is Invalid");
		  }	  
	  }while(toAcct < 0 || toAcct >= theUser.numAccounts());
	  //get amount to transfer
	  do {
		  System.out.printf("enter the amount to transfer! " +"No more than have in your account");
		  amount =sc.nextDouble();
		  if(amount < 0 ) {
			  System.out.println("Amount must be greater than 0");
		  }else if (amount > acctBal) {
			  System.out.println("Amount cannot be greater than your " + acctBal);
		  }
		  
	  }while(amount < 0 || amount > acctBal);
	  //Transfer
	  theUser.addAcctTransaction(fromAcct, -1*amount, String.format("Transfer to account %s",
			  theUser.getAcctUUID(toAcct)));
	  theUser.addAcctTransaction(toAcct, -1*amount, String.format("Transfer to account %s",
			  theUser.getAcctUUID(fromAcct)));
	  
}
public static void withdrawFunds(User theUser, Scanner sc) {
	int fromAcct;
	  int toAcct;
	  double amount;
	  double acctBal;
	  String memo;
	  do {
		  System.out.printf("Enter the number (1-%d) of the account you would"
		  		+ "like to see: ", theUser.numAccounts()) ;
		 fromAcct = sc.nextInt()-1;
		  if(fromAcct< 0 || fromAcct >+ theUser.numAccounts()) {
			  System.out.println("Try Again, The Account is Invalid");
		  }	  
	  }while(fromAcct < 0 || fromAcct >= theUser.numAccounts());
	  acctBal = theUser.getAcctBalance(fromAcct);
	  
	  do {
		  System.out.printf("enter the amount to transfer! " +"No more than have in your account");
		  amount =sc.nextDouble();
		  if(amount < 0 ) {
			  System.out.println("Amount must be greater than 0");
		  }else if (amount > acctBal) {
			  System.out.println("Amount cannot be greater than your " + acctBal);
		  }
		  
	  }while(amount < 0 || amount > acctBal);
	  sc.nextLine();
	  
	  //get memo
	  System.out.println("Enter a memo: ");
	  memo = sc.nextLine();
	  
	  //withdraw
	  theUser.addAcctTransaction(fromAcct, -1*amount, memo);
	  
}
public static void depositFunds(User theUser, Scanner sc) {
	 int toAcct;
	  double amount;
	  double acctBal;
	  String memo;
	  do {
		  System.out.printf("Enter the number (1-%d) of the account you would"
		  		+ "like to see: ", theUser.numAccounts()) ;
		 toAcct = sc.nextInt()-1;
		  if(toAcct< 0 || toAcct >+ theUser.numAccounts()) {
			  System.out.println("Try Again, The Account is Invalid");
		  }	  
	  }while(toAcct < 0 || toAcct >= theUser.numAccounts());
	  acctBal = theUser.getAcctBalance(toAcct);
	  
	  do {
		  System.out.printf("enter the amount to transfer! " +"No more than have in your account");
		  amount =sc.nextDouble();
		  if(amount < 0 ) {
			  System.out.println("Amount must be greater than 0");
		  }else if (amount > acctBal) {
			  System.out.println("Amount cannot be greater than your " + acctBal);
		  }
		  
	  }while(amount < 0 || amount > acctBal);
	  sc.nextLine();
	  
	  //get memo
	  System.out.println("Enter a memo: ");
	  memo = sc.nextLine();
	  
	  //withdraw
	  theUser.addAcctTransaction(toAcct, amount, memo);
	  
}
}
