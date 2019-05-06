package Q13;
/*
 * Display the triangle on the console as follows using any type of loop.  
 * Do NOT use a simple group of print statements to accomplish this.
 * 0
 * 10
 * 101
 * 0101
 */
public class Triangle {

	public static void main(String[] args) {
		 
	      // The triangle will have 4 lines
	      // One loop iteration each line
	 
	      for (int i=1; i<=4; i++) {
	 
	         // For each loop iteration 
	         // I want to print a pattern of numbers
	 
	         for (int j=1;j<=i; j++) {
	            System.out.print(((i+j)%2)+"");
	         }
	         System.out.print("\n");
	      }
	   }
}
