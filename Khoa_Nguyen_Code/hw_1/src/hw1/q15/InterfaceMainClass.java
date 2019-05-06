package hw1.q15;

public class InterfaceMainClass extends InterfaceTestClass {


    public static void main(String[] args) {

        InterfaceTestClass calculator = new InterfaceMainClass();
		double x = 999;
        double y= 1000;

        System.out.println(x + " and " + y);
        System.out.println("Addition: "+ calculator.addition(x,y));
        System.out.println("Subtraction: "+ calculator.subtraction(x,y));
        System.out.println("Multiplication: "+ calculator.multiplication(x,y));
        System.out.println("Division: "+ calculator.division(x,y));
    }

}