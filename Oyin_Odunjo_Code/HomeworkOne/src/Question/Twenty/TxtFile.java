package Question.Twenty;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.StringTokenizer;

public class TxtFile {

	public static void main(String[] args) {
		String uno;
		StringTokenizer dos = null; //This allows the class to break the strings into Tokens 
		String filename = "C://Users/wildcat/Documents/workspace-sts-3.9.4.RELEASE/HomeworkOne/src/Question/Twenty/Data.txt";
		
		//Beginning of try method 
		try (BufferedReader buff = new BufferedReader(new FileReader(filename))){ 
			while( (uno = buff.readLine()) != null) {
				dos = new StringTokenizer(uno, ":");
				String[] dataInput = {"Name", "Age", "State"};
				
				int i = 0; //Creating the counter 
				
				//Parse through the name
				System.out.println( dataInput[i] + ": " + dos.nextToken() + " " + dos.nextToken() );
				
				//Parsing through the age and the state 
				while ( dos.hasMoreTokens()) {
					i++;
					System.out.println( dataInput[i] + " : " + dos.nextToken() );
				}
				
				System.out.println();
				//End of the read 
			}
			}
			//end of the try 
			catch(FileNotFoundException o) {
				o.printStackTrace();
			}
			catch(Exception o) {
				o.printStackTrace();
			}
		}
	}


