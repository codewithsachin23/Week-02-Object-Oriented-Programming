package probleamstatement.employeemanagementsystem;

public class PartTimeEmployee extends Employee implements Department{
    private int hoursWorked;
    private double hourlyRate;
    private String department;

    public PartTimeEmployee(String employeeId,String name,double baseSalary,int hoursWorked,double hourlyRate){
        super(employeeId, name, baseSalary);
        this.hourlyRate=hourlyRate;
        this.hoursWorked=hoursWorked;
    }

    public void assignDepartment(String departmentName){
        this.department=departmentName;
    }
    public void getDepartmentDetails(){
        System.out.println("DepartMent : "+department);
    }

    @Override
    public void calculateSalary(){
        System.out.println("Salary Based on hours" +hoursWorked*hourlyRate);

    }


}
