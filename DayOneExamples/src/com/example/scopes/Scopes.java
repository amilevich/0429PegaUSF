package com.example.scopes;

public class Scopes {

	/*
	 * The lifetime of a variable
	 * 
	 * 4 scopes in Java:
	 * 
	 * Class/Static - variables exist for the lifetime of the class and exist within
	 * the class itself.
	 * 
	 * Object/Instance - the object's fields/state variables exist for the lifetime
	 * of the object and exist within the object itself.
	 * 
	 * Method/Local - parameters and any variables defined at the method level.
	 * Variables exist for the lifetime of the method call.
	 * 
	 * Loop/Block - any variable defined within only curly braces or a control flow
	 * statement
	 */
	{
		int i = 4;
		int j = 4;
	}

	public static int i;

	static {
		int i = 5;
	}

	public static void main(String[] args) {

		int k;

		for (int l = 0; l < 3; l++) {
			int i = 5;
		}

	}

}
