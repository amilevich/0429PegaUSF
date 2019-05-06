package Question.Nine;

import java.util.ArrayList;

public class PrimeIntegers {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		int num = 0;

		for(int i = 1; i <=100; i++) {  
			number.add(i); //setting the parameters for the new array as 1-100
			
			int counter = 0;
			for(num = i; num >= 1; num--) { //iterating through all the numbers in the arraylist 
				if (i%num==0) { //Checking to see if there are any remainders
					counter = counter + 1; 
					//If it has no remainder, move to the next index and check it 
					
				}
			}
			
			if (counter == 2) {
				System.out.println(i + " is a Prime Number"); 
				//Printing out the numbers with remainders of 2 as prime numbers 
			}
			
		}
		
		
	}

	
}
