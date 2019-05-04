package question2;

// Name: Fibonacci.java
// Author: Joe Ruiz
// Date: 04/30/2019
// Fibonacci numbers program

public class Fibonacci {
	
	public static int fib(int n) {
		// This is best done recursively...
		// It WILL NOT run endlessly because fib(0) = 0 and fib(1) = 1!
		if (n == 0 || n == 1) {
			// The base case, return n if it is 0 or 1
			return n;
		} else {
			// The recursive part, call fib() again for n-1 and n-2
			// which if they equal 1 and 0, we reached the end
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static void main(String[] args) {
		// Call Fibonacci function from 0 to 24 and print them in a list
		for (int i = 0; i <= 24; i++) {
			System.out.println(i + " : " + fib(i));
		}
	}

}
