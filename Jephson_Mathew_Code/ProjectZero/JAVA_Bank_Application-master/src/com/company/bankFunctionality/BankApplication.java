package com.company.bankFunctionality;
//import com.sun.java.util.jar.pack.Package;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;

//for file out
import java.io.FileWriter;
import java.io.IOException;

public class BankApplication {
    public BankApplication() { }

    public static void main(String[] args) throws IOException {

        ArrayList<Account> myAccounts = new ArrayList<>();
        //read the file and set all counts into an array list
        myAccounts = FileIn();


        boolean keepAsking = true;
        boolean loggedIn =true;
        // This will loop till the user Successfully logs in to their account.
        while (keepAsking) {

                loggedIn = true;
            /*Inside log in loop*/

            //This creates a border around any string
            String sign = "Please Log in to your account";
            signBorder(sign);

            String[] person = login();
            String firstName = person[0].toLowerCase();
            String lastName = person[1].toLowerCase();
            int personPin = Integer.parseInt(person[2]);

         while(loggedIn)  {
            //this will loop through all the accounts and will find if there is a match in the database
            //for firstName or lastName AND pin number must match if they don't match then it will continue asking till it finds a match
            for (Account acc : myAccounts) {
                if ((acc.firstName.equals(firstName) || acc.lastName.equals(lastName)) && (acc.pin == personPin)) {
                    myAccounts.remove(acc);
                    System.out.println("");
                    System.out.println("Welcome To Bank Revature " + firstName.toUpperCase()+"!");
                    System.out.println("");
                    int choice;
                    choice = menu();
//                    System.out.println("This is the user choice: " + choice);
                    Account userAccount = new Account(acc.firstName, acc.lastName, acc.pin, acc.balance, acc.lastTransaction);
                    Account account = gatheredData(userAccount, choice);
                    if (choice == 5) {
                        System.out.println("Thank you for Using Revature Bank, Good Bye!");
                        myAccounts.add(account);
                        FileOut(myAccounts);
                        loggedIn = false;
                        FileIn();
                        break;
                    }
//                    System.out.println(account.toString());
                    myAccounts.add(account);
                    keepAsking = false;
                    FileOut(myAccounts);
                    loggedIn =true;
                    break;
                } else if (!(acc.firstName.equals(firstName) || !(acc.lastName.equals(lastName))) || !(acc.pin == personPin)) {
//                    System.out.println("invalid loggin");
                      keepAsking = true;
                      loggedIn =false;
                }
            }
        }
    }

            FileOut(myAccounts);
    }



    public static String[] login(){
        String[] person = scanForUser();
        return person;
    }
    public static void signBorder(String sign){
        for (int i = 0; i < sign.length()+3 ; i++) {
            System.out.print("-");
        }
        System.out.println("\n| "+sign+" | ");
        for (int i = 0; i < sign.length()+3 ; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }


    public static int menu(){
        int choice;
        System.out.println("   MAIN MENU");
        for (int i = 0; i < 15 ; i++) {
            System.out.print("-");
        }
        System.out.println("");
        System.out.println("1.) Deposit");
        System.out.println("2.) WithDraw ");
        System.out.println("3.) View Balance");
        System.out.println("4.) View Previous Transaction");
        System.out.println("5.) Log out");
        //Checks for user input makes sure its a integer , This is for the menu
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                choice = Integer.parseInt(sc.next());
                break; // will only get to here if input is int
                //into not then it throws out the custom exception
            } catch (NumberFormatException ignore) {
                System.out.println("Invalid input, Select the correct numeric value for menu item.");
            }
        }
        return choice;
    }


    public static String[] scanForUser(){
        String firstName;
        String lastName;
        int pin;
        String[] person = new String[3];

        // Allows a person to enter his/her first name
        Scanner one = new Scanner(System.in);
        System.out.print("Enter First Name: " );
        firstName = one.nextLine();

        person[0] = firstName;
        // Allows a person to enter his/her last name
        Scanner one1 = new Scanner(System.in);
        System.out.print("Enter Last Name: " );
        lastName = one1.nextLine();

        person[1] = lastName;

        // Allows a person to enter their pin number
        Scanner two = new Scanner(System.in);
        System.out.print("* Enter your Pin Number: " );

       //custom exception to makes sure the input of the user is valid numeric type
        while (true) {
            try {
                pin = Integer.parseInt(two.next());
                break; // will only get to here if input is a string
            } catch (NumberFormatException ignore) {
                System.out.println("Invalid input, Please enter a valid 4 digit numeric pin number: Example: 1234");
            }
        }
        String Anumber = Integer.toString(pin);
        person[2] = Anumber;

        return person;
    }

    public static Account gatheredData(Account data,int choice) throws IOException {

        float depositMoney;
        float widthdrawMoney;

        switch(choice){
            case 1:
                Scanner sc = new Scanner(System.in);
                System.out.println("How Much you want to deposit? Example: if you want to deposit $100, just enter 100");
                while (true) {
                    try {
                        depositMoney = Float.parseFloat(sc.next());
                        break; // will only get to here if float
                    } catch (NumberFormatException ignore) {
                        System.out.println("Invalid input, Please enter numeric value");
                    }
                }
                data.deposit(depositMoney);
                break;
            case 2:
                Scanner sc2 = new Scanner(System.in);
                System.out.println("How Much you want to withdraw? Example: if you want to withdraw $50, just enter 50");
                while (true) {
                    try {
                        widthdrawMoney = Float.parseFloat(sc2.next());
                        break; // will only get to here if float
                    } catch (NumberFormatException ignore) {
                        System.out.println("Invalid input, Please enter a numeric value");
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
                try
                {
                    throw new IOThatsNotAnOptionExeption("Pick the right number ...");

                }
                catch(IOThatsNotAnOptionExeption ex)
                {
                    ex.printStackTrace();
                    System.out.println("That is not an option please try again...");
                }

        }
        return data;
    }

    public static ArrayList FileIn() throws IOException{

        System.out.println("Accounts in file: ");
        ArrayList<Account> myAccounts = new ArrayList<>();

            BufferedReader reader = null;

            try {
                reader = new BufferedReader(new FileReader("Resources/Accounts"));
                String line;
                int count = 0;
                while ((line = reader.readLine()) != null) {
                    count++;
                    String[] data = line.split(",");


                    String first = data[0];
                    String last = data[1];
                    int pin = Integer.parseInt(data[2]);
                    float amount = Float.parseFloat(data[3]);
                    float lastTransaction = Float.parseFloat(data[4]);

                    Account userAccount = new Account(first, last, pin, amount, lastTransaction);
                    System.out.println("First: "+data[0].toUpperCase() +" | Last: "+ data[1].toUpperCase()
                            +" | Pin#: "+data[2]);
                    myAccounts.add(userAccount);
                }
                System.out.println(count + " Accounts in File\n");
            }catch(IOException ex){
                ex.printStackTrace();
            }finally{
                if(reader != null){
                    reader.close();
                }
            }
        System.out.println("");
          return myAccounts;
        }


    public static void FileOut(ArrayList myAccounts) throws IOException{

           FileWriter writer = null;
            try{
                writer = new FileWriter("Resources/Accounts");

                for (int i = 0; i < myAccounts.size(); i++) {
                    writer.write(String.valueOf(myAccounts.get(i))+"\n");
                }
//                writer.write(String.valueOf(acc));
//                writer.write("music,show,111,344,40");

            }catch (IOException ex){
                ex.printStackTrace();
            }finally {
                if(writer != null){
                    writer.close();
                }
            }
        }

}
