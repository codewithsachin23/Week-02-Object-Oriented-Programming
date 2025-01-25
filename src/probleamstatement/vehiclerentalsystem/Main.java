package probleamstatement.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Car("C123", 1500, "CAR-INS-001");
        Vehicle bike1 = new Bike("B123", 500, "BIKE-INS-002");
        Vehicle truck1 = new Truck("T123", 3000, "TRUCK-INS-003");

        // List to store vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car1);
        vehicles.add(bike1);
        vehicles.add(truck1);

        // Simulate rental calculations for 5 days
        int days = 5;

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Rental Cost for " + days + " days: " + vehicle.calculateRentalCost(days));
            System.out.println("Insurance Cost: " + vehicle.calculateInsurance());
            System.out.println("Insurance Details: " + vehicle.getInsuranceDetails());
            System.out.println("---------------------------------------");
        }
    }
}
