package Problem18;

import java.util.Scanner;

public class Main extends MyBean {
	
    public Main(String myString) {
        super(myString);
    }
    
    
    public static void main(String[] args) {
	String input;
	MyBean userInput;
   
    while (true) {
        try { Scanner one = new Scanner(System.in);
        System.out.println("Enter String: " );
            input = one.nextLine();
            userInput = new MyBean(input);
            break;
        } catch (NumberFormatException ignore) {
            System.out.println("Invalid input, Please enter numeric value");
        }
    }

    boolean checkUpper = userInput.isUpperCase();
    if(checkUpper){
        System.out.println("1.)" + input + " Does have uppercase Letters");
    }else{
        System.out.println("1.)" +input+" Does NOT have uppercase Letters");
    }

    String toUpper = userInput.convertToUpper();
    System.out.println("2.)" + input + " -> Converted to UpperCase: " + toUpper);

    int addTen = userInput.convertToInt();
    System.out.println("3.)" + input + " + 10 = " + addTen);

    }

}

