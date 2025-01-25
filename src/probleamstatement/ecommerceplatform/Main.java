package probleamstatement.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Electronics e1=new Electronics("E123","laptop",25000,15);
        Electronics e2=new Electronics("124","mobile",50000,10);

        Clothing c1=new Clothing("C123","shirt",300,5);
        Groceries g1=new Groceries("G123","xyz",50,5);

        List<Product> products=new ArrayList<>();

        products.add(e1);
        products.add(e2);
        products.add(c1);
        products.add(g1);




        for(Product product:products){
            System.out.println("Product name "+product.getName());
            System.out.println("product Id "+product.getProductId());
            System.out.println("Original Price: " + product.getPrice());
            System.out.println("Discount: " + product.calculateDiscount());
            double finalPrice=0.0;
            if(product instanceof Taxable){
               Taxable taxable= (Taxable) product;
               taxable.calculateTax();
               double tax=taxable.getTaxDetails();
               finalPrice=product.getPrice()+tax-product.calculateDiscount();
            }
            System.out.println("Final price:"+ finalPrice);
            System.out.println();
        }

    }
}
