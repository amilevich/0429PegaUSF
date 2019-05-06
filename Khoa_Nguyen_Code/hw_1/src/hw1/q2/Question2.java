package hw1.q2;

public class Question2 {
	public static void main(String[] args) {
		// System.out.println(0);
		// System.out.println(1);
		int firstNum = 0;
		System.out.println(firstNum);
		int secondNum = 1;
		int sum = 1;
		for (int i = 1; i < 24; i++) {
			System.out.println(sum);
			sum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;

		}
		
	}
}
