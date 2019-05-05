package question11;


// imports from question b package.  Question b package contains the float float variables
import question11b.Variables;

public class AccessFromJava {

    public AccessFromJava() { }

    public static void main(String[] args) {
    	
 // instantiating nubmers
    	Variables numbers = new Variables();
// print out floats from other package
        System.out.println("Float one: "+ numbers.floatOne);
        System.out.println("Float Two: "+ numbers.floatTwo);
    }
}

