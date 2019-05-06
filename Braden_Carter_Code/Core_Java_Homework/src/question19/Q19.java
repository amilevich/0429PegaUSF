package question19;


	import java.util.ArrayList;

	public class Q19 {

	   public static void main(String[] args) {

	       ArrayList<Integer> list = new ArrayList<Integer>();
	       double evenSum = 0;
	       double oddSum = 0;


	       for (int i = 1; i <= 10; i++) {
	           list.add(i);
	           //starting at 1, while less than or equal to 10, add 1
	       }

	       System.out.println("My ArrayList is 1 through 10: " + list);

	       boolean evenGo = true;
	       boolean oddGo = true;

	       for (int i = 0; i < list.size(); i++) {
	           //starting at 1, while less than list size, add 1
	           int checkEvenOrOdd = isEvenOdd(list.get(i));
	           if (checkEvenOrOdd == 1) {
	               while(evenGo){
	                   System.out.print("\nEven: ");
	                   evenGo =false;
	               }
	               System.out.print(list.get(i)+ " ");
	               evenSum += list.get(i);
	            //check if even or odd
	           }

	       }
	       System.out.println("\t\tEven Sum: " + evenSum);

	       for (int i = 0; i < list.size(); i++) {
	           //checks if elements form the original list are odd
	           int checkEvenOrOdd = isEvenOdd(list.get(i));
	           if (checkEvenOrOdd == 0) {
	               while(oddGo){
	                   System.out.print("\nOdd: ");
	                   oddGo =false;
	               }
	               System.out.print(list.get(i)+ " ");
	               oddSum += list.get(i);
	           }
	       }
	       System.out.println("\t\t\tOdd Sum: " + oddSum);

	       for (int i = 0; i < list.size(); i++) {
	           boolean boolPrime = isPrime(list.get(i));
	           if (!boolPrime) {
	              list.remove(i);
	           }

	       }
	       System.out.println("\nNot Prime: " + list);

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

	        
	       if(value == 1 || value == 0) return false;

	       if(value == 2) return true;
	       //checking for prime number


	       
	       if (value % 2 == 0) return false;
	       	//check if diving by two returns an odd number
	       
	       for (int i = 3; i * i <= value; i += 2) {
	           if (value % i == 0)
	               return false;
	       }
	       return true;

	   }


	
}
