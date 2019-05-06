//***NEED TO COMMENT***

package Question.Eight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Palindrome {

private static ArrayList<String> palinOne = new ArrayList<String>();
	
	
	private static ArrayList<String> palindromes( ArrayList<String> list ){ //new method
		int cOne,
		    cTwo;
		
		
		for(String y: list){
			
			if( y.length() % 2 == 0 ){
				
				cOne = y.length() / 2;
				cTwo = 0;
				
				for(int i = 0; i < cOne; i++){
					
					if( y.charAt(i) == y.charAt( y.length() - i - 1))
						cTwo++;
					
					if( cTwo == cOne )
						palinOne.add(y);
				}
			}else{
				
				cOne = (y.length()- 1) / 2;
				cTwo = 0;
				
				for(int j = 0; j < cOne; j++){	
					if( y.charAt(j) ==  y.charAt( y.length() - j - 1)  )
						cTwo++;
					
					if( cTwo == cOne )
						palinOne.add(y);	
				}
			}
			
			
		}
		return palinOne;
	}
	
	
	
	

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String> 
		(Arrays.asList("karan", "madam", "tom", "civic", "radar", "sexes", "jimmy",
						  "kayak", "john", "refer", "billy", "did"));
		
		
		try( BufferedWriter out = new BufferedWriter(new FileWriter("src/palindromes.txt")) )
		{
			Iterator<String> iterate = arr.iterator();
			
			while( iterate.hasNext() )
				out.write( "\""+ iterate.next() + "\", " );
				
			
		} 
		catch (IOException x) 
		{
			x.printStackTrace();
		}
		
		
		System.out.println("First ArrayList: " + arr);
		System.out.println("Second ArrayList of palindromes: " + palindromes(arr) );
	}
}
