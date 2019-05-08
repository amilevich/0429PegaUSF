package com.project0;

public class Calculation {
	public static double withdraw(double x, double y) {
		if (x < 0) {
			System.out.println("[ERROR: Don't put negative amounts]");
			return y;
		} else {
			if (x > y) {
				System.out.println("Overdrawing from Your Account  ");
				return y;
			} else {
				double z = y - x;
				return z;
			}
		}
	}

	public static double add(double x, double y) {
		if (x < 0) {
			System.out.println("[ERROR: Don't put negative amounts]");
			return y;
		} else {
			double z = y + x;
			return z;
		}
	}
}
