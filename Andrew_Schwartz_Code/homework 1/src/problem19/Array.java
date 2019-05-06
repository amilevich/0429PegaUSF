package problem19;

import java.util.ArrayList;

public class Array {

	
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
		
	
		// sum even, sum odd, remove primes
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
				i--;              // account for removal
			}
	
		}
	
		System.out.println("The sum of the even numbers: " + even);
		System.out.println("The sum of the odd numbers: " + odd);
		System.out.println( "ArrayList (no primes): " + arr );
		
	}
}

