package Q1;

public class MainQ1 {

	public static void main(String[] args) {

		int array[] = { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4 };
		System.out.println("before bubble sort");
		printArr(array);
		System.out.println();
		System.out.println("after bubble sort");
		bubbleSort(array);
		System.out.println();
		printArr(array);
	}

	public static void bubbleSort(int[] arr) {

		int temp;

		/*
		 * temp= first; first=next; next=temp; System.out.println(first);
		 */

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < (arr.length - i); j++) {

				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;

				}

			}
		}

	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; ++i) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}
