package Question.Two;

public class Fibonacci {
	
	public static void main(String args[]) {
		int a = 0; // Setting parameters for the initial index value also the F(n-2)
		int b = a; // Setting a premise for the number that is to proceed the F(n-1)
		int c = 1; // Setting the parameter for the second number in the series 
		int d = 25; // Setting variable (number of times we want to be iterated)
		
		for (int z = 0; z < d; z++) { //The code will iterate until it has done so 25 times
			a = b; // 
			b = c; //
			c = a + b; //The previous two numbers added together 
			
			System.out.println(a); //print out the value of the sequence
		}
	}

}
