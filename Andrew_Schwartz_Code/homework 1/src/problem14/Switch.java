package problem14;

import java.util.Date;

public class Switch {

	public static void main(String[] args) {
		int IcedCoffee=2;
		command(IcedCoffee);
	}

	public static void command(int IcedCoffee) {
		
		switch(IcedCoffee) {
		case 1: System.out.println("Math.sqrt(" + 25 +")=" + Math.sqrt(25));
		break;
		
		case 2: Date date = new Date();
		System.out.println(date);
		break;
		
		case 3: String Espresso= "I am learning core Java";
		char[] output=Espresso.toCharArray();
		System.out.println(output[10]);
		break;
		
		default: System.out.println("help me life is miserable");
		
	}
	
	
        } 
    } 
 

