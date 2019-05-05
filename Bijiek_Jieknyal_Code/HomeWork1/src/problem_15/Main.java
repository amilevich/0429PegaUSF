package problem_15;

import java.util.Scanner;

public class Main {

	// used perform mathematical operations to create a class that implements interface
	
	public static void main(String args[])
    {
       int a, b, res;
       Scanner scan = new Scanner(System.in);
       
	   // enter two number to performance mathematic calculations
       
       System.out.print("Enter Two Numbers : ");
       a = scan.nextInt();
       b = scan.nextInt();
	   // perform mathematical operations using addition, substraction, mulitiplication as well as division 
       res = a + b;
       System.out.println("Addition = " +res);
	   
       res = a - b;
       System.out.println("Subtraction = " +res);
	   
       res = a * b;
       System.out.println("Multiplication = " +res);
	   
       res = a / b;
       System.out.println("Division = " +res);
    }
}
