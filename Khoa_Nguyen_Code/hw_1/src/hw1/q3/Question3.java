package hw1.q3;

public class Question3 {
	public static void main(String[] args) {
		String s = "Hello World";
		String strArray[] = s.split("");
		System.out.println(strArray);
		
		for(int i=strArray.length-1; i > 0; i--){
			System.out.print(strArray[i]);
		}
	}
}