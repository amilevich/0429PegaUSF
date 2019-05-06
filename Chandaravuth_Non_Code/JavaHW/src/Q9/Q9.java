package Q9;

import java.util.ArrayList;

public class Q9 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			a.add(i + 1);
		}
		for (Integer n : a) {
			checkPrimeNumber(n);
		}

	}

	public static void checkPrimeNumber(Integer n) {
		int i, m = 0, flag = 0;

		m = n / 2;
		if (n == 0 || n == 1) {
			System.out.println(n + " is not prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		}

	}

}
