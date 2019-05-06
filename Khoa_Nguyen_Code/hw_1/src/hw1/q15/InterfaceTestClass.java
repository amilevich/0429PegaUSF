package hw1.q15;

public class InterfaceTestClass implements Operations {

	public double addition(double x, double y) {
		return x + y;
	}

	public double subtraction(double x, double y) {
		return x - y;
	}

	public double multiplication(double x, double y) {
		return x * y;
	}

	public double division(double x, double y) {
		if (y == 0) {
			System.out.println("Second number cannot be zero");
		} else {
			return x / y;
		}
		return 0;
	}
}