package Q16;

public class MainQ16 {
	public static void main(String[] args) {

		int num = 0;
		for (int i = 0; i < args.length; i++) {
			num = num + args[i].length();
		}
		System.out.println("number of characters for a string input is: " + num);

	}

}
