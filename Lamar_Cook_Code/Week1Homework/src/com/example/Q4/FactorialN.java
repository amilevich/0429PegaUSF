package com.example.Q4;

public class FactorialN {

	public static void main(String[] args) {
		int i;//Variable 
		int facT;//Variable
		facT = 1;//Assigned variable the value of 1
		int num = 6;//Variable number that will be factored
		for(i =1;i <=num;i++) {//for loop to perform the Operation
			facT =facT*i;
		}
		System.out.println( "The factorial results are ....." + facT);//Print results to the console

	}

}
