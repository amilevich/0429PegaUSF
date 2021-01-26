package Problem19;
import java.util.ArrayList;

public class Main {

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
		//Initialing the Array List
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		//Inserting integers 1 through 10
		for(int i = 1; i <= 10; i++)
			arr.add(i);
		
		//Inserting integers 1 through 10
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
				arr.remove(i); //Removes the element at the specified position in this list
				i--;              // account for removal
			}
	
		}
	
		System.out.println("The sum of the even numbers: " + even);
		System.out.println("The sum of the odd numbers: " + odd);
		System.out.println( "ArrayList (no primes): " + arr );
		
	}

}
