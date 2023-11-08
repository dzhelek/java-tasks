package example1;

public class Main {
   public static void main(String[] args) {
        var b = new FictionBook("hello", "da", "va", 10, 20, "da");
        try {
            b.sellBook(15);
        }
        catch OutOfStockException (e) {
            System.out.println(e.getMessage());
        }
   } 
}
