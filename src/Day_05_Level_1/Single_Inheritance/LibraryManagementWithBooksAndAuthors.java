package Day_05_Level_1.Single_Inheritance;

class Book{
   protected String title;
   protected int publicationYear;
    public Book(String title,int publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }

    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }


}
class Author extends Book{
    private String name;
    private String bio;

    public Author(String name,String bio,String title,int publicationYear){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }

}

public class LibraryManagementWithBooksAndAuthors {
    public static void main(String[] args) {
        Book book=new Author("Sam willeam","Book writer","power of mind",2014);
        book.displayInfo();

    }
}
