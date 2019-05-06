package com.example.q1attempt2;

import java.util.Arrays;

public class main {
	/*
	 * All sys.o's are used to troubleshoot. They are commented out once
	 * troubleshooting is no longer necessary.
	 */
	public static void main(String[] args) {
		int[] intArr = new int[]{1,0,5,6,3,2,3,7,9,8,4};
		System.out.println("Original Set: "+ Arrays.toString(intArr));
		BubbleSort(intArr);
		System.out.println("Sorted Set: " + Arrays.toString(intArr));
		int[] testing = new int[]{11,10,9,8,7,6,5,4,3,2,1};
		BubbleSort(testing);
		System.out.println("Test: "+Arrays.toString(testing));


	}
	
	public static void BubbleSort(int[] intArr) {
		/*
		 * To BubbleSort, we use two variables: count and iteration in a while loop,
		 * iteration allows us to "move along" through all of the values in our
		 * group of numbers (i.e. the "array")
		 * 
		 * count is a variable that is designed to stop the loop once the array has
		 * been sorted.count turns to zero every time that a switch is made. If the
		 * bubble sort goes throughout the whole array without changing any values,
		 * then the set is sorted and there is no need for the computer to keep
		 * sorting, and the while loop 
		 */
		int count = 0;
		int iteration=0;
		while (count<=(intArr.length)) {
			//System.out.println("iteration: "+iteration);
			//System.out.println(intArr[iteration]>intArr[iteration+1]);
			if(intArr[iteration]>intArr[iteration+1]) {
				count=0;
				//System.out.println(Arrays.toString(intArr));
				int middleVariable1=intArr[iteration];
				int middleVariable2=intArr[iteration+1];
				intArr[iteration]=middleVariable2;
				intArr[iteration+1]=middleVariable1;
				
			}
			else {
				count=count+1;
			}
			
			iteration=iteration+1;
			if (iteration == (intArr.length-1)) {
				iteration=0;
			}
			
			//System.out.println(Arrays.toString(intArr));
	
		}
		//System.out.println((Arrays.toString(intArr)));
		//return intArr;
	}

}
 