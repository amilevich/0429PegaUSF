package com.example.controlflow;

public class Main {

	/*
	 * control flow statements break up the flow of execution by employing decision
	 * making and loops, enabling the program to conditionally execute particular
	 * blocks of code
	 * 
	 * if -> runs block of code if true "else if" is used to write mutually
	 * exclusive blocks of code "else" will execute if nothing else did (or if no
	 * condition is met)
	 * 
	 * while -> typically used when you do not know how long you want to loop, but
	 * have a condition that needs to be satisfied
	 * 
	 * do while -> same as while, but will definitely run at least once
	 * 
	 * for -> typically used when you know how long you want to loop
	 * 
	 * switch -> useful when you are checking a variable against a lot of values
	 * 
	 * "break" -> end loop, can be only used in loops and switch statements
	 * 
	 * "continue" -> go to end of loop and starts the next iteration can be used in
	 * loops and in switch statements
	 */

	public static void main(String[] args) {
		
		int tempWhile = 0;
		
//		while(tempWhile<7) {
//			//System.out.print(tempWhile++);
//		}
//		
		int arrayOne[] = {27, 1997, 4 ,5, 7};
		
		for(int i=0; i<arrayOne.length; i++) {
			System.out.println(arrayOne[i]);
		}
		
	// & - and
	// && - short circuit and
	// | - or
	// || - short circuit or
	
	/*
	 * short circuit - only checks the first
	 * condition meaning they don't evaluate
	 * the right hand side (if the left hand side
	 * satisfies the condition)
	 * 
	 * false && -> it is not necessary to know
	 * what the right hand side is, the result
	 * must be false
	 */
	
//		while(boolOne && boolTwo) {
//			
//		}
		
	}

}
