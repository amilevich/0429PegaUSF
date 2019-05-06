package Question.Four;

public class NFactorial {
	
	/*
	 * N (integer) factorial is the product of all positive integers 
	 * less than or equal to n 
	 */

	public static void main(String args[]) {
		int j; //creating integer to be used to calculate the remaining numbers in the factorial 
		long factorial = 1; //Making it a long in the case that a really large number is inputted 
		int input = 25; //This is the number that we want the factorial of.. 
						//Can be any input desired  
		
		for(j = 1; j <= input; j++) {
			factorial = factorial * j; //multiplying each iteration of number by one, 
									  //i.e. adding it to the multiplication sequence
		}
		
		System.out.println("The Factorial of " + input + " is " + factorial);
		//Printing out the product
	}
	
}
