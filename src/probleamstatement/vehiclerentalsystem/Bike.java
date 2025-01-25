package probleamstatement.vehiclerentalsystem;

public class Bike extends Vehicle {
    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        // Bike rental cost has no surcharges
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        // Insurance cost is 3% of the rental cost for the first day
        return getRentalRate() * 0.03;
    }
}
