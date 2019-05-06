package question6;

	// check for even or odd 
	
	  
	public class Question6 {  
	       
	    // Returns 0 if n is even, else odd 
		
	    static int isEven(int n) 
	    { 
	           
	        // n&1 is 1, then odd, else even 
	    	
	        return (n & 1); 
	    } 
	       
	    // Driver code 
	    public static void main(String args[]) 
	    { 
	        int n = 101; 
	        if(isEven(n)==0) 
	            System.out.print("Even"); 
	        else
	            System.out.print("Odd"); 
	    } 
	} 
	   
	// This code is contributed 
	// by Manish Shaw (manishshaw1) 


