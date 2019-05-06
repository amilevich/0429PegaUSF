package Q10;

//Find the minimum of two numbers using ternary operators.
import java.util.Scanner;

public class TernaryMin {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int a,b,min;
System.out.println("Enter the value of a,b");
a=s.nextInt();
b=s.nextInt();
min=(a<=b)?a:b;
System.out.println("min = " + min);

}

}
