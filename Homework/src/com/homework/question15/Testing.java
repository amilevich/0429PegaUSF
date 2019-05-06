package com.homework.question15;

public class Testing implements Math {
	
	@Override
	public double add(double x, double y) {
		return x + y;
	}
	
	@Override
	public double subtract(double x, double y) {
		return x - y;
	}
	
	@Override
	public double multiply(double x, double y) {
		return x * y;
	}
	
	@Override
	public double divide(double x, double y) {
		if(y == 0) {
			System.out.println("ERROR: Division by 0");
		} else {
			return x / y;
		}
		
		return 0;
	}
	
	

}
