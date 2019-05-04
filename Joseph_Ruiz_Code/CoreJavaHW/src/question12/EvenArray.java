package question12;

// Name: EvenArray.java
// Author: Joe Ruiz
// Date: 05/02/2019
// Print even numbers from an array

public class EvenArray {

	public static void main(String[] args) {
		// Create and fill the array
		int num;
		boolean even;
		int[] numArray = new int[100];
		for (int i = 0; i <= 99; i++) {
			numArray[i] = i + 1;
		}
		// Find if each number is even (without modulus! but slow)
		for (int out : numArray) {
			num = out;
			while (true) {
				if (num == 0) {
					even = true;
					break;
				} else if (num == 1) {
					even = false;
					break;
				}
				num = num - 2;
			}
			// Print the even ones
			if (even) {
				System.out.println(out);
			}
		}
	}

}
