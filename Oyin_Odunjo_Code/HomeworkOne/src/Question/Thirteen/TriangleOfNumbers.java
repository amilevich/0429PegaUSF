package Question.Thirteen;

public class TriangleOfNumbers {
		
	public static void TriangleNumbers(String[] args) { //Will display a triangle of 0s and 1s 
		
		for(int i = 0; i < 10; i++) { //This will iterate through 10 numbers 
			//Will print out 0 of i is an even number
			if(i % 2 == 0) {
				System.out.print(1);
			}else { //Print 1 if i is an odd number 
				System.out.print(0);
			}
		}
		System.out.println();
	}

}
 