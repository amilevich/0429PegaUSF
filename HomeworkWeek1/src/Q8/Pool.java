package Q8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
 * Write a program that stores the following strings in an ArrayList and saves all the palindromes in another ArrayList.
“karan”, “madam”, ”tom”, “civic”, “radar”, “sexes”, “jimmy”, “kayak”, “john”,  “refer”, “billy”, “did”

 */

public class Pool {
	
private static ArrayList<String> pal = new ArrayList<String>();
	
	
	private static ArrayList<String> palindromes( ArrayList<String> list )
	{
		int comparsions,
		    counter;
		
		
		for(String s: list)
		{
			if( s.length() % 2 == 0 )
			{
				comparsions = s.length() / 2;
				counter = 0;
				
				for(int i = 0; i < comparsions; i++)
				{		
					if( s.charAt(i) == s.charAt( s.length() - i - 1) )
						counter++;
					
					if( counter == comparsions )
						pal.add(s);
				}
			}//end-if
			
			else
			{
				comparsions = (s.length()- 1) / 2;
				counter = 0;
				
				for(int j = 0; j < comparsions; j++)
				{	
					if( s.charAt(j) ==  s.charAt( s.length() - j - 1)  )
						counter++;
					
					if( counter == comparsions )
						pal.add(s);	
				}
			}//end-else
			
			
		}
		return pal;
	}//end-method
	
	

	public static void main (String[] args) {
		
	
		ArrayList<String> pool = new ArrayList<String>(); 
		// Initialize an ArrayList with add() 
		pool.add("karan"); 
		pool.add("madam"); 
		pool.add("tom"); 
		pool.add("civic"); 
		pool.add("radar"); 
		pool.add("sexes"); 
		pool.add("jimmy"); 
		pool.add("kayak"); 
		pool.add("john"); 
		pool.add("refer"); 
		pool.add("billy"); 
		pool.add("did"); 
		
	 
		
		// print ArrayList 
		
		System.out.println("ArrayList: " + pool);
		System.out.println("ArrayList palindromes: " + palindromes(pool) );
	
	} 
	
}
