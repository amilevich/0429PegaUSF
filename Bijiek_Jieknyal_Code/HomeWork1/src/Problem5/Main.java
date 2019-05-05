package Problem5;

public class Main {
	// returns the string to the int value
	// write substring method that accepts a string str and an integer idx
	// returns the substring contained between 0 and idx-1 inclusive
	
	 
			  public class ReverseTest {
				  
			  }
				   public static void main(String[] args) {
					   
					 //  reverse a String using substring method in java
					  // if we have the String "ABCDE", and then the character at index-1 is the "C"
				      System.out.println(reverse("ABCDEFG"));
				   }
				   private static String reverse(String str) {
				      if (str.length() <= 1) {
				         return str;
				      }
				      //  reverse a String using substring method in java 
				      return reverse(str.substring(1)) + str.substring(0, 1);
				   }
				}
