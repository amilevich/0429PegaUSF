//**DOES NOT PRINT**//

package Question.Five;

public class Substring {
	
	//Creating a static for the substring of a word
	static String SubString;
	
	public static String ReturnSubstring(String str, int idx) {
		
		SubString = str.substring(0,  idx);
		return SubString;
		
	}

}
