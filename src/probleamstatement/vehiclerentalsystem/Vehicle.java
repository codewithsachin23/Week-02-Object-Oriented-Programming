package probleamstatement.vehiclerentalsystem;

public abstract class Vehicle implements Insurable {

    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private String insurancePolicyNumber;
    public Vehicle(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Encapsulation - restricts direct access to sensitive details
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Abstract method to calculate rental cost
    public abstract double calculateRentalCost(int days);

    // Implementing Insurable method
    @Override
    public String getInsuranceDetails() {
        return "Policy Number: " + insurancePolicyNumber;
    }
}
