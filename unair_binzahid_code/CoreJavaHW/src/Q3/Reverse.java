package Q3;


public class Reverse {
	
	public static void main(String [] args) {
	String r = "reverse me!"; //string created with desired text
	for (int i = 0; i < r.length(); i++) { //to loop through length of the string
	    r = r.substring(1, r.length() - i) // string r has its values swapped
	        + r.substring(0, 1)
	        + r.substring(r.length() - i, r.length());
	 }
	 System.out.println(r); //prints reversed string
	
	}
}
