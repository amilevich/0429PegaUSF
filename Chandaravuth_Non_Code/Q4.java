package test1;

import java.util.ArrayList;

public class Q4 {

	public static void main(String[] args) {
		
		printnFactorial();

	}
	public static int nFactorial(int n)
	{
		if(n==0) 
		{
			return 1;
			
		}
		return n * nFactorial(n-1);
	}
	
	public static void printnFactorial() 
	{
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=0; i<7;i++) 
		{
			arr.add(nFactorial(i));
		}
		System.out.println(arr);
		
		
	}
	
	

}
