
package probleamstatement.food_delivery_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Chole Kulche", 200, 2));
        order.add(new NonVegItem("Chicken Curry", 300, 1));
        order.add(new VegItem("Dosa", 70, 3));
        order.add(new NonVegItem("Mutton", 400, 2));

        // Process the order and apply discounts
        double discountRate = 0.20; // 20% discount
        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                discountable.applyDiscount(discountRate);
                System.out.println(discountable.getDiscountDetails());
            }

            System.out.println("********************************************************************");
        }
    }
}
