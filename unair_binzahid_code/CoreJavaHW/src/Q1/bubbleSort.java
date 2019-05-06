package Q1;

public class bubbleSort {
	
	void bubbleSort(int arr[]) 
	// bubbleSort is made to not return anything but define how
	// the actual sorting is done by using nested for loops
    { 
        int n = arr.length; 			//defines n as the length of the array
        for (int i = 0; i < n-1; i++) 	//loops through the length of the array
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) //if next value is bigger, swaps places
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
    } 
  
    
    void printArray(int arr[])  	//creating a format on how to print the array
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 			//goes through each sorted value
            System.out.print(arr[i] + " "); //prints each sorted value with a space
        System.out.println(); 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        bubbleSort ob = new bubbleSort(); //object referencing sorting method is created
        int arr[] = {1, 0, 5, 6, 3, 2, 3, 7, 9, 8, 4}; //array is given
        ob.bubbleSort(arr); //the array is being sorted
        System.out.println("Sorted array"); 
        ob.printArray(arr); //printArray method is called so print sorted array
    } 

}
