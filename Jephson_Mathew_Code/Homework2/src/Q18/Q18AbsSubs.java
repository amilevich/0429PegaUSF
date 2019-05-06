package Q18;


public class Q18AbsSubs extends StringAbstract {

    public Q18AbsSubs(String myString) {

        this.myString = myString;
    }

    @Override
    public boolean isUpperCase() {
        String lowerString = myString.toLowerCase();
        //this checks if when myString is casted to lowercase
        boolean equal = lowerString.equals(myString);

        //if they are equal then myString doesn't have uppercase letters
        if(equal){
            return false;
        }else{
            //if they are not equal then myString did have upper case letters
            return true;
        }
    }

    @Override
    public String convertToUpper() {
        //this just cast myString to all uppercase letters
        return myString.toUpperCase();
    }

    @Override
    public int convertToInt() {
        int num = 10;
        //since a string is scanned to add an integer to the string
        //type cast character by character
        for(int i = 0; i<myString.length();i++){
            num = num + (int)myString.charAt(i);
        }
        return num;
    }
}