package Q11b;

import Q11.Accessor;

public class Accessee{
public static void main(String[]args){
double sum=new Accessor().sum(5.5,6.5);//instance method access
double mul=Accessor().multiply(5.5,6.5); //static method access
System.out.println(sum+"\t"+mul);
}

private static Accessor Accessor() {
	// TODO Auto-generated method stub
	return null;
}
} 
