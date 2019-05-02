package com.example.inheritance;

public class MainDriver {

	public static void main(String[] args) {
		
	SuperHero superH = new SuperVillain();
	//System.out.println(superH.alias);
	
	System.out.println(((SuperVillain)superH).alias);
	// casting - taking an object of one particular type
	// and turning it into another object type
	
	/*
	 * upcasting - casting a subtype to supertype when we want
	 * to write general code that deals with only the supertype
	 * 
	 * downcasting - casting to a subtype from a supertype when
	 * we want to access specific behavior of a subtype
	 */
		
	//superH.alterWeakness();
	//System.out.println(superH.getWeakness());
	
	System.out.println(((SuperVillain)superH).weakness);
	
	}
}
