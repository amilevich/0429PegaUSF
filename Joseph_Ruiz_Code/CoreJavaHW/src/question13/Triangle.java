package question13;

// Name: Triangle.java
// Author: Joe Ruiz
// Date: 05/03/2019
// Number triangle!

public class Triangle {

	public static void main(String[] args) {
		for (int i = 0; i <= 3; i++) {
			// This zero is printed last
			if (i == 3) {
				System.out.print("0 ");
			}
			// Print this 1 second
			if (i >= 1) {
				System.out.print("1 ");
			}
			// This zero always prints
			System.out.print("0 ");
			// This 1 is printed third
			if (i >= 2) {
				System.out.print("1 ");
			}
			// Go to the next line
			System.out.println();
		}
	}

}
