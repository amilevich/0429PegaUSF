package com.example.reflection;

import java.lang.reflect.Method;

public class MainDriver {
	
	/*
	 * Reflection API
	 * library that allows us to inspect and/or modify
	 * runtime attributes of classes, interfaces, fields,
	 * and methods.
	 * It is used mostly for debugging/information 
	 * purposes.
	 */
	
	public static void main(String[] args) {
		
		// create an object whose property is to be
		// checked
		
		HorseRadish obj = new HorseRadish();
		
		// create the class object from the object using
		// getClass method
		Class cls = obj.getClass();
		System.out.println("The name of the class is: " + cls.getName());
		
		// get the methods of the class through the object
		// by using GetMethods
		
		Method[] methods = cls.getMethods();
		
		for(Method m: methods) {
			System.out.println(m.getName());
		}
		
	}

}
