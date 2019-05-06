package Q1;

public class Q1 {
	   static void bubbleSort(int[] arr) {
	       int n = arr.length;
	       int temp = 0;
	        for(int i=0; i < n; i++){
	                for(int j=1; j < (n-i); j++){
	                         if(arr[j-1] > arr[j]){
	                                //swaps the elements
	                                temp = arr[j-1];
	                                arr[j-1] = arr[j];
	                                arr[j] = temp;
	                        }

	                }
	        }

	   }
	   public static void main(String[] args) {
	               int arr[] ={1,0,5,6,3,2,3,7,9,8,4
	                       };
                      //Prints out the Array before it was sorted
	               System.out.println("Array Before Bubble Sort");
	               for(int i=0; i < arr.length; i++){
	                       System.out.print(arr[i] + " ");
	               }
	               System.out.println();

	               bubbleSort(arr);//sorting array elements using bubble sort

	               System.out.println("Array After Bubble Sort");
	               for(int i=0; i < arr.length; i++){
	                       System.out.print(arr[i] + " ");
	               }

	       }
	}

