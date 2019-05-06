package Q9;

import java.util.ArrayList;

public class prime {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<Integer>(); //creates 3 blank array lists
        ArrayList<Integer> myPrimes = new ArrayList<Integer>();
        ArrayList<Integer> notPrimes = new ArrayList<Integer>();
        for (int i = 1; i <= 100; i++) { //adds values 1-100 into mylist
            myList.add(i);
        }

        for (int primes : myList) {

            boolean boolPrime = isPrime(primes); //creating boolean object to check
            									 //whether num is prime
            
            if (boolPrime) { //adds the num to the prime list
                myPrimes.add(primes);
            } else { 		//adds the non to the not prime list
                notPrimes.add(primes);
            }
        }

        System.out.println("NotPrimes List: "); //syso non and prime list
        System.out.println(notPrimes);

        System.out.println("Primes list: ");
        System.out.print(myPrimes);

    }


    public static boolean isPrime(int value) { //defining true/false of isPrime


        if(value == 1 || value == 0) return false; //creating checks for even/odd
        if(value == 2) return true;			//multiples of 2 will return true

        if (value % 2 == 0) return false; //checks if num is a mult of 2

        for (int i = 3; i * i <= value; i += 2) {//checking if odd
            if (value % i == 0)
                return false;
        }
        return true;

    }
}