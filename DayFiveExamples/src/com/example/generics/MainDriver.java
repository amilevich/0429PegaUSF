package com.example.generics;

/*
 * Generics <>
 * generic methods and generic classes enable programmers
 * to specify, with a single method declaration, a set of related 
 * methods or a set of related types.
 * 
 * Generics enforce compile time safety by allowing you
 * to use parameterized types.
 * syntax: <>
 */

class GenericClass<T> {
	private T value;
	
	public GenericClass(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
}

public class MainDriver {
	public static void main(String[] args) {
		
		/*
		 * Naming conventions: type parameters can be named anything 
		 * you want, but the convention is to use single, uppercase
		 * letters to make it obvious that they are not real class 
		 * names
		 * 
		 * T => Generic Data Type
		 * E => Element
		 * K => Map Key
		 * V => Map Value
		 * N => Number
		 */
		
		GenericClass<String> gClassOne = new GenericClass<String>("Tuna");
		GenericClass<Integer> gClassTwo = new GenericClass<Integer>(5);
		
		// bad practice to leave the right hand side chevrons empty
		// you want to restrict the data type so that you don't get
		// unexpected object types
		
		GenericClass gClassThree = new GenericClass<>("Happy Pottery");
		//  defaults to Object
	}

}
