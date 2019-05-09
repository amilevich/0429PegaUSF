package com.banker;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Employee EmpLogon = new Employee();
		Scanner IntScan = new Scanner(System.in);
		Scanner MainMenu = new Scanner(System.in) ;
		Serialization writer = new Serialization();		
		PendingAccountsAndActions variableDo = new PendingAccountsAndActions();
		RetrieveUserPass retriever = new RetrieveUserPass();
		System.out.println("Please Select One of the Following:");
		System.out.println("Set up an Account --> 1");
		System.out.println("Current Customer --> 2");
		int selection0=IntScan.nextInt();
		switch(selection0) {
			   case 1 :{
				   BankAccount JaneDoe=new BankAccount(); 
				   CreateAccount NewCustomer = new CreateAccount();
				   CreateAccount.Register(JaneDoe);
				   String filename =Long.toString(JaneDoe.getAccount())+".txt";
				   Serialization.writeObject("PendingFiles/"+filename, JaneDoe);
				   //InfoStorer writes the serialized object to a file named after
				   //the new account number, to be moved to the MasterList
				   variableDo.writeToPending(JaneDoe);
				   
			   }
			   System.out.println("Account Pending Approval");
			   break;
			   
			   case 2: {
				   System.out.println("Please Enter Username:");
				   String userinput2=MainMenu.nextLine();	   
				   if (retriever.validUser(userinput2)) {
					   BankAccount JohnDoe = new BankAccount();
					   RetrieveUserPass.ObtainPassword(userinput2);
					   System.out.println("Password: ");
					   String Password0=MainMenu.nextLine();
					   if(Password0.equals(retriever.ObtainPassword(userinput2))) {
						   String filename =retriever.ObtainAccount(userinput2);
						   JohnDoe = writer.readObject("MasterFiles/" +filename);
					   
						   System.out.println("What would you like to do?");
						   System.out.println("View Account Balance -->1");
						   System.out.println("Deposit -->2");
						   System.out.println("Withdraw -->3");
						   int selection1=IntScan.nextInt();
						   
						   switch(selection1) {
						   case 1 : {						   
							   System.out.println(JohnDoe.toString());
							   break;
						   }
						   case 2 :{
							   System.out.println("How much would you like to deposit?");
							   double deposit=MainMenu.nextDouble();
							   JohnDoe.setBalance(JohnDoe.getBalance()+deposit);
							   writer.writeObject("MasterFiles/" + Long.toString(JohnDoe.getAccount())+".txt", JohnDoe);
						   }
					   		case 3 : {
					   			System.out.println("How much would you like to withdraw?");
					   			double withdraw=MainMenu.nextDouble();
					   			JohnDoe.setBalance(JohnDoe.getBalance()-withdraw);
					   			writer.writeObject("MasterFiles/" + Long.toString(JohnDoe.getAccount())+".txt", JohnDoe);
					   			}
						   }
					   }
					   else {System.out.println("Login Failed, Please Try Again");}
					   }
				  else {System.out.println("Not a Valid Username");}
			   }
			   case 3 : {
			   System.out.println("Please Enter Username:");
			   String empinput=MainMenu.nextLine();	   
			   if (EmpLogon.validEmp(empinput)) {
				   RetrieveUserPass.ObtainPassword(empinput);
				   System.out.println("Password: ");
				   String Password0=MainMenu.nextLine();
				   if(Password0.equals(EmpLogon.ObtainEmpPassword(empinput))) {
					   System.out.println("Please input a bank account number");
					   long AccountToSee=IntScan.nextLong();
					   BankAccount JohnDoe = new BankAccount();
					   JohnDoe=writer.readObject("PendingFiles/" + AccountToSee+".txt");
					   System.out.println("What would you like to do?");
					   System.out.println("ApproveAccount -->1");
					   System.out.println("View Balance-->2");
					   System.out.println("Vew Information-->3");
					   int selectionEmp = IntScan.nextInt();
					   switch (selectionEmp) {
					   	case 1 : {
						   variableDo.approveAccount(AccountToSee);
						   
					   	}
					   	
					   	case 2 :{
					   		JohnDoe=writer.readObject("MasterFiles/" + AccountToSee+".txt");
					   		System.out.println(JohnDoe.getBalance());
					   	}
					   	case 3 : {
					   		JohnDoe=writer.readObject("MasterFiles/" + AccountToSee+".txt");
					   		System.out.println(JohnDoe.getfirstName() + " " + JohnDoe.getlastName());
					   		
					   	}
				   }
			   }
			   }
			   else {System.out.println("Invalid Employee Credentials");}
	
//			   case 4 : {
//				   System.out.println("Please Provide Employee Credentials");
//				   System.out.println("View Existing Account -->1");
//				   System.out.println("Approve New Account -->2");
//				   System.out.println("Modify Account Details-->3");
//				   int selectionEmp=MainMenu.nextInt();
//			   }
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
}

