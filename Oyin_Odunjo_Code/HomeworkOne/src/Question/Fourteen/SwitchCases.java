package Question.Fourteen;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SwitchCases {
	
	public static void SCases(int x) {
		
		switch(x) {
		case 1: // This will print out the square root of 144 
			System.out.println(String.format("The Square root of 144 is: ", Math.sqrt(144)));
			break;
			
		case 2: //This will print whatever the current date is 
			
			DateTimeFormatter dateForm = DateTimeFormatter.ofPattern("MM/DD/YYYY"); //setting up the format for the date 
			LocalDateTime currentDate = LocalDateTime.now();
			System.out.println(dateForm.format(currentDate)); //Printing out the current date 
			break;
			
		case 3: //This will store a string into a string array and print it 
			String SplitString = "I am learning Core Java";
			String[] newArray = new String[SplitString.length()];
			int i;
			
			for(i = 0; i < SplitString.length(); i++) {
				newArray[i] = String.valueOf(SplitString.charAt(i));				
			}
			
			for(i = 0; i < newArray.length; i++) {
				System.out.print(newArray[i]);
			}
		}
		System.out.println();
		
	}

}
