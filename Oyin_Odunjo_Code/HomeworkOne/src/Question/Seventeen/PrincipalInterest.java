package Question.Seventeen;

import java.util.Scanner;

public class PrincipalInterest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		//Scanning in the value of the interest 
		System.out.println("To calculate interest, enter Principal here: ");
		double prinOfInterest = scan.nextDouble(); //This will take the principal amount as a double 
		System.out.println("Enter the Interest rate as a decimal here: ");
		double interestRate = scan.nextDouble(); //this will take the interest percentage as a double 
		System.out.println("Enter the amount of years here: ");
		double amountOfYears = scan.nextDouble(); //this will take the amount of years that has gone by
		scan.close();
		
		//Interest amount = Principal*Rate*Time 
		System.out.println("1The interest is $" + (prinOfInterest * (interestRate/100) * amountOfYears));
		
	}	

}
