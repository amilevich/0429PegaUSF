package Q15;

public class MainQ15 implements InterfaceQ15 {

	public static void main(String[] args) {
		InterfaceQ15 obj = new MainQ15();
		
		
		System.out.print("5+5 = ");
		System.out.println(obj.addition(5, 5));
		System.out.println();
		System.out.print("5-5 = ");
		System.out.println(obj.subTraction(5, 5));
		System.out.println();
		System.out.print("5*5 = ");
		System.out.println(obj.multiplication(5, 5));
		System.out.println();
		System.out.print("5/5 = ");
		System.out.println(obj.division(5, 5));

	}

	@Override
	public double addition(double x, double y) {
		double result = 0;
		result = x + y;

		return result;
	}

	@Override
	public double subTraction(double x, double y) {
		double result = 0;
		result = x - y;

		return result;

	}

	@Override
	public double multiplication(double x, double y) {
		double result = 0;
		result = x * y;

		return result;

	}

	@Override
	public double division(double x, double y) {
		double result = 0;
		result = x / y;

		return result;

	}

}
