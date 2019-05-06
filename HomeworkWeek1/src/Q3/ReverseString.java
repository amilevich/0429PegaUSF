package Q3;

public class ReverseString {

	public static void main(String[] args) { 
	    String s[]="Those hotdogs on the far left are on sale , but not the ones in the cooler".split(" "); 
	    String ans=""; 
	    for(int i=s.length - 1; i >= 0; i--) { 
	        ans+=s[i]+" "; 
	          
	    } 
	    System.out.println("Reversed String:"); 
	    System.out.println(ans.substring(0,ans.length()-1)); 
	      
	} 
}
