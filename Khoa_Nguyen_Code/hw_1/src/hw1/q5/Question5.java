package hw1.q5;

public class Question5 {

    public static void main(String[] args) {

        int idx=5;
        String str = "Hello World";
        System.out.println("String \""+ str + "\" and index " + idx);
        String sub = SubString(idx,str);
        System.out.println("Substring: "+ sub);
}

   static String SubString(int idx, String str){
        char[] subString = new char[idx];
        for(int i=0; i<=idx-1;i++) {
            subString[i] = str.charAt(i);
        }
        String s = new String(subString);
        return s;
    }

}
