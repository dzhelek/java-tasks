package lab8;

import java.util.LinkedList;
import java.util.Queue;

public class BookShelf {
    Queue<String> books = new LinkedList<>();

    void addBook(String book) {
        books.offer(book);
    }

    String takeBook() {
        return books.poll();
    }

    public static void main(String[] args) {
        var shelf = new BookShelf();
        shelf.addBook("Книга 1");
        var book = shelf.takeBook(); // Връща "Книга 1"
        System.out.println(book);
    }
}
