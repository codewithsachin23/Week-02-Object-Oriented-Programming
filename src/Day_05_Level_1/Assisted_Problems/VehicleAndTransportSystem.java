package Day_05_Level_1.Assisted_Problems;
class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }
}
class Car extends Vehicle {
        private int seatCapacity;

        public Car(int maxSpeed, String fuelType, int seatCapacity) {
            super(maxSpeed, fuelType);
            this.seatCapacity = seatCapacity;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Seat Capacity: " + seatCapacity);
        }
}
class Truck extends Vehicle {
        private int loadCapacity;

        public Truck(int maxSpeed, String fuelType, int loadCapacity) {
            super(maxSpeed, fuelType);
            this.loadCapacity = loadCapacity;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Load Capacity: " + loadCapacity + " tons");
        }

}

class Motorcycle extends Vehicle {
        private int seat;

        public Motorcycle(int maxSpeed, String fuelType, int seat) {
            super(maxSpeed, fuelType);
            this.seat = seat;
        }

        @Override
        public void displayInfo() {
            super.displayInfo();
            System.out.println("Has Sidecar: " + seat);
        }
    }
public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        // Create objects of each subclass
        Vehicle car = new Car(200, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 10);
        Vehicle motorcycle = new Motorcycle(180, "Petrol", 2);

        Vehicle []vehicles={car,truck,motorcycle};

        for (Vehicle vehicle:vehicles){
            System.out.println(vehicle.getClass().getSimpleName()+ " Details:");

            vehicle.displayInfo();
            System.out.println();
        }


    }

}
