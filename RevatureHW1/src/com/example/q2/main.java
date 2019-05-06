package com.example.q2;

import java.util.Arrays;

public class main {
	public static void main(String[] args) {
		int[] x=fibonacci(25);
		System.out.println(Arrays.toString(x));
	}
	
	public static int[] fibonacci(int num) {
		int[] intArr = new int[num];
		intArr[0]=0;
		intArr[1]=1;
		for (int x = 2; x < num; x = x + 1) {
			intArr[x]=intArr[x-1]+intArr[x-2];
		}
		return intArr;
	}

}
