package Problem09;

public class Main {

	public static void main(String[] args) {

		int max = 100;

		System.out.println("Generate Prime numbers between 1 and " + max);

		// loop through the numbers one by one
		for (int i = 1; i < max; i++) {

			boolean isPrimeNumber = true;

			// check to see if the number is prime
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimeNumber = false;
					break; // exit the inner for loop
				}
			}

			// print the number if prime
			if (isPrimeNumber) {
				System.out.print(i + " ");
			}
		}

	}

}
