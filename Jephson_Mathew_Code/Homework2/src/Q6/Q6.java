package Q6;

public class Q6 {

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

       int n = 7;
       if(isEven(n))
           System.out.println("Even");
       else
           System.out.println("Odd");

   }

}