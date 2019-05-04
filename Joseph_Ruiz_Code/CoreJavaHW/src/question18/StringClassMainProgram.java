package question18;

// Name: StringClassMainProgram.java
// Author: Joe Ruiz
// Date: 05/03/2019
// subclass demo

public class StringClassMainProgram {

	public static void main(String[] args) {
		String t = "Hello World!";
		StringClass sc = new StringClass();
		System.out.println(sc.hasUppercase(t));
		System.out.println(sc.makeUppercase(t));
		System.out.println(sc.toInteger(t));
	}

}
