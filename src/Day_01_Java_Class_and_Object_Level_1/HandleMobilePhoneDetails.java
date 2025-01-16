package Day_01_Java_Class_and_Object_Level_1;
class MobilePhone{
    String brand;
    String model;
    int price;
    public MobilePhone(String brand,String model,int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    public void displayDetails(){
        System.out.println("Mobile brand :" + brand);
        System.out.println("Mobile model:" +model);
        System.out.println("Price :" +price);
    }


}

public class HandleMobilePhoneDetails {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Apple", "I Phone 14", 79999);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S23", 74999);
        MobilePhone phone3 = new MobilePhone("OnePlus", "11 Pro", 64999);

        // Display details of each phone
        System.out.println("Mobile Phone 1 Details:");
        System.out.println("--------------------------------");
        phone1.displayDetails();

        System.out.println("\nMobile Phone 2 Details:");
        System.out.println("--------------------------------");
        phone2.displayDetails();

        System.out.println("\nMobile Phone 3 Details:");
        System.out.println("--------------------------------");
        phone3.displayDetails();
    }
}
