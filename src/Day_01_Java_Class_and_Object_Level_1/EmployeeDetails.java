package Day_01_Java_Class_and_Object_Level_1;

class Employee{
    int id;
    String name;
     int salary;

     public Employee(int id,String name,int salary){
         this.id=id;
         this.name=name;
         this.salary=salary;

     }
     public void displayDetails(){
         System.out.println("Employee id :" +id);
         System.out.println("Employee Name :" +name);
         System.out.println("Employee Salary :" +salary);

     }
}
public class EmployeeDetails {
    public static void main(String[] args) {


        Employee emp1 = new Employee(1, "Rahul", 50000);
        Employee emp2 = new Employee(2, "sachin", 30000);
        System.out.println("Employee one");
        System.out.println("-----------------------------------------------");
        emp1.displayDetails();

        System.out.println("-----------------------------------------------");

        System.out.println("Employee Two");
        System.out.println("-----------------------------------------------");
        emp2.displayDetails();

    }
}
