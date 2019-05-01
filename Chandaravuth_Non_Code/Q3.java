package test1;

public class Q3 {

	public static void main(String[] args) {
	
		reverse("ABCDEF");

	}
	
	public static void reverse(String s) {
		char[] carr= s.toCharArray();
		
		try {
		for(int i=5;i<carr.length;i--) 
		{
			System.out.print(carr[i]);
		}
		}catch(Exception e) {
			
		}
		
/*		String str;
		
		
		for(int i = carr.length; i>carr.length;i--)
		{
			System.out.println(carr[i]);
		}*/
		
		
	}

}
