package Day_04_Level_01;

import java.util.ArrayList;
import java.util.List;
class Product{
    private String productName;
    private double weight;
    private double price;
    public Product(String productName,double weight,double price){
        this.productName=productName;
        this.weight=weight;
        this.price=price;
    }
    public String getProductName(){
        return productName;
    }
    public double getWeight(){
        return weight;
    }
    public double getPrice(){
        return price;
    }
    public double calculateProductPrice() {
        return weight * price;
    }
}
class Customer{
   private String customerName;
   List<Product>products=new ArrayList<>();


    public Customer(String customerName) {
        this.customerName = customerName;
    }
   public void addProduct(Product product){
       products.add(product);
   }

    public List<Product> getProducts() {
        return products;
    }

    public String getCustomerName() {
        return customerName;
    }

}

class BillGenerator{
    public void generateBill(Customer customer){
        System.out.println("Bill for customer" +customer.getCustomerName());

        double totalBill = 0;
        for (Product product : customer.getProducts()) {
            double productPrice = product.calculateProductPrice();
            System.out.println(product.getProductName()  + product.getWeight() + " kg $" + productPrice);
            totalBill += productPrice;
        }

        System.out.println("Total Bill: $" + totalBill);

    }
}

public class GroceryStoreBillGenerationApplication {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John Doe");
        Customer customer2 = new Customer("Jane Smith");

        Product p1=new Product("Apple", 2.5, 3.0);
        Product p2=new Product("Mango", 3.0, 1.0);

        customer1.addProduct(p1);
        customer1.addProduct(p2);

        customer2.addProduct(p2);
        customer2.addProduct(p1);

        BillGenerator billGenerator = new BillGenerator();
        billGenerator.generateBill(customer1);
        System.out.println();
        billGenerator.generateBill(customer2);
    }

}