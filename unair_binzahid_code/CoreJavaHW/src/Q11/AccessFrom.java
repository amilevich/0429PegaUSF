package Q11;

import Q11variables.variables; //imports from other package variables

public class AccessFrom {

    public static void main(String[] args) {
        variables numbers = new variables(); //calling the method from the other package

        System.out.println("Float one: "+ numbers.floatOne); //syso the float
        System.out.println("Float Two: "+ numbers.floatTwo);
    }

}
