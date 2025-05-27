public class Book {
    String bookName;
    String author;
    String publisher;
    double price;
    int yearOfPublished;

    public Book(String bookName, String author, String publisher, double price, int yearOfPublished) {
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.yearOfPublished = yearOfPublished;
    }

    public void display() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: $" + price);
        System.out.println("Year of Published: " + yearOfPublished);
    }

    public static void main(String[] args) {
        Book book = new Book("Effective Java", "Joshua Bloch", "Pearson", 45.99, 2018);
        book.display();
    }
}
