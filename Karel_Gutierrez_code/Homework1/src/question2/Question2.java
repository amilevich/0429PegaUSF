package question2;

public class Question2 {
	
	 
	    // Method to print first n Fibonacci Numbers 
	
	public static void main(String[] args) {

        int n = 10, t1 = 0, t2 = 1; // declaring variables 
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
		
		
		

