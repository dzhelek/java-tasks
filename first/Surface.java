package first;
import java.util.Scanner;

public class Surface {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = scanner.nextInt();
        System.out.print("b = ");
        int b = scanner.nextInt();
        System.out.println("The surface is " + a*b);
        scanner.close();
    }
}
