package question1;

public class Question1 {

	public static void main(String[] args) {
		 int array[]= {1,0,5,6,3,2,3,7,9,8,4};
		 
		bubbleSort(array) ;
		
		for (int i=0; i< array.length ; i++) {
			
			System.out.print(array[i]);
			
		}		
	}
	
	    public static void bubbleSort(int[] unsorted) {

	        for(int i = 0; i < unsorted.length; i++) {
	        	
	            for(int j = 0; j < unsorted.length-1; j++) {
	            	
	                if(unsorted[j] > unsorted[j+1]) {
	                	
	                    int temp = unsorted[j];
	                    
	                    unsorted[j] = unsorted[j+1];
	                    
	                    unsorted[j+1] = temp;
	                }
	            }
	        }

	    }

	

}