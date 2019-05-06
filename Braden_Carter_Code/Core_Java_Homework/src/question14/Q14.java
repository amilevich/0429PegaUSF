package question14;
import java.lang.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Q14 {

    public static void main(String[] args) {

        
        int pick = 2;
        //select which process you would like to choose
        //selecting 1 = the square root of number process
        //selecting 2 = date and time process
        //selecting 3 = print string "I am Learning Core Java"
        
        
        int number = 144;
        //set variable to value of number used for square root process
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        //set date format
        Date date = new Date();

      
        switch (pick) {
            case 1:
                System.out.println("Square Root of Number: "+number + " is: "+ Math.sqrt(number));
                break;
            case 2:
                System.out.println(dateFormat.format(date)); 
                break;
            case 3: String myString = "I am learning Core Java";
                   String[] spString = myString.split("");
                printArray(spString);
        }
    }

  
    static void printArray(String myArray[])
    {
        
        int n = myArray.length;
        
        for (int i=0; i<n; ++i) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
    }
}


