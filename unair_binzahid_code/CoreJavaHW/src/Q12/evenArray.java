package Q12;

public class evenArray {
	
	public static void main(String[] args) {

        int arraySize = 100;
        int[] myArray = new int[arraySize];

        for(int i=0; i < myArray.length;i++){ //loops 99x
            myArray[i]=i+1;  //add one to store the 1 -> 100
        }

        for (int even : myArray) {
            if(even % 2 == 0) //if divisible by 2 then it is even
            {
                System.out.println("Even: " +even); //for evens print them
            }
        }

    }
	
}
 
