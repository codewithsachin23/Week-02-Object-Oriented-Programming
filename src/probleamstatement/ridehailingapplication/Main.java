package probleamstatement.ridehailingapplication;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car c1=new Car("C123","Rahul",50,"Anand nagar","Tit college");
        Car c2=new Car("C124","Rahul",50,"Anand nagar","piplani");
        Bike B1=new Bike("B123","Rahul",30,"Anand nagar","Tit college");
        Auto A1=new Auto("A123","Rahul",40,"Anand nagar","Tit college");




        List<Vehicle> vehicles=new ArrayList<>();
        vehicles.add(c1);
        vehicles.add(c2);
        vehicles.add(A1);
        vehicles.add(B1);

        for(Vehicle vehicle:vehicles){
            vehicle.getVehicleDetails();
            GPS gps=(GPS)vehicle;
            gps.getCurrentLocation();
            gps.updateLocation();
            vehicle.calculateFare(5);
            System.out.println();
        }



    }
}
