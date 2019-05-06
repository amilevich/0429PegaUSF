package question16;

public class Question16 {

	public static void main(String[] args) {

		int count = 0;                         // initializing the count of characters or spaces
		for (String s : args) {
			count += s.length();
		}
		System.out.println(count);         // Printing number of characters in String

	}
}