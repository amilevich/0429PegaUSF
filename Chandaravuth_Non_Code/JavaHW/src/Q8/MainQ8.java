package Q8;

import java.util.ArrayList;

public class MainQ8 {

	public static void main(String[] args) {
		String[] s1 = { "karan", "madam", "tom", "civic", "radar", "sexes", "jimmy", "kayak", "john", "refer", "billy",
				"did" };

		arrayListMethod(s1);

	}

	public static void arrayListMethod(String[] s) {
		ArrayList<String> Array1 = new ArrayList<>();
		ArrayList<String> Array2 = new ArrayList<>();

		for (int i = 0; i < s.length; i++) {
			Array1.add(s[i]);
		}
		System.out.println("ArrayList1:  ");
		System.out.println(Array1);
		System.out.println();

		System.out.println("ArrayList2 Copy from ArrayList1:  ");
		Array2.addAll(Array1);
		System.out.println(Array2);
	}

}
