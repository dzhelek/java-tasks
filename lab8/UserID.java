package lab8;

public class UserID {
    public static int generateUserId(String email) {
        return email.hashCode();
    }
    public static void main(String[] args) {
        var id = generateUserId("test@email.com");
        System.out.println(id);
    }
}
