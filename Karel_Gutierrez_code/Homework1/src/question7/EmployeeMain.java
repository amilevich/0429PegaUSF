package question7;
import java.util.Arrays;
import java.util.Comparator;
// Inheriting the Employee class to main one
public class EmployeeMain {
    
    // implements the CompareDepartment interface
public static class CompareDepartment implements Comparator<Employee> {
    
    // comparing the employee departments 
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
// comparing the employee departments 
public static class NameCompare implements Comparator<Employee> {
    // comparing the employee names 
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
// comparing the employee age
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
// declares and sets the variables names hard coded in for names, departments, and age

        // instantiating employees 
        Employee employee1 = new Employee("Karel","Electronics",37);
        Employee employee2 = new Employee("Hanna","Mechanical",18);
        // declaring an array for employee 1 and 2
        Employee[] myArray = {employee1,employee2};
        
        // instantiating the check statements for age, department, and names 
        CompareAge checkAge = new CompareAge();
        CompareDepartment checkDep = new CompareDepartment();
        NameCompare checkName = new NameCompare();
        
        // sort the employees by age.  For each employee in the employee array, sort them in order of age. 
        Arrays.sort(myArray,checkAge);
        System.out.println("Sort by age: ");
        for(Employee employee : myArray){
            System.out.println("Age: "+employee.getAge()+" Name: "+employee.getName()+" Department: "+ employee.getDepartment());
        }
        
        // sort the employees by department.  For each employee in the employee array, sort them in order of deparmtent. 
        Arrays.sort(myArray,checkDep);
        System.out.println("Sort by Department: ");
        for(Employee employee : myArray){
            System.out.println("Age: "+employee.getAge()+" Name: "+employee.getName()+" Department: " +employee.getDepartment());
        }
        // sort the employees by age.  For each employee in the employee array, sort them in order of name. 
        Arrays.sort(myArray,checkName);
        System.out.println("Sort by Name: ");
        for(Employee employee : myArray){
            System.out.println("Age: "+employee.getAge()+" Name: "+employee.getName()+" Department: "+employee.getDepartment());
        }
    }
}