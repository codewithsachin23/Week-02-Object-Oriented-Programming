package Day_03_Java_Keywords;
class Patient {
    // Static variables and method
    static String hospitalName = "City General Hospital";
    static int totalPatients = 0; // Tracks the total number of patients

    static void getTotalPatients() {
        System.out.println("Total patients admitted: " + totalPatients);
    }

    // Final variable
    final String patientID;

    // Instance variables
    String name;
    int age;
    String ailment;

    // Constructor to initialize patient details
    public Patient(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // Increment total patients on each new admission
    }

    // Method to display patient details
    public void displayPatientDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
    }
}
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient patient1 = new Patient("P001", "sachin shukla", 21, "Flu");
        Patient patient2 = new Patient("P002", "Ashish kumar", 20, "Fracture");

        // Validate objects using instanceof before displaying details
        if (patient1 instanceof Patient) {
            patient1.displayPatientDetails();
        }

        if (patient2 instanceof Patient) {
            patient2.displayPatientDetails();
        }

        // Display total number of patients
        Patient.getTotalPatients();
    }

}
