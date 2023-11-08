package example1;

public class FictionBook extends Book {
    String genre;
    public FictionBook(String title, String author, String releaseYear, int totalCopies, int pricePerCopy, String genre) {
        super(title, author, releaseYear, totalCopies, pricePerCopy);
        this.genre = genre;
    } 

    boolean sellBook(int num) throws OutOfStockException {
        if (num <= getTotalCopies()) {
            setTotalCopies(getTotalCopies()-num);
            return true;
        }
        else {
            throw new OutOfStockException("not enough books in stock");
        }
    }
}
