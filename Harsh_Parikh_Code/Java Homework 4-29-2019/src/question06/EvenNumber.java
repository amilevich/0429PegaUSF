package question06;
import java.util.Scanner;


public class EvenNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Please enter a number: ");
	    int num  = scan.nextInt();
	    
	    if ((num / 2)*2 == num) {
	    		System.out.println("The number " + num + " is even");
	    }
	    else
	    	System.out.println("That number is odd");

}
}

