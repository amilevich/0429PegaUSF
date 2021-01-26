package Problem11;

import Problem11Float.*;

public class Main {

	public static void main(String[] args) {

		MainFloat Abdou = new MainFloat();

		System.out.println("Here is my first float: " + Abdou.getWidth());
		System.out.println("Here is my second float: " + Abdou.getHeight());

		/* Instance variable can access with object */
		System.out.println("Access Instance Variable like this :" + Abdou.getA());

		/* we can access static variable from two types */
		/* 1. we can access static variable with the help of class and the object */
		System.out.println("Access Static Variable like this :-->" + " " + Abdou.getB());

		/* 2. we can access static variable with the help of classname */
		System.out.println("Access Static Variable like this :" + " " + MainFloat.getB());

		/* we cannot access static variable directly */
		// System.out.println(b); it does not see "b" at all.
		// I have to introduce the classname

		/* we can access final variable with object */
		System.out.println("Access Final Variable like this :" + " " + Abdou.getC());
		/* we cannot access final variable directly */
		// System.out.println(c); it asks to call GetC method.

		Abdou.setWidth((float) 15.5);
		Abdou.setHeight((float) 25.3);

		System.out.println("Here is my first float with another value: " + Abdou.getWidth());
		System.out.println("Here is my second float with another value: " + Abdou.getHeight());

	}

}
