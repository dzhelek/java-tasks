package lab8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DocumentHashTable {
    HashMap<String, List<Integer>> documents = new HashMap<>();

    void addDocument(int uid, String... keywords) {
        for (var keyword : keywords) {
            var uids = documents.putIfAbsent(keyword, List.of(uid));
            if (uids != null) {
                uids = new ArrayList<>(uids);
                uids.add(uid);
                documents.put(keyword, uids);
            }
        }
    }

    List<Integer> search(String keyword) {
        return documents.get(keyword);
    }
    public static void main(String[] args) {
        var docs = new DocumentHashTable();
        docs.addDocument(1, "ООП", "Програмиране");
        docs.addDocument(2, "хахах");
        docs.addDocument(3, "хахах", "ООП");
        var a = docs.search("ООП");
        System.out.println(a);
    }
}
