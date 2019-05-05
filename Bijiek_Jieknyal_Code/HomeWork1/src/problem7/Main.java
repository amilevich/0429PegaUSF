package problem7;

import java.util.Arrays;

import problem7.Employee;

public class Main {

    public static void main(String[] args) {

        //sorting custom object array
    	
        Employee[] empArr = new Employee[2];
        
        empArr[0] = new Employee("Mikey", 31, "Accounting");
        empArr[1] = new Employee("Arun", 27, "Biology");
         
        
        Arrays.sort(empArr, Employee.DepartmentComparator);
        System.out.println("Employees list sorted by department:\n"+Arrays.toString(empArr));
        
        //sort employees array using Comparator by Age
        
        Arrays.sort(empArr, Employee.AgeComparator);
        System.out.println("Employees list sorted by Age:\n"+Arrays.toString(empArr));
        
        //sort employees array using Comparator by Name
        Arrays.sort(empArr, Employee.NameComparator);
        System.out.println("Employees list sorted by Name:\n"+Arrays.toString(empArr));
        
    }  

}