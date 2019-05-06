package hw1.q13;

public class Question13 {

	public static void main(String[] args) {
		int num = 0;
		System.out.println(num);
		for (int i = 0; i <= 1; i++) {
			for (int k = 0; k <= i; k++) {
				System.out.print(num + 1);

				if (k % 2 == 0) {
					System.out.print(num);
				}
			}
			System.out.print("\n");
		}

		for (int i = 0; i < 3; i += 2) {
			if (i % 2 == 0) {
				System.out.print(num);
			}
			System.out.print(num + 1);
		}
	}
}