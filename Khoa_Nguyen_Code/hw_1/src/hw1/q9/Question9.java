package hw1.q9;

import java.util.ArrayList;

public class Question9 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		ArrayList<Integer> notPrimeList = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			list.add(i);
			primeList.add(i);
		}
		for (Integer num : list) {
			for (int k = 2; k < num; k++) {
				if (num % k == 0) {
					notPrimeList.add(num);
					primeList.remove(num);
					break;
				} 
			}
		}
		System.out.println(list);
		System.out.println("Prime numbers " +primeList);
		System.out.println("Not prime numbers " +notPrimeList);
	}
}
