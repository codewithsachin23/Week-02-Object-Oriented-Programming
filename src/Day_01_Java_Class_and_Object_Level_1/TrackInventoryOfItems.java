package Day_01_Java_Class_and_Object_Level_1;

import java.util.Scanner;

class Item{
    int itemCode;
    String itemName;
    int price;

    public Item(int itemCode,String itemName,int price){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.price=price;

    }

    public void displayItemDetails(){
        System.out.println("itemCode :" + itemCode);
        System.out.println("item Name :" +itemName );
        System.out.println("Price :" +price);
    }
    public void calculateQuantity(int quantity){
        int totalCost=price*quantity;

        System.out.println("Total Cost for :"+totalCost);
    }

}
public class TrackInventoryOfItems {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter item code :");
        int itemCode=input.nextInt();
        input.nextLine();
        System.out.println("Enter item Name :");
        String itemName=input.nextLine();
        System.out.println("Enter Price :");
        int price=input.nextInt();
        input.nextLine();

        Item item1=new Item(itemCode,itemName,price);

        System.out.println("Item Deatils");
        item1.displayItemDetails();

        System.out.println("Enter total Quantity :");
        int quantity=input.nextInt();

        item1.calculateQuantity(quantity);



    }
}
