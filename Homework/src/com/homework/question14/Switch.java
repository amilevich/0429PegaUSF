package com.homework.question14;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Switch {
	
	static void arrayPrint(String arrayOne[]) {
		
		int n = arrayOne.length;
		
		for(int i = 0; i < n; ++i) {
			
			System.out.print(arrayOne[i]);
			
		}
		
		//System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		//this int represents the case number
		int c = 3;
		
		//this int represents the number to undergo the square root operation
		int n = 169;
		
		//a new date format is created. for some reason, when i tried to set the day in all caps, i got a 3-digit number
		DateFormat date = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		
		//setting the date to the current date
		Date today = new Date();
		
		switch(c) {
		
		//square root operation
		case 1:
			System.out.println("Square root of " + n + ": " + Math.sqrt(n));
			break;
			
		//today's date
		case 2:
			System.out.println(date.format(today));
			break;
			
		//prints "I am learning Core Java"
		case 3:
			String thisString = "I am learning Core Java";
			String[] string = thisString.split("");
			arrayPrint(string);
		}
		
	}

}
