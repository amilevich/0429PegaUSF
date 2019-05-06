package question5;

public class Q5 {
	  

	    public Q5() { }

	    public static void main(String[] args) {

	        int idx=5;
	        //index for substring
	        String str = "Braden";
	        //original string
	        System.out.println("original String: "+str);
	        //print out original string
	        String sub = SubString(idx,str);
	        
	        System.out.println("This is the substring: "+ sub+ " (substring contained between 0 and "+idx+"-1 inclusive)");

	    }

	   static String SubString(int idx, String str){

	        //declare a substring that is the length of the index specified
	        char[] subString = new char[idx];

	        //keep going until arriving at index number 
	        for(int i=0; i<=idx-1;i++)
	        {
	            //iterate through the string and assign the character till idx-1 to the substring character array
	            subString[i] = str.charAt(i);
	        }
	        //convert the subString character array to a string
	        String subStr = new String(subString);
	        //return the substring
	        return subStr;
	    }

	}