package probleamstatement.employeemanagementsystem;

public class FullTimeEmployee extends Employee implements Department{
    private double monthlySalary;
    private String department;
    public FullTimeEmployee(String employeeId,String name,double baseSalary,double monthlySalary){
        super(employeeId, name, baseSalary);
        this.monthlySalary=monthlySalary;

    }

    public void assignDepartment(String departmentName){
       this.department=departmentName;
    }
    public void getDepartmentDetails(){
        System.out.println("DepartMent : "+department);
    }

    @Override
  public void calculateSalary(){
      System.out.println("Monthly Salary " + monthlySalary);

   }


}
