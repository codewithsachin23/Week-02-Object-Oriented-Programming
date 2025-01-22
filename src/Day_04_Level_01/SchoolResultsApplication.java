package Day_04_Level_01;

import java.util.ArrayList;
import java.util.List;

class Subject {
    private String subjectName;
    private double marks;

    public Subject(String subjectName, double marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public double getMarks() {
        return marks;
    }
}

class Student {
    private String studentName;
    private List<Subject> subjects = new ArrayList<>();

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getStudentName() {
        return studentName;
    }
}

class CalculateGrade {
    public static void calculateGrade(Student student) {
        double totalMarks = 0;
        List<Subject> subjects = student.getSubjects();

        // Sum all the marks of the subjects
        for (Subject subject : subjects) {
            totalMarks += subject.getMarks();
        }

        double averageMarks = totalMarks / subjects.size();
        String grade;

        // Determine grade based on average marks
        if (averageMarks >= 90) {
            grade = "A";
        } else if (averageMarks >= 75) {
            grade = "B";
        } else if (averageMarks >= 60) {
            grade = "C";
        } else if (averageMarks >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Student: " + student.getStudentName());
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);
    }
}

public class SchoolResultsApplication {
    public static void main(String[] args) {
        // Create Subject objects
        Subject sub1 = new Subject("Math", 85);
        Subject sub2 = new Subject("Science", 90);
        Subject sub3 = new Subject("English", 88);

        // Create Student object
        Student student = new Student("Rahul");

        // Add subjects to the student
        student.addSubject(sub1);
        student.addSubject(sub2);
        student.addSubject(sub3);

        // Calculate grade for the student
        CalculateGrade.calculateGrade(student);
    }
}
