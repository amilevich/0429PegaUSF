package Q4;

public class nFact {
	
	public static void main(String [] args) {
		
		int x, f=1, n=6; //creates int for base start of multiple 1 and n for factorial
							// limit
		for(x = 1; x <= n; x++) { //loops through and does the action until nth time
			f = f * x; //f becomes the new number and lops again for more factorials
		}
		System.out.println("Factorial of " + n + " is " + f);
	}	//syso final factorial of nth number

}
