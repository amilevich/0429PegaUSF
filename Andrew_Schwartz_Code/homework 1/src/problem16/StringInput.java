package problem16;

public class StringInput {
	
	public static void main (String[] args) {
		
		String str  = "I need a drink after this homework";
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i)))
				counter++;
			
		}
		System.out.println(counter + " charcaters. ");
	}

}
