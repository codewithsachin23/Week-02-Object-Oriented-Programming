package probleamstatement.ridehailingapplication;

public class Bike extends Vehicle implements GPS{

    private String CurrentLocation;
    private String updateLocation;
    public Bike(String vehicleId,String driverName,double ratePerKm,String CurrentLocation,String updateLocation){
        super(vehicleId, driverName, ratePerKm);

        this.CurrentLocation=CurrentLocation;
        this.updateLocation=updateLocation;
    }
    public void calculateFare(double distance){
        System.out.println(getRatePerKm()*distance);
    }
    public void getCurrentLocation(){
        System.out.println("current location "+CurrentLocation);

    }
    public void updateLocation(){
        System.out.println("Updated location "+updateLocation);
    }

}
