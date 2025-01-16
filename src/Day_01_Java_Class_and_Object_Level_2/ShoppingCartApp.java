package Day_01_Java_Class_and_Object_Level_2;

import java.util.Scanner;

class ItemCart {
    String itemName;
    double price;
    int quantity;

    // Constructor to assign values
    public ItemCart(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }
}

class ShoppingCart {
    // Cart item store
    public static ItemCart[] cartItems = new ItemCart[10];
    static int itemCount = 0;

    // Add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        if (itemCount >= cartItems.length) {
            System.out.println("Cart is full; we cannot add this item.");
            return;
        }
        cartItems[itemCount++] = new ItemCart(itemName, price, quantity);
        System.out.println("Item added successfully.");
    }

    // Remove an item from the cart by name
    public void removeItem(String itemName) {
        boolean itemFound = false;

        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].itemName.equalsIgnoreCase(itemName)) {
                // Shift the remaining items to fill the gap
                for (int j = i; j < itemCount - 1; j++) {
                    cartItems[j] = cartItems[j + 1];
                }
                cartItems[itemCount - 1] = null;
                itemCount--;
                itemFound = true;
                System.out.println(itemName + " removed from the cart.");
                break;
            }
        }
        if (!itemFound) {
            System.out.println("Item '" + itemName + "' not found in the cart.");
        }
    }

    // Display the total cost of all items in the cart
    public void displayTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += cartItems[i].getTotal();
        }
        System.out.println("Total cost of all items in the cart: " + totalCost);
    }

    // Display the items in the cart
    public void displayCart() {
        if (itemCount == 0) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Items in the cart:");
            for (int i = 0; i < itemCount; i++) {
                System.out.println("- " + cartItems[i].itemName + " | Price: " + cartItems[i].price + " | Quantity: " + cartItems[i].quantity + " | Total: " + cartItems[i].getTotal());
            }
        }
    }
}

public class ShoppingCartApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart sc = new ShoppingCart();
        boolean exit = false;

        System.out.println("Welcome to the Shopping Cart System!");

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add an item to the cart");
            System.out.println("2. Remove an item from the cart");
            System.out.println("3. Display all items in the cart");
            System.out.println("4. Display total cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = scanner.nextInt();
                    sc.addItem(itemName, price, quantity);
                    break;

                case 2:
                    System.out.print("Enter the name of the item to remove: ");
                    String removeItemName = scanner.nextLine();
                    sc.removeItem(removeItemName);
                    break;

                case 3:
                    sc.displayCart();
                    break;

                case 4:
                    sc.displayTotalCost();
                    break;

                case 5:
                    System.out.println("Thank you for using the Shopping Cart System! Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
