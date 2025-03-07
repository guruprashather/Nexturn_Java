class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Copy Constructor
    Book(Book b) {
        this.title = b.title;
        this.author = b.author;
        this.price = b.price;
    }

    
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

public class copyconst {
    public static void main(String[] args) {
 
        Book originalBook = new Book("Java Programming", "James Gosling", 30.5);

        // Creating a copied book object using the copy constructor
        Book copiedBook = new Book(originalBook);

        System.out.println("Original Book Details:");
        originalBook.displayDetails();

        System.out.println("\nCopied Book Details:");
        copiedBook.displayDetails();
    }
}
