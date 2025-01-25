package probleamstatement.employeemanagementsystem;

abstract public class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;
    public Employee(String employeeId,String name,double baseSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=baseSalary;
    }
    abstract void calculateSalary();

    public void displayDetails(){
        System.out.println("employeeId : "+employeeId);
        System.out.println("name : "+name);
        System.out.println("baseSalary : "+baseSalary);
    }

    public String getEmployeeId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }

    public double getBaseSalary(){
        return baseSalary;
    }


}
