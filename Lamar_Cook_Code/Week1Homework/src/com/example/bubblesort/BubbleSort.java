package com.example.bubblesort;

public class BubbleSort {
	//static method for array
public static void bbSort(int [] array) {
	int n = array.length;
	
	int temp = 0;
	
	for(int i = 0; i < n; i++) {
		for(int j=1; j<(n-1); j++) {
			if(array[j-1] > array[j]) {
				//then swap out the elements
				temp = array[j-1];
				array[j-1] = array[j];
				array[j]= temp;
			}
		}
	}
}

public static void main(String[] args) {
	int array[]=  {1,0,5,6,3,2,3,7,9,8,4};//My  Array
	
	for(int i= 0; i < array.length; i++);
	System.out.println(array[1]);//for loop to print array
	
	System.out.println("--------");

	bbSort(array);
 for(int i =0; i < array.length; i++ ) {
	 //print out numbers using bubble sort
	 System.out.println(array[i]);
 }
} 
}


