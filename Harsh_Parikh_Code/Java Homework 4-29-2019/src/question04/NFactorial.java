package question04;
import java.util.Scanner;

public class NFactorial {

	public static void main(String[] args) {
		
		// intializes factorial number as 1, so it doesn't go and multiply 0
		double factorial = 1;
		// initializes counting procedure
		long i;
		
		// askes for user input on a number
		Scanner input = new Scanner(System.in);
	    System.out.println("Please enter a number: ");
	    int n = input.nextInt();
		
	    
	    //loops the iteration.  We initialize i as one, then compared it to the values below n, and iterate
		for (i=1; i<=n; i++) {
			//multiplies the values that come before n and subtracts by one until we reach 1.
			factorial = factorial*i;
		}
				
		//we print out the factorial solution
		System.out.println("The factorial of " + n + " is " + factorial);
				
		

	}

}
