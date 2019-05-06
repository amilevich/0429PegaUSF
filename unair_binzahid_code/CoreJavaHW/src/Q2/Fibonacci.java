package Q2;

public class Fibonacci {
	
	public static void main(String [] args) {
		
		int n = 25, n1 = 0, n2 = 1; //sets values for limit and 2 objects for comparison
		System.out.println("First " + n + " terms: "); //title and end goal of code
		
		for (int i = 1; i <= n; ++i) { 		//goes from 25 loops
			System.out.println(n1 + " + "); //prints 0 with a space as starting
			
			int sum = n1 + n2;		//code for sequence in which the previous is
			n1 = n2;				//is added to get the next number
			n2 = sum;
		}
		
	}

}
