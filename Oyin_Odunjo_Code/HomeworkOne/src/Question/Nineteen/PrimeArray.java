package Question.Nineteen;


import java.util.ArrayList;

public class PrimeArray {

	
	private static boolean isPrime(int y){
		int count = 0; //Initializing the counter 
		
		
		for(int x = 1; x <= y; x++)
			if( y % x == 0) //Iterating through the even numbers 
				count++;
			
					if( y <= 3 )
						return true;
					
					else if( count > 2)
						return false;
					
					else
						return true;
		}
	
	
	
	
	
	public static void main(String[] args){
		
		//Creating a new array list nums 
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for(int i = 1; i <= 10; i++)
			nums.add(i); //Arrays from 1-10
		
		//Printing the arraylist 
		
		System.out.println("ArrayList from 1 - 10: " + nums); 
		
		//Initializing the even and odd variables 
		int even = 0;
		int odd = 0;
		
	
		// To get the sum off the even and odd numbers. Also remove the prime numbers and list them 
		for(int i = 0; i < nums.size(); i++ )	{
			
			Integer num = nums.get(i);
			
			if( num % 2 == 0 )
				even = even + num;
			//New variable even = sum of the even numbers 
			if( num % 2 == 1  )
				odd = odd + num;
			//new variable odd = sum of the odd numbers 
			
			
			if( isPrime(num) ){	//If one of the numbers in the array list is a prime 	
				nums.remove(i);
				i--; 
				//This will remove the primes and take them into account 
			}
	
		}
	
		System.out.println("\nSum of the even numbers is: " + even);
		
		System.out.println("\nSum of the odd numbers is: " + odd);
		
		System.out.println( "\nHere is the ArrayList without the Primes: " + nums);
		
	}
}


