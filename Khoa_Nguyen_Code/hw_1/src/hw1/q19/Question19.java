package hw1.q19;

import java.util.ArrayList;

public class Question19 {

	public static void main(String[] args) {

		ArrayList<Integer> myList = new ArrayList<Integer>();
		ArrayList<Integer> noPrimeList = new ArrayList<Integer>();
		
		int sumOdd = 0;
		int sumEven = 0;

		for (int i = 1; i <= 10; i++) {
			myList.add(i);
		}
		System.out.println(myList);

		for (int i = 0; i < myList.size(); i++) {
			int evenOdd = isEvenOddNumber(myList.get(i));
			if (evenOdd == 1) {
				sumOdd = sumOdd + myList.get(i);

			} else {
				sumEven = sumEven + myList.get(i);
			}
		}
		for (int i = 0; i < myList.size(); i++) {
			for (int k = 2; k < myList.get(i); k++) {
				if (myList.get(i) % k == 0) {
					noPrimeList.add(myList.get(i));
					break;
				}
			}
		}

		System.out.println("\nEven Sum: " + sumEven);
		System.out.println("Even Odd: " + sumOdd);
		System.out.println(noPrimeList);
	}

	public static int isEvenOddNumber(int x) {
		if (x % 2 == 0) {
			return 1;
		} else {
			return 0;
		}
	}
}