package Question.Twelve;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		// Print out even numbers from 1 - 100 
		int[] newArray = new int[100];
		//int x;
		
		//adding the numbers into newArray 
		
		for(int x = 0; x < 100; x++) {
			newArray[x] = x + 1;
	
		}

		//Creating an enhanced for loop to print out the even numbers
		//in the arraylist 
		
		for(int x : newArray) { //for any x in newArray
			
			if((x < 100) && (newArray[x] % 2 == 0)) { 
				//all the numbers within 1 - 100 and that are dividable by 2 without a remainder aka even 
				System.out.print(newArray[x] + ", ");
				
			}
			
		}
	}

}
