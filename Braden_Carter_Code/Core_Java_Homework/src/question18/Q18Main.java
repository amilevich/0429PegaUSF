package question18;


import java.util.Scanner;

	public class Q18Main extends Q18Subs{

	    public Q18Main(String myString) {
	        super(myString);
	    }

	    public static void main(String[] args) {
	        String input;
	        Q18Subs userInput;
	        Scanner one = new Scanner(System.in);
	        System.out.println("Enter String: " );
	        //entire string in console
	        while (true) {
	            try {
	                input = one.nextLine();
	                userInput = new Q18Subs(input);
	                break;
	            } catch (NumberFormatException ignore) {
	                System.out.println("Invalid input, Please enter numeric value");
	            }
	        }

	        boolean checkUpper = userInput.isUpperCase();
	        //true or false, check if uppercase
	        if(checkUpper){
	            System.out.println("1.)" + input + " Does have uppercase Letters");
	            //if string does have uppercase
	        }else{
	            System.out.println("1.)" +input+" Does NOT have uppercase Letters");
	            //if string does NOT have uppercase
	        }

	        String toUpper = userInput.convertToUpper();
	        System.out.println("2.)" + input + " -> Converted to UpperCase: " + toUpper);

	        int addTen = userInput.convertToInt();
	        System.out.println("3.)" + input + " + 10 = " + addTen);


	    }

	}


	
