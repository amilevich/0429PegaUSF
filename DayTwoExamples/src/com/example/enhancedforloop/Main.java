package com.example.enhancedforloop;

import java.util.ArrayList;

public class Main {
	
	public static void main (String[] args) {
		
		/*
		 * what is an arraylist?
		 * similar to array but the size
		 * is not fixed
		 * ArrayList can not contain primitive
		 * data types, it can only contain
		 * objects
		 */
		ArrayList<String> names = new ArrayList<String>();
		// new keyword = instantiation 
		names.add("Mark");
		names.add("Abdou");
		names.add("Audrey");
		names.add("John");
		
		// for each loop/ enhanced for loop
		for(String x : names) {		// : = "in"
			System.out.println(x);
		}
		
		// enhanced for loop can be used on 
		// any data structure in the Collection API
		// sets, lists, queues
		
		// not part of it, arrays
		
	}

}
