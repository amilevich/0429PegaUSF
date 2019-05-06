package Q19;

import java.util.ArrayList;

public class MainQ19 {
	public int count = 0;

	public static void main(String[] args) {

		printResult();
	}

	public static void printResult() {
		ArrayList<Integer> a = new ArrayList<Integer>();
		int even = 0;
		int odd = 0;
		// int count=0;

		for (int i = 0; i < 10; i++) {
			a.add(i + 1);
		}
		for (int n : a) {
			if (n % 2 == 0) {
				// System.out.println(n);
				even = even + n;

			}

			if (n % 2 != 0) {
				// System.out.println(n);
				odd = odd + n;
			}

			if (checkPrimeNumber(n) == true) {
				System.out.println("Prime: " + n);
				/*
				 * for(int i=0;i<10;i++) { if(a.get(i)==n) {
				 * 
				 * System.out.println(a.get(i)); //a.remove(i); }
				 * 
				 * }
				 */

			} else {
				System.out.println("Not Prime NUmber: -> " + n + ",");

			}

		}
		System.out.println();
		System.out.print("Result of EVEN #: ");
		System.out.println(even);
		System.out.println();
		System.out.print("Result of ODD #: ");
		System.out.println(odd);
		System.out.println();

		for (int i = 0; i < a.size(); i++) {
			if (checkPrimeNumber(a.get(i)) == true) {
				a.remove(i);

			}

		}
		System.out.println("I can't figure out why it do not remove 3 from arraylist!");
		System.out.println(a);

	}

	public static boolean checkPrimeNumber(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;

	}

}
