package question01;
import java.util.Arrays;

public class BubbleSortArray {
	   //declaring bubble sort method inside array
		static void bubbleSort(int[] array) {
			// defining the array length maximum of 11
		      int n = array.length;
		      // initializing the temporary storage variable at 0
		      int temp = 0;
		      // iterating the values inside of the array from first value to max value
		      for(int i = 0; i < n; i++) {
		    	  // iterating the secondary next values inside of the array
		         for(int j=1; j < (n-i); j++) {
		        	 // if current value is greater than the previous value, swap the two into the temp variable
		            if(array[j-1] > array[j]) {
		               temp = array[j-1];
		               array[j-1] = array[j];
		               array[j] = temp;
		            }
		         }
		      }
		   }
		   public static void main(String[] args) {
			   // declare array
		      int array[] = { 1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4 };
		      System.out.println("Array Before Bubble Sort");
		      
		      // for each value in the array, print out the iteration of each number before the sort
		      
		      // iterate array count up to array length, and print them in the intended order

		      for(int i = 0; i < array.length; i++) {
		         System.out.print(array[i] + " ");
		      }
		      // empty space
		      System.out.println();
		      //call the bubblesort method inside of the array and print the sorted version 
		      bubbleSort(array);
		      System.out.println("Array After Bubble Sort");
		      // print the sorted version of array

		      for(int i = 0; i < array.length; i++) {
		         System.out.print(array[i] + " ");
		      }
		   }
		}
		
		