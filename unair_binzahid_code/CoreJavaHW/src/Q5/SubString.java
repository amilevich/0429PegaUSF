package Q5;


public class SubString { //creating own substring method

    private String s;

    public SubString(String s) { //creating constructor
        this.s = s;
    }
    
    @Override
    public String toString() { //creating to string
        return s;
    }
    
    public SubString substring(int begin) {

        String substring = ""; //creates blank string

        for (int i = begin; i < s.length(); i++) { //loops through and selects character 
            substring += s.charAt(i);				//at chosen location to start from
        }										//creates new strings for each iteration
        return new SubString(substring);
    }



public static void main(String[] args) {

    SubString s1 = new SubString("thunderstorm");  //creates new object of substring method   
    SubString substring = s1.substring(2);	//selects at which char to start after

    System.out.println(substring); //syso the substring method

}
}
