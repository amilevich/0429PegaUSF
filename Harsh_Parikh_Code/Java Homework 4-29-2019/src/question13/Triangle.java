package question13;

public class Triangle {
	public static void main(String[] args) {
        int var = 0;
        //first print out the first element 0
        System.out.println(var);
        //for for the second and third levels
        for (int i = 0; i <= 1; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(var+1);

                if(j%2==0){
                    System.out.print(var);
                }
            }
            System.out.print("\n");
        }
        //last level of the triangle
        // we increment it to two so that it prints only 4 numbers rather than 5
        for(int i =0; i<3;i+=2){
        	// if any length of i is divisible by 2 with remainder of 0, print out the variable.
            if(i%2==0)
            {
                System.out.print(var);
            }
            System.out.print(var+1);
        }
    }
}