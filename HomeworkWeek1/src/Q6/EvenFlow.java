package Q6;

public class EvenFlow {

	// Returns true if n  
    // is even, else odd 
    static boolean isEven(int n) 
    { 
        boolean isEven = true; 
          
        for (int i = 1; i <= n; i++)  
            isEven = !isEven; 
              
        return isEven; 
    } 
      
    // Driver Code 
    public static void main(String args[]) 
    { 
          
        int n = 4; 
        if(isEven(n)) 
            System.out.println("Even"); 
        else
            System.out.println("Odd"); 
          
    } 
}
