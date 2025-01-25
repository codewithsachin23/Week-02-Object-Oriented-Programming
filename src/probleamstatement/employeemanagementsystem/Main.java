package probleamstatement.employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee e1=new FullTimeEmployee("E123","sachin",400000,25000);
        PartTimeEmployee e2=new PartTimeEmployee("E124","rahul",20000,5,2000);

        e1.assignDepartment("IT");
        e2.assignDepartment("ITT");

        List<Employee> employees=new ArrayList<>();

        employees.add(e1);
        employees.add(e2);
        employees.add(e2);

        for(Employee employee:employees){
            employee.displayDetails();
            employee.calculateSalary();

            if(employee instanceof Department){
                Department dep=(Department) employee;
                dep.getDepartmentDetails();
            }
            System.out.println();
        }

    }
}
