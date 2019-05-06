package Q7;

import java.util.Arrays;
import java.util.Comparator;

public class EMain extends EInfo{ //extending to the employee info

    public EMain(String name, String department, int age) {
        super(name, department, age);
    }

    public static class CompareDepartment implements Comparator<EInfo> {
    				//creating the compare department method using einfo
        @Override	//goes by alphabetical order
        public int compare(EInfo o1, EInfo o2) {
            if (o1.getDepartment().compareTo(o2.getDepartment()) > 0) {
                return 1;
            } else if (o1.getDepartment().compareTo(o2.getDepartment()) < 0) {
                return -1;
            } else {
                return 0;
            }
        }

    }
    public static class NameCompare implements Comparator<EInfo> {
    				//creating the compare name method using einfo
        @Override	//goes by alphabetical order
        public int compare(EInfo o1, EInfo o2) {
            if (o1.getName().compareTo(o2.getName()) > 0) {
                return 1;
            } else if (o1.getName().compareTo(o2.getName()) < 0) {
                return -1;
            } else {
                return 0;
            }
        }

    }
    public static class CompareAge implements Comparator<EInfo> {
    				//creating compare age method using einfo
        @Override	//goes by numerical order
        public int compare(EInfo o1, EInfo o2) {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else if (o1.getAge() < o2.getAge()) {
                return -1;
            } else {
                return 0;
            }
        }

    }

    public static void main(String[] args) { //main driver

        String name = "John"; //setting names
        String name1 = "Lemon";

        String department = "BusAnalytics"; //setting department
        String department2 = "Secretary";

        int age = 43; //setting age
        int age2 = 31;

        EInfo employee1 = new EInfo(name,department,age); //creating 2 new info objects
        EInfo employee2 = new EInfo(name1,department2,age2);

        EInfo[] myArray = {employee1,employee2}; //putting both objects into an array

        CompareAge checkAge = new CompareAge(); //creating objects to check age, department, name
        CompareDepartment checkDep = new CompareDepartment();
        NameCompare checkName = new NameCompare();

        Arrays.sort(myArray,checkAge); //creating the array format based on einfo ascending age
        System.out.println("Sort by age: ");
        for(EInfo employee : myArray){
            System.out.println("Age: "+employee.getAge()+" Name: "+employee.getName()+" Department: "+ employee.getDepartment());
        } //syso the array

        Arrays.sort(myArray,checkDep); //creating the array format based on enfo department sorting
        System.out.println("Sort by Department: ");
        for(EInfo employee : myArray){
            System.out.println("Age: "+employee.getAge()+" Name: "+employee.getName()+" Department: " +employee.getDepartment());
        }

        Arrays.sort(myArray,checkName); //creating the array format based on info name alphabetical sorting
        System.out.println("Sort by Name: ");
        for(EInfo employee : myArray){
            System.out.println("Age: "+employee.getAge()+" Name: "+employee.getName()+" Department: "+employee.getDepartment());
        }

    } 
    }

