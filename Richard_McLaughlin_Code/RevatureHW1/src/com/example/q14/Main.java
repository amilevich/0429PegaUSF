package com.example.q14;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		int HWsucks=2;
		command(HWsucks);

	}
	
	public static void command(int HWsucks) {

		switch(HWsucks) {
		   case 1: System.out.println("Math.sqrt(" + 25 + ")=" + Math.sqrt(25));
		   break;
		   
		   case 2: Date date = new Date();
		   System.out.println(date);
		   break;
		   
		   case 3: String HWisDumb= "I am learning core Java";
		   char[] output=HWisDumb.toCharArray();
		   System.out.println(output[10]);
		   break;
		   
		   
		   // You can have any number of case statements.
		   default: System.out.println("Homework is dumb");
		}
	}

	

}
