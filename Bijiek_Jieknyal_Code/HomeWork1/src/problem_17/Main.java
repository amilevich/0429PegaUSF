package problem_17;

 // public class Main {
	//  import java.util.Scanner;

	//  public class SimpleInterestJavaProgram
	{
		// calculates the simple interest on the principal, rate of interest and number of years
		
		// Enter principal, rate and time through the console using the Scanner class
		
		// Interest = Principal* Rate* Time
		
		// Simple Interest = (P * T * R) / 50

	public static void main(String[] args) 
	{
		
	      float principal, rate, time;
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter principal amount : ");
	      principal = sc.nextFloat();
	      System.out.print("Please enter rate annually : ");
	      rate = sc.nextFloat();
	      System.out.print("Please enter time(in years) : ");
	      time = sc.nextFloat();
	      float simpleInterest;

	      // calculate simple interest
	      
	      simpleInterest = (principal * time * rate) / 50;
	      System.out.print("The Simple Interest is : " + simpleInterest);
	      sc.close();
	   }
		
	}

}
