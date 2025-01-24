package Day_05_Level_1.Assisted_Problems;


class Employee{
protected String name;
protected String id;
protected double salary;

public Employee(String name,String id,double salary){
    this.name=name;
    this.id=id;
    this.salary=salary;


}
   public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }


}

class Manager extends Employee{
    private int teamSize;
    public Manager(String name, String id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }

}

class Developer extends Employee{
    private String programmingLanguage;
    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }

}

class Intern extends Employee{
    private String duration;
    public Intern(String name, String id, double salary, String duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration);
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create objects of each subclass
        Employee employee1=new Manager("Shivam","M1",75000,4);
        Employee employee2=new Developer("rahul","D1",50000,"Java");
        Employee employee3=new Intern("suraj","I1",25000,"3 month");

        System.out.println("Manager");
        employee1.displayDetails();
        System.out.println();
        System.out.println("Developer");
        employee2.displayDetails();
        System.out.println();

        System.out.println("Intern");
        employee3.displayDetails();

    }
}
