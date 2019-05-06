package com.example.fibonacci;

public class Fibonacci {


public static void main(String []args) {
	double n;//Variables
	double a;
	double b;
    a =0;//Assigning variables a value
    b=0.2;
	
	n = 0;
	while(n<=25) {//While loop to check if n is less than or equal to 25
		n = a + b;
		System.out.println(n);//Print out results
		a=b;
		b=n;
	}
}
}