package probleamstatement.vehiclerentalsystem;

public class Truck extends Vehicle{
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber);
    }

    @Override
    public double calculateRentalCost(int days) {
        // Truck rental includes a per-day surcharge of 300
        double dailySurcharge = 300;
        return (getRentalRate() + dailySurcharge) * days;
    }

    @Override
    public double calculateInsurance() {
        // Insurance cost is 10% of the rental cost for the first day
        return getRentalRate() * 0.10;
    }
}
