package hw1.q14;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Question14 {

	public static void main(String[] args) {

		int caseNumber = 3;

		int number = 100;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();

		switch (caseNumber) {
		case 1:
			System.out.println("Square Root of " + number + " = " + Math.sqrt(number));
			break;
		case 2:
			System.out.println("Today is " + dateFormat.format(date));
			break;
		case 3:
			String str = "Hello World";
			String[] newString = str.split("");
			for (String a : newString) {
				System.out.print(a + " ");
			}
		}
	}
}
