package question03;

public class ReverseString {
	

public static void main(String[] args) {

	// instantiating the string as an object
String a = new String("egasseM sdrawkcaB");


// for each character in the string, subtract the character from the string and 
// return a the new substring with the message reversed
for (int i = 0; i < a.length(); i++) {
	a = a.substring(1, a.length()-1) + a.substring(0,1) + a.substring(a.length() - i, a.length());


System.out.println(a);
}
}
}



