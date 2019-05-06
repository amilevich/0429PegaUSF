package Question.One;

public class BubbleSort {
	
	void bubbleSort(int MyArray[]) {
		
		int x = MyArray.length; //assigning the length of the entire array to "x"
		// x in our case = 11
		for (int y = 0; y < x-1; y++) //Grabbing the first element and wil increment 
			for (int z = 0; z < x-y-1; z++) //grabbing the element next to it 
				if (MyArray[z] > MyArray[z-1]) {
					// swapping the two elements in the array
					// MyArray[y] and MyArray[y+1] 
					
					int tempInt = MyArray[z];
					MyArray[z] = MyArray[z+1];
					MyArray[z+1] = tempInt;
					
				}
		
		//Printing the array 
		
		
	}


	

}

