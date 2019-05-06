package Q2;

public class Fibonacci {

	// Method to print first n Fibonacci Numbers 
    static void printFibonacciNumbers(int n) 
    { 
        int f1 = 0, f2 = 1, i; 
      
        if (n < 1) 
            return; 
      
        for (i = 1; i <= n; i++) 
        { 
            System.out.print(f2+" "); 
            int next = f1 + f2; 
            f1 = f2; 
            f2 = next; 
        } 
    }  
      
    // Driver Code 
    public static void main(String[] args)  
    { 
        printFibonacciNumbers(25); 
    } 
}
