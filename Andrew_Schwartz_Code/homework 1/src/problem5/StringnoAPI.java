package problem5;

public class StringnoAPI{
	
	public static void main(String[] args) {
		
	String myString =  "Hello World";
	int start=0;
	int dex=8;
	String alpha=AndrewsIndex(myString, start,dex);
	System.out.println(alpha);
	
	
	}

	private static String AndrewsIndex(String myString, int start, int dex) {
		char[] output = new char[dex];
		for (int x = 0; x<=dex-1; x=x+1) {
			output[x]=myString.toCharArray()[x];
		}
		String outputString = new String(output);
		
		return outputString;
	}
	

}
