package probleamstatement.ridehailingapplication;

public abstract class Vehicle {

    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    public Vehicle(String vehicleId,String driverName,double ratePerKm){
        this.vehicleId=vehicleId;
        this.driverName=driverName;
        this.ratePerKm=ratePerKm;
    }

    abstract void calculateFare(double distance);

   public void getVehicleDetails(){
       System.out.println("vechicle id : " +vehicleId);
       System.out.println("driverName : " +driverName);
       System.out.println("ratePerKm : " +ratePerKm);
    }






    public String getVehicleId(){
        return vehicleId;
    }
    public String getDriverName(){
        return driverName;
    }
    public double getRatePerKm(){
        return ratePerKm;
    }
}
