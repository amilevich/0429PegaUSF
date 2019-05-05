package question19;

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {
    	
    	// declares an arrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        //initializing sums
        double evenSum = 0;
        double oddSum = 0;

// for every value in the list, display the full list up to the 10th value
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("This is my arrayList populated with integers 1 through 10: " + numbers);

        boolean evenGo = true;
        boolean oddGo = true;
// for each element from the original, check is the numbers in the list are even
        for (int i = 0; i < numbers.size(); i++) {
            int checkEvenOrOdd = isEvenOdd(numbers.get(i));
  // if number is equivalent to 1, then the number is false
            if (checkEvenOrOdd == 1) {
                while(evenGo){
                    System.out.print("Even: ");
                    evenGo =false;
                }
                System.out.print(numbers.get(i)+ " ");
                evenSum += numbers.get(i);
            }

        }
        // prints even numbers
        System.out.println(" Even Sum: " + evenSum);

        
        for (int i = 0; i < numbers.size(); i++) {
            //checks if elements form the original list are odd
            int checkEvenOrOdd = isEvenOdd(numbers.get(i));
            if (checkEvenOrOdd == 0) {
                while(oddGo){
                    System.out.print("Odd: ");
                    oddGo =false;
                }
                System.out.print(numbers.get(i)+ " ");
                oddSum += numbers.get(i);
            }
        }
        // prints odd numbers
        System.out.println("Odd Sum: " + oddSum);
// checks if numbers are prime.  
        // If number is only divisible by 1 and itself, remove the value
  
        for (int i = 0; i < numbers.size(); i++) {
            boolean boolPrime = isPrime(numbers.get(i));
            if (boolPrime) {
            	numbers.remove(i);
            }

        }
        // print out list without prime numbers
        System.out.println("Not Prime: " + numbers);

        }

    public static int isEvenOdd(int value) {
        if(value % 2 == 0)
        {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static boolean isPrime(int value) {

        //we know these so we can just create them
        if(value == 1 || value == 0) return false;
        if(value == 2) return true;


        //check if n is a multiple of 2
        if (value % 2 == 0) return false;

        //if not, then just check the odds
        for (int i = 3; i * i <= value; i += 2) {
            if (value % i == 0)
                return false;
        }
        return true;

    }
}
