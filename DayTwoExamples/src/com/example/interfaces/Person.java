package com.example.interfaces;

public interface Person {

	int i = 0;
	
	public void breathe();
	
	default public void snack() {
		//java 8, why
	}
}
