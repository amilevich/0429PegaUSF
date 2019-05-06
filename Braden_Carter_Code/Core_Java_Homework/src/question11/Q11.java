package question11;
import question11B.NumbersToImport;
//^^imports numbers from different package
public class Q11 {
	
	public Q11() { }

	    public static void main(String[] args) {
	        NumbersToImport numbers = new NumbersToImport();

	        System.out.println("Float number one: "+ numbers.floatNumber1);
	        //print out float number 1 from other class
	        System.out.println("Float number two: "+ numbers.floatNumber2);
	        //print out float number 2 from other class
	    
	}
}


