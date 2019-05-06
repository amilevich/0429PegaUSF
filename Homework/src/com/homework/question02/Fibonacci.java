package com.homework.question02;

public class Fibonacci {
	
	//1st 25 Fibonacci numbers
	/*
	 * F(0) = 0
	 * F(1) = 1
	 * F(2) = 1
	 * F(3) = 2
	 * F(4) = 3
	 * F(5) = 5
	 * F(6) = 8
	 * F(7) = 13
	 * F(8) = 21
	 * F(9) = 34
	 * F(10) = 55
	 * F(11) = 89
	 * F(12) = 144
	 * F(13) = 233
	 * F(14) = 377
	 * F(15) = 610
	 * F(16) = 987
	 * F(17) = 1597
	 * F(18) = 2584
	 * F(19) = 4181
	 * F(20) = 6765
	 * F(21) = 10946
	 * F(22) = 17711
	 * F(23) = 28657
	 * F(24) = 46368
	 * F(25) = 75025
	 */
	
	//initialization of 3 integers, two of them equal 0 while one of them equals 1
	static int n1 = 0;
	static int n2 = 1;
	static int n3 = 0;
	
	//setting up how the Fibonacci series will print
	static void printFibonacciSeries(int count) {
		
		//execute these lines of code if integer count is greater than zero
		if (count>0) {
			
			//static integer n3 is equal to the sum of static integers n1 and n2 
			n3 = n1 + n2;
			
			//static integer n1 is now equal to the value of n2
			n1 = n2;
			
			//static integer n2 is now equal to the value of n3
			n2 = n3;
			
			//JVM will print an empty space string followed by the value of n3. println was not used in order to keep the values in a straight line
			System.out.print(" " + n3);
			
			//the console will print the count integer minus one
			printFibonacciSeries(count - 1);
		}
	}
	
	public static void main(String[] args) {
		
		//because the JVM counts 0 as F(1) rather than F(0), int count is set to 26. setting int count to 25 will see the JVM only go up to F(24)
		int count = 26;
		
		//this will print 0 and 1, the values for n1 and n2 respectively
		System.out.print(n1 + " " + n2);
		
		//the console will print the series as specified in the count integer, but it will subtract two from the specified integer value
		printFibonacciSeries(count - 2);
	}

}
