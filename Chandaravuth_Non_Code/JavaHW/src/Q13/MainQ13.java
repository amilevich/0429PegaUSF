package Q13;

public class MainQ13 {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("Display the Triangle: ");
		System.out.println();

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				if (i <= j) {
					if (count == 0) {
						System.out.print(0);
						count++;
					} else if (count == 1) {
						System.out.print(1);
						count--;
					}

				}

			}
			System.out.println();
		}

	}

}
