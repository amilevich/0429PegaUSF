package Q7;


import java.util.Arrays;
import java.util.Comparator;

public class EmployeeMain extends Employee{

    public EmployeeMain(String name, String department, int age) {
        super(name, department, age);
    }

    public static class CompareDepartment implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.getDepartment().compareTo(o2.getDepartment()) > 0) {
                return 1;
            } else if (o1.getDepartment().compareTo(o2.getDepartment()) < 0) {
                return -1;
            } else {
                return 0;
            }
        }

    }
    public static class NameCompare implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.getName().compareTo(o2.getName()) > 0) {
                return 1;
            } else if (o1.getName().compareTo(o2.getName()) < 0) {
                return -1;
            } else {
                return 0;
            }
        }

    }
    public static class CompareAge implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else if (o1.getAge() < o2.getAge()) {
                return -1;
            } else {
                return 0;
            }
        }

    }

    public static void main(String[] args) {

        String name = "Jake";
        String name1 = "Anita";

        String department = "Education";
        String department2 = "HR";

        int age = 30;
        int age2 = 20;

        Employee employee1 = new Employee(name,department,age);
        Employee employee2 = new Employee(name1,department2,age2);

        Employee[] myArray = {employee1,employee2};

        CompareAge checkAge = new CompareAge();
        CompareDepartment checkDep = new CompareDepartment();
        NameCompare checkName = new NameCompare();

        Arrays.sort(myArray,checkAge);
        System.out.println("Sort by age: ");
        for(Employee employee : myArray){
            System.out.println("Age: "+employee.getAge()+" Name: "+employee.getName()+" Department: "+ employee.getDepartment());
        }

        Arrays.sort(myArray,checkDep);
        System.out.println("Sort by Department: ");
        for(Employee employee : myArray){
            System.out.println("Age: "+employee.getAge()+" Name: "+employee.getName()+" Department: " +employee.getDepartment());
        }

        Arrays.sort(myArray,checkName);
        System.out.println("Sort by Name: ");
        for(Employee employee : myArray){
            System.out.println("Age: "+employee.getAge()+" Name: "+employee.getName()+" Department: "+employee.getDepartment());
        }

    }

}