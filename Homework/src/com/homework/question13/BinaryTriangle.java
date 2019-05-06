package com.homework.question13;

public class BinaryTriangle {
	
	

	public static void main(String[] args) {
		
		//a new int is set to 0
		int myVariable = 0;
		
		System.out.println(myVariable);
		
		//a for loop that examines if an int i is less than or equal to 1
		for(int i = 0; i <= 1; i += 1) {
			
			//a for loop that examines if an int j is less than or equal to i and is incremented once and prints out the previously defined int + 1
			for(int j = 0; j <= i; j++) {
				
				System.out.print(myVariable + 1);
				
				//if int j mod 2 equals 0, then the int itself is printed
				if(j % 2 == 0) {
					
					System.out.print(myVariable);
					
				}
			}
			
			System.out.print("\n");
		}
		
		//for i being less than 3 and i equals i plus 2, and if i mod 2 equals 0, then the int is printed
		for(int i = 0; i < 3; i += 2) {
			
			if(i % 2 == 0) {
				
				System.out.print(myVariable);
				
			}
			
			System.out.print(myVariable + 1);
			
		}

	}

}