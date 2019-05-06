package question12;

public class Q12 {

	 public static void main(String[] args) {

	        int arraySize = 100;
	        //array size set to 100
	        int[] myArray = new int[arraySize];
	        
	        
	        for(int i=0; i < myArray.length;i++){
	            myArray[i]=i+1;  
	            //starting at 0, while i is < array length(100), add 1
	        }

	        for (int even : myArray) {
	            
	            if(even % 2 == 0)
	            {
	                System.out.println("Even: " +even);
	            }
	        }
	        //^^for loop to find even numbers. After dividing by 2 if there is no remainder, number is even

	    }
	    
	    static void printArray(int myArray[])
	    //print array
	    {
	        int n = myArray.length;
	        //set n equal to array length
	        for (int i=0; i<n; ++i) {
	            System.out.print(myArray[i] + " ");
	            //starting at 0, while < array length, add 1 after
	        }
	        System.out.println();
	    }




	}
	
