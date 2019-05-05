package problem12;

public class Main {

	// create a list of even numbers from Java Example
	// This List Even Numbers Java Example shows how to find and list even
	// numbers between 1 and any given number.

	
	//public class ListEvenNumbers {
		 
		public static void main(String[] args) {
			
			//define the limit of values
			int limit = 10;
			
			// print out the even numbers
			
			System.out.println("Printing Even numbers between 1 and " + limit);
			
			for(int i=1; i <= limit; i++){
				
				// if the digit is divisible by 2 then it is even number
				
				if( i % 2 == 0){
					System.out.print(i + " ");
				}
			}
		}
	}