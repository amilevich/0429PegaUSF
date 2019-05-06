package Q2;

import java.util.ArrayList;

public class MainQ2 {

	public static void main(String[] args) {
		System.out.println("Print 25 Fibonacci numbers: ");
		printFibonacci();
	}

	public static int fibonacci(int n) {
		int result;
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			result = fibonacci(n - 1) + fibonacci(n - 2);
		}
		return result;
	}

	public static void printFibonacci() {
		ArrayList<Integer> arrList = new ArrayList<>();
		for (int i = 0; i < 25; i++) {
			arrList.add(fibonacci(i));
			// System.out.println(arrList);
		}
		System.out.println(arrList);

	}
}
