package com.example.q4;

//This is a program to compute N factorial,
//since longs get very big very quickly, longs will be used rather than ints

public class Main {
	public static void main(String[] args) {
		long N = 20;
		System.out.println(Factorial(N));
	}
	
	public static long Factorial(long N) {
		long fact=N;
		for (long x = N-1; x > 0; x--) {
			fact=fact*x;
		}
		return fact;
	}

}
