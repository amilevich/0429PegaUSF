package Problem11Float;

public class MainFloat {

	public float width;
	public float height;
	private int a;
	private static int b;
	private final int c;

	public MainFloat() {
		this.width = 400f;
		this.height = 400f;
		//Since my variable is private, I have to call setA method to
		//assign it a variable
		this.setA(10);
		//Since my variable is private and static, I have to call the class alone 
		//with the setA method to assign it a variable
		MainFloat.setB(20);
		
		this.c = 30;

	}

	public float getWidth() {
		return this.width;
	}

	public float getHeight() {
		return this.height;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public static int getB() {
		return b;
	}

	public static void setB(int b) {
		MainFloat.b = b;
	}

	public int getC() {
		return c;
	}

}
