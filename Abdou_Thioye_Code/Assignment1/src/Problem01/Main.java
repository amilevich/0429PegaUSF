package Problem01;

public class Main {

	public static void main(String[] args) 
	{
		// I declare my Array here
		int[] Array= new int[]{1 , 0, 5, 6, 3, 2, 3, 7, 9, 8,4};
		
		// Print out the Unsorted array with the for loop to make spaces between indexes.
		System.out.print( "Unsorted Array is  : " ); 
		for (int k =0; k<Array.length; k++)
		{
			System.out.print(+Array[k]+" ");
		}
		System.out.println();
		//Assign a temp variable to make my switching in the array
	    int tmp;
	    // t
	    for(int i=0;i<Array.length;i++){
	        for(int j=0;j<Array.length-i;j++){
	            if(j==(Array.length-1)){
	                break;
	            }
	            else{
	                if(Array[j]>Array[j+1]){
	                    tmp=Array[j];
	                    Array[j]=Array[j+1];
	                    Array[j+1]=tmp;
	                }
	            }
	        }
	    }
	    System.out.print("The Sorted Array is: ");
	    for(int i=0;i<Array.length;i++){
	        System.out.print( + Array[i]+" ");
	    }
	    
	    
	}

}
