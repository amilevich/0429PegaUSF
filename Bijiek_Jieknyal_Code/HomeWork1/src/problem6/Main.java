package problem6;

import java.util.Scanner;

public class Main {

	//public static void main(String[] args) {
	// determine if an integer is an even number without using the modulus operator (%)
	// determine if the number is odd with without using the modulues operator (%)
	// find the even the numbers
	
	//class OddOrEven
	
	   public static void main(String args[])
	   {
	      int x;
	      // find out if the number is event
	      
	      System.out.println("Enter an integer to check if it is even");
	      Scanner in = new Scanner(System.in);
	      x = in.nextInt();
	      
	     // print out the results
	      
	      if (x % 2 == 0)
	         System.out.println("The number is even.");
	      else
	         System.out.println("The number is odd.");
	   }
	}