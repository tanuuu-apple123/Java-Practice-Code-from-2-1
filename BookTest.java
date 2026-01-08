import java.util.Scanner;

class Book {
    private String bookName;
    private String isbn;
    private String author;
    private String publisher;

    // Constructor
    public Book(String bookName, String isbn, String author, String publisher) {
        this.bookName = bookName;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }

    // Mutator (setter) methods
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Accessor (getter) methods
    public String getBookName() {
        return this.bookName;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getPublisher() {
        return this.publisher;
    }

    // Method to return complete book info
    public String getBookInfo() {
        return "Book Name: " + this.bookName +
               "\nISBN: " + this.isbn +
               "\nAuthor: " + this.author +
               "\nPublisher: " + this.publisher;
    }
}

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[30];

        System.out.print("Enter number of books to input (up to 30): ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1));
            System.out.print("Enter Book Name: ");
            String name = sc.nextLine();
            System.out.print("Enter ISBN Number: ");
            String isbn = sc.nextLine();
            System.out.print("Enter Author Name: ");
            String author = sc.nextLine();
            System.out.print("Enter Publisher: ");
            String publisher = sc.nextLine();

            books[i] = new Book(name, isbn, author, publisher);
        }

        System.out.println("\n--- Book Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Book " + (i + 1) + " Info:");
            System.out.println(books[i].getBookInfo() + "\n");
        }
    }
}
