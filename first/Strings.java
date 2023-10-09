package first;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        var stringsArr = new String[5];
        var scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            stringsArr[i] = scanner.next();
        }
        scanner.close();

        System.out.println("Your strings are:");
        for (var i : stringsArr) {
            System.out.print(i + " ");
        }
    }
}
