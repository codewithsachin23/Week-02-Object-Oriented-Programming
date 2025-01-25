package probleamstatement.vehiclerentalsystem;

public class Car extends Vehicle{

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        // Car rental includes a flat surcharge of 200
        double surcharge = 200;
        return (getRentalRate() * days) + surcharge;
    }

    @Override
    public double calculateInsurance() {
        // Insurance cost is 5% of the rental cost for the first day
        return getRentalRate() * 0.05;
    }
}
