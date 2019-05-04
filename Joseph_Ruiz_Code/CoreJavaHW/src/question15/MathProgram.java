package question15;

// Name: MathProgram.java
// Author: Joe Ruiz
// Date: 05/02/2019
// Math operator class test program

public class MathProgram {

	public static void main(String[] args) {
		MathObject m = new MathObject(53, 65);
		System.out.println("53 + 65 = " + m.add());
		System.out.println("53 - 65 = " + m.subtract());
		System.out.println("53 * 65 = " + m.multiply());
		System.out.println("53 / 65 = " + m.divide());
	}

}
