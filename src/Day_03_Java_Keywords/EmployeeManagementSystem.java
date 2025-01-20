package Day_03_Java_Keywords;
class Employee {
    static String companyName ="Capgemini";
    static int totalNumberOfEmployee;
    final int id;

    String name;
    String designation ;


    public Employee(int id,String name,String designation){
        this.id=id;
        this.name=name;
        this.designation=designation;
        totalNumberOfEmployee++;

    }
    public static void displayTotalEmployees(){
        System.out.println("Total number of Employee :"+totalNumberOfEmployee);

    }
    void display(){
        System.out.println("company Name: " + companyName);
        System.out.println("Employee id: " + id);
        System.out.println("Name : " + name);
        System.out.println("Designation : " + designation);
    }


        }
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1=new Employee(145,"Sachin shukla","SoftWare Engineer");
        Employee e2=new Employee(146,"Suraj Patel","SoftWare Engineer");


        //calling a Static method directly
        Employee.displayTotalEmployees();

        System.out.println("-----------------------------");

        //check it is instance of class or not and displaying result
        if(e1 instanceof Employee) {
            System.out.println("Details of First Employee");
            e1.display();
        }else {
            System.out.println("This is not a instance of class");
        }
        System.out.println("-----------------------------");
        //check it is instance of class or not and displaying result
        if(e2 instanceof Employee) {
            System.out.println("Details of second Employee");
            e2.display();
        }else {
            System.out.println("This is not a instance of class");
        }

    }
}
