package question3;

public class Question3 {

	public static void main(String[] args) {
		

		
		  String txt = "The art of reversing text";

		    int len = txt.length();
		    
		    for (int i = (len-1); i >= 0; --i) 
		    	
		        txt += txt.charAt(i);
		    
		    txt = txt.substring(len);

		    System.out.println(txt);
	}

}
