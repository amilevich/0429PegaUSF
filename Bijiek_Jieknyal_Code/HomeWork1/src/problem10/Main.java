package problem10;

// import java.util.Scanner;

 public class Main{

//public class JavaTernaryOperatorExamples

  /**
   * Find the minimum of two numbers using ternary operators in java
   * Used the Java ternary operator

   */
  public static void main(String[] args)
  {
    // Apply the example of minimum value
	  
    int minVal, a=3, b=2;
    minVal = a < b ? a : b;
    System.out.println("min = " + minVal);
    
    // used absolute value 
    
    a = -10;
    int absValue = (a < 0) ? -a : a;
    System.out.println("abs = " + absValue);

    // the value of 1.0 is assigned to the result
    
    float result = true ? 1.0f : 2.0f;
    System.out.println("float = " + result);
 
    // sorry dude it is false, was assigned as a value
    
    String s = false ? "Dude, that was true" : "Sorry Dude, it's false";
    System.out.println(s);
    
    // the examples of the ternary operator on the rhs, in a string were applied
    
    int x = 5;
    String out = "There " + (x > 1 ? " are " + x + " cookies" : "is one cookie") + " in the jar.";
    System.out.println(out);

  }
}
	
	    