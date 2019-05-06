package question13;

public class Q13 {

	public static void main(String[] args) {
        int line = 0;
        //set line = to 0
        System.out.println(line);
        //print out first line (variable "line") ("0")
        for (int i = 0; i <= 1; i+=1)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(line+1);

                if(j%2==0){
                    System.out.print(line);
                }
            }
            System.out.print("\n");
        }
        //last level of the pyramid
        for(int i =0; i<3;i+=2){
            if(i%2==0)
            {
                System.out.print(line);
            }
            System.out.print(line+1);
        }
    }
}


