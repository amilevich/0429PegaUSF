package Q12;

public class MainQ12 {

	public static void main(String[] args) {
		System.out.println("Print all EVEN number from 1 to 100");
		addArray();
	}

	public static void addArray() {
		int[] array = new int[100];

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}

		}

	}

}
