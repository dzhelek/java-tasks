package javac1;
import java.util.Scanner;

public class MyFirstProject {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();
        String birthday = scanner.next();
        scanner.close();
        System.out.println("Your name is " + name + "\nYour age is " + age + "\nYou are born " + birthday);
    }
}
