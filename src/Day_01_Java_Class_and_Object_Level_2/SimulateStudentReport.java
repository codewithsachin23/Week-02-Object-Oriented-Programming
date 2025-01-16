package Day_01_Java_Class_and_Object_Level_2;

import java.util.Scanner;

class Student{
    int rollNumber;
    String name;
    double marks;

    public Student(int rollNumber,String name,int marks){
        this.rollNumber=rollNumber;
        this.name=name;
        this.marks=marks;
    }
    public String CalculateGrade(){
        String grade=" ";
        if (marks >= 90 && marks <= 100) {
            grade = "A+";
        } else if (marks >= 80 && marks < 90) {
            grade = "A";
        } else if (marks >= 70 && marks < 80) {
            grade = "B";
        } else if (marks >= 60 && marks < 70) {
            grade = "C";
        } else if (marks >= 50 && marks < 60) {
            grade = "D";
        } else if (marks >= 0 && marks < 50) {
            grade = "Fail";
        } else {
            grade = "Invalid marks! Please enter marks between 0 and 100.";
        }
        return grade;
    }
    public void displayResult(){
        System.out.println("Student Roll Number :" +rollNumber);
        System.out.println("Student Name :" +name);
        System.out.println("Student Marks :" +marks);
        System.out.println("Student Grade :" +CalculateGrade());
    }


}


public class SimulateStudentReport {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Student Roll Number :");
        int rollNumber=input.nextInt();
        input.nextLine();
        System.out.println("Student Name :");
        String name=input.nextLine();
        System.out.println("Student Marks :");

        int marks=input.nextInt();

        Student stu=new Student(rollNumber,name,marks);
        stu.displayResult();

    }
}
