//Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.

 
import java.util.ArrayList;

class Book{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book);
    }

    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equals(title));
        System.out.println("Removed book with title: " + title);
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book("1984", "George Orwell");

        library.addBook(book1);
        library.addBook(book2);

        library.listBooks();

        library.removeBook("1984");
        library.listBooks();
    }
}
