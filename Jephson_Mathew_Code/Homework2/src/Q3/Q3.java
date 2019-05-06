package Q3;

public class Q3 { 
	
	public static void main(String[] args) {
	//Variable named reverseMe with string Rajon Rondo as the string literal
	String reverseMe = "Rajon Rondo";
	for (int i = 0; i < reverseMe.length(); i++) {
	    reverseMe = reverseMe.substring(1, reverseMe.length() - i)
	        + reverseMe.substring(0, 1)
	        + reverseMe.substring(reverseMe.length() - i, reverseMe.length());
	 }
	//Prints out the reversed String 
	 System.out.println(reverseMe);
}

}
