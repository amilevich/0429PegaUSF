package question7;


import java.util.Arrays;
import java.util.Comparator;

	public class Q7Main extends Q7Employee{

	    public Q7Main(String name, String department, int age) {
	        super(name, department, age);
	        //uses parent class 
	    }

	    public static class CompareDepartment implements Comparator<Q7Employee> {

	        @Override
	        public int compare(Q7Employee o1, Q7Employee o2) {
	            if (o1.getDepartment().compareTo(o2.getDepartment()) > 0) {
	                return 1;
	            } else if (o1.getDepartment().compareTo(o2.getDepartment()) < 0) {
	                return -1;
	            } else {
	                return 0;
	            }
	        }
	        //^^compares employee department 

	    }
	    public static class NameCompare implements Comparator<Q7Employee> {

	        @Override
	        public int compare(Q7Employee o1, Q7Employee o2) {
	            if (o1.getName().compareTo(o2.getName()) > 0) {
	                return 1;
	            } else if (o1.getName().compareTo(o2.getName()) < 0) {
	                return -1;
	            } else {
	                return 0;
	            }
	        }
	        //^^compares employee name

	    }
	    public static class CompareAge implements Comparator<Q7Employee> {

	        @Override
	        public int compare(Q7Employee o1, Q7Employee o2) {
	            if (o1.getAge() > o2.getAge()) {
	                return 1;
	            } else if (o1.getAge() < o2.getAge()) {
	                return -1;
	            } else {
	                return 0;
	            }
	        }
	        //^^compares employee age

	    }

	    public static void main(String[] args) {

	        String name = "Braden"; //name of employee 1
	        String name1 = "Harsh"; //name of employee 2 

	        String department = "Psychology"; //department of employee 1
	        String department2 = "Computer Science"; //department of employee 2

	        int age = 28; //age of employee 1
	        int age2 = 23;//age of employee 2

	        Q7Employee employee1 = new Q7Employee(name,department,age);
	        Q7Employee employee2 = new Q7Employee(name1,department2,age2);

	        Q7Employee[] myArray = {employee1,employee2};

	        CompareAge checkAge = new CompareAge();
	        CompareDepartment checkDep = new CompareDepartment();
	        NameCompare checkName = new NameCompare();

	        Arrays.sort(myArray,checkAge);
	        System.out.println("\nEmployee Sorted by Age: ");
	        //print out new line before each process to separate sorts (\n)
	        for(Q7Employee employee : myArray){
	            System.out.println("Age: "+employee.getAge()+"\t\tName: "+employee.getName()+"\t\tDepartment: "+ employee.getDepartment());
	        //print out sorted by Age, with two tabs in between category for visual preference
	        }

	        Arrays.sort(myArray,checkDep);
	        System.out.println("\nEmployee Sorted by Department: ");
	        //print out new line before each process to separate sorts (\n)
	        for(Q7Employee employee : myArray){
	            System.out.println("Age: "+employee.getAge()+"\t\tName: "+employee.getName()+"\t\tDepartment: " +employee.getDepartment());
		    //print out sorted by Department, with two tabs in between category for visual preference

	        }
	        

	        Arrays.sort(myArray,checkName);
	        System.out.println("\nEmployee Sorted by Name: ");
	        //print out new line before each process to separate sorts (\n)
	        for(Q7Employee employee : myArray){
	            System.out.println("Age: "+employee.getAge()+"\t\tName: "+employee.getName()+"\t\tDepartment: "+employee.getDepartment());
		    //print out sorted by Name, with two tabs in between category for visual preference
  
	        }

	    }

	}

