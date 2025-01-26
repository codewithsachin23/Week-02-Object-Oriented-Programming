
package probleamstatement.librarymanagement;
// main class
public class Main {
    public static void main(String[] args) {
        // creating object of each class with referance of abstract class
        LibraryItem book = new Book(1,"Let us c ","sachin");
        LibraryItem magazine = new Magazine(2," Times of India","rahul");
        LibraryItem dvd = new DVD(3,"Blue ray","Vivek");


        // array for story object of class
        LibraryItem [] library = {book,magazine,dvd};

        // for loop used for iterating over object
        for(LibraryItem libraryItem : library){
            libraryItem.getItemDetails();
            // checking whether a object implements the Reservable interface or not
            if(libraryItem instanceof Reservable){
                Reservable reservable= (Reservable) libraryItem;
                System.out.println("Available : "+reservable.checkAvailability());
                reservable.reserveItem("Vivek");
                System.out.println("Available after reservation : "+reservable.checkAvailability());
            }
            System.out.println("***************************************************");
        }
    }
}
