package example1;

public abstract class Book {
    private String title, author, releaseYear;
    private int totalCopies, pricePerCopy;
    public Book(String title, String author, String releaseYear, int totalCopies, int pricePerCopy) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.totalCopies = totalCopies;
        this.pricePerCopy = pricePerCopy;
    }

    abstract boolean sellBook(int num) throws OutOfStockException;
        // if (num < totalCopies) {
            // totalCopies -= num;
        // }
        // else {
            // throw new OutOfStockException("not enough books in stock");
        // }
    // }

    String getTitle() {
        return this.title;
    }

    String getAuthor() {
        return this.author;
    }

    String getReleaseYear() {
        return this.releaseYear;
    }

    int getTotalCopies() {
        return this.totalCopies;
    }

    int getPricePerCopy() {
        return this.pricePerCopy;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    void setPricePerCopy(int pricePerCopy) {
        this.pricePerCopy = pricePerCopy;
    }

}