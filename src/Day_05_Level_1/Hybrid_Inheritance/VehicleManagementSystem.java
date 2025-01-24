package Day_05_Level_1.Hybrid_Inheritance;
interface Refuelable{
    void refuel();

}
class Vehicle{
    protected int maxSpeed;
    protected String model;

    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }


}
class PetrolVehicle extends Vehicle implements Refuelable{
    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    @Override
    public void refuel(){
        System.out.println("Refuel Done");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("This is a Petrol Vehicle.");
    }


}

class ElectricVehicle extends Vehicle{
    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    public void charge(){
        System.out.println("charging Done");

    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("This is a Electric Vehicle.");
    }

}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        PetrolVehicle vehicle1=new PetrolVehicle(200,"Suzuki");
        vehicle1.displayInfo();
        vehicle1.refuel();
        System.out.println();

        ElectricVehicle vehicle2=new ElectricVehicle(180,"TATA EV");
        vehicle2.displayInfo();
        vehicle2.charge();


    }
}
