package Day_03_Java_Keywords;

class Vehicle {
    // Static variables and method
    static double registrationFee = 500.0; // Default registration fee

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: $" + registrationFee);
    }

    // Final variable
    final String registrationNumber;

    // Instance variables
    String ownerName;
    String vehicleType;

    // Constructor to initialize vehicle details
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Method to display registration details
    public void displayRegistrationDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }
}
    public class VehicleRegistrationSystem {
        public static void main(String[] args) {
            Vehicle vehicle1 = new Vehicle("V001", "John Doe", "Car");
            Vehicle vehicle2 = new Vehicle("V002", "Jane Smith", "Bike");

            // Validate objects using instanceof before displaying details
            if (vehicle1 instanceof Vehicle) {
                vehicle1.displayRegistrationDetails();
            }
            System.out.println("-----------------------------------------");
            if (vehicle2 instanceof Vehicle) {
                vehicle2.displayRegistrationDetails();
            }


            // Update the registration fee for all vehicles
            Vehicle.updateRegistrationFee(600.0);
            System.out.println("-----------------------------------------");
            // Display vehicle details again after updating the registration fee
            System.out.println("After updating registration fee:");
            System.out.println("-----------------------------------------");
            if (vehicle1 instanceof Vehicle) {
                vehicle1.displayRegistrationDetails();
            }
            System.out.println("-----------------------------------------");
            if (vehicle2 instanceof Vehicle) {
                vehicle2.displayRegistrationDetails();
            }
        }
    }

