package Day_05_Level_1.Assisted_Problems;
//super class animal
class Animal{
    protected String name;
    protected double age;
    // Constructor to initialize name and age
    public Animal(String name,double age){
        this.name=name;
        this.age=age;
    }
    // Method to represent a animal sound
   public void makeSound(){
       System.out.println("Animals sound");
    }
    public void display(){
        System.out.println("Name :"+name+"\nage: "+age);
    }

}
// Dog is Subclass of Animal
class Dog extends Animal{
    public Dog(String name,double age){
        super(name, age);
    }
    // Override makeSound() to represent Dog sound
    @Override
    public void makeSound(){
        System.out.println("Dog sound");
        System.out.println();
    }


}
// cat is Subclass of Animal
class Cat extends Animal{
    public Cat(String name,double age){
        super(name, age);
    }
    // Override makeSound() to represent cat sound
    @Override
    public void makeSound(){
        System.out.println("cat sound");
        System.out.println();
    }

}
// Bird is Subclass of Animal
class Bird extends Animal{
    public Bird(String name,double age){
        super(name, age);
    }
    // Override makeSound() to represent bird sound
    @Override
    public void makeSound(){
        System.out.println("bird sound");
        System.out.println();
    }

}
public class Animal_Hierarchy {
    public static void main(String[] args) {
        // Create objects of each subclass and display details
        Dog d1=new Dog("puppy",2.5);
        d1.display();
        d1.makeSound();


        Cat c1=new Cat("ggg",3);
        c1.display();
        c1.makeSound();

        Bird b1=new Bird("Eagle",5);
        b1.display();
        b1.makeSound();


    }
}
