package com.example.test;

public class Test {
	
	public static void main(String[] args) {
		
		
		// single quotes are for characters
		// double quotes are for strings
		
		int i = 300;
		//System.out.println(i + i + "Blue");
		//System.out.println("Red" + i + i);
		//order of operations matters, it is left 
		// to right
		
		int num = 50;
		System.out.println(++num); // pre increment
		//uses the variable afterwards
		System.out.println(num++); // post increment
		// uses the variable first and then
		// increments
		System.out.println(--num);
	}

}
