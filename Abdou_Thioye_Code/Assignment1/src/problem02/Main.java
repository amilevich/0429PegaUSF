package problem02;

public class Main {

	public static void printFibonacciNumbers(int n) {
		// initializing and assigning my two variables
		int f1 = 0, f2 = 1;
		// to check my base case and return none
		if (n < 1)
			return;
		// go throughout the for loop until it reaches the passing value in my main
		// methods
		for (int i = 0; i <= n; i++) {
			System.out.print(f1 + " ");
			int next = f1 + f2;
			f1 = f2;
			f2 = next;
		}
	}

	// Driver Code
	public static void main(String[] args) {
		// I pass it through 25 to reach the 25th Fibonacci numbers
		System.out.println("The first 25 Fibonacci numbers beginning at zero are: ");
		printFibonacciNumbers(25);
	}

}
