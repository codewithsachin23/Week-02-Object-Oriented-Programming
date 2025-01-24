package Day_05_Level_1.Single_Inheritance;
class Device{
 protected String deviceId;
 protected String status;

 public Device(String deviceId,String status){
     this.deviceId=deviceId;
     this.status=status;
 }
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }

}
class Thermostat extends Device{
    private double temperatureSetting;
    public  Thermostat (double temperatureSetting,String deviceId,String status){
        super(deviceId, status);
        this.temperatureSetting=temperatureSetting;
    }
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }


}
public class SmartHomeDevices {
    public static void main(String[] args) {
        Device thermostat=new Thermostat(15,"T123","Active");
       thermostat.displayStatus();

    }
}
