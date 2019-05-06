package Problem15;

import java.util.Scanner;

public class Main {
	static Problem15Impl obj = new Problem15Impl();

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

        System.out.println("Simple Calculator");

        System.out.println("\nHere are your options:");
        System.out.println("\n1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");

        System.out.print("\nWhat would you like to do?: ");
        int choice = reader.nextInt();
        System.out.println();


        if (choice == 1){
            obj.addition();
        }
        else if (choice == 2){
            obj.subtraction();
        }
        else if (choice == 3){
            obj.division();
        }
        else if (choice == 4){
            obj.multiplication();
        }
        else {
        	System.out.println("You Have Entered a wrong choice");
       
        }

        System.out.println();
        reader.close();
    }

}