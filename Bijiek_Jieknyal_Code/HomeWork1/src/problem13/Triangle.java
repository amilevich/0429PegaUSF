package problem13;

public class Triangle{
	
	// public class TrianglePattern 
	// create a triangle for loop
	
	    public static void main(String[] args) {
	    	
	        // This procedures was used to generate the numbers needed to build the triangle 
	    	
	        int dim = 10;
	        for (int i = 0; i < dim; i++) {
	            for (int k = i; k < dim; k++) {
	                System.out.print(" ");
	            }
	            
	            // for loop type is appy to render appropriate variables
	            
	            for (int j = 0; j <= i; j++) {
	           // print codes to display the console triangle	
	                
	                    System.out.print("*");
	                System.out.print(" ");
	            }
	            System.out.println("");
	        }
	    }
	}