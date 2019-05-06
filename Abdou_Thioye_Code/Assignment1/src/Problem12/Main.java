package Problem12;

public class Main {

	public static void main(String[] args) {

		final int SIZE = 100;
		int[] arr = new int[SIZE];

		for (int i = 0; i < SIZE; i++)
			arr[i] = i + 1;

		for (int num : arr)
			if (num % 2 == 0)
				System.out.println(num);

	}

}
