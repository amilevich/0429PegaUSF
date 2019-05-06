package question9;

import java.util.*;
public class Q9
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n = 100;
        //greatest number to find prime numbers
        for(int i=1;i<=n;i++) 
        //starting value is 1
        {
            int flag = 1;
            for(int j=2;j<=i/2;j++)  
            {
                if(i%j==0) 
                {
                    flag = 0;
                    break;
                }

            }
            if(flag==1) 
            {
                System.out.print(i+" ");
            }
        }
    }
}