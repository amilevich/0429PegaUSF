package hw1.q12;

import java.util.ArrayList;

public class Question12 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		ArrayList<Integer> oddList = new ArrayList<Integer>();
		for (int i = 1; i <= 100; i++) {
			list.add(i);
			oddList.add(i);
		}
		for (Integer num : list) {
			if (num % 2 == 0) {
				evenList.add(num);
				oddList.remove(num);
				} 
			
		}
		System.out.println(list);
		System.out.println("Even numbers " +evenList);
		System.out.println("Odd numbers " +oddList);
	}
}
