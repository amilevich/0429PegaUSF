package com.example.keywords;

public class MyClass {
	
	/*
	 * private 
	 * public			--> access modifiers
	 * protected
	 * 
	 * abstract -> no body/no implementation
	 * 
	   public method(){
	    	//code here
	   }
	   
	   public abstract method();
	 * 
	 * static -> object - single instance
	 * 			 method - method can be invoked
	 * 					without creating an instance
	 * 					of the class (aka object)
	 * void -> no return type
	 * 
	 * final -> variables = cannot be changed(immutable)
	 * 			methods = cannot be overridden
	 * 			classes = can not have children
	 */
	
	public static void main(String[] args) {
		
		new Animal(); //pure instantiation
		
		Animal creature = new Animal();
		creature.setName("Timh");
		creature.setSpecies("Turkey-Platypus");
		creature.setNumberOfLegs(5);
		
		System.out.println("Its name is " + creature.getName());
		System.out.println(creature);
		
	}

}


