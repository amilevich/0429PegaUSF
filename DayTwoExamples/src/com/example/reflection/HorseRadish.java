package com.example.reflection;

public class HorseRadish {
	
	public static void main(String[] args) {
		HorseRadish hr = new HorseRadish();
		hr.method3();
	}
	
	private String s;

	public HorseRadish() {
	}
	
	public void method1() {
		System.out.println("The string is " + s);
	}
	
	public void method2(int a) {
		System.out.println("The number is " + a);
	}
	
	private void method3() {
		System.out.println("private method invoked");
	}
	

}
