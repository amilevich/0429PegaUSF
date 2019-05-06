package problem9;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
	
	 public static void main (String[] args)
	    {
	        System.out.println (" prime numbers: ");

	        
	        List<Integer> primeNums = new ArrayList<Integer>();

	        for (int index = 2; index < 100; index++)
	        {
	            boolean isPrime = true; 

	            
	            for (int i = 2; i < index; i++) 
	                
	                if (index%i == 0) isPrime = false; 

	            if (isPrime) 
	            {
	                System.out.print (index + " "); 
	                primeNums.add(index); 
	            }
	        }
	    }
	}


