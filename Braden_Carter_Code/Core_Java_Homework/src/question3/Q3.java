package question3;

public class Q3 {
	
	public static void main(String[] args) {
		
		String stringToReverse = "Braden Carter";
		//create string that is going to be reversed
		for (int i = 0; i < stringToReverse.length(); i++) {
		    stringToReverse = stringToReverse.substring(1, stringToReverse.length() - i)
		        + stringToReverse.substring(0, 1)
		        + stringToReverse.substring(stringToReverse.length() - i, stringToReverse.length());
		 }
		 System.out.println(stringToReverse);
		 //print out reversed string
	}

}
