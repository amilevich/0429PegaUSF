package com.banker;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		LoginScreen Credentials = new LoginScreen();
		Scanner MainMenu = new Scanner(System.in) ;
		Serialization InfoStorer = new Serialization();
		PendingAccountsAndActions variableDo = new PendingAccountsAndActions();
		System.out.println("Please Select One of the Following:");
		System.out.println("Set up an account --> 1");
		System.out.println("Current Customer --> 2");
		int selection0=MainMenu.nextInt();
		switch(selection0) {
			   case 1 :{
				   BankAccount JaneDoe=new BankAccount(); 
				   CreateAccount NewCustomer = new CreateAccount();
				   NewCustomer.Register(JaneDoe);
				   String filename =Long.toString(JaneDoe.getAccount())+".txt";
				   InfoStorer.writeObject("PendingFiles/"+filename, JaneDoe);
				   variableDo.writeToMaster(JaneDoe);
				   
			   }
			   break;
			   
//			   case 2: {
//				   System.out.println("Please Enter Username: ");
//				   String username0=MainMenu.nextLine();
//				   String password0=MainMenu.nextLine();
//				   LoginScreen() LoggingIn = new LoginScreen();
//				   boolean loginbool=LoginScreen.run();
//				   if (loginbool) {
//					   BankAccount JohnDoe = new BankAccount();
//					   System.out.println("What would you like to do?");
//					   System.out.println("View Account Balance -->1");
//					   System.out.println("Deposit -->2");
//					   System.out.println("Withdraw -->3");
//					   int selection1=MainMenu.nextInt();
//					   switch(selection1) {
//					   	case 1 : {						   
//					   		System.out.println(JohnDoe.getAccount());
//					   	}
//					   	case 2 :{
//					   		System.out.println("How much would you like to deposit?");
//					   		double deposit=MainMenu.nextDouble();
//					   		JohnDoe.setBalance(JohnDoe.getBalance()+deposit);
//					   		writer.DocumentDeposit(JohnDoe);
//					   		}
//					   	case 3 : {
//					   		System.out.println("How much would you like to withdraw?");
//					   		double withdraw=MainMenu.nextDouble();
//					   		JohnDoe.setBalance(JohnDoe.getBalance()-withdraw);
//					   		}
//					   }
//				   }
//				   else {System.out.println("Login Failed, Please Try Again");}
//				   
//				   }
//			   
//			   
//			   case 3 : {
//				   System.out.println("View Existing Account -->1");
//				   System.out.println("Approve New Account -->2");
//				   System.out.println("Modify Account Details-->3");
//				   
//			   }
//	
//			   case 4 : {
//				   System.out.println("Please Enter Username: ");
//				   String username0=MainMenu.nextLine();
//				   String password0=MainMenu.nextLine();
//				   LoginScreen() LoggingIn = new LoginScreen();
//				   boolean loginbool=LoginScreen.run();
//				   if (loginbool) {
//					   BankAccount JohnDoe = new BankAccount();
//					   System.out.println("What would you like to do?");
//					   System.out.println("ApproveAccounts -->1");
//					   System.out.println("Approve Deposits -->2");
//					   System.out.println("Approve Withdraws -->3");
//					   switch 
//				   
//			   }
//				   case 5 : {
//					   System.out.println("Please Enter Username: ");
//					   String username0=MainMenu.nextLine();
//					   String password0=MainMenu.nextLine();
//					   LoginScreen() LoggingIn = new LoginScreen();
//					   boolean loginbool=LoginScreen.run();
//					   if (loginbool) {
//						   BankAccount JohnDoe = new BankAccount();
//						   System.out.println("What would you like to do?");
//						   System.out.println("ApproveAccounts -->1");
//						   System.out.println("Approve Deposits -->2");
//						   System.out.println("Approve Withdraws -->3");
//						   System.out.println("Modify Accounts -->4");
//						   System.out.println("Cancel Accounts -->5");
//						   int selectionadmin=MainMenu.nextInt();
//						   switch(selectionadmin) {
//						   case 1 : {
//						   }
//						   }
//						
			   
			   
			
		
		}

	}

}
