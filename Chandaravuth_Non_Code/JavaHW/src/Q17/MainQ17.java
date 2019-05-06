package Q17;

import java.util.Scanner;

public class MainQ17 {

	public static void main(String[] args) {
		double p, r, t;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Principal : ");
		p = input.nextFloat();
		System.out.print("Enter the Rate of interest : ");
		r = input.nextFloat();
		System.out.print("Enter the number of years : ");
		t = input.nextFloat();
		calInterest(p, r, t);
	}

	public static void calInterest(double p, double r, double t) {

		double result;

		result = (p * r * t);

		System.out.print("The Simple Interest is : " + result);
	}
}
