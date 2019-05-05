package question08;
import java.util.ArrayList;
import java.util.Arrays;

public class Palindromes
{
	//declares a regular  array List
	private static ArrayList<String> pal = new ArrayList<String>();
	
	// declares a palindrome array list
	private static ArrayList<String> palindromes( ArrayList<String> list )
	{
		// declares the counter and the comparing the arrray lists
		int comparsions,
		    counter;
		
		// for loop for each value in the array list
		for(String s: list)
		{
			//compares the length of the individual word, divides them by 2
			if( s.length() % 2 == 0 )
			{
				comparsions = s.length() / 2;
				counter = 0;
				
				// for each word in the list, if the length of each word matches the length
				// of the corresponding list, then it will add or return the list with the
				// palindrome variations
				
				for(int i = 0; i < comparsions; i++)
				{		
					if( s.charAt(i) == s.charAt( s.length() - i - 1) )
						counter++;
					// adds to list
					if( counter == comparsions)
						pal.add(s);
				}
			}//end-if
			
			else
			{
				// comparing the comparisons of each word in list 
				comparsions = (s.length()- 1) / 2;
				counter = 0;
				
				for(int j = 0; j < comparsions; j++)
				{	
					// checks the character lengths between the cooresponding list and original list
					if( s.charAt(j) ==  s.charAt( s.length() - j - 1)  )
						counter++;
					// if the count is equivalent to the comparisons, it'll add the list.
					if( counter == comparsions )
						pal.add(s);	
				}
			}//end-else
			
			
		}
		return pal;
	}//end-method
	
	public static void main(String[] args) 
	// instantiating and creating array as a list
	
	{
		ArrayList<String> arr = new ArrayList<String>
		( 
			Arrays.asList("karan",
						  "madam",
						  "tom",
						  "civic",
						  "radar",
						  "sexes",
						  "jimmy",
						  "kayak",
						  "john",
						  "refer",
						  "billy",
						  "did"
			)
		);
		
// printing out separate array lists		
		System.out.println("ArrayList: " + arr);
		System.out.println("ArrayList palindromes: " + palindromes(arr) );
	}
}