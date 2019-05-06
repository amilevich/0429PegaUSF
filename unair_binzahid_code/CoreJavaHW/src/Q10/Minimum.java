package Q10;

public class Minimum {

    public static void main(String[] args) {

        int v1 = 23;
        int v2 = 59;
        System.out.println("The minimum value of "+v1+" and "+v2+" is: ");
        int minimum = (v1 < v2) ? v1 : v2; //the calculation using ternary operators
        System.out.println(minimum); //syso the minimum
    }
}