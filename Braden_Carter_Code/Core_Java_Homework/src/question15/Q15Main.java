package question15;

public class Q15Main extends Q15Test{

	public static void main(String[] args) {

        Q15Test calculator = new Q15Main();
        double num1 = 4;
        double num2= 5;

        System.out.println("Numbers are: "+num1+ " and " +num2);
        //prints out numbers
        System.out.println("Addition: "+ calculator.addition(num1,num2));
        //prints out number after using addition process
        System.out.println("Subtraction: "+ calculator.subtraction(num1,num2));
        //prints out number after using subtraction
        System.out.println("Multiplication: "+ calculator.multiplication(num1,num2));
        //prints out number after using multiplication
        System.out.println("Division: "+ calculator.division(num1,num2));
        //prints out number after using division
    }
	
}
