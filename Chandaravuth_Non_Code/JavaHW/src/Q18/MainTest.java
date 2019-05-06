package Q18;

public class MainTest {
	public static void main(String [] args)
	{
		Q18ChildClass q18 = new Q18ChildClass();
		
		System.out.println("Check uppercase characters: return type TRUE or FALSE: ");
		System.out.println(q18.checkUppercase("hEllow world"));
		System.out.println();
		System.out.println("Convert all Lower Case Character to Upper Case: ");
		System.out.println(q18.convertLowerToUpperCase("hellow World"));
		System.out.println();
		System.out.println("Convert char to integer then add 10: ");
		System.out.println(q18.stringToInteger("hellow World"));
		
		
	}
}
