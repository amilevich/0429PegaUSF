package com.example.evenquestion;
/*
 * This method will use the binary value of the variable and then look at the last
 * binary digit to decide whether it is even or odd
 * 
 * Use .toBinaryString to get the Binary as a string
 * Turn the string object into a stringBuilder object
 * reverse the string builder object
 * take the 0th index, if the first number is 0 then the value is even
 * if it is one than it is odd
 */


public class Main {
	public static void main(String[] args) {
		int i=-200;
		long  l=-1;
		short s=200;
		byte b=0;
		System.out.println("binary int "+Integer.toBinaryString(i));
		System.out.println("binary int "+Long.toBinaryString(l));
		System.out.println("binary int "+Integer.toBinaryString(s));
		System.out.println("binary int "+Integer.toBinaryString(b));
		System.out.println(isEven(25));
		System.out.println(isEven(-25));
		System.out.println(isEven(0));
		System.out.println(isEven(100));
		System.out.println(isEven(-100));
	}
	
	public static boolean isEven(int i){
		StringBuilder temp = new StringBuilder(Long.toBinaryString(i));
		temp.reverse().toString();
		if (temp.charAt(0)=='0') {
			return true;
		}
		else { //if (temp.charAt(0)=='1') {
			return false;
		}
	}
}
