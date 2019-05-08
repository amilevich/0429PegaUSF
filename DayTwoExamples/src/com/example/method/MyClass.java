package com.example.method;

public class MyClass {
	
	public static void main(String[] args) {
		MyClass objectOne = new MyClass();
		method();
		method("John Happy");
		objectOne.method("3", "4");

//		MyClass objectTwo = new MyClass();
//		method();
//		objectOne.methodTwo();
//		objectTwo.methodTwo();
//		method();
	}
	public static void method() {
		System.out.println("method() called");
	}
	
	public static void method(String s) {
		System.out.println("method(String)"
				+ " called with an argument "+s);
	}
//	public void method(String s, String g) {
//		System.out.println("method(String)"
//				+ " called with an argument "+ s + " " + g);
//	}
	
	public void method(String l, String m) {
		System.out.println("method(String)"
				+ " called with an argument "+ l + " " + m);
	}
	
	
	public void methodTwo() {
		System.out.println("methodTwo() called");
	}
	
	

}
