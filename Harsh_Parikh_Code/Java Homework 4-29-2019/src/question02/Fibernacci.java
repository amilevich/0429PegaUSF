package question02;

public class Fibernacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// final incremented sum number
		int maxNum = 25;
		// initial numbers
		int prevNum = 0;
		int nextNum = 1;
		// prints out generic message
		System.out.print("The Fibonacci Series of " + maxNum + " numbers: ");
		
		
		
		// for loop used to  loop up to the 25 added totals, the ++i is done to display it.
		for (int i=1; i<maxNum; ++i) {
			// prints out the previous number, then the following numbers
			System.out.print(prevNum + "," + " ");
			
			// adding up the fibon series, which is the total of the previous number and the current 
			// consecutive number
			int sum = prevNum + nextNum;
			// after adding the numbers, the nextNum will become the previous number
			prevNum = nextNum;
			//the next number will become the sum of the nextNum and previous numbered iteration
			nextNum = sum;
					
			
			
		}
				
				

	}

}
