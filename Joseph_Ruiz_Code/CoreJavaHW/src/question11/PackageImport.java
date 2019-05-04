package question11;

// Name: PackageImport.java
// Author: Joe Ruiz
// Date: 05/03/2019
// Float variable object example

import question11A.FloatObject;

public class PackageImport {

	public static void main(String[] args) {
		// Create a FloatObject and read the values
		FloatObject f = new FloatObject(4.5f, 5.2f);
		System.out.println("A: " + f.getA());
		System.out.println("B: " + f.getB());
	}

}
