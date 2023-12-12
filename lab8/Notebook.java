package lab8;

import java.util.HashMap;

public class Notebook {
    HashMap<String, String> notes = new HashMap<>();

    void addNote(String title, String content) {
        notes.put(title, content);
    }

    String findNote(String title) {
        return notes.get(title);
    }
    public static void main(String[] args) {
        var notebook = new Notebook();
        notebook.addNote("ООП", "Основи на обектно-ориентираното програмиране");
        var a = notebook.findNote("ООП");
        System.out.println(a);
    }
}
