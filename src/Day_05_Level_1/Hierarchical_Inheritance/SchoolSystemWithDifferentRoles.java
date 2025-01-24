package Day_05_Level_1.Hierarchical_Inheritance;


class Person {
    protected String name;
    protected int age;

    // Constructor to initialize common attributes
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display general information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to be overridden by subclasses to display role-specific information
    public void displayRole() {
        System.out.println("Role: General Person");
    }
}

// Subclass representing a Teacher
class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Overriding displayRole method to display teacher's role
    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

// Subclass representing a Student
class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    // Overriding displayRole method to display student's role
    @Override
    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

// Subclass representing a Staff
class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Overriding displayRole method to display staff's role
    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

// Main class to test the school system hierarchy
public class SchoolSystemWithDifferentRoles {
    public static void main(String[] args) {
        // Create objects for each role
        Person teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        Person student = new Student("John", 16, "10th Grade");
        Person staff = new Staff("Mrs. Williams", 35, "Administration");

        // Store all roles in an array of Person type to demonstrate polymorphism
        Person[] people = { teacher, student, staff };

        // Call displayRole() on each person, demonstrating polymorphism
        for (Person person : people) {
            person.displayInfo();
            person.displayRole();
            System.out.println();
        }
    }
}
