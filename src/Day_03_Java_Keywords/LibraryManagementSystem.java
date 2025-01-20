package Day_03_Java_Keywords;
class Book{
    static String libraryName="Wisdom Library";
    String title;
    String author;
    int isbn;

    Book(String title,String author,int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }

    static void displayLibraryName(){
        System.out.println("Library Name : "+libraryName );

    }
     void display(){
        displayLibraryName();
        System.out.println("title: " + title);
        System.out.println("Author name: " + author);
         System.out.println("isbn number: " + isbn);
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book1=new Book("Power OF MInd","sam constas",55656784);
        Book book2=new Book("Rich Dad and Poor dad","sam willeam",55658484);


        //calling a display using instance of class
        //Checking instance or not

        if(book1 instanceof Book) {
            book1.display();
        }
        System.out.println("-----------------------------------------");
        if(book2 instanceof Book) {
            book2.display();
        }

    }

}
