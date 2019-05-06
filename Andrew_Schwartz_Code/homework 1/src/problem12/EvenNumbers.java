package problem12;

public class EvenNumbers {

	public static void main(String args[]){  
		int [] a=new int[100];
		for (int i=0;i <100;++i){
		a[i]=i;
		}
		
		
		System.out.println("Odd Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2!=0){  
		System.out.println(a[i]);  
		}  
		}  
		System.out.println("Even Numbers:");  
		for(int i=0;i<a.length;i++){  
		if(a[i]%2==0){  
		System.out.println(a[i]);  
		}  
		}  
		}  
	     }

	

