package Problem03;

public class Reverse {

	public static void main(String[] args) {

		String str = "The quick brown fox jumps over the lazy dog";
		System.out.println(str);
		// Assigning array length to "len" to make my life easier
		int len = str.length();
		// Declaring the for loop which starts from the end of the Array and increment
		// it by 1 to the starting array
		for (int i = (len - 1); i >= 0; --i)
			str += str.charAt(i);

		str = str.substring(len);
		System.out.print("The Reverse Array is as follows: ");
		System.out.println(str);

	}

}
