package lab8;

import java.util.HashMap;

public class HashTable {
    HashMap<String, String> table = new HashMap<>();

    void add(String user, String email) {
        table.put(user, email);
    }

    String get(String user) {
        return table.get(user);
    }

    public static void main(String[] args) {
        var userTable = new HashTable();
        userTable.add("user1", "user1@example.com");
        var email = userTable.get("user1"); // Връща "user1@example.com"
        System.out.println(email);
    }
}
