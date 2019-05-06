package hw1.q18;

public class Question18 extends StringAbstract {

	public Question18(String myString) {

		this.myString = myString;
	}

	public boolean isUpperCase() {
		String lowerString = myString.toLowerCase();
		boolean equal = lowerString.equals(myString);
		if (equal) {
			return false;
		} else {
			return true;
		}
	}

	public String convertToUpper() {
		return myString.toUpperCase();
	}

	public int convertToInt() {
		int num = 10;
		for (int i = 0; i < myString.length(); i++) {
			num = num + (int) myString.charAt(i);
		}
		return num;
	}
}