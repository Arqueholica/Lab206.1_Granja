public class Libro {
    public String title;
    private long ISBN;
    double price;

    public Libro(String title, long ISBN, double price) {
        this.title = title;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "📖 LIBRO" + '\n' +
                "Título: " + title + '\n' +
                "ISBN: " + ISBN +  '\n' +
                "Precio: " + price +  '\n' +
                "------------";
    }
}
