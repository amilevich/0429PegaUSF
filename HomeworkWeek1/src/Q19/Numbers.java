package Q19;

/*
 * Create an ArrayList and insert integers 1 through 10. 
 * Display the ArrayList. Add all the even numbers up and display 
 * the result. Add all the odd numbers up and display the result. Remove 
 * the prime numbers from the ArrayList and print out the remaining ArrayList.
 */
import java.util.ArrayList;

public class Numbers {

	private static boolean isPrime(int i)
	{
		int counter = 0;
		
		for(int j = 1; j <= i; j++)
			if( i % j == 0)
				counter++;
			
		if( i <= 3 )
			return true;
		else if( counter > 2)
			return false;
		else
			return true;
	}
	
	
	public static void main(String[] args)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 1; i <= 10; i++)
			arr.add(i);
		
		System.out.println("ArrayList: " + arr);
		
		int even = 0;
		int odd = 0;
		
	
		// sum of evens
		// sum of odds
		// remove primes
		
		for(int i = 0; i < arr.size(); i++ )
		{
			Integer num = arr.get(i);
			
			if( num % 2 == 0 )
				even = even + num;
			if( num % 2 == 1  )
				odd = odd + num;
			
			
			if( isPrime(num) )
			{		
				arr.remove(i);
				i--;             
			}
	
		}
	
		System.out.println("The sum of the even numbers is: " + even);
		System.out.println("The sum of the odd numbers is: " + odd);
		System.out.println( "ArrayList without primes): " + arr );
		
	}
}
