package Day_01_Java_Class_and_Object_Level_1;

class Book{
    String title;
    String author;
    int price;

    public Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;

    }

    public void displayBookDetails(){
        System.out.println("Title :" +title);
        System.out.println("Author :" +author);
        System.out.println("Price  :" +price);
    }



}

public class HandleBookDetails {
    public static void main(String[] args) {
        Book b1=new Book("Mind Game","Sam Willom",300);
        b1.displayBookDetails();

    }
}
