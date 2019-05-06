package question6;

public class Q6 {


    
    static boolean isEven(int n) 
    { 
    	boolean isEven = true; 
       	// Returns true if n is even. 

        for (int i = 1; i <= n; i++)  
            isEven = !isEven; 
              
        return isEven; 
    } 
      
      
     
    public static void main(String args[]) 
    { 
          
        int n = 101; 
        //number that is being evaluated
        if(isEven(n)) 
            System.out.println("Even");
        	//if even print out "even"
        else
            System.out.println("Odd"); 
        	//if odd print out "odd"
          
    } 

}
