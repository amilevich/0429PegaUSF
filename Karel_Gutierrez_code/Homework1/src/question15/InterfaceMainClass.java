package question15;



public class InterfaceMainClass extends InterfaceTestClass {


    public static void main(String[] args) {

        InterfaceTestClass calculator = new InterfaceMainClass();
        double operand1 = 3;
        double operand2= 4;

        System.out.println("Numbers are: "+operand1+ " and " +operand2);
        System.out.println("Addition: "+ calculator.addition(operand1,operand2));
        System.out.println("Subtraction: "+ calculator.subtraction(operand1,operand2));
        System.out.println("Multiplication: "+ calculator.multiplication(operand1,operand2));
        System.out.println("Division: "+ calculator.division(operand1,operand2));
    }

}
	
	
	
	
