package test1;

public class Q3 {

	public static void main(String[] args) {
	
		reverse("ABCDEF");

	}
	
	public static void reverse(String s) {
		char[] carr= s.toCharArray();
		
		System.out.println(carr.length+"Hey");
		for(int i=carr.length-1;i>=0;i--) 
		{
			System.out.print(carr[i]);
		}
		}
			
	
		
/*		String str;
		
		
		for(int i = carr.length; i>carr.length;i--)
		{
			System.out.println(carr[i]);
		}*/
		
		
	}


