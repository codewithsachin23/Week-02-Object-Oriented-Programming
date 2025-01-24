package Day_05_Level_1.Hybrid_Inheritance;



// Interface defining worker duties
interface Worker {
    void performDuties();
}

// Superclass representing a person in the restaurant
class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Subclass representing a chef
class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is preparing dishes in the kitchen.");
    }
}

// Subclass representing a waiter
class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving food to the customers.");
    }
}

// Main class to test the restaurant management system
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("rahul", 1);
        chef.displayInfo();
        chef.performDuties();
        System.out.println();
        Waiter waiter = new Waiter("vivek", 2);
        waiter.displayInfo();
        waiter.performDuties();


    }
}
