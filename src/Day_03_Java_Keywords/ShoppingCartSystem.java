package Day_03_Java_Keywords;
class Product{
    static double discount=10.0;

    final int productID;

    String productName;
    int price;
    int quantity;


    public Product(int productID,String productName,int price,int quantity){
        this.productID=productID;
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;


    }
     static void updateDiscount(double newDiscount){
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }
    void display(){
        double discountedPrice = price - (price * discount / 100);
        System.out.println("productID : " + productID);
        System.out.println("productName : " + productName);
        System.out.println("price : " + price);
        System.out.println("Discounted Price: " + discountedPrice);
        System.out.println("quantity : " + quantity);
    }

        }
public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1=new Product(12,"Laptop",50000,2);
        Product p2=new Product(13,"mobile",10000,2);



        if(p1 instanceof Product) {
            p1.display();
        }
        System.out.println("-----------------------------------------");
        if(p2 instanceof Product) {
            p2.display();
        }
        Product.updateDiscount(15);
    }

}
