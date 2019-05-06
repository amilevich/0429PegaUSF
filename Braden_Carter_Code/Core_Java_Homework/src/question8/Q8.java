package question8;
import java.util.ArrayList;


public class Q8 {
    


        public static void main(String[] args) {


            ArrayList<String> listOfWords = new ArrayList<String>();
            ArrayList<String> wordsArePal = new ArrayList<String>();
            ArrayList<String> notPal = new ArrayList<String>();
            listOfWords.add("karan");
            listOfWords.add("madam");
            listOfWords.add("tom");
            listOfWords.add("civic");
            listOfWords.add("radar");
            listOfWords.add("sexes");
            listOfWords.add("jimmy");
            listOfWords.add("kayak");
            listOfWords.add("john");
            listOfWords.add("refer");
            listOfWords.add("billy");
            listOfWords.add("did");
            //adding all words to initial list (all words before finding palindromes)

            for (String palin: listOfWords) {

                
               boolean palindrome = isPalindrome(palin);
               //^^ true or false boolean to determine if word is palindrome
               
               if(palindrome)
            	   //if word is palindrome...
               {
                   wordsArePal.add(palin);
                   //adds word to palindrome list. 
               }
               else{
                   
            	   notPal.add(palin);
            	   //if not a palindrome, then added to not palindrome list
               }
            }
            
            System.out.println("List of Total Words: ");
            System.out.println(listOfWords);
            //prints out list of all words

            System.out.println("Words that are palindromes: ");
            System.out.print(wordsArePal);
            //prints out list of words that are palindromes

        }


        public static boolean isPalindrome(String value) {
            if (value == null || value.isEmpty())
                return false;

            // this take the string passed it reverses it and compares if its equal to itself
            //it returns a boolean
            return new StringBuilder(value).reverse().toString().equals(value);
        }


    }