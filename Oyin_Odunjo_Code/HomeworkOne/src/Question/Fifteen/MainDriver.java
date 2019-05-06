package Question.Fifteen;

public class MainDriver implements Operands {
	
	@Override
	public void addition(double a, double b) { //add the variables together 
		System.out.println(a + " + " + b + " = " + (a + b));
		
	}
	
	@Override
	public void subtraction(double a, double b) {
		System.out.println(a + " - " + b + " = " + (a - b));
	}

	@Override
	public void multiplication(double a, double b) {
		System.out.println(a + " * " + b + " = " + (a * b));
	}
	
	@Override
	public void division(double a, double b) {
		System.out.println(a + " / " + b + " = " + (a * b));
	}
}
