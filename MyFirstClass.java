import java.util.Scanner;

public class MyFirstClass {

    public static void main(String... argc) {
        var number = 10;
        var text = "hello";

        var concat = text + number;

        int cat = switch (number) {
            case 10, 15 -> 0;
            default -> 2;
        };

        System.out.println("Hello world!");
        System.out.println(concat);
        System.out.println(cat);

        var scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            System.out.println(scan.nextLine());
        }
    }

}