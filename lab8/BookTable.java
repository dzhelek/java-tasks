package lab8;

public class BookTable {
    public static void main(String[] args) {
        var bookCatalog = new HashTable();
        bookCatalog.add("978-3-16-148410-0", "Примерна книга");
        var book = bookCatalog.get("978-3-16-148410-0");
        System.out.println(book);
    }
}
