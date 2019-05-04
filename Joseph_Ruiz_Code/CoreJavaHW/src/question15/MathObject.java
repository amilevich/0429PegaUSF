package question15;

// Name: MathObject.java
// Author: Joe Ruiz
// Date: 05/02/2019
// Math operator class

public class MathObject implements BasicMathOperators {
	
	private int l;
	private int r;
	
	public MathObject(int l, int r) {
		super();
		this.l = l;
		this.r = r;
	}

	@Override
	public int add() {
		return this.l + this.r;
	}

	@Override
	public int subtract() {
		return this.l - this.r;
	}

	@Override
	public int multiply() {
		return this.l * this.r;
	}

	@Override
	public double divide() {
		return (double) this.l / (double) this.r;
	}

}
