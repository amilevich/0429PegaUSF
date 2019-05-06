package Q4;

import java.util.ArrayList;

public class MainQ4 {

	public static void main(String[] args) {
		System.out.println("Print N Factorial from 0 to 6: ");
		printnFactorial();
	}

	public static int nFactorial(int n) {
		if (n == 0) {
			return 1;

		}
		return n * nFactorial(n - 1);
	}

	public static void printnFactorial() {
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < 7; i++) {
			arr.add(nFactorial(i));
		}
		System.out.println(arr);

	}

}
