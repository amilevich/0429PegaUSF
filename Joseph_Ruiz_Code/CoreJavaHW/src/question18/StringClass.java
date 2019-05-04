package question18;

// Name: StringClass.java
// Author: Joe Ruiz
// Date: 05/03/2019
// implementes subclass

public class StringClass extends MyClass {

	@Override
	public boolean hasUppercase(String str) {
		for (int i = 0; i <= str.length() - 1; i++) {
			// test the characters, return true if any are uppercase
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				return true;
			}
		}
		// return false if none are uppercase
		return false;
	}

	@Override
	public String makeUppercase(String str) {
		// Java has a toUpperCase method
		return str.toUpperCase();
	}

	@Override
	public int toInteger(String str) {
		int sum = 0;
		for (int i = 0; i <= str.length() - 1; i++) {
			// Add the number value for each character
			sum = sum + str.charAt(i);
		}
		// Add 10 to the sum
		sum = sum + 10;
		return sum;
	}

}
