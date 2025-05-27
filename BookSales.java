public class BookSales {
    String salerName;
    int numberOfSales;
    int salerId;

    public BookSales(String salerName, int numberOfSales, int salerId) {
        this.salerName = salerName;
        this.numberOfSales = numberOfSales;
        this.salerId = salerId;
    }

    public void displaySales() {
        System.out.println("Saler Name: " + salerName);
        System.out.println("Number of Sales: " + numberOfSales);
        System.out.println("Saler ID: " + salerId);
    }

    public static void main(String[] args) {
        BookSales sales = new BookSales("Rahul", 250, 103);
        sales.displaySales();
    }
}
