package Day_03_Java_Keywords;
class Student{
    static String universityName ="Rgpv bhopal";
    static int totalNumberOfStudent;

    final String rollNumber;
   String name;
    String grade;


    public Student(String rollNumber,String name,String grade){
        this.rollNumber=rollNumber;
        this.name=name;
        this.grade=grade;
        totalNumberOfStudent++;

    }
    public static void displayTotalStudents(){
        System.out.println("Total number of student :"+totalNumberOfStudent);

    }
    void display(){
        System.out.println("university Name " + universityName);
        System.out.println("Student rollNumber: " + rollNumber);
        System.out.println("Student name: " + name);
        System.out.println("grade: " + grade);
    }

}
public class UniversityStudentManagement {
    public static void main(String[] args) {


    Student stu1=new Student("0191CS211142","sachin shukla","A+");
    Student stu2=new Student("0191CS211141","sachin kumar","A+");

    Student.displayTotalStudents();

    if(stu1 instanceof Student) {
        stu1.display();
    }
        System.out.println("-----------------------------------------");
        if(stu2 instanceof Student) {
        stu2.display();
    }
    }
}
