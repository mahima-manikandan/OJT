public class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean available;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public void borrow() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available for borrowing.");
        }
    }

    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book is already available.");
        }
    }

    public void displayDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {
        Book book1 = new Book("978-3-16-148410-0", "Goat Life", "Basheer");
        book1.displayDetails();
        book1.borrow();
        book1.displayDetails();
        book1.borrow();
        book1.returnBook();
        book1.displayDetails();
    }
}
