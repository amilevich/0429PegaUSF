package question20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadWritePrintFile {

	public static void main(String[] args) {
		

		
		String fileName = "C://Users//Ronak Parich//eclipse-workspace//Java Homework 4-29-2019//src//question20/data.txt";
		
        // This will reference one line at a time
        String line = null;
        
		writeCharacterStream(fileName);
		readCharacterStream(fileName);

		
		try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            
            // writing lines and processing it in data
            while((line = bufferedReader.readLine()) != null) {
                String[] spaces = line.split(":");
                System.out.println("Name: " + spaces[0] + " " + spaces[1]);
                System.out.println("Age: " + spaces[2] + " years" );
                System.out.println("State: " + spaces[3] + " State \n");
                
                
                
                // Name: Mickey Mouse
                //Age: 35 years
                //State: Arizona State
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");                
        }
        catch(IOException ex) {
        	System.out.println("Error reading file '" + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
    }


	private static void readCharacterStream(String fileName) {
		
	}


	private static void writeCharacterStream(String fileName) {
		
	}

}
